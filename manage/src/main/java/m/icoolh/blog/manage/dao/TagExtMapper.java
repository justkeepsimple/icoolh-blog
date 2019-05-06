package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.TagExt;
import m.icoolh.blog.entity.TagExtExample;
import m.icoolh.blog.entity.vo.TagVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface TagExtMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(TagExtExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(TagExtExample example);

    /**
     *
     * @mbggenerated
     */
    int insert(TagExt record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(TagExt record);

    /**
     *
     * @mbggenerated
     */
    List<TagExt> selectByExample(TagExtExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TagExt record, @Param("example") TagExtExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TagExt record, @Param("example") TagExtExample example);

    int saveListTagExt(@Param("tagExts") List<TagExt> tagExts, @Param("tagId") Long tagId);

    int deleteBatchTagExts(List<Long> tagIds);

    int deleteTagExts(@Param("tagId") Long tagId);
}