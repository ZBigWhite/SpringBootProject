/*
 * Copyright (C), 2002-2021, 苏宁易购电子商务有限公司
 * FileName: Singleton.java
 * Author:   20018848
 * Date:     2021/8/29 15:09
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名    修改时间    版本号       描述
 */
package geektime.spring.hello.learn;

import java.io.Serializable;

/**
 * 功能描述:<br>
 *
 * @author 20018848
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Singleton implements Serializable {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }
}
