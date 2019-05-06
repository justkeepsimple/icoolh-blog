package m.icoolh.blog.entity.vo;

import m.icoolh.blog.entity.Tag;
import m.icoolh.blog.entity.TagExt;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangkaihong on 2019/3/5
 */
public class TagVo extends Tag implements Serializable{
    private static final long serialVersionUID = 6698799268208692713L;

    private List<TagExt> extend;

    public List<TagExt> getExtend() {
        return extend;
    }

    public void setExtend(List<TagExt> extend) {
        this.extend = extend;
    }
}
