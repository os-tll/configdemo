//package xyz.supertll.configclient;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author tanglonglong ＼(－－)／
// * @version 1.0
// * @date 2019/11/13 20:58
// */
//
//@RestController
//@RefreshScope
//public class TestConfigServer {
//
//    @Value("${version}")
//    private String version = "开发环境";
//
//    @RequestMapping("/test")
//    public String test() {
//        return "当前环境：" + version;
//    }
//}