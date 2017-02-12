<template>
    <div id="login">
        <el-row type="flex" class="panel">
            <el-col :xs="24" :span="6">
                <h1 class="header">ADMIN</h1>
                <div class="body">
                    <el-input
                        placeholder="用户名"
                        type="text"
                        v-model="username">
                    </el-input>
                    <el-input
                        placeholder="密码"
                        type="password"
                        v-model="password">
                    </el-input>
                    <div>
                        <router-link class="myRouter" to="/admin">
                            <el-button type="primary">登录</el-button>
                        </router-link>
                        <router-link class="myRouter" to="/admin">
                            <el-button type="primary" style="float:right">取消</el-button>
                        </router-link>
                    </div>
                </div>
            </el-col>
        </el-row>
    </div>
</template>
<style lang="scss">
    #login {
        padding: 0.5rem;
        .panel {
            justify-content: center;

        }
        .header {
            font-size: 5rem;
            text-align: center;
            margin-top: 25%;
        }
        .body {
            padding: 2.5rem;
            background-color: rgba(15, 241, 139, 0.12);
            -moz-box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.2);
            -webkit-box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.2);
            box-shadow: 0 2px 10px 1px rgba(0, 0, 0, 0.2);
        }
        .el-input {
            margin-top: 1rem;
            margin-bottom: 3rem;
        }
    }
</style>
<script>
    export default{
        data(){
            return{
                msg:'hello vue',
                username:"",
                password:""
            }
        }
    }
</script>
