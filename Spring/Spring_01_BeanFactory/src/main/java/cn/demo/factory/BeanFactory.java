package cn.demo.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Classname BeanFactory
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/6 10:07
 * @Version V1.0.0
 * @Since 1.0
 */
public class BeanFactory {
    private static Properties properties;
    private static Map<String,Object> beanMap;

    static {
        try {
            properties = new Properties();
            InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(inputStream);
            beanMap = new HashMap<>();
            Enumeration keys = properties.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                System.out.println(key);
                String beanPath = properties.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beanMap.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化Properties失败!");
        }
    }

    public static Object getBeanOfSingleton(String beanName){
        return beanMap.get(beanName);
    }

    public static Object getBeanOfProperty(String beanName){
        Object bean = null;
        try {
            String beanPath = properties.getProperty(beanName);
            bean = Class.forName(beanPath).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
