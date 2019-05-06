package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.CategoryExt;
import m.icoolh.blog.entity.CategoryExtExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CategoryExtMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(CategoryExtExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(CategoryExtExample example);

    /**
     *
     * @mbggenerated
     */
    int insert(CategoryExt record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(CategoryExt record);

    /**
     *
     * @mbggenerated
     */
    List<CategoryExt> selectByExample(CategoryExtExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CategoryExt record, @Param("example") CategoryExtExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CategoryExt record, @Param("example") CategoryExtExample example);

    int insertBatchCatExts(@Param("exts") List<CategoryExt> exts,
                           @Param("catId") Long catId);

    int deleteByCatId(@Param("catId") Long catId);

    int deleteByCatIds(List<Long> ids);
}