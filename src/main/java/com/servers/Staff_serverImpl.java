package com.chinactOA.servers;

import com.chinactOA.Beans.Staff;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/7.
 */
@Service
public class Staff_serverImpl implements Staff_server {

    public void printAll() {
        Staff t = (Staff) ctx.getBean("staff");
        System.out.println(t.getStaff_id() + " " + t.getName() + " " +t.getAge());
    }
}
