package m.icoolh.blog.common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangkaihong on 2018/12/13
 */
public class PageBean<T> implements Serializable{
    private static final long serialVersionUID = 533174613877012403L;
    /**
     * 最大每页显示数量
     */
    private final int maxPageSize = 200;
    /**
     * 最小页数
     */
    private final int minPage = 1;
    /**
     * 当前页数 最小为１
     */
    private int currentPage = 1;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 每页显示数量
     */
    private int pageSize = 10;

    /**
     * 总记录数
     */
    private Long totalSize;
    /**
     * 数据
     */
    private List<T> pageList;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage < minPage ? minPage : currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize > maxPageSize ? maxPageSize : pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }
}
