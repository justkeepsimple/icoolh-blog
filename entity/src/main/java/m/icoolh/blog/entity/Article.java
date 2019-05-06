package m.icoolh.blog.entity;

import java.util.Date;

public class Article {
    /**
     * 主键id id
     */
    private Long id;

    /**
     * 文章标题 title_
     */
    private String title;

    /**
     * 文章缩略图 thumb
     */
    private String thumb;

    /**
     * 文章描述 description
     */
    private String description;

    /**
     * 文章来源 origin
     */
    private Integer origin;

    /**
     * 文章状态 state
     */
    private Integer state;

    /**
     * 公开度 publish
     */
    private Integer publish;

    /**
     * 访问密码 password_
     */
    private String password;

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
     * @date 2019-03-14 16:53:13
     * @return id 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id
     * @date 2019-03-14 16:53:13
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 文章标题
     * @date 2019-03-14 16:53:13
     * @return title_ 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 文章标题
     * @date 2019-03-14 16:53:13
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 文章缩略图
     * @date 2019-03-14 16:53:13
     * @return thumb 文章缩略图
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * 文章缩略图
     * @date 2019-03-14 16:53:13
     * @param thumb 文章缩略图
     */
    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    /**
     * 文章描述
     * @date 2019-03-14 16:53:13
     * @return description 文章描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 文章描述
     * @date 2019-03-14 16:53:13
     * @param description 文章描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 文章来源
     * @date 2019-03-14 16:53:13
     * @return origin 文章来源
     */
    public Integer getOrigin() {
        return origin;
    }

    /**
     * 文章来源
     * @date 2019-03-14 16:53:13
     * @param origin 文章来源
     */
    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    /**
     * 文章状态
     * @date 2019-03-14 16:53:13
     * @return state 文章状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 文章状态
     * @date 2019-03-14 16:53:13
     * @param state 文章状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 公开度
     * @date 2019-03-14 16:53:13
     * @return publish 公开度
     */
    public Integer getPublish() {
        return publish;
    }

    /**
     * 公开度
     * @date 2019-03-14 16:53:13
     * @param publish 公开度
     */
    public void setPublish(Integer publish) {
        this.publish = publish;
    }

    /**
     * 访问密码
     * @date 2019-03-14 16:53:13
     * @return password_ 访问密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 访问密码
     * @date 2019-03-14 16:53:13
     * @param password 访问密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 创建时间
     * @date 2019-03-14 16:53:13
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @date 2019-03-14 16:53:13
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @date 2019-03-14 16:53:13
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @date 2019-03-14 16:53:13
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}