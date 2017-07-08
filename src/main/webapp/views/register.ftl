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
        <link rel="stylesheet" href="/css/register.css">

        <script src="/js/vendor/modernizr-2.6.2.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->

        <!-- Add your site or application content here -->
        <div class="content">
            <div class="register">
                <h1>欢迎注册</h1>
                <form>
                    <div class="form-group">
                        <label >用户名</label>
                        <input type="text" class="form-control" placeholder="usernmae">
                    </div>
                    <div class="form-group">
                        <label >手机号</label>
                        <input type="text" class="form-control" placeholder="cellpone">
                    </div>
                    <div class="form-group">
                        <label >密码</label>
                        <input type="text" class="form-control" placeholder="password">
                    </div>
                    <div class="form-group">
                        <label >确认密码</label>
                        <input type="text" class="form-control" placeholder="password">
                    </div>

                    <div class="form-group identify-code">
                        <label>验证码</label>
                        <input type="text" class="form-control" placeholder="code">
                        <span class="btn btn-success">重新发送</span>
                    </div>
                    <input class="btn btn-info" type="submit" value="注册" />
                </form>
                <div class="footer">
                    <span>已有账号？<a href="/login">登录</a></span>
                </div>
            </div>
        </div>



        <script src="/libs/jquery-2.2.1.min.js"></script>
        <script src="/libs/bootstrap/js/bootstrap.min.js"></script>
        <script src="/js/plugins.js"></script>
        <script src="/js/main.js"></script>

        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
        <script>
            var _gaq=[['_setAccount','UA-XXXXX-X'],['_trackPageview']];
            (function(d,t){var g=d.createElement(t),s=d.getElementsByTagName(t)[0];
            g.src=('https:'==location.protocol?'//ssl':'//www')+'.google-analytics.com/ga.js';
            s.parentNode.insertBefore(g,s)}(document,'script'));
        </script>
    </body>
</html>
