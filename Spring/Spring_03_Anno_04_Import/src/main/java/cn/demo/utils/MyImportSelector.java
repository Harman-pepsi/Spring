package cn.demo.utils;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Classname MyImportSelector
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/7 13:00
 * @Version V1.0.0
 * @Since 1.0
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //可以返回零数组，不要返回null,否则会报空指针异常
        return new String[]{"cn.demo.domain.Student","cn.demo.domain.Teacher"};
    }
}
