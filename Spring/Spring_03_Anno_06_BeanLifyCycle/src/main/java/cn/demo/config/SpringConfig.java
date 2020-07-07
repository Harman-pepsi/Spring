package cn.demo.config;

import cn.demo.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname SpringConfig
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 18:15
 * @Version V1.0.0
 * @Since 1.0
 */
/**
 * Bean生命周期:
 *  Bean创建 --- 初始化 --- 销毁过程
 *  容器管理Bean的生命周期
 *  我们可以自定义初始化和销毁方法，容器在Bean进行到当前生命周期的时候来调用我们自定义的初始化和销毁方法
 *
 *  构造(对象创建)
 *      单例模式:在容器启动的时候创建对象
 *      原型模式:在每次获取的时候创建对象
 *
 * BeanPostProcessor.postProcessBeforeInitialization
 *  初始化:
 *      对象创建完成，并赋值好，调用初始化方法
 * BeanPostProcessor.postProcessAfterInitialization
 *
 *  BeanPostProcessor原理：
 *  遍历得到容器中的所有BeanPostProcessor，挨个执行BeforeInitialization，
 *  一旦返回null,跳出for循环，不会执行后面的BeanPostProcessor.postProcessBeforeInitialization
 *  populateBean(beanName, mbd, instanceWrapper); //给Bean进行属性赋值
 *  initializeBean
 *  {
 *      applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
 *      invokeInitMethods(beanName, wrappedBean, mbd); //执行初始化
 *      applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
 *  }
 *
 *   销毁:
 *      单例模式在容器关闭的时候进行销毁
 *      原型模式不会管理这个Bean，容器不会调用销毁方法
 *
 *      1)、指定初始化和销毁方法
 *          通过@Bean指定init-method="" destory-method=""
 *      2)、通过让Bean实现InitializingBean接口(定义初始化逻辑),DisposableBean接口(实现销毁逻辑)
 *      3)、可以使用JSR250
 *              @PostConstruct:在Bean创建完成并且属性赋值完成，来执行初始化方法
 *               @PreDestory:在容器销毁Bean之前通知我们进行清理工作
 *      4)、BeanPostProcessor:Bean的后置处理器
 *              在Bean初始化前后进行一些处理工作
 *              postProcessBeforeInitialization:在初始化之前工作
 *              postProcessAfterInitialization:在初始化之后工作
 *
 *   Spring底层对BeanPostProcessor的使用：
 *      bean赋值，注入其他组件，@AutoWired，生命周期注解等
 */
@Configuration
@ComponentScans(
        @ComponentScan(basePackages = {"cn.demo"})
)
public class SpringConfig {

//    @Bean(initMethod = "init",destroyMethod = "destory")
//    public Car car(){
//        return new Car("法拉利","红色",2990000.0d);
//    }
}
