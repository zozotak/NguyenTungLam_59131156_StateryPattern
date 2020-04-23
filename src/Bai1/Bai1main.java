/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author DELL
 */
public class Bai1main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        context pheptinh1 = new context();
        ITinh cong = new Cong();
        pheptinh1.setTinhToan(cong);
        System.out.println("Kết quả phép tính cộng: " + pheptinh1.tinh(1,2));
        
        context pheptinh2 = new context();
        ITinh tru = new Tru();
        pheptinh2.setTinhToan(tru);
        System.out.println("Kết quả phép tính trừ: " + pheptinh2.tinh(3, 4));
        
        context pheptinh3 = new context();
        ITinh nhan = new Nhan();
        pheptinh3.setTinhToan(nhan);
        System.out.println("Kết quả phép tính nhân: " + pheptinh3.tinh(5, 6));
        
        context pheptinh4 = new context();
        ITinh chia = new Chia();
        pheptinh4.setTinhToan(chia);
        System.out.println("Kết quả phép tính chia: " + pheptinh4.tinh(7, 8));
    }
    
}
