package m.icoolh.blog.entity;

import m.icoolh.blog.entity.vo.TagVo;

import java.util.Date;

public class Tag {
    /**
     * 主键id id
     */
    private Long id;

    /**
     * 标签名称 name_
     */
    private String name;

    /**
     * 标签别名 slug
     */
    private String slug;

    /**
     * 关联文章数 art_num
     */
    private Integer artNum;

    /**
     * 标签描述 description
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
     * @date 2019-03-11 11:01:51
     * @return id 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id
     * @date 2019-03-11 11:01:51
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 标签名称
     * @date 2019-03-11 11:01:51
     * @return name_ 标签名称
     */
    public String getName() {
        return name;
    }

    /**
     * 标签名称
     * @date 2019-03-11 11:01:51
     * @param name 标签名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 标签别名
     * @date 2019-03-11 11:01:51
     * @return slug 标签别名
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 标签别名
     * @date 2019-03-11 11:01:51
     * @param slug 标签别名
     */
    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    /**
     * 关联文章数
     * @date 2019-03-11 11:01:51
     * @return art_num 关联文章数
     */
    public Integer getArtNum() {
        return artNum;
    }

    /**
     * 关联文章数
     * @date 2019-03-11 11:01:51
     * @param artNum 关联文章数
     */
    public void setArtNum(Integer artNum) {
        this.artNum = artNum;
    }

    /**
     * 标签描述
     * @date 2019-03-11 11:01:51
     * @return description 标签描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 标签描述
     * @date 2019-03-11 11:01:51
     * @param description 标签描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 创建时间
     * @date 2019-03-11 11:01:51
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @date 2019-03-11 11:01:51
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @date 2019-03-11 11:01:51
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @date 2019-03-11 11:01:51
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}