package m.icoolh.blog.entity.vo;

import m.icoolh.blog.entity.*;

import java.util.List;

/**
 * Created by yangkaihong on 2019/3/14
 */
public class ArticleVo extends Article{
    private ArticleMeta meta;
    private String content;
    private List<ArticleExt> extend;
    private List<String> keywords;
    private List<ArticleCat> categories;
    private List<Tag> tags;

    public ArticleMeta getMeta() {
        return meta;
    }

    public void setMeta(ArticleMeta meta) {
        this.meta = meta;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<ArticleExt> getExtend() {
        return extend;
    }

    public void setExtend(List<ArticleExt> extend) {
        this.extend = extend;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<ArticleCat> getCategories() {
        return categories;
    }

    public void setCategories(List<ArticleCat> categories) {
        this.categories = categories;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
