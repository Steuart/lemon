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
                            ${articleVo.article.title}
                        </h1>
                        <p class="author">
                            作者：
                            <a href="#">${articleVo.article.author}</a>
                            <span class="time">${articleVo.article.createTime?datetime}</span>
                        </p>
                        <div class="content">
                            <a href="/article/${articleVo.article.id}">
                                ${articleVo.article.summary}
                            </a>
                        </div>
                        <div class="tags">
                            <#if articleVo.tags??>
                                <i class="fa fa-tags"></i>
                                <#list articleVo.tags as tag>
                                    <a class="tag" href="#" style="color: ${tag.fontColor};background-color: ${tag.bgColor}">${tag.name}</a>
                                </#list >
                            </#if>
                        </div>
                        <div class="footer">
                            <a href="#">
                                <i class="fa fa-thumbs-up"></i>点赞(${articleVo.article.praiseNo})
                            </a>
                            <a href="#">
                                <i class="fa fa-thumbs-down"></i>踩(${articleVo.article.treadNo})
                            </a>
                            <a href="#">
                                <i class="fa fa-comment"></i>评论(${articleVo.article.commentNo})
                            </a>
                            <a href="#">
                                <i class="fa fa-eye"></i>浏览(${articleVo.article.scanNo})
                            </a>
                        </div>
                    </li>
                </#list>
                </ul>
                <nav aria-label="...">
                    <ul class="pager">
                        <#if pageInfo.hasPreviousPage>
                            <li><a href="/?pageNo=${pageInfo.prePage}">上一页</a></li>
                        <#else>
                            <li class="disabled"><a>上一页</a></li>
                        </#if>

                        <#if pageInfo.hasNextPage>
                            <li><a href="/?pageNo=${pageInfo.nextPage}">下一页</a></li>
                        <#else>
                            <li class="disabled"><a>下一页</a></li>
                        </#if>
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
                        <#list hotArticles as article>
                            <li>
                                <a href="/article/${article.id}">${article.title}</a>
                            </li>
                        </#list>
                    </ul>
                </div>

                <div class="tags">
                    <h1>标签云</h1>
                    <div class="list">
                        <#list hotTags as tag>
                            <a href="#" style="background-color: ${tag.bgColor};color: ${tag.fontColor};font-size: ${tag.fontSize}rem;">${tag.name}</a>
                        </#list>
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
