package com.hibernate.hibernate;

public class table_model2 implements First_inter, Second_inter 
{

	private int slno;
	private String name;
	public void setSlno(int slno)
	{
		this.slno=slno;
	}
	
	public void first()
	{
	System.out.println("this is parent first implementation");	
	}
	public void second() {
		System.out.println("this is parent second implementation");
	}
	public void third() {
		System.out.println("this is parent third implementation");
	}

}
