package m.icoolh.upload;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@Import(FdfsClientConfig.class)
@SpringBootApplication
@EnableDiscoveryClient
public class UploadApp {
	public static void main(String[] args) {
		SpringApplication.run(UploadApp.class, args);
	}
}
