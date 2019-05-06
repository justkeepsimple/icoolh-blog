package m.icoolh.blog.entity;

import java.util.Date;

public class Announcement {
    /**
     * 主键 id
     */
    private Long id;

    /**
     * 状态 state_
     */
    private Integer state;

    /**
     * 公共内容 content
     */
    private String content;

    /**
     * 更新时间 update_time
     */
    private Date updateTime;

    /**
     * 创建时间 create_time
     */
    private Date createTime;

    /**
     * 主键
     * @date 2019-03-18 15:49:28
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @date 2019-03-18 15:49:28
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 状态
     * @date 2019-03-18 15:49:28
     * @return state_ 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态
     * @date 2019-03-18 15:49:28
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 公共内容
     * @date 2019-03-18 15:49:28
     * @return content 公共内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 公共内容
     * @date 2019-03-18 15:49:28
     * @param content 公共内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 更新时间
     * @date 2019-03-18 15:49:28
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @date 2019-03-18 15:49:28
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建时间
     * @date 2019-03-18 15:49:28
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @date 2019-03-18 15:49:28
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}