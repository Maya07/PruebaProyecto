import java.util.*;

public class MarcaPere implements Marca {

	private int id; 
	private String nombre;

	public MarcaPere(int id, String nombre){
		this.id=id;
		this.nombre=nombre;

	}
	
  public double calcularTasa(){

  	return ((new GregorianCalendar()).get(Calendar.MONTH)+1)*0.1;

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