$(document).ready(function () {
    var html = markdown.toHTML("## 树莓派 \n" +
        "### asddsa \n" +
        "#### saddas \n" +
        "- sdsad \n" +
        "** asddsa ** \n");
    $(".article .content").html(html);
});