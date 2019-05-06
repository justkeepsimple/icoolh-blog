package m.icoolh.blog.entity;

import java.util.Date;

public class Category {
    /**
     * 主键id id
     */
    private Long id;

    /**
     * 父分类id pid
     */
    private Long pid;

    /**
     * 分类名称 name_
     */
    private String name;

    /**
     * 文章数 art_num
     */
    private Integer artNum;

    /**
     * 分类别名 slug
     */
    private String slug;

    /**
     * 分类描述 description
     */
    private String description;

    /**
     * 创建时间 create_time
     */
    private Date createTime;

    /**
     * 更新时间 update_time
     */
    private Date updateTime;

    /**
     * 主键id
     * @date 2019-03-12 10:56:00
     * @return id 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id
     * @date 2019-03-12 10:56:00
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 父分类id
     * @date 2019-03-12 10:56:00
     * @return pid 父分类id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 父分类id
     * @date 2019-03-12 10:56:00
     * @param pid 父分类id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 分类名称
     * @date 2019-03-12 10:56:00
     * @return name_ 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 分类名称
     * @date 2019-03-12 10:56:00
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 文章数
     * @date 2019-03-12 10:56:00
     * @return art_num 文章数
     */
    public Integer getArtNum() {
        return artNum;
    }

    /**
     * 文章数
     * @date 2019-03-12 10:56:00
     * @param artNum 文章数
     */
    public void setArtNum(Integer artNum) {
        this.artNum = artNum;
    }

    /**
     * 分类别名
     * @date 2019-03-12 10:56:00
     * @return slug 分类别名
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 分类别名
     * @date 2019-03-12 10:56:00
     * @param slug 分类别名
     */
    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    /**
     * 分类描述
     * @date 2019-03-12 10:56:00
     * @return description 分类描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 分类描述
     * @date 2019-03-12 10:56:00
     * @param description 分类描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 创建时间
     * @date 2019-03-12 10:56:00
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @date 2019-03-12 10:56:00
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @date 2019-03-12 10:56:00
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @date 2019-03-12 10:56:00
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}