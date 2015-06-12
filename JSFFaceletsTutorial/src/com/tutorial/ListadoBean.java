/**
 * ListadoBean.java
 * 
 */
package com.tutorial;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;


public class ListadoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String salutation = "Bonjour!/Hi!";
    private Farmacia[] listPharmacies;
    private ArrayList <Farmacia> itemList;
    private DataModel <Farmacia> farmacias;
	//getter and setter methods
    private int itemId;
    private String itemName;
    private String itemFirstDetail;
    private boolean firstTime = true;
    
	//getter and setter methods

	public void setIdItem(String itemId)
	{
		System.out.println("Setting the itemId en Listado bean desde welcome.xhtml");
		this.itemId = (int) Integer.parseInt(itemId);
		
	}
	
	public String getIdItem()
	{
		return Integer.toString(this.itemId);
	}
    
	public void setNombreItem(String itemName)
	{

		System.out.println("El nombre a agregar es: "+itemName);
		this.itemName = itemName;
		
	}
	
	public String getNombreItem()
	{
		return this.itemName;
	}

	public void setDetalleUnoItem(String itemFirstDetail)
	{
		System.out.println("El detalle a agregar es: "+itemFirstDetail);
		this.itemFirstDetail = itemFirstDetail;
		
	}
	
	public String getDetalleUnoItem()
	{
		return this.itemFirstDetail;
	}
	
	
	//getter and setter methods
   
    
	public void setSalute(String salute)
	{
		this.salutation = salute;
		
	}
	
	public String getSalute()
	{
		if(firstTime){
		System.out.println("Creando listas y todo por primera vez firstTime es true");
		this.createList();
		this.fillDataModel();
		this.fillList();
		firstTime = false;
		}
		System.out.println("Antes de regresar Saludo");
		return this.salutation;
	}
    public Farmacia[] getPharmacies()
    {
    	return this.listPharmacies;
    }

	public DataModel<Farmacia> getPharmacieList()	{
		return this.farmacias;
	}
	
	public ArrayList<Farmacia> getListOfItems(){
		return this.itemList;
	}
	
    public void setPharmacies(Farmacia[] phList)
    {
    	this.listPharmacies = phList;
    }
	public int getPharmaciesAmount()
	{
		System.out.println("Enviando Tamaño de Arreglo");
		return this.listPharmacies.length;
	}	

	public String addItem()
	{
		System.out.println("Entrando al método addItem en Listado Bean");		
		Farmacia i = new Farmacia(itemId, itemName,itemFirstDetail);
		itemList.add(i);
		System.out.println("Antes de crear farmacia en add Item");		

		System.out.println("Antes de insertar farmacia en ArrayList en add Item");		

		System.out.println("Despues de agregar farmacia en ArrayList en add Item");		

		return "yes";
	}
	
	public void fillDataModel()
	{
		System.out.println("Antes de llenar Data Model");
		farmacias = new ArrayDataModel<Farmacia>(listPharmacies);
		System.out.println("Depues de llenar Data Model");
	}
	
	public void fillList()
	{
		System.out.println("Antes de llenar List");
		itemList = new ArrayList<Farmacia>(Arrays.asList(listPharmacies));
		System.out.println("Depues de llenar List");
	}
	
	public void createList()
    {
    	//Aqui vamos a crear el listado de farmacias cuando sea magia
    	   System.out.println("Creando listado de Farmacias");
    		listPharmacies = new Farmacia[] {
    		new Farmacia(101, "Majestic","1"),
    		new Farmacia(102, "San Jose","1"),
    		new Farmacia(103, "105 Pte","1"),
    		new Farmacia(104, "San Miguel","1"),
    		new Farmacia(105, "Prol 11 Sur","1"),
    		new Farmacia(106, "Prol 16 de Sept","1"),
    		new Farmacia(107, "La Fragua","1"),
    		new Farmacia(108, "San Francisco","1"),
    		new Farmacia(109, "Las Torres","1"),
    		new Farmacia(110, "San Isidro","1"),
    		new Farmacia(111, "San Manuel","1"),    		
    		new Farmacia(212, "Circuito","2"),    		
    		new Farmacia(213, "Valsequillo","2"),
    		new Farmacia(214, "16 de Septiembre","2"),    		
    		new Farmacia(215, "7 Sur","2"),
    		new Farmacia(216, "Huexotitla","2"),    		
    		new Farmacia(217, "Garita","2"),
    		new Farmacia(218, "Anzures","2"),    		
    		new Farmacia(219, "39 Oriente","2"),
    		new Farmacia(220, "La Margarita","2"),    		
    		new Farmacia(221, "Zaragoza","2"),
    		new Farmacia(322, "Santiago","3"),
    		new Farmacia(323, "Paseo Bravo","3"),
    		new Farmacia(324, "Centro","3"),
    		new Farmacia(325, "4 Pte","3"),
    		new Farmacia(326, "18 Pte","3"),
    		new Farmacia(327, "10 Pte","3"),
    		new Farmacia(328, "Sta. Clara","3"),
    		new Farmacia(329, "11 Oriente","3")

    	};
    }
	
	public static class Farmacia{
		 
		int idFarmacia;
		String nombreDeFarmacia;
		String ruta;
		
 
		public Farmacia(int idFarmacia, String nombreDeFarmacia, String rutaFarmacia) {
			System.out.println("Creando Farmacia"+nombreDeFarmacia);
			this.idFarmacia = idFarmacia;
			this.nombreDeFarmacia = nombreDeFarmacia;
			this.ruta = rutaFarmacia;
			
		}
		//getter and setter methods		
		public int getIdFarmacia()
		{
			return this.idFarmacia;
		}
 
		public void setIdFarmacia(int id)
		{
			this.idFarmacia = id;
		}
		
		public String getNombreDeFarmacia()
		{
			return this.nombreDeFarmacia;
		}

		public void setNombreDeFarmacia(String nombre)
		{
			this.nombreDeFarmacia = nombre;
		}
		
		public String getRutaDeFarmacia()
		{
			return this.ruta;
		}
		
		public void setRutaDeFarmacia(String rF)
		{
			this.ruta = rF;	
		}
		
		public String toString()
		{
			return this.nombreDeFarmacia;
		}
		
	}
	
}

	
	

