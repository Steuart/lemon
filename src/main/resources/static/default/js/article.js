$(document).ready(function () {

    //添加标题
    var h = $(".content :header");
    h.each(function () {
        var content = $(this).text();
        var tagName = $(this).prop("tagName");
        var space = (parseInt(tagName.charAt(1))-1)*2.5;
        $(".catalog ul").append("<li style='margin-left: "+space+"rem'>"+content+"</li>");
    })
});