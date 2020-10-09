layui.use(['layer', 'form', 'jquery'], function() {
    let $ = layui.jquery,
        layer = layui.layer,
        form = layui.form;
    
    form.on('submit(login)', function () {
        let index = layer.load();
        $.ajax({
            type: 'get',
            url: nginx_url + '/login.do',
            data: {
                'loginId': $('#loginId').val(),
                'password': $('#password').val()
            },
            dataType: 'json',
            async: false,
            success: function (result) {
                $.cookie("loginId",result.user);
                if (result.status === "SUCCESS") {
                    console.log(result.user);
                    setTimeout(function() {
                        layer.close(index);
                        layer.msg('登录成功', {
                            time: 800,
                            icon: 1
                        }, function () {
                            window.location.href = 'index.html';
                        });
                    },800);
                }
            }
        });
        return false;
    });
});
