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
public class Chia implements ITinh{

    @Override
    public float Tinh(float a, float b) {
        if(b == 0)
        {
            System.out.println("Lỗi chia cho 0");
            return 0;
        }
        else
            return a / b;
    }
    
}