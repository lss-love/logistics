layui.use(['element', 'form', 'laydate', 'layer', 'table'], function(){
    let element = layui.element,
    form = layui.form,
    laydate = layui.laydate,
    layer = layui.layer,
    table = layui.table;

    let goodsBillCode = window.location.href.split("=")[1];
    alert(goodsBillCode);
    form.on('submit(addGoods)', function (data) {
        $.ajax({
            type: "post",
            url: nginx_url + "/goodsBill/addGoods?goodsBillCode=" + goodsBillCode,
            data: $("#goodsForm").serialize(),
            dataType: "json",
            success: function (result) {
                console.log(result);
                if (result.code == 1) {
                    layer.msg('货物添加成功', {
                        time: 800
                    }, function () {
                        let index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                        parent.layer.close(index); //再执行关闭
                    });
                    $("#resetForm").click();
                } else {
                    layer.msg('货物添加失败', {
                        time: 800
                    });
                }
                console.log(result);
            }
        });
        return false;
    });

});
