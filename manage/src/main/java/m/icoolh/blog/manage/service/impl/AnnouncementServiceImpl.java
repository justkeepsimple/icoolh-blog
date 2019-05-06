package m.icoolh.blog.manage.service.impl;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.common.ResponseMsgCode;
import m.icoolh.blog.entity.Announcement;
import m.icoolh.blog.entity.vo.TagVo;
import m.icoolh.blog.exception.IcoolhCommonException;
import m.icoolh.blog.manage.dao.AnnouncementMapper;
import m.icoolh.blog.manage.service.IAnnouncementService;
import m.icoolh.blog.pager.PageHelpProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yangkaihong on 2019/3/18
 */
@Service
public class AnnouncementServiceImpl implements IAnnouncementService {
    @Resource
    private AnnouncementMapper announcementMapper;

    @Override
    @Transactional
    public int saveAnnouncement(Announcement announcement) {
        Date date = new Date(System.currentTimeMillis());
        announcement.setCreateTime(date);
        announcement.setUpdateTime(date);
        return announcementMapper.insert(announcement);
    }

    @Override
    public PageBean<Announcement> listAnnouncements(Announcement announcement, PageBean pageBean) {
        announcement = announcement == null ? new Announcement() : announcement;
        pageBean = pageBean == null ? new PageBean() : pageBean;
        return new PageHelpProxy<Announcement>(announcementMapper, "listAnnouncements", announcement).doPage(pageBean);
    }

    @Override
    @Transactional
    public int updateById(Announcement announcement) {
        Assert.notNull(announcement.getId(), "id cannot be null!");
        announcement.setUpdateTime(new Date(System.currentTimeMillis()));
        return announcementMapper.updateByPrimaryKeySelective(announcement);
    }

    @Override
    @Transactional
    public int deleteById(Long id) {
        Assert.notNull(id, "id cannot be null!");
        return announcementMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int deleteByIds(List<Long> ids) {
        if (ids != null && ids.size() == 1){
            return announcementMapper.deleteByPrimaryKey(ids.get(0));
        }
        else if (ids.size() > 1){
            return announcementMapper.deleteByIds(ids);
        }
        return 0;
    }
}
