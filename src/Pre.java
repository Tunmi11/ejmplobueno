/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tunmi
 */
public class Pre 
{
    private String cas, des;
    private double impor = 0;

    public Pre(String c, String d, double impor) 
    {
        this.cas = c;
        this.des = d;
        this.impor = impor;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getImpor() {
        return impor;
    }

    public void setImpor(double impor) {
        this.impor = impor;
    }
    
    
    
    
    
}
