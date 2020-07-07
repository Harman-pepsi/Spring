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
/**
 * 自动装配：
 *      Spring利用依赖注入(DI)，完成对IOC容器中各个组件关系赋值
 * 1、@AutoWired：自动注入
 *      1)、默认有限按照类型去容器中赵对应组件:applicationContext.getBean(BookDao.class)，找到就赋值
 *      2)、如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 *      3)、@Qualifier("bookDaoImpl2"):使用@Qualifier指定要装配的组件id,而不是使用属性名
 *      4)、自动装配默认一定更将属性赋值好，没有就会报错
 *              可以使用@Autowired(required = false)解决报错
 *      5)、@Primary,让Spring进行自动装配的时候，默认使用首选的bean
 *              也可以继续使用@Qualifier指定需要装配的bean的名字
 *          BookService{
 *              @AutoWired
 *              BookDao bookDao;
 *          }
 * 2、Spring还支持使用@Resource(JSR250)和@Inject(JSR330) [Java规范的注解]
 *      @Resource
 *          可以和@Autowired一样实现自动装配功能，默认是按照组件名称进行装配的
 *          没有支持按照@Primary功能和@Autowired(required = false)的支持
 *      @Inject:
 *          需要导入javax.inject的包，和Autowired的功能一样，支持@Primary，但是没有@Autowired(required = false)的功能
 *
 * @Autowired：Spring定义的，@Resource和@Inject是Java规范
 *
 * 3、@Autowired:构造器、方法、参数、属性，都是从容器中获取组件参数的值
 *      1)、标注在方法位置: @Bean+方法参数，参数从容器中获取，默认不写@Autowired效果都是一样的
 *      2)、标注在构造器上,如果组件只有一个有参构造器，这个有参构造器的@Autowired可以省略，参数位置的组件还是可以自动从容器中获取
 *      3)、放在参数位置
 *
 *  4、自定义组件想要使用Spirng容器底层的一些组件(如:ApplicationContext,BeanFactory等)
 *        自定义组件实现xxxAware接口，在创建对象的时候，会调用接口规定的方法，注入相关的组件
 *        把Spring底层的一些组件注入到自定义的Bean中
 *        xxxAware功能:功能使用xxxProcessor处理
 *          如：ApplicationContextAware ==> ApplicationContextAwareProcessor
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
