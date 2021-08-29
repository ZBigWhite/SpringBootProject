/*
 * Copyright (C), 2002-2021, 苏宁易购电子商务有限公司
 * FileName: Customer.java
 * Author:   20018848
 * Date:     2021/8/24 22:49
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名    修改时间    版本号       描述
 */
package geektime.spring.hello.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 功能描述:<br>
 *
 * @author 20018848
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                '}';
    }

}
