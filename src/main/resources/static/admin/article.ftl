<!DOCTYPE html>
<html lang="en">
    <head>
        <#include "reference.ftl">
        <link type="text/css" href="/${theme}/css/article.css" rel="stylesheet" />
        <script type="text/javascript" src="/${theme}/libs/showdown.min.js"></script>
        <script type="text/javascript" src="/${theme}/js/article.js"></script>
    </head>
    <body>
        <#include "navbar.ftl">
        <div class="content">
            <p class="head-bar">写文章</p>
            <div class="edit">
                <div class="write-area">
                    <textarea id="markdown" oninput="this.editor.update()" onkeydown="tab(this)">请写点什么</textarea>
                </div>
                <div class="preview markdown" id="preview"></div>
            </div>
            <div class="operate">
                <div class="gear" id="gear">
                    <i class="fa fa-bars" aria-hidden="true"></i>
                </div>
                <ul>
                    <li class="title">
                        <p>标题</p>
                        <input type="text">
                    </li>
                    <li class="cover">
                        <p>封面</p>
                        <img src="/${theme}/img/test.jpg">
                    </li>
                    <li class="summary">
                        <p>摘要</p>
                        <textarea></textarea>
                    </li>
                    <li class="tags">
                        <p>
                            标签
                            <i class="fa fa-plus" aria-hidden="true" id="add-tag"></i>
                        </p>
                        <div class="tag">
                            <span>树莓派</span>
                            <span>x</span>
                        </div>
                        <div class="tag">
                            <span>树莓派</span>
                            <span>x</span>
                        </div>
                        <div class="tag">
                            <span>树莓派</span>
                            <span>x</span>
                        </div>
                        <div class="tag">
                            <span>树莓派</span>
                            <span>x</span>
                        </div>
                        <div class="tag">
                            <span>树莓派</span>
                            <span>x</span>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
        <div class="tag-select">

        </div>
        <div class="mask" id="mask"></div>
    </body>
</html>