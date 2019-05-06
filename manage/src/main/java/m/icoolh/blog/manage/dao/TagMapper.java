package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.Tag;
import m.icoolh.blog.entity.TagExample;
import m.icoolh.blog.entity.vo.TagVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface TagMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(TagExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(TagExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Tag record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Tag record);

    /**
     *
     * @mbggenerated
     */
    List<Tag> selectByExample(TagExample example);

    /**
     *
     * @mbggenerated
     */
    Tag selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tag record);

    List<TagVo> listTagVos(Tag tag);

    int deleteBatchTags(List<Long> tagIds);

    int updateTag(Tag tag);
}