<template>
    <div id="tag">
        <div class="header">
            <el-button type="primary" icon="plus" @click="addDialog=true" size="small"></el-button>
            <el-input class="search"
                  placeholder="搜索"
                  icon="search"
            >
            </el-input>
        </div>
        <div class="body">
            <tag :prop="tag" v-for="tag in tags">爱吃习惯</tag>
        </div>

        <!--新增弹出框-->
        <el-dialog title="编辑菜单" v-model="addDialog">
            <el-form label-position="left" label-width="80px">
                <el-form-item label="名字">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="字体颜色">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="备注">
                    <el-input
                            type="textarea"
                            :rows="3">
                    </el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button @click="addDialog = false">取 消</el-button>
                <el-button type="primary" @click="addDialog = false">确 定</el-button>
            </div>
        </el-dialog>
    </div>
</template>
<style rel="stylesheet/scss" lang="scss">
    #tag{
        padding: 2rem;
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
        .body {
            display: flex;
            flex-wrap:wrap;
            justify-content: center;
            align-items: center;
        }
    }
</style>
<script type="text/ecmascript-6">
    import tag from "../../components/tag.vue"
    let tags = [
        {
            name:"机器人",
            nameStyle:{
                "fontSize":'7rem',
                "color":'#aaaFFF'
            }
        },
        {
            name:"人工智能",
            nameStyle:{
                "fontSize":'2rem',
                "color":'#dacFFd'
            }
        }
    ]
    export default{
        data(){
            return{
                msg:'hello vue',
                tags:tags,
                addDialog:false
            }
        },
        components:{
            "tag":tag
        }
    }
</script>
