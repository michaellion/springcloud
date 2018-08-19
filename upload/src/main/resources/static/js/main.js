function getfiles() {
    alert("aaaa");
    console.log("请求准备发送");
    $.ajax({
        type: "POST",
        url: "/getfiles",
        dataType: "json",
        data: {},
        success: function (test) {
            alert("ok");
            var text;
            var select = document.getElementById("select");
            $.each(test, function (i, n) {
                text = n.text;
                console.log(text);
                select.add(new Option(text, i));
            })

            /* 由于采取了bootstrap-select的样式，这就不是一个普通的select，在动态加载之后必须刷新*/
            /*
                        $('.selectpicker').selectpicker('refresh');*/
        },
    });
}