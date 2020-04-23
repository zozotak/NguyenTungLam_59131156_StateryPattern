/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
//
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Bai3main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdtf = new SimpleDateFormat("dd-MM-yyyy");
        ISoSanh ss1 = new SSTheoTen();
        ISoSanh ss2 = new SSTheoDiem();
        QLSV qlsv = new QLSV();
        SinhVien sv1 = new SinhVien();
        sv1.setHoTen("Nguyễn A");
        sv1.setNgaySinh(sdtf.parse("12-10-1999"));
        sv1.setDiemTB(7);
        SinhVien sv2 = new SinhVien();
        sv2.setHoTen("Lê B");
        sv2.setNgaySinh(sdtf.parse("24-07-1999"));
        sv2.setDiemTB(9);
        SinhVien sv3 = new SinhVien();
        sv3.setHoTen("Võ C");
        sv3.setNgaySinh(sdtf.parse("25-05-1999"));
        sv3.setDiemTB(6);
        qlsv.dssv.add(sv1);
        qlsv.dssv.add(sv2);
        qlsv.dssv.add(sv3);
        System.out.println("\n Danh sách sinh viên sắp xếp theo tên: ");
        qlsv.setSs(ss1);
        qlsv.sapXep();
        qlsv.inDS();
        System.out.println("\n Danh sách sinh viên sắp xếp theo điểm: ");
        qlsv.setSs(ss2);
        qlsv.sapXep();
        qlsv.inDS();
       
    }
    
}
