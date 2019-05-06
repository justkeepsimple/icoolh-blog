package m.icoolh.blog.manage.service;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.entity.Announcement;

import java.util.List;

/**
 * Created by yangkaihong on 2019/3/18
 */
public interface IAnnouncementService {
    int saveAnnouncement(Announcement announcement);
    PageBean<Announcement> listAnnouncements(Announcement announcement, PageBean pageBean);
    int updateById(Announcement announcement);
    int deleteById(Long id);
    int deleteByIds(List<Long> ids);
}
