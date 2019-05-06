package m.icoolh.upload.controller;

import m.icoolh.blog.common.ResponseMessage;
import m.icoolh.blog.utils.ResponseMessageUtil;
import m.icoolh.upload.strategy.IUpload;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yangkaihong on 2019/4/2
 */
@RestController
@RequestMapping("/upload")
public class UploadController {
    @Resource
    private IUpload fastDFSUpload;


    @PutMapping("/file")
    public ResponseMessage uploadFile(@RequestParam("file") MultipartFile file){
        String fileURL = fastDFSUpload.uploadFile(file);
        if (fileURL != null)
            return ResponseMessageUtil.success((Object) fileURL);
        return ResponseMessageUtil.fail();
    }

    @PostMapping("/file")
    public ResponseMessage uploadFile_POST(@RequestParam("file") MultipartFile file){
        String fileURL = fastDFSUpload.uploadFile(file);
        if (fileURL != null)
            return ResponseMessageUtil.success((Object) fileURL);
        return ResponseMessageUtil.fail();
    }

}
