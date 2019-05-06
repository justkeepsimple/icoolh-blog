package m.icoolh.blog.entity;

public class CategoryExt {
    /**
     * 文章分类id cat_id
     */
    private Long catId;

    /**
     *  name_
     */
    private String name;

    /**
     *  value_
     */
    private String value;

    /**
     * 文章分类id
     * @date 2019-03-05 13:55:09
     * @return cat_id 文章分类id
     */
    public Long getCatId() {
        return catId;
    }

    /**
     * 文章分类id
     * @date 2019-03-05 13:55:09
     * @param catId 文章分类id
     */
    public void setCatId(Long catId) {
        this.catId = catId;
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