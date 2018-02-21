import java.util.*;

public class Operacion{

	private int id; 
	private double importe; 
	private Tarjeta tarjeta;
	private double tasaAplicada;
	private Date fecha; 

	public Operacion(){

	}

	public Operacion(int id, double importe, Tarjeta tarjeta, double tasaAplicada, Date fecha){

		this.id=id;
		this.importe=importe;
		this.tarjeta=tarjeta;
		this.tasaAplicada=tasaAplicada;
		this.fecha=fecha;

	}

	public String infoOperacion(){


		 return "Importe:\t\t"+importe+"\n"+
		 		"Marca:\t\t"+tarjeta.getMarca().getNombre()+"\n";
              
	}


	public void setId(int id) {
    this.id=id;
  }

  public int getId() {
    return id;
  }

  public void setMonto(double importe){
  	this.importe=importe;
  }

   public double getMonto() {
    return importe;
  }

  public void setTarjeta(Tarjeta tarjeta){
  	this.tarjeta=tarjeta;
  }

   public Tarjeta getTarjeta() {
    return tarjeta;
  }

  public void setTasaAplicada(double tasaAplicada){
  	this.tasaAplicada=tasaAplicada;
  }

  public double getTasaAplicada(){
  	return tasaAplicada;
  }

  public void setFecha(Date fecha){
  	this.fecha=fecha;
  }

  public Date getFecha(){
  	return fecha;
  }

}