package m.icoolh.blog.entity;

public class ArticleTag {
    /**
     * 文章id art_id
     */
    private Long artId;

    /**
     * 标签id tag_id
     */
    private Long tagId;

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
     * 标签id
     * @date 2019-03-05 13:55:09
     * @return tag_id 标签id
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 标签id
     * @date 2019-03-05 13:55:09
     * @param tagId 标签id
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}