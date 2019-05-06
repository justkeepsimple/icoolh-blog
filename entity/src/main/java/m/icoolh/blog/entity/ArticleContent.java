package m.icoolh.blog.entity;

public class ArticleContent {
    /**
     * 文章id art_id
     */
    private Long artId;

    /**
     * 文章内容 content
     */
    private String content;

    /**
     * 文章id
     * @date 2019-03-14 16:53:13
     * @return art_id 文章id
     */
    public Long getArtId() {
        return artId;
    }

    /**
     * 文章id
     * @date 2019-03-14 16:53:13
     * @param artId 文章id
     */
    public void setArtId(Long artId) {
        this.artId = artId;
    }

    /**
     * 文章内容
     * @date 2019-03-14 16:53:13
     * @return content 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 文章内容
     * @date 2019-03-14 16:53:13
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}