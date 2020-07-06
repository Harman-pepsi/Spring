package cn.demo.filter;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Classname CustomFilter
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 3:42
 * @Version V1.0.0
 * @Since 1.0
 */
public class CustomFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        String className = classMetadata.getClassName();
        System.out.println("------>" + className);
        if(className.contains("Controller")){
            return true;
        }
        return false;
    }
}
