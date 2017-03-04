<template>
    <div class="tag" @mouseover="action=true"  @mouseleave="action=false">
        <p :style="prop.nameStyle">{{prop.name}}</p>
        <div v-if="action" class="action">
            <el-button type="primary" size="mini" icon="edit" @click="editTag"></el-button>
            <el-button type="primary" size="mini" icon="delete" @click="deleteTag"></el-button>
        </div>
        <!--编辑弹出框-->
        <el-dialog title="编辑菜单" v-model="modifyDialog">
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
                <el-button @click="modifyDialog = false">取 消</el-button>
                <el-button type="primary" @click="modifyDialog = false">确 定</el-button>
            </div>
        </el-dialog>
    </div>
</template>
<style  rel="stylesheet/scss" lang="scss">
    .tag {
        position: relative;
        margin-left: 1rem;
        margin-right: 1rem;
        text-align: center;
        p {
            margin: 0.5rem;
        }
        .action {
            position: absolute;
            top: 0;
            left:100%;
            .el-button {
                margin-left: 0;
                margin-bottom: 0.1rem;
            }
        }
    }
    .tag:hover {
        background-color: rgba(0,0,0,0.6);
        cursor:pointer
    }
</style>
<script type="text/ecmascript-6">
    export default{
        props:{
            prop:{
                name:'',
                nameStyle:{
                    'fontSize':'4rem'
                }
            }
        },
        data(){
            return{
                msg:'hello vue',
                //显示动作操作
                action:false,
                //修改弹出框
                modifyDialog:false
            }
        },
        methods:{
            editTag(){
                this.modifyDialog = true;
            },
            deleteTag(){
                this.$confirm('此操作将永久删除'+this.msg+', 是否继续?', '提示', {
                    confirmButtonText: '确定',
                    cancelButtonText: '取消',
                    type: 'warning'
                }).then(() => {
                    this.$message({
                        type: 'success',
                        message: '删除成功!'
                    });
                }).catch(() => {
                    this.$message({
                        type: 'info',
                        message: '已取消删除'
                    });
                });
            }
        },
        components:{

        }
    }
</script>
