package m.icoolh.blog.manage.service.impl;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.entity.Category;
import m.icoolh.blog.entity.CategoryExt;
import m.icoolh.blog.entity.vo.CategoryVo;
import m.icoolh.blog.manage.dao.CategoryExtMapper;
import m.icoolh.blog.manage.dao.CategoryMapper;
import m.icoolh.blog.manage.service.ICategoryService;
import m.icoolh.blog.pager.PageHelpProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yangkaihong on 2019/3/12
 */
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private CategoryExtMapper categoryExtMapper;

    @Transactional
    @Override
    public void saveCategory(CategoryVo categoryVo) {
        Date date = new Date(System.currentTimeMillis());
        categoryVo.setCreateTime(date);
        categoryVo.setUpdateTime(date);
        categoryVo.setArtNum(0);
        if (1 == categoryMapper.insert(categoryVo)){
            List<CategoryExt> exts;
            if ((exts= categoryVo.getExtend()) != null && exts.size() > 0){
                categoryExtMapper.insertBatchCatExts(exts, categoryVo.getId());
            }
        }
    }


    @Override
    @Transactional
    public void updateCategory(CategoryVo categoryVo) {
        Long catId = categoryVo.getId();
        Assert.notNull(catId, "id cannnot be null!");
        categoryVo.setUpdateTime(new Date(System.currentTimeMillis()));
        if (1 == categoryMapper.updateCategory(categoryVo)){
            categoryExtMapper.deleteByCatId(catId);
            List<CategoryExt> exts;
            if ((exts = categoryVo.getExtend()) != null && exts.size() > 0){
                categoryExtMapper.insertBatchCatExts(exts, catId);
            }
        }
    }

    @Override
    public PageBean<CategoryVo> listCategoryVos(Category category, PageBean pageBean) {
        category = category == null ? new Category() : category;
        pageBean = pageBean == null ? new PageBean() : pageBean;
        return new PageHelpProxy<CategoryVo>(categoryMapper, "listCategoryVos", category).doPage(pageBean);
    }

    @Override
    @Transactional
    public void deleteCategoryById(Long id) {
        Assert.notNull(id, "id cannnot be null!");
        categoryExtMapper.deleteByCatId(id);
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void deleteCateGories(List<Long> ids) {
        Assert.isTrue(ids != null && ids.size() > 0, "ids cannnot be null!");
        categoryExtMapper.deleteByCatIds(ids);
        categoryMapper.deleteByIds(ids);
    }
}
