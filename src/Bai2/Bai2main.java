/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author DELL
 */
public class Bai2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HangHoa HH1 = new HangHoa("Tivi", 1000000, "Tivi kỹ thuất số");
        HangHoa HH2 = new HangHoa("Honda", 2000000, "Xe máy");
        HangHoa HH3 = new HangHoa("Samsum Galaxy A6", 3000000, "Điện thoại ");
        GioHang GH1 = new GioHang();
        GioHang GH2 = new GioHang();
        GH1.themHH(HH1);
        GH1.themHH(HH2);
        IThanhToan TTOnline = new ThanhToanOnline();
        GH1.setHinhThucTT(TTOnline);
        System.out.println("Danh sách hàng hóa: ");
        GH1.hienthiDSHH();
        System.out.println("Tổng tiền giỏ hàng 1: " + GH1.tinhtien());
        System.out.println("Tổng tiền khách trả online: " + GH1.thanhToan(GH1.tinhtien()));
        
        GH2.themHH(HH1);
        GH2.themHH(HH3);
        IThanhToan TTCOD = new  ThanhToanCOD();
        GH2.setHinhThucTT(TTCOD);
        GH2.hienthiDSHH();
        System.out.println("Tổng tiền giỏ hàng 2: " + GH2.tinhtien());
        System.out.println("Tổng tiền khách trả COD: " + GH2.thanhToan(GH2.tinhtien()));
        //dă
    }
}