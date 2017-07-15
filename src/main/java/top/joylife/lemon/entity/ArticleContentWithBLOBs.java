package top.joylife.lemon.entity;

public class ArticleContentWithBLOBs extends ArticleContent {
    private String content;

    private String markdown;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown == null ? null : markdown.trim();
    }
}