layui.use(['element', 'form', 'laydate', 'layer', 'table'], function() {
    let element = layui.element,
        form = layui.form,
        laydate = layui.laydate,
        layer = layui.layer,
        table = layui.table;

    let employeeCode = window.location.href.split("=")[1];
    $.ajax({
        type: "get",
        url: nginx_url + "/selectEmpByCode/" + employeeCode,
        dataType:"json",
        success: function (result) {
            $("#employeeCode").val(result.employeeCode);
            $("#employeeName").val(result.employeeName);
            $("#department").val(result.department);
            $("#position").val(result.position);
            $("#birthday").val(result.birthday);
            form.render('select');
            $(":radio[name='gender'][value='" + result.employee.gender + "']").prop("checked", "checked");
            $(":radio[name='gender']").prop("disabled", "disabled");
            $(":radio[name='condition'][value='" + result.condition + "']").prop("checked", "checked");
            // form.render("radio");
            // laydate.render({
            //     elem: '#birthday',
            //     type: 'date',
            //     value: new Date(result.birthday)
            //     // theme: 'grid'
            // });

        }
    });
    
    $("#modifyEmp").click(function (){
        $.ajax({
            type: "PUT",
            url: nginx_url + "/updateEmp/" + employeeCode,
            data: $("#empForm").serialize(),
            dataType: "json",
            success: function (result) {
                console.log(result);
                if (result.code == 1) {
                    layer.msg('更新成功', {
                        time: 800
                    }, function () {
                        let index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                        parent.layer.close(index); //再执行关闭
                    });
                }
            }
        });
    })



});