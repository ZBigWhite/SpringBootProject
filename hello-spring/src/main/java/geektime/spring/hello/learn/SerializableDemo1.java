/*
 * Copyright (C), 2002-2021, 苏宁易购电子商务有限公司
 * FileName: SerializableDemo1.java
 * Author:   20018848
 * Date:     2021/8/29 14:09
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名    修改时间    版本号       描述
 */
package geektime.spring.hello.learn;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;
import java.util.ArrayList;

/**
 * 功能描述:<br>
 *
 * @author 20018848
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SerializableDemo1 {

    //为了便于理解，忽略关闭流操作及删除文件操作。真正编码时千万不要忘记
    //Exception直接抛出
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(Singleton.getSingleton());
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        Singleton newInstance = (Singleton) ois.readObject();
        //判断是否是同一个对象
        System.out.println(newInstance == Singleton.getSingleton());
    }

}
