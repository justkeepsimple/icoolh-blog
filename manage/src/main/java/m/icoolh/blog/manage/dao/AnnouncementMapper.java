package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.Announcement;
import m.icoolh.blog.entity.AnnouncementExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AnnouncementMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(AnnouncementExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(AnnouncementExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Announcement record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Announcement record);

    /**
     *
     * @mbggenerated
     */
    List<Announcement> selectByExample(AnnouncementExample example);

    /**
     *
     * @mbggenerated
     */
    Announcement selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Announcement record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Announcement record);

    int deleteByIds(@Param("ids") List<Long> ids);

    List<Announcement> listAnnouncements(Announcement announcement);
}