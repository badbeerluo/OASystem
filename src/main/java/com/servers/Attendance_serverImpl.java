package com.chinactOA.servers;

import com.chinactOA.Beans.Attendance;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/8.
 */
@Service
public class Attendance_serverImpl implements Attendance_server {
    @Override
    public Attendance getAttendance() {
        Attendance att = (Attendance) ctx.getBean("Attendance");
        System.out.println();
        return null;
    }

    @Override
    public Attendance getAllAttendance() {
        return null;
    }
}
