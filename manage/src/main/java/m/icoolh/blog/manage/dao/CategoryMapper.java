package m.icoolh.blog.manage.dao;

import m.icoolh.blog.entity.Category;
import m.icoolh.blog.entity.CategoryExample;
import m.icoolh.blog.entity.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CategoryMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(CategoryExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(CategoryExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Category record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Category record);

    /**
     *
     * @mbggenerated
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     *
     * @mbggenerated
     */
    Category selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Category record);

    int updateCategory(Category category);

    List<CategoryVo> listCategoryVos(Category category);

    int deleteById(Long id);

    int deleteByIds(List<Long> ids);
}