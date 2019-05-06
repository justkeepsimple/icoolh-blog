package m.icoolh.blog.manage.advice;

import m.icoolh.blog.common.ResponseMessage;
import m.icoolh.blog.common.ResponseMsgCode;
import m.icoolh.blog.exception.IcoolhBaseRuntimeException;
import m.icoolh.blog.utils.ResponseMessageUtil;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yangkaihong on 2018/11/20
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 参数校验异常处理
     * @param e
     * @return
     */
    /*@ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseMessage validExceptionHandler(MethodArgumentNotValidException e){
        e.printStackTrace();
        return ResponseMessageUtil.fail(ResponseMsgCode.USER_PARAMS_ERROR, e.getBindingResult().getFieldError().getDefaultMessage());
    }*/

    /**
     * 自定义异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(IcoolhBaseRuntimeException.class)
    @ResponseBody
    public ResponseMessage zggExceptionHandler(IcoolhBaseRuntimeException e){
        e.printStackTrace();
        return ResponseMessageUtil.fail(e.getErrorCode(), e.getDetailMessage());
    }


    /**
     * 未定义异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseMessage exceptionHandler(Exception e){
        e.printStackTrace();
        return ResponseMessageUtil.fail((Object) e.getMessage());
    }

}

