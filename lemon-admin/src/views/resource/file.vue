<template>
    <div id="file">
        <div class="header">
            <el-button type="primary" icon="plus" @click="modifyArticle=true" size="small"></el-button>
            <el-input class="search"
                      placeholder="搜索"
                      icon="search">
            </el-input>
        </div>
        <div class="content">
            <el-table
                    :data="tableData"
                    border
                    style="width: 100%">
                <el-table-column
                        label="日期"
                        width="180">
                    <template scope="scope">
                        <el-icon name="time"></el-icon>
                        <span style="margin-left: 10px">{{ scope.row.date }}</span>
                    </template>
                </el-table-column>
                <el-table-column
                        label="姓名"
                        width="180">
                    <template scope="scope">
                        <el-icon name="time"></el-icon>
                        <span style="margin-left: 10px">{{ scope.row.name }}</span>
                    </template>
                </el-table-column>
                <el-table-column
                        label="姓名"
                        width="180">
                    <template scope="scope">
                        <el-icon name="time"></el-icon>
                        <span style="margin-left: 10px">{{ scope.row.name }}</span>
                    </template>
                </el-table-column>
                <el-table-column label="操作">
                    <template scope="scope">
                        <el-button
                                size="small"
                                type="danger"
                        >查看</el-button>
                        <el-button
                                size="small"
                        >编辑</el-button>
                        <el-button
                                size="small"
                                type="danger"
                        >删除</el-button>
                    </template>
                </el-table-column>
            </el-table>
        </div>
        <div class="pagination">
            <el-pagination
                    :current-page="currentPage"
                    layout="prev, pager, next, jumper"
                    :total="400">
            </el-pagination>
        </div>
    </div>
</template>
<style rel="stylesheet/scss" lang="scss">
    #file {
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
            padding: 4.5rem 0 0 0;
            .folder {
                height: 54rem;
                padding: 2rem 0 0 2rem;
                background-color: #08dbff;
            }
        }
        .pagination {
            text-align: center;
        }
    }


</style>
<script type="text/ecmascript-6">

    export default{
        data(){
            return{
                'msg':'hello vue',
                tableData: [{
                    date: '2016-05-02',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1517 弄'
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1519 弄'
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1516 弄'
                }],
                currentPage:4
            }
        },
        components:{

        }
    }
</script>
