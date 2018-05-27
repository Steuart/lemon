<!DOCTYPE html>
<html lang="en">
    <head>
        <#include "reference.ftl">
        <link type="text/css" href="/${theme}/css/article.css" rel="stylesheet" />
        <script type="text/javascript" src="/${theme}/libs/markdown.min.js"></script>
        <script type="text/javascript" src="/${theme}/js/article.js"></script>
    </head>
    <body>
        <#include "navbar.ftl">
        <div class="content">
            <p class="head-bar">写文章</p>
            <div class="edit">
                <div class="write-area">
                    <textarea id="markdown" oninput="this.editor.update()">请写点什么</textarea>
                </div>
                <div class="preview markdown" id="preview"></div>
            </div>
        </div>
    </body>
</html>