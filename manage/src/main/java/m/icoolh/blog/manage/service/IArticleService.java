package m.icoolh.blog.manage.service;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.entity.Article;
import m.icoolh.blog.entity.dto.ArticleDto;
import m.icoolh.blog.entity.vo.ArticleVo;

import java.util.List; /**
 * Created by yangkaihong on 2019/3/14
 */
public interface IArticleService {
    void saveArticle(ArticleDto articleDto);

    PageBean<ArticleVo> listArticleVos(Article article, PageBean pageBean);

    void deleteArticles(List<Long> articleIds);

    void deleteArticleById(Long id);

    void updateArticle(ArticleVo articleVo);
}
