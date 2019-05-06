package m.icoolh.blog.entity.dto;

import m.icoolh.blog.entity.*;

import java.util.List;

/**
 * Created by yangkaihong on 2019/3/14
 * 接受前端传递过来的参数
 */
public class ArticleDto extends Article {
    private String content;
    private List<ArticleExt> extend;
    private List<String> keywords;
    private List<Long> categories;
    private List<Long> tags;

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

    public List<Long> getCategories() {
        return categories;
    }

    public void setCategories(List<Long> categories) {
        this.categories = categories;
    }

    public List<Long> getTags() {
        return tags;
    }

    public void setTags(List<Long> tags) {
        this.tags = tags;
    }
}
