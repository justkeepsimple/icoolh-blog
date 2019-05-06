package m.icoolh.blog.manage;

import com.github.pagehelper.PageHelper;
import m.icoolh.blog.pager.MysqlPageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableTransactionManagement
public class ManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageApplication.class, args);
	}
    //配置mybatis的分页插件pageHelper
    @Bean
    public PageHelper pageHelper(){
        return MysqlPageHelper.getMysqlPageHelper();
    }

}
