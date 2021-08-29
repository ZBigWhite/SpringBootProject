/*
 * Copyright (C), 2002-2021, 苏宁易购电子商务有限公司
 * FileName: Person.java
 * Author:   20018848
 * Date:     2021/8/29 20:15
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名    修改时间    版本号       描述
 */
package geektime.spring.hello.learn;
import com.alibaba.fastjson.*;
import lombok.Data;
import lombok.ToString;

/**
 * 功能描述:<br>
 *
 * @author 20018848
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Data
@ToString
public class Person {
    @MyAnno
    private String stra;
    @MyAnno
    private String strb;
    private String strc;

    public Person(String str1,String str2,String str3){
        super();
        this.stra = str1;
        this.strb = str2;
        this.strc = str3;
    }
}
