<template>
    <li class="menu-item">
        <div class="item-content">
            <span class="name">{{model.name}}</span>
            <span class="name"></span>
            <span class="name">排序:10</span>
            <el-button-group>
                <el-button type="primary" size="small"  @click="editDialog = true">编辑</el-button>
                <el-button type="success" size="small" @click="addDialog = true">添加</el-button>
                <el-button type="danger" size="small" :disabled="deleteShow" @click="deleteDialog">删除</el-button>
            </el-button-group>
        </div>
        <ul> <!-- open属性来决定是否打开，isFolder属性来决定能否打开 -->
            <item
                v-for="model in model.children"
                :model="model">
            </item> <!-- 重复使用item，并将数据传递给子组件，很深层次的文件夹也会遍历到 -->
        </ul>

        <!--编辑弹出框-->
        <el-dialog title="编辑菜单" v-model="editDialog">
            <el-form label-position="left" label-width="80px">
                <el-form-item label="名字">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="url">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="排序">
                    <el-input ></el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button @click="editDialog = false">取 消</el-button>
                <el-button type="primary" @click="editDialog = false">确 定</el-button>
            </div>
        </el-dialog>

        <!--添加弹出框-->
        <el-dialog title="新增菜单" v-model="addDialog">
            <el-form label-position="left" label-width="80px">
                <el-form-item label="名字">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="url">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="菜单">
                    <el-input ></el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button @click="addDialog = false">取 消</el-button>
                <el-button type="primary" @click="addDialog = false">确 定</el-button>
            </div>
        </el-dialog>
    </li>
</template>
<style  rel="stylesheet/scss" lang="scss">

    @keyframes item {
        from {background-color:#EFF2F7}
        to {background-color: #D3DCE6}
    }

    .menu-item {
        .item-content {
            background-color: #EFF2F7;
            border-top: rgba(77, 5, 27, 0.12) solid 0.2rem;
            border-radius: 0.5rem;
            height: 4rem;
            display: flex;
            align-items: center;
            justify-content: space-between;
            .name {
                margin-left: 1rem;
            }
            .el-button-group {
                margin-right: 1rem;
            }
        }
        .item-content:hover {
            background-color: #D3DCE6;
            animation: item 0.3s;
            -moz-animation: item 0.3s;	/* Firefox */
            -webkit-animation:item 0.3s;	/* Safari 和 Chrome */
            -o-animation: item 0.3s;	/* Opera */
        }
        ul {
            list-style-type:none;
        }
    }

</style>
<script type="text/ecmascript-6">
    export default{
        name: 'item',
        props: { //传递父组件传递的数据
            model:Object //判断是否是Object类型的数据
        },
        data(){
            return {
                open: false,
                editDialog:false,
                addDialog:false
            }
        },
        methods:{
            //删除菜单
            deleteDialog(){
                this.$confirm('此操作将永久删除'+this.model.name+', 是否继续?', '提示', {
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
        computed:{
            //删除按钮是否显示
            deleteShow(){
                let model = this.model;
                if(model.children && model.children.length!=0){
                    return true
                }else{
                    return false
                }
            }
        }
    }
</script>
