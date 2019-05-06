package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.ArticleExt;
import m.icoolh.blog.entity.ArticleExtExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleExtMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(ArticleExtExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleExtExample example);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleExt record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleExt record);

    /**
     *
     * @mbggenerated
     */
    List<ArticleExt> selectByExample(ArticleExtExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArticleExt record, @Param("example") ArticleExtExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArticleExt record, @Param("example") ArticleExtExample example);

    int insertBatchArtExts(@Param("exts") List<ArticleExt> exts, @Param("artId") Long artId);
}