/**
 * ListadoBean.java
 * 
 */
package com.tutorial;

import java.io.Serializable;


public class ListadoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String salutation = "Bonjour!/Hi!";
    private Farmacia[] listPharmacies;
	//getter and setter methods
	
	public void setSalute(String salute)
	{
		this.salutation = salute;
		
	}
	
	public String getSalute()
	{
		this.createList();
		System.out.println("Antes de regresar Saludo");
		return this.salutation;
	}
	
    public Farmacia[] getPharmacies()
    {
    	return this.listPharmacies;
    }
    
    public void setPharmacies(Farmacia[] phList)
    {
    	this.listPharmacies = phList;
    }
	
	public void createList()
    {
    	//Aqui vamos a crear el listado de farmacias cuando sea magia
    	   System.out.println("Creando listado de Farmacias");
    		listPharmacies = new Farmacia[] {
    		new Farmacia(1, "Majestic",1),
    		new Farmacia(2, "San Jose",1),
    		new Farmacia(3, "105 Pte",1),
    		new Farmacia(4, "San Miguel",1),
    		new Farmacia(5, "Prol 11 Sur",1),
    		new Farmacia(6, "Prol 16 de Sept",1),
    		new Farmacia(7, "La Fragua",1),
    		new Farmacia(8, "San Francisco",1),
    		new Farmacia(9, "Las Torres",1),
    		new Farmacia(10, "San Isidro",1),
    		new Farmacia(11, "San Manuel",1),    		
    		new Farmacia(12, "Circuito",2),    		
    		new Farmacia(13, "Valsequillo",2),
    		new Farmacia(14, "16 de Septiembre",2),    		
    		new Farmacia(15, "7 Sur",2),
    		new Farmacia(16, "Huexotitla",2),    		
    		new Farmacia(17, "Garita",2),
    		new Farmacia(18, "Anzures",2),    		
    		new Farmacia(19, "39 Oriente",2),
    		new Farmacia(20, "La Margarita",2),    		
    		new Farmacia(21, "Zaragoza",2),
    		new Farmacia(22, "Santiago",3),
    		new Farmacia(23, "Paseo Bravo",3),
    		new Farmacia(24, "Centro",3),
    		new Farmacia(25, "4 Pte",3),
    		new Farmacia(26, "18 Pte",3),
    		new Farmacia(27, "10 Pte",3),
    		new Farmacia(28, "Sta. Clara",3),
    		new Farmacia(29, "11 Oriente",3)

    	};
    }
	
	public static class Farmacia{
		 
		int idFarmacia;
		String nombreDeFarmacia;
		int ruta;
		
 
		public Farmacia(int idFarmacia, String nombreDeFarmacia, int rutaFarmacia) {
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
		
		public int getRutaDeFarmacia()
		{
			return this.ruta;
		}
		
		public void setRutaDeFarmacia(int rF)
		{
			this.ruta = rF;	
		}
		
		public String toString()
		{
			return this.nombreDeFarmacia;
		}
		
	}
	
}

	
	

