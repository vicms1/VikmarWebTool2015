/**
 * LoginBean.java
 * 
 */

package com.tutorial;


public class LoginBean {
    private String nombre;
    private int nameCounter = 0;
    private String clave;
    private int passCounter = 0;
    private String magicKey = "F9rm9ci9";
    private boolean isPassWordValid;

    
    public String getName ()
    {
    	
    	if(nameCounter!= 0)
    	{	
    	System.out.println("Obtaining the name in the bean: "+ nameCounter);
    	}
    	nameCounter = nameCounter+1;
    	return nombre;
        
        
    }


    public void setName (final String nombre)
    {
        System.out.println("Setting the name in the bean");
    	this.magicKey = nombre + "1";
        this.nombre = nombre;
    }


    public String getPassword()
    {
    	
    	if(passCounter!=0)
    	{
    	System.out.println("Obtaining the pass in the bean:"+ passCounter);
    	}
    	passCounter = passCounter+1;
    	return clave;
    }


    public void setPassword (final String clave)
    {
    	System.out.println("Inside the SetPass");
    	this.clave = clave;
    }
    

    
    public void setIsPasswordValid(boolean isPassWordValid)
    {
    	this.isPassWordValid = isPassWordValid;
    	
    }
    
    public boolean getIsPassWordValid()
    {
    	return isPassWordValid;
    	
    }
    
    /**
	 * @paramtestMethod the methodTester
	 */
    
    public String testMethod()
    {
    	System.out.println("Prueba de los metodos del bean invocados");
    	return "TestMethodWorks";
    }
    
    public String checkPassword()
    {
    	System.out.println("Inside the CheckPass");
    	int res = this.clave.compareTo(magicKey);
    	System.out.println("Before if in inside the CheckPass");
    	if(res == 0)
    		{
    		System.out.println("It's the magic Key");
    		return "magic";
    		}
    	else
    	{
    		System.out.println("Won't pass");    		
    		return "nope";
    	}
    }

    
    	
    }
    
	
    

