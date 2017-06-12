package com.chinactOA.commons;

import com.chinactOA.Beans.Attendance;
import com.chinactOA.Beans.Staff;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/6/9.
 */
public class ReadExcel {
    private HSSFWorkbook hssfWorkbook;
    private HSSFSheet sheet;
    private HSSFRow row;
    private HSSFCell cell;

    public static List<Attendance> toReadExcel(String path) throws IOException, ParseException {
        List<Attendance> att = new ArrayList<Attendance>();
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);
        HSSFWorkbook workbook = new HSSFWorkbook(bis);
        HSSFSheet sheet = workbook.getSheet("考勤");
        HSSFRow row = null;
        int rowCnt = 0;
        while ((row = sheet.getRow(rowCnt++))!=null){
            if (row.getCell(0).getStringCellValue()==""){
                break;
            } else {
                Attendance attendance = new Attendance();
                System.out.println(sheet.getRepeatingRows() + " " + row.getCell(0) + " " + row.getCell(1) + " " + row.getCell(2));
                attendance.setAtt_no(row.getCell(0).toString());
                attendance.setAtt_id(Integer.valueOf(row.getCell(1).toString()));
                DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date d = sdf.parse(row.getCell(2).toString());
                attendance.setAtt_to_work(d);
                att.add(attendance);
            }
        }

        return att;
    }
}
