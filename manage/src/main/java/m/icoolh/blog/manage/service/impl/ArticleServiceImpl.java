package m.icoolh.blog.manage.service.impl;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.entity.Article;
import m.icoolh.blog.entity.ArticleContent;
import m.icoolh.blog.entity.ArticleExt;
import m.icoolh.blog.entity.ArticleMeta;
import m.icoolh.blog.entity.dto.ArticleDto;
import m.icoolh.blog.entity.vo.ArticleVo;
import m.icoolh.blog.entity.vo.CategoryVo;
import m.icoolh.blog.manage.dao.*;
import m.icoolh.blog.manage.service.IArticleService;
import m.icoolh.blog.pager.PageHelpProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yangkaihong on 2019/3/14
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private ArticleMetaMapper articleMetaMapper;

    @Resource
    private ArticleTagMapper articleTagMapper;

    @Resource
    private ArticleCatMapper articleCatMapper;

    @Resource
    private ArticleContentMapper articleContentMapper;

    @Resource
    private ArticleExtMapper articleExtMapper;

    @Resource
    private ArticleKeyWMapper articleKeyWMapper;
    @Override
    @Transactional
    public void saveArticle(ArticleDto articleDto) {
        Date date = new Date(System.currentTimeMillis());
        articleDto.setCreateTime(date);
        articleDto.setUpdateTime(date);

        articleMapper.insert(articleDto);
        Long artId = articleDto.getId();

        //文章内容
        ArticleContent articleContent = new ArticleContent();
        articleContent.setContent(articleDto.getContent());
        articleContent.setArtId(artId);
        articleContentMapper.insert(articleContent);

        //相关标签
        List<Long> tags = articleDto.getTags();
        if (tags != null && tags.size() > 0){
            articleTagMapper.insertBatchArtTags(tags, artId);
        }
        //相关分类
        List<Long> categories = articleDto.getCategories();
        if (categories != null && categories.size() > 0){
            articleCatMapper.insertBatchArtCats(categories, artId);
        }

        //拓展属性
        List<ArticleExt> exts = articleDto.getExtend();
        if(exts != null && exts.size() > 0){
            articleExtMapper.insertBatchArtExts(exts, artId);
        }

        //数据量
        ArticleMeta articleMeta = new ArticleMeta();
        articleMeta.setArtId(artId);
        articleMeta.setViews(0);
        articleMeta.setComments(0);
        articleMeta.setLikes(0);
        articleMetaMapper.insert(articleMeta);

        List<String> keywords = articleDto.getKeywords();
        if (keywords != null && keywords.size() > 0){
            articleKeyWMapper.insertBatchKeyWords(keywords, artId);
        }
    }

    @Override
    public PageBean<ArticleVo> listArticleVos(Article article, PageBean pageBean) {
        article = article == null ? new Article() : article;
        pageBean = pageBean == null ? new PageBean() : pageBean;
        return new PageHelpProxy<ArticleVo>(articleMapper, "listArticleVos", article).doPage(pageBean);

    }

    @Override
    @Transactional
    public void deleteArticles(List<Long> articleIds) {

    }

    @Override
    @Transactional
    public void deleteArticleById(Long id) {

    }

    @Override
    @Transactional
    public void updateArticle(ArticleVo articleVo) {

    }
}
