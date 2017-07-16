
<div class="col-lg-offset-1 col-md-7 left">
    <ul class="articles">
    <#list pageInfo.list as articleVo>
        <li>
            <h1>
                ${articleVo.title}
            </h1>
            <p class="author">
                作者：
                <a href="#">${articleVo.author}</a>
                <span class="time">${articleVo.createTime?datetime}</span>
            </p>
            <div class="content">
                <a href="/article">
                    ${articleVo.summary}
                </a>
            </div>
            <div class="tags">
                <i class="fa fa-tags"></i>
                <#list articleVo.tags as tag>
                    <a class="tag" href="#" style="color: ${tag.fontColor};background-color: ${tag.bgColor}">${tag.name}</a>
                </#list >
            </div>
            <div class="footer">
                <a href="#">
                    <i class="fa fa-thumbs-up"></i>点赞(${articleVo.praiseNo})
                </a>
                <a href="#">
                    <i class="fa fa-thumbs-down"></i>踩(${articleVo.treadNo})
                </a>
                <a href="#">
                    <i class="fa fa-comment"></i>评论(${articleVo.commentNo})
                </a>
                <a href="#">
                    <i class="fa fa-eye"></i>浏览(${articleVo.scanNo})
                </a>
            </div>
        </li>
    </#list>
    </ul>
    <nav aria-label="...">
        <ul class="pager">
            <li><a href="#">上一页</a></li>
            <li><a href="#">下一页</a></li>
        </ul>
    </nav>
</div>