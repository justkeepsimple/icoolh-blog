package m.icoolh.blog.entity.vo;

import m.icoolh.blog.entity.Category;
import m.icoolh.blog.entity.CategoryExt;

import java.util.List;

/**
 * Created by yangkaihong on 2019/3/12
 */
public class CategoryVo extends Category{
    private List<CategoryExt> extend;
    private List<Category> children;

    public List<CategoryExt> getExtend() {
        return extend;
    }

    public void setExtend(List<CategoryExt> extend) {
        this.extend = extend;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }
}
