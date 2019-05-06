package m.icoolh.blog.entity;

public class ArticleKeyW {
    /**
     * 文章id art_id
     */
    private Long artId;

    /**
     * 关键字 keyword
     */
    private String keyword;

    /**
     * 文章id
     * @date 2019-03-05 13:55:09
     * @return art_id 文章id
     */
    public Long getArtId() {
        return artId;
    }

    /**
     * 文章id
     * @date 2019-03-05 13:55:09
     * @param artId 文章id
     */
    public void setArtId(Long artId) {
        this.artId = artId;
    }

    /**
     * 关键字
     * @date 2019-03-05 13:55:09
     * @return keyword 关键字
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 关键字
     * @date 2019-03-05 13:55:09
     * @param keyword 关键字
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}