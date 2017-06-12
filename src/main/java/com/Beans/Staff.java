package com.Beans;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/6/5.
 */
@Repository
public class Staff {
    private Integer staff_id;
    private Integer age;
    private String name;
    private String no;
    private Integer post;

    public Integer getStaff_id() {
        return staff_id;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public String getNo() {

        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStaff_id(Integer staff_id) {

        this.staff_id = staff_id;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void printStaff() {
        System.out.println(this.staff_id + " " + this.name + " " + this.age);
    }
}
