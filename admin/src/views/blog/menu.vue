<template>
    <div id="menu">
        <div class="header">
            <el-button type="primary" icon="plus" @click="modifyArticle=true" size="small"></el-button>
            <el-input class="search"
                      placeholder="搜索"
                      icon="search">
            </el-input>
        </div>
        <ul class="content">
            <item
                    :model="treeData">
            </item>
        </ul>
    </div>

</template>
<style rel="stylesheet/scss" lang="scss">
    #menu {
        padding:2rem;
        .header {
            position: fixed;
            z-index: 98;
            display: flex;
            justify-content: center;
            .el-button{
                margin-right: 0.5rem;
                width:4rem;
                border-radius: 4rem;
            }
        }
        .content {
            margin: 0;
            padding: 4.5rem 0 0 0;
            list-style-type:none;
            ul {
                list-style-type:none;
            }
        }
    }
</style>
<script type="text/ecmascript-6">

    import item from '../../components/item.vue'
    var data = { //初始数据
        name: '页面',
        grade:0,
        children: [
            { name: 'hello' },
            { name: 'wat' },
            {
                name: 'child folder',
                children: [
                    {
                        name: 'child folder',
                        children: [
                            { name: 'hello' },
                            { name: 'wat' }
                        ]
                    },
                    { name: 'hello' },
                    { name: 'wat' },
                    {
                        name: 'child folder',
                        children: [
                            { name: 'hello' },
                            { name: 'wat' }
                        ]
                    }
                ]
            },
            { name: 'wat' },
            { name: 'wat' }
        ]
    };
    export default{
        data(){
            return{
                msg:'hello vue',
                dialogFormVisible:false,
                treeData:data
            }
        },
        components:{
            "item":item
        },
        methods:{
            showEdit(){
                this.dialogFormVisible=true
            }
        }
    }
</script>
