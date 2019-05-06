package m.icoolh.blog.entity;

public class ArticleCat {
    /**
     * 文章id art_id
     */
    private Long artId;

    /**
     * 分类id cat_id
     */
    private Long catId;

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
     * 分类id
     * @date 2019-03-05 13:55:09
     * @return cat_id 分类id
     */
    public Long getCatId() {
        return catId;
    }

    /**
     * 分类id
     * @date 2019-03-05 13:55:09
     * @param catId 分类id
     */
    public void setCatId(Long catId) {
        this.catId = catId;
    }
}