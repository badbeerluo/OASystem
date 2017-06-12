import com.Beans.Attendance;
import com.commons.ReadExcel;
import com.controller.Staff_controller;
import com.servers.Staff_serverImpl;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
public class staff_test {
     public static void main(String[] args) {
         Staff_serverImpl ss = new Staff_serverImpl();
         ss.printAll();
     }

     @Test
    public void testRead() {
         List<Attendance> att = new ArrayList<Attendance>();
        ReadExcel re = new ReadExcel();
        try {
            att = re.toReadExcel("C:\\Users\\Administrator\\Documents\\Tencent Files\\346863618\\FileRecv\\1111.xls");
            System.out.println(att.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
