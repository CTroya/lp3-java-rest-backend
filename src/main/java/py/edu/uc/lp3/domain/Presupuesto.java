package py.edu.uc.lp3.domain;

import java.util.ArrayList;

//import py.edu.uc.lp3.rest.controller.ProductoController;

public class Presupuesto {
    Double total = 0.0;
    Double totalImpuesto = 0.0;
    Double totalCosto = 0.0;
    Double totalFlete = 0.0;
    ArrayList<Producto> listItems= new ArrayList<Producto>();
    public Presupuesto(){
        this.total = 0.0;
        this.totalImpuesto = 0.0;
        this.totalCosto = 0.0;
        this.totalFlete = 0.0;
        this.listItems= new ArrayList<Producto>();
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
	public ArrayList<Producto> getListItems() {
		return listItems;
	}
	public void setListItems(ArrayList<Producto> listItems) {
		this.listItems = listItems;
	}
    
}
