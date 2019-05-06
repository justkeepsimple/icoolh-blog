package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.ArticleMeta;
import m.icoolh.blog.entity.ArticleMetaExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMetaMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(ArticleMetaExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleMetaExample example);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleMeta record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleMeta record);

    /**
     *
     * @mbggenerated
     */
    List<ArticleMeta> selectByExample(ArticleMetaExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArticleMeta record, @Param("example") ArticleMetaExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArticleMeta record, @Param("example") ArticleMetaExample example);
}