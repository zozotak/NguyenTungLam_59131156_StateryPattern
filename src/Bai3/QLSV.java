/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
//
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class QLSV{

    ISoSanh<SinhVien> ss;
    ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();

    public QLSV() {
    }
    
    public void setSs(ISoSanh<SinhVien> ss) {
        this.ss = ss;
    }
    public void sapXep()
    {
      for(int i = 0; i < dssv.size()-1; i++)
      {
         for(int j = i+1; j < dssv.size(); j++ )
         {
             if(ss.soSanh(dssv.get(i), dssv.get(j))>0)
             {
                 Collections.swap(dssv, i, j);
             }
         }
      }
    }
    public void inDS()
    {
        for(int i = 0; i < dssv.size(); i++)
        {
            System.out.println(dssv.get(i).toString());
        }
    }
   
}
