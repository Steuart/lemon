<template>
    <li class="tree">
        <div @mouseover="showOption=true" @mouseleave="showOption=false" :class="{bold: isFolder}" class="folders"
                >
            <el-input
                    v-model="model.name"
                    v-show="edit"
                    size="mini">
            </el-input>
            <span class="fold" @click="toggle" v-show="!edit">
                <i class="el-icon-picture"></i>
                {{model.name}}
            </span>
            <i class="icon" :class="{'el-icon-caret-right':!open,'el-icon-caret-bottom':open}" v-if="isFolder"></i>
            <span v-if="showOption" class="option">
                <i class="el-icon-edit"></i>
                <i class="el-icon-plus"></i>
                <i class="el-icon-delete"></i>
            </span>
        </div>
        <ul v-show="open" v-if="isFolder">
            <item
                v-for="model in model.children"
                :model="model">
            </item>
        </ul>
    </li>
</template>
<style rel="stylesheet/scss" lang="scss">
    .tree {
        list-style-type:none;
        .folders {
            cursor: pointer;
            height: 2rem;
            .el-input {
                width: 10rem;
            }
            .fold {
                font-size: 1.6rem;
                background-color: darkkhaki;
                box-shadow:2px 2px 5px #000;
                border-radius: 0.5rem;
            }
            .icon {
                font-size: 1.2rem;
            }
            .option {
                line-height: 2rem;
                float: right;
                font-size: 1.4rem;
            }
        }
    }
</style>
<script type="text/ecmascript-6">
    export default{
        name: 'item',
        props: {
            model: Object
        },
        data: function () {
            return {
                open: false,
                edit:false,
                showOption:false
            }
        },
        computed: {
            isFolder: function () {
                return true
            }
        },
        methods: {
            toggle: function () {
                if (this.isFolder) {
                    this.open = !this.open
                }
            },
            changeType: function () {
                this.edit=!this.edit;
                if (!this.isFolder) {
                    Vue.set(this.model, 'children', [])
                    this.addChild()
                    this.open = true
                }
            },
            addChild: function () {
                this.model.children.push({
                    name: 'new stuff'
                })
            }
        }
    }
</script>
