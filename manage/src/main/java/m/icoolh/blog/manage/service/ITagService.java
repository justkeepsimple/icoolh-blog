package m.icoolh.blog.manage.service;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.entity.Tag;
import m.icoolh.blog.entity.vo.TagVo;

import java.util.List;

/**
 * Created by yangkaihong on 2019/3/6
 */
public interface ITagService {
    boolean saveTag(TagVo  tagVo);

    PageBean<TagVo> listTagVos(Tag tag, PageBean pageBean);

    boolean deleteTagById(Long tagId);

    void deleteTags(List<Long> tagIds);

    void updateTag(TagVo tagVo);
}
