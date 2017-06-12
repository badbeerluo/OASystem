package com.Beans;

import org.springframework.stereotype.Repository;

import javax.annotation.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/7.
 */
@Repository
public class Attendance {
    private Integer id;
    private Integer att_id;
    private String att_no;
    private Date att_to_work;
    private Staff staff_att;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAtt_id() {
        return att_id;
    }

    public void setAtt_id(Integer att_id) {
        this.att_id = att_id;
    }

    public String getAtt_no() {
        return att_no;
    }

    public void setAtt_no(String att_no) {
        this.att_no = att_no;
    }

    public Date getAtt_to_work() {
        return att_to_work;
    }

    public void setAtt_to_work(Date att_to_work) {
        this.att_to_work = att_to_work;
    }

    public Staff getStaff_att() {
        return staff_att;
    }

    public void setStaff_att(Staff staff_att) {
        this.staff_att = staff_att;
    }
}
