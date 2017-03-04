<template>
    <div id="app">
        <!-- 渲染出口 -->
        <router-view></router-view>
    </div>
</template>

<script type="text/ecmascript-6">
    export default {
        data () {
            return {
              msg: 'Use Vue 2.0 Today!',
                value1:0,
                value2:50,
                value3:42,
                radio:1
            }
        },
        components:{
            //'test':test
        },
        methods: {
            test () {
                this.$notify({
                    title: '标题名称',
                    message: '这是提示文案这是提示文案这是提示文案这是提示文案这是提示文案这是提示文案这是提示文案这是提示文案'
                });
        },
        startHacking () {
          this.$notify({
            title: 'It Works',
            message: 'We have laid the groundwork for you. Now it\'s your time to build something epic!',
            duration: 6000
          })
        }
        }
    }
</script>

<style  rel="stylesheet/scss" lang="scss">
    html {
        margin: 0;
        padding: 0;
        height: 100%;
        font-size: 62.5%;
        body {
            font-family: Helvetica, sans-serif;
            font-size: 1.6rem;
            background-color: #FFFFFF;
            margin: 0;
            padding: 0;
            height: 100%;
            #app {
                height: 100%;
            }
        }
    }

</style>
