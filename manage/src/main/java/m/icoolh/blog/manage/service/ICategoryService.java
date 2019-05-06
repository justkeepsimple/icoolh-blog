package m.icoolh.blog.manage.service;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.entity.Category;
import m.icoolh.blog.entity.vo.CategoryVo;

import java.util.List;

/**
 * Created by yangkaihong on 2019/3/12
 */
public interface ICategoryService {
    void saveCategory(CategoryVo categoryVo);

    void updateCategory(CategoryVo categoryVo);

    PageBean<CategoryVo> listCategoryVos(Category category, PageBean pageBean);

    void deleteCategoryById(Long id);

    void deleteCateGories(List<Long> ids);
}
