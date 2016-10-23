<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8" />
    <title>登录 | 注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />
    <link href="/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
    <link href="/global/css/components-md.min.css" rel="stylesheet" id="style_components" type="text/css" />
    <link href="/global/css/plugins-md.min.css" rel="stylesheet" type="text/css" />

    <link href="/css/login.css" rel="stylesheet" type="text/css" />
    <link rel="shortcut icon" href="favicon.ico" /> </head>
<body class=" login">
<div class="menu-toggler sidebar-toggler"></div>
<!-- END SIDEBAR TOGGLER BUTTON -->
<!-- BEGIN LOGO -->
<div class="logo">
    <a href="/">
        <img src="" alt="" />
    </a>
</div>
<!-- END LOGO <!---->
<!-- BEGIN LOGIN -->
<div class="content">
    <!-- BEGIN LOGIN FORM -->
    <form class="login-form" action="/" method="post">
        <h3 class="form-title font-green">登录</h3>
        <div class="alert alert-danger display-hide">
            <button class="close" data-close="alert"></button>
            <span> 请输入用户名和密码。 </span>
        </div>
        <div class="form-group">
            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
            <label class="control-label visible-ie8 visible-ie9">用户名 </label>
            <input class="form-control form-control-solid placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名" name="username" /> </div>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">密码 </label>
            <input class="form-control form-control-solid placeholder-no-fix" type="password" autocomplete="off" placeholder="密码" name="password" /> </div>
        <div class="form-actions">
            <button type="submit" class="btn green uppercase">登录 </button>
            <label class="rememberme check">
                <input type="checkbox" name="remember" value="1" />记住我 </label>
            <a href="javascript:;" id="forget-password" class="forget-password">忘记密码?</a>
        </div>
        <div class="login-options">
            <h4>社交账号登录</h4>
            <ul class="social-icons">
                <li>
                    <a class="social-icon-color facebook" data-original-title="facebook" href="javascript:;"></a>
                </li>
                <li>
                    <a class="social-icon-color twitter" data-original-title="Twitter" href="javascript:;"></a>
                </li>
                <li>
                    <a class="social-icon-color googleplus" data-original-title="Goole Plus" href="javascript:;"></a>
                </li>
                <li>
                    <a class="social-icon-color linkedin" data-original-title="Linkedin" href="javascript:;"></a>
                </li>
            </ul>
        </div>
        <div class="create-account">
            <p>
                <a href="javascript:;" id="register-btn" class="uppercase">注册账号</a>
            </p>
        </div>
    </form>
    <!-- END LOGIN FORM -->
    <!-- BEGIN FORGOT PASSWORD FORM -->
    <form class="forget-form" action="index.html" method="post">
        <h3 class="font-green">忘记密码 ?</h3>
        <p> 请填写邮箱地址找回密码 </p>
        <div class="form-group">
            <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="邮箱" name="email" /> </div>
        <div class="form-actions">
            <button type="button" id="back-btn" class="btn btn-default">返回</button>
            <button type="submit" class="btn btn-success uppercase pull-right">提交</button>
        </div>
    </form>
    <!-- END FORGOT PASSWORD FORM -->
    <!-- BEGIN REGISTRATION FORM -->
    <form class="register-form" action="index.html" method="post">
        <h3 class="font-green">登录</h3>
        <p class="hint"> 填写您的详细信息: </p>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">全名</label>
            <input class="form-control placeholder-no-fix" type="text" placeholder="真实姓名" name="fullname" /> </div>
        <div class="form-group">
            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
            <label class="control-label visible-ie8 visible-ie9">邮箱</label>
            <input class="form-control placeholder-no-fix" type="text" placeholder="邮箱" name="email" /> </div>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">地址</label>
            <input class="form-control placeholder-no-fix" type="text" placeholder="地址" name="address" /> </div>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">City/Town</label>
            <input class="form-control placeholder-no-fix" type="text" placeholder="城市" name="city" /> </div>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">Country</label>
            <select name="country" class="form-control">
                <option value="">Country</option>
            </select>
        </div>
        <p class="hint"> 输入您的账号信息: </p>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">用户名</label>
            <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名" name="username" /> </div>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">密码</label>
            <input class="form-control placeholder-no-fix" type="password" autocomplete="off" id="register_password" placeholder="密码" name="password" /> </div>
        <div class="form-group">
            <label class="control-label visible-ie8 visible-ie9">确认密码</label>
            <input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="请确认密码" name="rpassword" /> </div>
        <#--<div class="form-group margin-top-20 margin-bottom-20">
            <label class="check">
                <input type="checkbox" name="tnc" /> I agree to the
                <a href="javascript:;"> Terms of Service </a> &
                <a href="javascript:;"> Privacy Policy </a>
            </label>
            <div id="register_tnc_error"> </div>
        </div>-->
        <div class="form-actions">
            <button type="button" id="register-back-btn" class="btn btn-default">返回</button>
            <button type="submit" id="register-submit-btn" class="btn btn-success uppercase pull-right">提交</button>
        </div>
    </form>
    <!-- END REGISTRATION FORM -->
</div>
<div class="copyright"> 2015 © www.joylife.top. </div>

<!-- BEGIN CORE PLUGINS -->
<script src="/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="/global/plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="/global/plugins/jquery-validation/js/additional-methods.min.js" type="text/javascript"></script>
<script src="/global/plugins/jquery-validation/js/localization/messages_zh.min.js" type="text/javascript"></script>
<script src="/global/scripts/app.min.js" type="text/javascript"></script>

<script src="/js/login.js" type="text/javascript"></script>
</body>

</html>