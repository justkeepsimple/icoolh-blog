package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.Article;
import m.icoolh.blog.entity.ArticleExample;
import m.icoolh.blog.entity.vo.ArticleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(ArticleExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Article record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Article record);

    /**
     *
     * @mbggenerated
     */
    List<Article> selectByExample(ArticleExample example);

    /**
     *
     * @mbggenerated
     */
    Article selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Article record);

    List<ArticleVo> listArticleVos(Article article);
}