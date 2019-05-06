///*
//package m.icoolh.gateway;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.session.data.redis.config.ConfigureRedisAction;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
//import org.springframework.session.web.http.HttpSessionIdResolver;
//
//*/
///**
// * Created by yangkaihong on 2018/12/20
// *//*
//
//@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 24 * 60 * 60)
//public class RedisHttpSessionConfig {
//
//    //这里有个小坑，如果服务器用的是云服务器，不加这个会报错
//    @Bean
//    public static ConfigureRedisAction configureRedisAction() {
//        return ConfigureRedisAction.NO_OP;
//    }
//
//    //这里是reids连接配置  自动配置
//    //session策略，这里配置的是Header方式（有提供Header，Cookie等方式），可自定义，后面会详细讲
//    @Bean
//    public HttpSessionIdResolver httpSessionStrategy() {
//        return new HeaderHttpSessionIdResolver("Authorization");
//    }
//}
//*/
