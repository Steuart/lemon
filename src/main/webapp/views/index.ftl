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
        <link rel="stylesheet" href="/css/index.css">
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
                    <a href="#">joylife</a>
                </div>

                <div class="menu">
                    <a href="#">首页</a>
                    <a href="#">工艺</a>
                    <a href="#">工具</a>
                    <a href="#">众筹</a>
                    <a href="#">铺子</a>
                </div>

                <div class="opreate">
                    <a href="/login" class="login">登录</a>
                    <a href="/register" class="register">注册</a>
                </div>
            </div>
        </header>

        <div class="row body">
            <div class="col-lg-offset-1 col-md-7 left">
                <ul class="articles">
                <#list pageInfo.list as articleVo>
                    <li>
                        <h1>
                            ${articleVo.title}
                        </h1>
                        <p class="author">
                            作者：
                            <a href="#">${articleVo.author}</a>
                            <span class="time">${articleVo.createTime?datetime}</span>
                        </p>
                        <div class="content">
                            <a href="/article">
                                ${articleVo.summary}
                            </a>
                        </div>
                        <div class="tags">
                            <i class="fa fa-tags"></i>
                            <#list articleVo.tags as tag>
                                <a class="tag" href="#" style="color: ${tag.fontColor};background-color: ${tag.bgColor}">${tag.name}</a>
                            </#list >
                        </div>
                        <div class="footer">
                            <a href="#">
                                <i class="fa fa-thumbs-up"></i>点赞(${articleVo.praiseNo})
                            </a>
                            <a href="#">
                                <i class="fa fa-thumbs-down"></i>踩(${articleVo.treadNo})
                            </a>
                            <a href="#">
                                <i class="fa fa-comment"></i>评论(${articleVo.commentNo})
                            </a>
                            <a href="#">
                                <i class="fa fa-eye"></i>浏览(${articleVo.scanNo})
                            </a>
                        </div>
                    </li>
                </#list>
                </ul>
                <nav aria-label="...">
                    <ul class="pager">
                        <li><a href="#">上一页</a></li>
                        <li><a href="#">下一页</a></li>
                    </ul>
                </nav>
            </div>
            <div class="col-md-3 right">

                <div class="the-hours">
                    <h1>此时此刻</h1>
                    <ul>
                        <li>毛毛正在查看</li>
                        <li>豆豆看完了00000</li>
                        <li>Arch回复了毛阿莫</li>
                        <li>妞妞加入平台</li>
                        <li>妞妞加入平台</li>
                        <li>妞妞加入平台</li>
                    </ul>
                    <a href="/now" class="more">------更多------</a>
                </div>

                <div class="groom">
                    <h1>热门推荐</h1>
                    <ul>
                        <li>
                            <a href="#">毛毛正在查看</a>
                        </li>
                        <li>
                            <a href="#">毛毛正在查看</a>
                        </li>
                        <li>
                            <a href="#">毛毛正在查看</a>
                        </li>
                        <li>
                            <a href="#">毛毛正在查看</a>
                        </li>
                        <li>
                            <a href="#">毛毛正在查看</a>
                        </li>
                    </ul>
                </div>

                <div class="tags">
                    <h1>标签云</h1>
                    <div class="list">
                        <a href="#" style="font-size: 3rem">毛毛</a>
                        <a href="#" style="font-size: 5rem">毛毛</a>
                        <a href="#" style="font-size: 5rem">JAVA</a>
                        <a href="#" style="font-size: 1rem">javascript</a>
                        <a href="#" style="font-size: 1rem">database</a>
                        <a href="#" style="font-size: 1rem">搜索引擎</a>
                        <a href="#" style="font-size: 2rem">天龙八部</a>
                        <a href="#" style="font-size: 1rem">画江湖</a>
                        <a href="#" style="font-size: 0.9rem">在这完</a>
                        <a href="#" style="font-size: 1.54rem">和我们</a>
                        <a href="#" style="font-size: 1rem">毛毛</a>
                        <a href="#" style="font-size: 3rem">毛毛</a>
                        <a href="#" style="font-size: 1rem">毛毛</a>
                    </div>

                    <a href="/tags" class="more">------更多------</a>
                </div>

                <div class="ads">
                    <h1>广而告之</h1>
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
