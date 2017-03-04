<template>
    <div id="editor">
        <el-row>
            <el-col :span="12">
                <textarea class="edit-input" id="text"
                          placeholder="请输入内容"
                          v-model="source"
                          @keydown.prevent.tab="tabkey"
                          @keydown.prevent.ctrl.83="save"
                          @blur="save"
                >
                </textarea>
            </el-col>
            <el-col :span="12" class="review">
                <vue-markdown :source="source"></vue-markdown>
            </el-col>
        </el-row>
    </div>
</template>
<style rel="stylesheet/scss" lang="scss">
    #editor {
        height: 100%;
        overflow-y: hidden;
        .el-row, .el-col, .edit-input {
            height: 100%;
        }
        textarea {
            height: 100%;
            width: 99%;
            font-size: 1.6rem;
            font-family: "Avenir Next", Helvetica, Arial, sans-serif;
            border-right: 0.5rem solid #0b97c4;
        }
        .review {
            background-color: #ffffff;
            padding-left: 1rem;
            overflow-y: auto;
            overflow-x: hidden;
        }
    }
</style>
<script type="text/ecmascript-6">

    import VueMarkdown from 'vue-markdown'
    export default{
        data(){
            return{
                msg:'hello vue',
                source: new Date().toLocaleTimeString()+""
            }
        },
        methods: {
            //空四格
            tabkey (){
                insertAtCaret("text","    ");
            },
            //保存
            save () {
                this.$message('保存成功');
            }
        },
        components: {
            VueMarkdown
        },
        mounted () {
            setInterval(function () {
                this.source = new Date().toLocaleTimeString();
            },1000);
            console.log('deviceid: ' + this.$route.params.id);
        }
    }

    //插入字符串
    function insertAtCaret(id,myValue){
        var text = document.getElementById(id);
        var val = text.value;
        var pos = text.selectionStart;
        var l = val.substring(0,pos);
        var r = val.substring(pos,val.length);
        text.value = l+myValue +r;
        text.selectionStart = text.selectionEnd = pos +myValue.length;
    }
</script>
