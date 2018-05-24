$(document).ready(function () {
    var html = markdown.toHTML("## 树莓派 \n" +
        "### asddsa \n" +
        "#### saddas \n" +
        "#### saddas \n" +
        " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
        "- sdsad \n" +
        " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
        " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
        " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +
        " 先让大家明确Dom对象和jQuery包装集的概念, 将极大的加快我们的学习速度. 我在学习jQuery的过程中就花了很长时间没有领悟到两者的具体差异, 因为书上并没有专门讲解两者的区别, 所以经常被\"this指针为何不能调用jQuery方法\"等问题迷惑.  直到某一天豁然开朗, 发现只要能够区分这两者, 就能够在写程序时变得清清楚楚.\n" + "#### saddas \n" +

        "** asddsa ** \n");
    $(".article .content").html(html);
    var h = $(".content :header");
    h.each(function () {
        var content = $(this).text();
        var tagName = $(this).prop("tagName");
        var space = parseInt(tagName.charAt(1))-1;
        $(".catalog").append("<li style='margin-left: "+space+"rem'>"+content+"</li>");
    })
});