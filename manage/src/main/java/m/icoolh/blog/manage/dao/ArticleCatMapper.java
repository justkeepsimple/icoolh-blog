package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.ArticleCat;
import m.icoolh.blog.entity.ArticleCatExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleCatMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(ArticleCatExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleCatExample example);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleCat record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleCat record);

    /**
     *
     * @mbggenerated
     */
    List<ArticleCat> selectByExample(ArticleCatExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArticleCat record, @Param("example") ArticleCatExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArticleCat record, @Param("example") ArticleCatExample example);

    int insertBatchArtCats(@Param("catIds") List<Long> catIds, @Param("artId") Long artId);
}