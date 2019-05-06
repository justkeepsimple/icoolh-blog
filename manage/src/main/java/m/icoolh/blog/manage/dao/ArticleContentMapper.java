package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.ArticleContent;
import m.icoolh.blog.entity.ArticleContentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleContentMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(ArticleContentExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleContentExample example);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleContent record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleContent record);

    /**
     *
     * @mbggenerated
     */
    List<ArticleContent> selectByExampleWithBLOBs(ArticleContentExample example);

    /**
     *
     * @mbggenerated
     */
    List<ArticleContent> selectByExample(ArticleContentExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);
}