package m.icoolh.upload.strategy;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by yangkaihong on 2019/4/2
 */
@Component
public class FastDFSUpload extends AbstractUpload {
    @Resource
    private FastFileStorageClient storageClient;

    @Value("${fdfs.url}")
    private String picPrefix;
   /* @Resource
    private TrackerClient trackerClient;*/

    protected String doUpload(MultipartFile file) {
        try {
            String originalFilename = file.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(), extName, null);
            return picPrefix + storePath.getFullPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
