package m.icoolh.upload.strategy;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by yangkaihong on 2019/4/2
 */
public abstract class AbstractUpload implements IUpload {
    @Override
    public String uploadFile(MultipartFile file) {
        return doUpload(file);
    }

    protected abstract String doUpload(MultipartFile file);
}
