/* 路由配置全写这里 */
import Vue from 'vue'
import VueRouter from 'vue-router'

/* 开启debug模式 */
Vue.config.debug = true;
Vue.use(VueRouter);

import login from '../views/login.vue';
import admin from '../views/admin.vue';
import article from '../views/blog/article.vue';
import menu from '../views/blog/menu.vue';
import tag from '../views/blog/tag.vue';
import user from '../views/blog/user.vue';
import comment from '../views/blog/comment.vue';
import statistic from '../views/home/statistic.vue';
import file from '../views/resource/file.vue';
import settings from '../views/system/settings.vue';
import editor from '../views/blog/editor.vue';

export default new VueRouter({
    //mode: 'history',
    base: __dirname,
    routes: [
        {
            path: '',
            component: login
        },
        {
            path: '/admin',
            component: admin,
            children:[{
                    path:'blog/article',
                    component:article
                }, {
                    path:'blog/tag',
                    component:tag
                }, {
                    path:'blog/user',
                    component:user
                }, {
                    path:'blog/menu',
                    component:menu
                }, {
                    path:'blog/comment',
                    component:comment
                }, {
                    path:'blog/editor/:id',
                    name:"editor",
                    component:editor
                },{
                    path:'home/statistic',
                    component:statistic
                },{
                    path:'resource/file',
                    component:file
                },{
                    path:'system/settings',
                    component:settings
                }
            ]
        }
    ]
})
