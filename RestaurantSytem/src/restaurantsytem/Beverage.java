/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantsytem;

/**
 *
 * @author User
 */
public class Beverage extends Menu{
        private int ml;
    public Beverage(double fiyat, String isim,int ml) {

        super(fiyat, isim);//menuden fiyat ve ismi alinir
        this.ml=ml;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
    
}
