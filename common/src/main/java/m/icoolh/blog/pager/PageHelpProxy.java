package m.icoolh.blog.pager;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import m.icoolh.blog.common.PageBean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by yangkaihong on 2018/12/13
 */
public final class PageHelpProxy<T> {
    private Object proxyObj;
    private String methodName;
    private Object[] params;
    private Class[] paramsType;

    /**
     * @param proxyObj   代理的对象
     * @param methodName 要调用代理的对象的方法
     * @param params     方法的参数
     */
    public PageHelpProxy(Object proxyObj, String methodName, Object... params) {
        this.proxyObj = proxyObj;
        this.methodName = methodName;
        this.params = params;

    }

    public PageBean<T> doPage(PageBean pageBean) {
        //参数存在
        if (params != null) {
            int len = params.length;
            paramsType = new Class[len];
            //根据参数得到相应的 Class的类对象
            for (int i = 0; i < len; i++) {
                paramsType[i] = params[i].getClass();
            }
        }
        try {
            Method method = proxyObj.getClass().getMethod(methodName, paramsType);
            PageHelper.startPage(pageBean.getCurrentPage(), pageBean.getPageSize());
            Object result = method.invoke(proxyObj, params);
            List<T> results = (List<T>) result;
            PageInfo<T> pageInfo = new PageInfo<>(results);
            pageBean.setTotalSize(pageInfo.getTotal());
            pageBean.setTotalPage(pageInfo.getPages());
            pageBean.setPageList(results);
            return pageBean;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
