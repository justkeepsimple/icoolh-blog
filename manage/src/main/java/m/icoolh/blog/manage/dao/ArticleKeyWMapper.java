package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.ArticleKeyW;
import m.icoolh.blog.entity.ArticleKeyWExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleKeyWMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(ArticleKeyWExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleKeyWExample example);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleKeyW record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleKeyW record);

    /**
     *
     * @mbggenerated
     */
    List<ArticleKeyW> selectByExample(ArticleKeyWExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArticleKeyW record, @Param("example") ArticleKeyWExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArticleKeyW record, @Param("example") ArticleKeyWExample example);

    int insertBatchKeyWords(@Param("keywords") List<String> keywords, @Param("artId") Long artId);
}