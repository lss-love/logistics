package com.lian.common;

import com.lian.convert.CustomerDateConvert;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class WebMvcConfig extends WebMvcConfigurationSupport {
    /**
     * 添加自定义的Converters和Formatters.
     */
    @Override
    protected void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new CustomerDateConvert());
    }

    /**
     * 如果继承了WebMvcConfigurationSupport，则在yml中配置的相关内容会失效。 需要重新指定静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/META-INF/resources/");
        super.addResourceHandlers(registry);
    }
}
