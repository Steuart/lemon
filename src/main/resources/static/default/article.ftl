<!DOCTYPE html>
<html lang="en">
    <head>
        <#include "quote.ftl">
        <link type="text/css" href="/${theme}/css/article.css" rel="stylesheet"/>
        <script type="text/javascript" src="/${theme}/js/article.js"></script>
    </head>
    <body>
        <#include "./header.ftl">
        <div class="body">
            <div class="article">
                <div class="content markdown">
                    <div class="title">树莓派</div>
                    <div class="info">
                        <img class="header-img" src="/${theme}/img/test.jpeg">
                        <div>
                            <div class="auth">既昼</div>
                            <div class="time">2018-05-10 15:00 字数 3739 阅读 6212 评论 74 喜欢 115 赞赏 4</div>
                        </div>
                    </div>
                    ${content}
                </div>
                <div class="catalog">
                    <h4>目录</h4>
                    <ul></ul>
                </div>
            </div>
        </div>
        <#include "./footer.ftl">
    </body>
</html>