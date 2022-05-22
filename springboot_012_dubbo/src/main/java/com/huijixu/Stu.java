package com.huijixu;

import java.io.Serializable;

/**
 * @author HuiJixu
 * @version 2.0
 * @since 2021.9
 */
public class Stu implements Serializable {
    private static final  long serialVersionUID = 123L;
    private String  name;
    private Integer  age;
    private String  id;


    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Stu(String name, Integer age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Stu() {
    }
}
