import java.util.*;

public class MarcaSCO implements Marca {

	private int id; 
	private String nombre;

	public MarcaSCO(int id, String nombre){
		this.id=id;
		this.nombre=nombre;

	}

  public double calcularTasa(){

  	return (new GregorianCalendar()).get(Calendar.DAY_OF_MONTH)*0.5;

  }

  public void setId(int id){
  	this.id=id;
  }

  public int getId(){
  	return id;
  }

  public void setNombre(String nombre){
  	this.nombre=nombre;
  }

  public String getNombre(){
  	return nombre;
  }

  }