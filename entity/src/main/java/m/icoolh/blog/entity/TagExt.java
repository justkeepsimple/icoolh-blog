package m.icoolh.blog.entity;

public class TagExt {
    /**
     * 文章标签id tag_id
     */
    private Long tagId;

    /**
     *  name_
     */
    private String name;

    /**
     *  value_
     */
    private String value;

    /**
     * 文章标签id
     * @date 2019-03-05 13:55:09
     * @return tag_id 文章标签id
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * 文章标签id
     * @date 2019-03-05 13:55:09
     * @param tagId 文章标签id
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
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