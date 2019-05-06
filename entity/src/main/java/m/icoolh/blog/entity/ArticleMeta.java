package m.icoolh.blog.entity;

public class ArticleMeta {
    /**
     * 文章id art_id
     */
    private Long artId;

    /**
     * 喜欢数 likes_
     */
    private Integer likes;

    /**
     * 观看数 views_
     */
    private Integer views;

    /**
     * 评论数 comments_
     */
    private Integer comments;

    /**
     * 文章id
     * @date 2019-03-14 17:31:07
     * @return art_id 文章id
     */
    public Long getArtId() {
        return artId;
    }

    /**
     * 文章id
     * @date 2019-03-14 17:31:07
     * @param artId 文章id
     */
    public void setArtId(Long artId) {
        this.artId = artId;
    }

    /**
     * 喜欢数
     * @date 2019-03-14 17:31:07
     * @return likes_ 喜欢数
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * 喜欢数
     * @date 2019-03-14 17:31:07
     * @param likes 喜欢数
     */
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    /**
     * 观看数
     * @date 2019-03-14 17:31:07
     * @return views_ 观看数
     */
    public Integer getViews() {
        return views;
    }

    /**
     * 观看数
     * @date 2019-03-14 17:31:07
     * @param views 观看数
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * 评论数
     * @date 2019-03-14 17:31:07
     * @return comments_ 评论数
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * 评论数
     * @date 2019-03-14 17:31:07
     * @param comments 评论数
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }
}