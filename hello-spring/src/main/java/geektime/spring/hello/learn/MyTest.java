/*
 * Copyright (C), 2002-2021, 苏宁易购电子商务有限公司
 * FileName: MyTest.java
 * Author:   20018848
 * Date:     2021/8/29 20:26
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名    修改时间    版本号       描述
 */
package geektime.spring.hello.learn;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 功能描述:<br>
 *
 * @author 94647
 * @Date 2021/8/29 20:26
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MyTest {
    public static void main(String[] args) {
        //初始化全都赋值无注解
        Person person = new Person("无注解","无注解","无注解");
        //解析注解
        doAnnoTest(person);
        System.out.println(person.toString());
    }

    private static void doAnnoTest(Object obj) {
        Class clazz = obj.getClass();
        Field[] declareFields = clazz.getDeclaredFields();
        for (Field field:declareFields) {
            //检查该字段是否使用了某个注解
            if(field.isAnnotationPresent(MyAnno.class)){
                MyAnno anno = field.getAnnotation(MyAnno.class);
                if(anno!=null){
                    String fieldName = field.getName();
                    try {
                        Method setMethod = clazz.getDeclaredMethod("set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1),String.class);
                        //获取注解的属性
                        String annoValue = anno.value();
                        //将注解的属性值赋给对应的属性
                        setMethod.invoke(obj,annoValue);
                    }catch (NoSuchMethodException e){
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }

                }
            }

        }
    }
}
