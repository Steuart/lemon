<template>
    <div id="articles">
        <div class="header">
            <el-button type="primary" icon="plus" @click="modifyArticle=true" size="small"></el-button>
            <el-input class="search"
                    placeholder="搜索"
                    icon="search"
                    >
            </el-input>
        </div>
        <ul class="content">
            <li v-for="article in articles" class="article">
                <header><h1>Internet Explorer 9</h1></header>
                <p>Windows Internet Explorer 9（简称 IE9）于 2011 年 3 月 14 日发布.....</p>
                <footer>
                    <div class="tags">
                        <span>评论(100)</span>
                        <span>评论(100)</span>
                        <span>评论(100)</span>
                        <el-tag>标签一</el-tag>
                        <el-tag>标签一</el-tag>
                        <el-tag>标签一</el-tag>
                    </div>
                    <el-button-group>
                        <el-button type="primary" icon="document" size="small" @click="modifyArticle=true"></el-button>
                        <router-link :to="{name:'editor',params:{id:article.name}}">
                            <el-button type="primary" icon="edit" size="small"></el-button>
                        </router-link>
                        <el-button type="primary" icon="delete" size="small" @click="deleteArticle"></el-button>
                    </el-button-group>
                </footer>
            </li>
        </ul>
        <div class="pagination">
            <el-pagination
                    @size-change="handleSizeChange"
                    @current-change="handleCurrentChange"
                    :current-page="currentPage"
                    layout="total, prev, pager, next, jumper"
                    :total="400">
            </el-pagination>
        </div>
        <!--新增和编辑弹出框-->
        <el-dialog title="编辑文章" v-model="modifyArticle">
            <el-form label-position="left" label-width="80px">
                <el-form-item label="标题">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="标签">
                    <el-select
                            v-model="value"
                            multiple
                            filterable
                            allow-create
                            placeholder="请选择文章标签">
                        <el-option
                                v-for="item in options"
                                :label="item.label"
                                :value="item.value">
                        </el-option>

                    </el-select>
                </el-form-item>
                <el-form-item label="来源">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="作者">
                    <el-input ></el-input>
                </el-form-item>
                <el-form-item label="摘要">
                    <el-input
                            type="textarea"
                            :rows="4">
                    </el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button @click="modifyArticle = false">取 消</el-button>
                <el-button type="primary" @click="modifyArticle = false">确 定</el-button>
            </div>
        </el-dialog>
    </div>
</template>
<style rel="stylesheet/scss" lang="scss">
    #articles {
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
        .content {
            list-style-type:none;
            padding: 4.5rem 0 0 0;
            .article {
                background-color: antiquewhite;
                margin-bottom: 1rem;
                padding: 0.5rem;
                box-shadow: 0 0.2rem 1rem 0.1rem rgba(0, 0, 0, 0.2);
                border-radius: 1rem;
                footer {
                    .tags{
                        display: inline;
                    }
                    .el-button-group {
                        float: right;
                    }
                }
            }
        }
        .pagination {
            text-align: center;
        }
        .el-dialog {
            .el-select {
                width: 100%;
            }
        }
    }
</style>
<script type="text/ecmascript-6">

    let articles=[
        {
            name:"sd"
        },
        {
            name:"sd1"
        },
        {
            name:"sdas"
        },
        {
            name:"sdas"
        },
        {
            name:"sd"
        },
        {
            name:"sd"
        },
        {
            name:"sd"
        },
        {
            name:"sd"
        },
        {
            name:"sd"
        },
        {
            name:"sd"
        }
    ]

    export default{
        data(){
            return{
                msg:'hello vue',
                articles:articles,
                currentPage: 4,
                modifyArticle:false,
                options: [{
                    value: 'HTML',
                    label: 'HTML'
                }, {
                    value: 'CSS',
                    label: 'CSS'
                }, {
                    value: 'JavaScr2',
                    label: 'JavaScript'
                }, {
                    value: 'JavaSc3t',
                    label: 'JavaScr1'
                }, {
                    value: 'Java4cript',
                    label: 'JavaScr2t'
                }, {
                    value: 'Ja5Script',
                    label: 'JavaS3pt'
                }, {
                    value: 'Java6Script',
                    label: 'JavaS4ipt'
                }, {
                    value: 'Java6Script',
                    label: 'JavaS4ipt'
                }, {
                    value: 'Java6Script',
                    label: 'JavaS4ipt'
                }, {
                    value: 'Java6Script',
                    label: 'JavaS4ipt'
                }, {
                    value: 'Java6Script',
                    label: 'JavaS4ipt'
                }, {
                    value: 'Java6Script',
                    label: 'JavaS4ipt'
                }, {
                    value: 'Java6Script',
                    label: 'JavaS4ipt'
                }],
                value:[]
            }
        },
        components:{

        },
        methods:{
            handleSizeChange(val) {
                console.log(`每页 ${val} 条`);
            },
            handleCurrentChange(val) {
                this.currentPage = val;
                console.log(`当前页: ${val}`);
            },
            //删除文章
            deleteArticle(){
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
        }
    }
</script>
