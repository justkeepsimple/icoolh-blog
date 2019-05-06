package m.icoolh.blog.manage.controller;

import m.icoolh.blog.common.PageBean;
import m.icoolh.blog.common.ResponseMessage;
import m.icoolh.blog.entity.Announcement;
import m.icoolh.blog.entity.Article;
import m.icoolh.blog.entity.vo.ArticleVo;
import m.icoolh.blog.manage.service.IAnnouncementService;
import m.icoolh.blog.manage.service.IArticleService;
import m.icoolh.blog.utils.ResponseMessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by yangkaihong on 2019/3/14
 */
@RestController
@RequestMapping("v1/show/")
public class ShowController {
    @Resource
    private IArticleService articleService;
    @Resource
    private IAnnouncementService announcementService;

    @GetMapping("article")
    public ResponseMessage<PageBean<ArticleVo>> listArticleVos(Article article,
                                                               PageBean pageBean) {
        return ResponseMessageUtil.success("成功！", articleService.listArticleVos(article, pageBean));
    }

    @GetMapping("announcement")
    public ResponseMessage<PageBean<Announcement>> listAnnouncements(Announcement announcement, PageBean pageBean) {
        return ResponseMessageUtil.success("成功！", announcementService.listAnnouncements(announcement, pageBean));
    }

    @GetMapping("/test/session")
    public ResponseMessage saveSession(HttpServletRequest request){
        request.getSession().setAttribute("user","ykh");
        return ResponseMessageUtil.success((Object) request.getSession().getId());
    }

    @GetMapping("/test/session1")
    public ResponseMessage getSession(HttpServletRequest request){
        return ResponseMessageUtil.success((Object) request.getSession().getAttribute("user"));
    }
}
