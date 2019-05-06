package m.icoolh.upload.strategy;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by yangkaihong on 2019/4/2
 */
public interface IUpload {
    String uploadFile(MultipartFile file);
}
