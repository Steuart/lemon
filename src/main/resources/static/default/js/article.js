$(document).ready(function () {

    //添加标题
    var h = $(".content :header");
    var i =0;
    h.each(function () {
        var content = $(this).text();
        var tagName = $(this).prop("tagName");
        var space = (parseInt(tagName.charAt(1))-1)*2.5;
        $(this).attr("id","anchor"+i);
        $(".catalog ul").append("<li style='margin-left: "+space+"rem'><a href='#anchor"+i+"'>"+content+"</a></li>");
        i++;
    })
});