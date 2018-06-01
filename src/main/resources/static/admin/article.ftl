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
            <div class="head-bar">
                <span>写文章 /</span>
            </div>
            <div class="edit" id="edit">
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
                        <p>标题:</p>
                        <input type="text">
                    </li>
                    <li class="cover">
                        <p>封面:</p>
                        <label for="upload-img">
                            <img src="/${theme}/img/test.jpg">
                        </label>
                        <input type="file" id="upload-img" name="pic" accept="image/gif"/>
                    </li>
                    <li class="summary">
                        <p>摘要:</p>
                        <textarea></textarea>
                    </li>
                    <li class="tags">
                        <p>
                            标签:
                            <i class="fa fa-plus" aria-hidden="true" id="add-tag"></i>
                        </p>
                        <dl>
                            <dt>
                                <span>树莓派</span>
                                <i class="fa fa-times" aria-hidden="true"></i>
                            </dt>
                            <dt>
                                <span>树莓派</span>
                                <i class="fa fa-times" aria-hidden="true"></i>
                            </dt>
                            <dt>
                                <span>树莓派</span>
                                <i class="fa fa-times" aria-hidden="true"></i>
                            </dt>
                            <dt>
                                <span>树莓派</span>
                                <i class="fa fa-times" aria-hidden="true"></i>
                            </dt>
                        </dl>
                    </li>
                    <button class="save" type="button">保存</button>
                </ul>
            </div>
        </div>
        <div class="tags-container">
            <ul class="add">
                <li>
                    名字<input type="text">
                </li>
                <li>
                    背景颜色<input type="text">
                </li>
                <li>
                    字体颜色<input type="text">
                </li>
                <button type="button" class="save">保存</button>
            </ul>
            <ul class="tags">
                <li>猫咪</li>
                <li>排骨</li>
                <li>猫咪</li>
                <li>排骨</li>
            </ul>
            <div class="delete">
                <input type="text">
                <button type="button">删除</button>
            </div>
        </div>
        <div class="mask" id="mask"></div>
    </body>
</html>