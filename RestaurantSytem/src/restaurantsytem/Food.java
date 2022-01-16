/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantsytem;

import java.util.ArrayList;
import java.util.Arrays;
public class Food extends Menu{
    private String alan;
    public Food(double fiyat, String isim,String alan) {
        super(fiyat, isim);
        this.alan=alan;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }
    
}
