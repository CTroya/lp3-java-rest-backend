package py.edu.uc.lp3.domain;

import java.util.ArrayList;

//import py.edu.uc.lp3.rest.controller.ProductoController;

public class Presupuesto {
    Double total = 0.0;
    Double totalImpuesto = 0.0;
    Double totalCosto = 0.0;
    Double totalFlete = 0.0;
    ArrayList<Producto> listItems = new ArrayList<Producto>();


    
    public Presupuesto(){
        total = 0.0;
        totalImpuesto = 0.0;
        totalCosto = 0.0;
        totalFlete = 0.0;
    }
    public Double getTotal(){
        return total;
    }
    public Double getTotalImpuesto(){
        return totalImpuesto;
    }
    public Double getTotalCosto(){
        return totalCosto;
    }
    public Double getTotalFlete(){
        return totalFlete;
    }
    public void setTotalFlete(Double set){
        totalFlete = set;
    }
    public void setTotalCosto(Double set){
        totalCosto = set;
    }
    public void setTotalImpuesto(Double set){
        totalImpuesto = set;
    }
    public void setTotal(Double set){
        total = set;
    }
}
