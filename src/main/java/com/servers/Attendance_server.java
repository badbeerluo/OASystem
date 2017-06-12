package com.servers;

import com.Beans.Attendance;

/**
 * Created by Administrator on 2017/6/7.
 */
public interface Attendance_server extends Defult_servers{
    public Attendance getAttendance();
    public Attendance getAllAttendance();
}
