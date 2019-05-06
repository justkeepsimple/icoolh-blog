package m.icoolh.blog.manage.controller;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.common.ResponseMessage;
import m.icoolh.blog.entity.Announcement;
import m.icoolh.blog.entity.Article;
import m.icoolh.blog.entity.Category;
import m.icoolh.blog.entity.Tag;
import m.icoolh.blog.entity.dto.ArticleDto;
import m.icoolh.blog.entity.vo.ArticleVo;
import m.icoolh.blog.entity.vo.CategoryVo;
import m.icoolh.blog.entity.vo.TagVo;
import m.icoolh.blog.manage.service.IAnnouncementService;
import m.icoolh.blog.manage.service.IArticleService;
import m.icoolh.blog.manage.service.ICategoryService;
import m.icoolh.blog.manage.service.ITagService;
import m.icoolh.blog.utils.ResponseMessageUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangkaihong on 2019/3/6
 */
@RestController
@RequestMapping("v1/manage/")
public class ManageController {
    @Resource
    private ITagService tagService;
    @Resource
    private ICategoryService categoryService;
    @Resource
    private IArticleService articleService;
    @Resource
    private IAnnouncementService announcementService;

    @PostMapping("tag")
    public ResponseMessage saveTag(@RequestBody TagVo tagVo) {
        if (tagService.saveTag(tagVo))
            return ResponseMessageUtil.success("保存成功！");
        return ResponseMessageUtil.fail("保存失败！");
    }

    @GetMapping("tag")
    public ResponseMessage<PageBean<TagVo>> listTagVos(Tag tag,
                                                       PageBean pageBean) {
        return ResponseMessageUtil.success("成功！", tagService.listTagVos(tag, pageBean));
    }

    @DeleteMapping("tag")
    public ResponseMessage deleteTags(@RequestBody List<Long> tagIds) {
        tagService.deleteTags(tagIds);
        return ResponseMessageUtil.success("删除成功！");
    }

    @DeleteMapping("tag/{tagId}")
    public ResponseMessage deleteTag(@PathVariable("tagId") Long tagId) {
        if (tagService.deleteTagById(tagId))
            return ResponseMessageUtil.success("删除成功！");
        return ResponseMessageUtil.fail("删除失败！");
    }


    @PutMapping("tag")
    public ResponseMessage updateTag(@RequestBody TagVo tagVo) {
        tagService.updateTag(tagVo);
        return ResponseMessageUtil.success("修改成功！");
    }


    /***************************************文章分类***************************************/
    /***************************************文章分类***************************************/
    /***************************************文章分类***************************************/
    /***************************************文章分类***************************************/

    @PostMapping("category")
    public ResponseMessage saveCategory(@RequestBody CategoryVo categoryVo) {
        categoryService.saveCategory(categoryVo);
        return ResponseMessageUtil.success();
    }

    @GetMapping("category")
    public ResponseMessage<PageBean<CategoryVo>> listCategoryVos(Category category,
                                                            PageBean pageBean) {
        return ResponseMessageUtil.success("成功！", categoryService.listCategoryVos(category, pageBean));
    }

    @DeleteMapping("category")
    public ResponseMessage deleteCategories(@RequestBody List<Long> catIds) {
        categoryService.deleteCateGories(catIds);
        return ResponseMessageUtil.success("删除成功！");
    }

    @DeleteMapping("category/{catId}")
    public ResponseMessage deleteCategory(@PathVariable("catId") Long catId) {
        categoryService.deleteCategoryById(catId);
        return ResponseMessageUtil.success("删除成功！");
    }


    @PutMapping("category")
    public ResponseMessage updateCategory(@RequestBody CategoryVo categoryVo) {
        categoryService.updateCategory(categoryVo);
        return ResponseMessageUtil.success("修改成功！");
    }

    /***************************************文章***************************************/
    /***************************************文章***************************************/
    /***************************************文章***************************************/
    /***************************************文章***************************************/


    @PostMapping("article")
    public ResponseMessage saveArticle(@RequestBody ArticleDto articleDto) {
        articleService.saveArticle(articleDto);
        return ResponseMessageUtil.success();
    }

    @GetMapping("article")
    public ResponseMessage<PageBean<ArticleVo>> listArticleVos(Article article,
                                                               PageBean pageBean) {
        return ResponseMessageUtil.success("成功！", articleService.listArticleVos(article, pageBean));
    }

    @DeleteMapping("article")
    public ResponseMessage deleteArticle(@RequestBody List<Long> articleIds) {
        articleService.deleteArticles(articleIds);
        return ResponseMessageUtil.success("删除成功！");
    }

    @DeleteMapping("article/{articleId}")
    public ResponseMessage deleteArticle(@PathVariable("articleId") Long articleId) {
        articleService.deleteArticleById(articleId);
        return ResponseMessageUtil.success("删除成功！");
    }


    @PutMapping("article")
    public ResponseMessage updateArticle(@RequestBody ArticleVo articleVo) {
        articleService.updateArticle(articleVo);
        return ResponseMessageUtil.success("修改成功！");
    }

/***************************************公告***************************************/
/***************************************公告***************************************/
/***************************************公告***************************************/
/***************************************公告***************************************/

@PostMapping("announcement")
public ResponseMessage saveAnnouncement(@RequestBody Announcement announcement) {
    announcementService.saveAnnouncement(announcement);
    return ResponseMessageUtil.success();
}

    @GetMapping("announcement")
    public ResponseMessage<PageBean<Announcement>> listAnnouncementVos(Announcement announcement,
                                                               PageBean pageBean) {
        return ResponseMessageUtil.success("成功！", announcementService.listAnnouncements(announcement, pageBean));
    }

    @DeleteMapping("announcement")
    public ResponseMessage deleteAnnouncement(@RequestBody List<Long> ids) {
        announcementService.deleteByIds(ids);
        return ResponseMessageUtil.success("删除成功！");
    }

    @DeleteMapping("announcement/{id}")
    public ResponseMessage deleteAnnouncement(@PathVariable("id") Long id) {
        announcementService.deleteById(id);
        return ResponseMessageUtil.success("删除成功！");
    }


    @PutMapping("announcement")
    public ResponseMessage updateAnnouncement(@RequestBody Announcement announcement) {
        announcementService.updateById(announcement);
        return ResponseMessageUtil.success("修改成功！");
    }
}
