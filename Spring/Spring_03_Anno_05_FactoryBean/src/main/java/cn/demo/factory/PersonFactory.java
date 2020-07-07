package cn.demo.factory;

import cn.demo.domain.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Classname PersonFactory
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 13:43
 * @Version V1.0.0
 * @Since 1.0
 */
public class PersonFactory implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        System.out.println("FactoryBean.getObject......");
        return new Person(1,"JackMa","88888888");
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
