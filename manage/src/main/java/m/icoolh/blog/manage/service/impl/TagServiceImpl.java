package m.icoolh.blog.manage.service.impl;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.common.ResponseMsgCode;
import m.icoolh.blog.entity.Tag;
import m.icoolh.blog.entity.TagExt;
import m.icoolh.blog.entity.vo.TagVo;
import m.icoolh.blog.exception.IcoolhCommonException;
import m.icoolh.blog.manage.dao.TagExtMapper;
import m.icoolh.blog.manage.dao.TagMapper;
import m.icoolh.blog.manage.service.ITagService;
import m.icoolh.blog.pager.PageHelpProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yangkaihong on 2019/3/6
 */
@Service
public class TagServiceImpl implements ITagService {
    @Resource
    private TagMapper tagMapper;
    @Resource
    private TagExtMapper tagExtMapper;


    @Transactional
    @Override
    public boolean saveTag(TagVo tagVo) {
        Date date = new Date();
        tagVo.setUpdateTime(date);
        tagVo.setCreateTime(date);
        tagVo.setArtNum(0);
        int insert = tagMapper.insert(tagVo);
        if (insert == 1) {
            List<TagExt> tagExts = tagVo.getExtend();
            if (null != tagExts && tagExts.size() > 0) {
                /*for (TagExt tagExt : extend) {
                    tagExt.setTagId(tagVo.getId());
                    int rowNum = tagExtMapper.insert(tagExt);
                    if (rowNum != 1){
                        throw new IcoolhCommonException(ResponseMsgCode.ERROR_OPT_DB,
                                ResponseMsgCode.getMsgByCode(ResponseMsgCode.ERROR_OPT_DB));
                    }
                }*/
                if (tagExtMapper.saveListTagExt(tagExts, tagVo.getId()) <= 0) {
                    throw new IcoolhCommonException(ResponseMsgCode.ERROR_OPT_DB,
                            ResponseMsgCode.getMsgByCode(ResponseMsgCode.ERROR_OPT_DB));
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public PageBean<TagVo> listTagVos(Tag tag, PageBean pageBean) {
        tag = tag == null ? new Tag() : tag;
        pageBean = pageBean == null ? new PageBean() : pageBean;
        return new PageHelpProxy<TagVo>(tagMapper, "listTagVos", tag).doPage(pageBean);
    }

    @Override
    @Transactional
    public boolean deleteTagById(Long tagId) {
        return tagMapper.deleteByPrimaryKey(tagId) == 1 ? true : false;
    }


    @Override
    @Transactional
    public void deleteTags(List<Long> tagIds) {
        tagMapper.deleteBatchTags(tagIds);
        tagExtMapper.deleteBatchTagExts(tagIds);
    }

    @Override
    @Transactional
    public void updateTag(TagVo tagVo) {
        Long tagId = tagVo.getId();
        Assert.notNull(tagId, "id cannot be null!");
        tagVo.setUpdateTime(new Date());
        if (1 == tagMapper.updateTag(tagVo)){
            List<TagExt> extend = tagVo.getExtend();
            //删除所有
            tagExtMapper.deleteTagExts(tagId);
            if (extend != null && extend.size() > 0){
                tagExtMapper.saveListTagExt(extend, tagId);
            }
        }
    }
}
