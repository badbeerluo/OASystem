package com.chinactOA.controller;

import com.chinactOA.Beans.Attendance;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/6/8.
 */
@Controller
@RequestMapping("/staff")
public class Staff_controller {

    @RequestMapping("/get")
    public ModelAndView getAllStaff(ModelMap model) {
        return new ModelAndView("test");
    }

    @RequestMapping("/get/attendance")
    public @ResponseBody Object getAllAtt() {

        return null;
    }
}
