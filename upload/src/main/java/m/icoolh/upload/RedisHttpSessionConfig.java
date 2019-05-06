package m.icoolh.gateway;

import org.springframework.context.annotation.Configuration;

/**
 * Created by yangkaihong on 2018/12/20
 */
@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 24 * 60 * 60)
public class RedisHttpSessionConfig {

  /*  //这里有个小坑，如果服务器用的是云服务器，不加这个会报错
    @Bean
    public static ConfigureRedisAction configureRedisAction() {
        return ConfigureRedisAction.NO_OP;
    }

    //这里是reids连接配置  自动配置
    //session策略，这里配置的是Header方式（有提供Header，Cookie等方式），可自定义，后面会详细讲
    @Bean
    public HttpSessionStrategy httpSessionStrategy() {
        HeaderHttpSessionStrategy headerHttpSessionStrategy = new HeaderHttpSessionStrategy();
        headerHttpSessionStrategy.setHeaderName("Authorization");
        return headerHttpSessionStrategy;
    }*/
}
