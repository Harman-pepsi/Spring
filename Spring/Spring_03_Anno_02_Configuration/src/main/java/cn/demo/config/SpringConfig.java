package cn.demo.config;

import cn.demo.domain.DBInfo;
import cn.demo.domain.User;
import cn.demo.filter.CustomFilter;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/6 11:06
 * @Version V1.0.0
 * @Since 1.0
 */
@Configuration
@ComponentScans(

//        @ComponentScan(value = {"cn.demo"})

//        @ComponentScan(value = {"cn.demo"},includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//        },useDefaultFilters = false)

//        @ComponentScan(value = {"cn.demo"},excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//        },useDefaultFilters = false)

        @ComponentScan(value = {"cn.demo"},includeFilters = {
             @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {CustomFilter.class})
        },useDefaultFilters = false)
)
@PropertySources(
        @PropertySource(value = {"db.properties"},ignoreResourceNotFound = true)
)
public class SpringConfig {

    @Bean
    public User user(){
        return new User(1,"Jack","123456");
    }

    @Bean
    public DBInfo dbInfo(){
        return new DBInfo();
    }
}
