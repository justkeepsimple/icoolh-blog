package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.ArticleTag;
import m.icoolh.blog.entity.ArticleTagExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleTagMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(ArticleTagExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleTagExample example);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleTag record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleTag record);

    /**
     *
     * @mbggenerated
     */
    List<ArticleTag> selectByExample(ArticleTagExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArticleTag record, @Param("example") ArticleTagExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArticleTag record, @Param("example") ArticleTagExample example);

    int insertBatchArtTags(@Param("tagIds") List<Long> tagIds, @Param("artId") Long artId);
}