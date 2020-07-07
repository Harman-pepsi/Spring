package cn.demo.config;

import cn.demo.conditional.LinuxConditional;
import cn.demo.conditional.WindowConditional;
import cn.demo.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 4:51
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
public class SpringConfig {

    @Conditional(value = {WindowConditional.class})
    @Bean("Bill")
    public User user1(){
        return new User(UUID.randomUUID().toString().replace("-",""),"Bill","123456");
    }

    @Conditional(value = {LinuxConditional.class})
    @Bean("Jack")
    public User user2(){
        return new User(UUID.randomUUID().toString().replace("-",""),"Jack","123456");
    }

    @Conditional(value = {LinuxConditional.class})
    @Bean("Rose")
    public User user3(){
        return new User(UUID.randomUUID().toString().replace("-",""),"Rose","123456");
    }
}
