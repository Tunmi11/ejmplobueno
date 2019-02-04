/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta clase representa un presu de una compar
 * @author Tunmi
 */
public class Pre 
{
    
    private String cas, des;
    private double impor = 0;

    /**
     * Constructor por parametros
     * @param c nombre del cliente
     * @param d descripcion del presuspuesto
     * @param impor importe del presupuesto
     */
    public Pre(String c, String d, double impor) 
    {
        this.cas = c;
        this.des = d;
        this.impor = impor;
    }

    /**
     * devuelve el nombre del cliente
     * @return nombre del cliente
     */
    public String getCas() 
    {
        return cas;
    }

    /**
     * modifica el cliente
     * @param cas nombre del cliente
     */
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

    /**
     * 
     * @param impor 
     */
    public void setImpor(double impor) {
        this.impor = impor;
    }
    
    
    
    
    
}
