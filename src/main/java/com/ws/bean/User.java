package com.ws.bean;

import javax.persistence.*;

// 使用JPA注解配置映射关系
@Entity // 告诉JPA这是一个实体类（和数据表映射的类）
@Table(name="tab_user") // @Table用来指定和哪个数据表对应；如果省略，默认表名为类名的小写
public class User {

    @Id // 这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 主键自增
    private Integer id;
    @Column(name = "last_name", length = 50) // 这是和数据表对应的一个列
    private String lastName;
    @Column // 省略，默认列名为属性名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
