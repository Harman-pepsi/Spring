package cn.demo.config;

import cn.demo.dao.IUserDao;
import cn.demo.dao.impl.UserDaoImpl;
import cn.demo.domain.Car;
import cn.demo.domain.User;
import cn.demo.service.IUserService;
import cn.demo.service.impl.UserServiceImpl;
import org.springframework.context.annotation.*;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 22:29
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
@ComponentScans(
        @ComponentScan(basePackages = {"cn.demo"})
)
public class SpringConfig {

    @Bean("userDaoImpl2")
    @Primary
    public UserDaoImpl userDaoImpl(){
       UserDaoImpl userDao = new UserDaoImpl();
       userDao.setLabel("2");
       return userDao;
    }


}
