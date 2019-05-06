package m.icoolh.blog.entity;

public class ArticleExt {
    /**
     * 文章id art_id
     */
    private Long artId;

    /**
     *  name_
     */
    private String name;

    /**
     *  value_
     */
    private String value;

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
     * 
     * @date 2019-03-05 13:55:09
     * @return name_ 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @date 2019-03-05 13:55:09
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @date 2019-03-05 13:55:09
     * @return value_ 
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @date 2019-03-05 13:55:09
     * @param value 
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}