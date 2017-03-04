<template>
    <div id="home">
        <div class="head">
            <i class="fa fa-bars side-switch" @click="sideWitch" ></i>
        </div>
        <div class="left" v-bind:class="{'left-show': sideActive,'left-hide':!sideActive}">
            <el-row class="tac">
                <el-col>
                    <div class="header">
                        <img src="../assets/header.jpg" />
                        <p>Admin</p>
                    </div>
                    <el-menu default-active="2" class="el-menu-vertical-demo" theme="dark">
                        <router-link to="/admin/home/statistic">
                            <el-menu-item index="1">
                                <i class="fa fa-tachometer"></i>统计
                            </el-menu-item>
                        </router-link>
                        <el-submenu index="2">
                            <template slot="title">
                                <i class="fa fa-book"></i> blog
                            </template>
                            <router-link to="/admin/blog/menu">
                                <el-menu-item index="2-1">菜单</el-menu-item>
                            </router-link>
                            <router-link to="/admin/blog/tag">
                                <el-menu-item index="2-2">标签</el-menu-item>
                            </router-link>
                            <router-link to="/admin/blog/article">
                                <el-menu-item index="2-3">文章</el-menu-item>
                            </router-link>
                            <router-link to="/admin/blog/comment">
                                <el-menu-item index="2-4">评论</el-menu-item>
                            </router-link>
                            <router-link to="/admin/blog/user">
                                <el-menu-item index="2-5">用户</el-menu-item>
                            </router-link>
                        </el-submenu>
                        <el-submenu index="3">
                            <template slot="title">
                                <i class="fa fa-paw"></i>
                                爬虫
                            </template>
                            <el-menu-item index="3-1"> 菜单</el-menu-item>
                        </el-submenu>
                        <router-link to="/admin/resource/file">
                            <el-menu-item index="4">
                                <i class="fa fa-cubes"></i> 资源管理
                            </el-menu-item>
                        </router-link>
                        <router-link to="/admin/system/settings">
                            <el-menu-item index="5">
                                <i class="fa fa-gear"></i> 系统设置
                            </el-menu-item>
                        </router-link>
                    </el-menu>
                </el-col>
            </el-row>
        </div>

        <div class="right" v-bind:class="{'right-show': rightActive,'right-full':!rightActive}">
            <div class="body">
                <router-view></router-view>
            </div>
            <div class="foot"></div>
        </div>
    </div>
</template>
<style rel="stylesheet/scss" lang="scss">

    $side:20rem;
    $side-delay:0.5s;
    //隐藏左侧菜单动画
    @keyframes hideSideBar
    {
        from {left: 0}
        to {left: -$side}
    }
    //显示左侧菜单动画
    @keyframes showSideBar
    {
        from {left: -$side}
        to {left: 0}
    }

    //全屏右侧内容
    @keyframes fullRightContent {
        from {margin-left: $side}
        to {margin-left: 0}
    }
    //恢复右侧内容
    @keyframes showRightContent {
        from {margin-left: 0}
        to {margin-left: $side}
    }

    #home {
        height: 100%;
        .head {
            background-color: #F9FAFC;
            height: 6%;
            //切换按钮
            .side-switch {
                font-size: 2.4rem;
                margin-left: 1rem;
                margin-top: 0.5rem;
                padding: 0.4rem;
            }
            .side-switch:hover {
                cursor: pointer;
            }
            .side-switch:active {
                -webkit-box-shadow: inset 0 -1.1rem 0.6rem 0 rgba(50, 50, 50, 0.46);
                -moz-box-shadow:    inset 0 -1.1rem 0.6rem 0 rgba(50, 50, 50, 0.46);
                box-shadow:         inset 0 -1.1rem 0.6rem 0 rgba(50, 50, 50, 0.46);
            }
        }
        .left {
            width: $side;
            height: 94%;
            background-color: #324057;
            position: absolute;
            overflow-x: hidden;
            overflow-y: auto;
            z-index: 99;
            .header {
                color: #C0CCDA;
                height: 12rem;
                text-align: center;
                img {
                    margin-top: 1rem;
                    width: 7rem;
                    border-radius: 7rem;
                }
            }
            a:hover, a:visited, a:link, a:active {
                color: #C0CCDA;
                text-decoration:none;
            }

        }
        //左侧显示
        .left-show {
            left: 0;
            animation: showSideBar $side-delay;
            -moz-animation: showSideBar $side-delay;	/* Firefox */
            -webkit-animation: showSideBar $side-delay;	/* Safari 和 Chrome */
            -o-animation: showSideBar $side-delay;	/* Opera */
        }
        //左侧隐藏
        .left-hide {
            left: -$side;
            animation: hideSideBar $side-delay;
            -moz-animation: hideSideBar $side-delay;	/* Firefox */
            -webkit-animation: hideSideBar $side-delay;	/* Safari 和 Chrome */
            -o-animation: hideSideBar $side-delay;	/* Opera */
        }

        .right {
            height: 94%;
            background-color: #0df1ec;
            overflow-x: hidden;
            overflow-y: auto;
            .body {
                height: 100%;
            }
            .foot {

            }
        }

        //左侧操作栏划出的右侧
        .right-show {
            margin-left: $side;
            animation: showRightContent $side-delay;
            -moz-animation: showRightContent $side-delay;	/* Firefox */
            -webkit-animation: showRightContent $side-delay;	/* Safari 和 Chrome */
            -o-animation: showRightContent $side-delay;	/* Opera */
        }
        //右侧铺满屏
        .right-full {
            animation: fullRightContent $side-delay;
            -moz-animation: fullRightContent $side-delay;	/* Firefox */
            -webkit-animation: fullRightContent $side-delay;	/* Safari 和 Chrome */
            -o-animation: fullRightContent $side-delay;	/* Opera */
        }

    }
</style>
<script type="text/ecmascript-6">
    //数据绑定
    let data = {
        msg:'hello vue',
        sideActive:true,
        rightActive:true
    }

    //判断浏览器类型
    let ifMobile =false;
    if( /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent) ) {
        ifMobile=true;
        data.rightActive=false;
        data.sideActive=false;
    }

    let admin = {
        data(){
            return data;
        },
        components:{

        },
        methods:{
            sideWitch(){
                if(ifMobile){
                    if(this.sideActive){
                        this.sideActive=false;
                    }else{
                        this.sideActive=true;
                    }
                }else {
                    if(this.sideActive){
                        this.sideActive=false;
                        this.rightActive = false;
                    }else{
                        this.sideActive=true;
                        this.rightActive=true;
                    }
                }
            }
        }
    }

    export default admin;
</script>
