<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">

        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="stylesheet" href="/libs/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="/css/normalize.css">
        <link rel="stylesheet" href="/css/article.css">
        <link rel="stylesheet" href="/libs/font-awesome/css/font-awesome.min.css">

        <script src="/js/vendor/modernizr-2.6.2.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
        <p class="chromeframe">You are using an
            <strong>outdated</strong> browser. Please
                <a href="http://browsehappy.com/">upgrade your browser</a> or
                <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame
            </a>
            to improve your experience.
        </p>
        <![endif]-->

        <header class="navbar">
            <div class="containers">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="logo">
                    <a href="/">joylife</a>
                </div>

                <div class="menu">
                    <a href="/">首页</a>
                    <a href="#">话题</a>
                    <a href="#">工艺</a>
                    <a href="#">工具</a>
                </div>

                <div class="opreate">
                    <a href="#" class="login">登录</a>
                    <a href="#" class="register">注册</a>
                </div>
            </div>
        </header>

        <div class="row body">
            <div class="col-lg-offset-1 col-md-7 left">
                <div class="content">
                    <article>
                        <h1>${article.title}</h1>
                        ${article.articleContent.content}
                    </article>
                </div>

                <ul class="comments">
                    <li class="comment">
                        <div class="header">
                            <img src="/images/kill-browser.png">
                            <div class="title">
                                <span>泡泡堂</span>
                                <span class="time">2017-07-07 15:06</span>
                                <p>生存还是死亡,这是一个值得思考的问题</p>
                            </div>
                        </div>
                        <p class="content">好文章啊,打死快递员</p>
                        <div class="function">
                            <a href="#"><i class="fa fa-thumbs-up"></i>赞</a>
                            <a href="#"><i class="fa fa-thumbs-down"></i>踩</a>
                            <a href="#"><i class="fa fa-comment"></i>评论</a>
                            <a href="#"><i class="fa fa-share"></i>分享</a>
                        </div>
                    </li>
                    <li class="comment">
                        <div class="header">
                            <img src="/images/kill-browser.png">
                            <div class="title">
                                <span>泡泡堂</span>
                                <span class="time">2017-07-07 15:06</span>
                                <p>生存还是死亡,这是一个值得思考的问题</p>
                            </div>
                        </div>
                        <p class="content">好文章啊,打死快递员</p>
                        <div class="function">
                            <a href="#"><i class="fa fa-thumbs-up"></i>赞</a>
                            <a href="#"><i class="fa fa-thumbs-down"></i>踩</a>
                            <a href="#"><i class="fa fa-comment"></i>评论</a>
                            <a href="#"><i class="fa fa-share"></i>分享</a>
                        </div>

                        <ul class="replys">
                            <li class="reply">
                                <div class="header">
                                    <span class="name">泡泡堂</span>
                                    <span class="time">2017-07-07 15:06</span>
                                </div>

                                <div class="content">
                                    <span>生存还是死亡,这是一个值得思考的问题</span>
                                    <span class="operation">
                                        <a href="#"><i class="fa fa-thumbs-up"></i>赞</a>
                                        <a href="#"><i class="fa fa-thumbs-down"></i>踩</a>
                                        <a href="#"><i class="fa fa-comment"></i>评论</a>
                                    </span>
                                </div>
                            </li>
                            <li class="reply">
                                <div class="header">
                                    <span class="name">泡泡堂</span>
                                    <span class="time">2017-07-07 15:06</span>
                                </div>

                                <div class="content">
                                    <span>生存还是死亡,这是一个值得思考的问题</span>
                                    <span class="operation">
                                        <a href="#"><i class="fa fa-thumbs-up"></i>赞</a>
                                        <a href="#"><i class="fa fa-thumbs-down"></i>踩</a>
                                        <a href="#"><i class="fa fa-comment"></i>评论</a>
                                    </span>
                                </div>
                            </li>
                            <li class="reply">
                                <div class="header">
                                    <span class="name">泡泡堂</span>
                                    <span class="time">2017-07-07 15:06</span>
                                </div>

                                <div class="content">
                                    <span>生存还是死亡,这是一个值得思考的问题</span>
                                    <span class="operation">
                                        <a href="#"><i class="fa fa-thumbs-up"></i>赞</a>
                                        <a href="#"><i class="fa fa-thumbs-down"></i>踩</a>
                                        <a href="#"><i class="fa fa-comment"></i>评论</a>
                                    </span>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li class="comment">
                        <div class="header">
                            <img src="/images/robot.jpg">
                            <div class="title">
                                <span>泡泡堂</span>
                                <span class="time">2017-07-07 15:06</span>
                                <p>生存还是死亡,这是一个值得思考的问题</p>
                            </div>
                        </div>
                        <p class="content">好文章啊,打死快递员</p>
                        <div class="function">
                            <a href="#"><i class="fa fa-thumbs-up"></i>赞</a>
                            <a href="#"><i class="fa fa-thumbs-down"></i>踩</a>
                            <a href="#"><i class="fa fa-comment"></i>评论</a>
                            <a href="#"><i class="fa fa-share"></i>分享</a>
                        </div>
                    </li>
                    <nav aria-label="...">
                        <ul class="pager">
                            <li><a href="#">上一页</a></li>
                            <li><a href="#">下一页</a></li>
                        </ul>
                    </nav>
                </ul>
            </div>
            <div class="col-md-3 right">
                <div class="ads">

                </div>

                <div class="name">

                </div>

            </div>
        </div>

        <footer>
            <p>友情链接:
                <a href="http://www.baidu.com">百度</a>
                <a href="http://www.baidu.com">淘宝</a>
                <a href="http://www.baidu.com">堆糖</a>
                <a href="http://www.baidu.com">啦啦</a>
            </p>
            <p>©2017 joylife.top 版权所有。沪ICP备10038086号-3</p>
        </footer>
        <script src="/libs/jquery-2.2.1.min.js"></script>
        <script src="/libs/bootstrap/js/bootstrap.min.js"></script>
        <script src="/js/plugins.js"></script>
        <script src="/js/main.js"></script>
    </body>
</html>
