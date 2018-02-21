import java.util.*;

public class Tarjeta {
  private int id;
  private String numero;
  private String cardHolder;
  private Date fechaVence;
  private Marca marca;


  public Tarjeta(){

  }

  public Tarjeta(int id, String numero, String cardHolder, Date fechaVence, Marca marca){

    this.id=id;
    this.numero=numero;
    this.cardHolder=cardHolder;
    this.fechaVence=fechaVence;
    this.marca=marca;

  }

  public String infoTarjeta() {
    return "Numero Tarjeta: "+"\t"+numero+"\n"+
            "Tarjetahabiente: "+"\t"+cardHolder+"\n"+
            "Fecha de Vencimiento"+"\t"+fechaVence+"\n"+
            "Marca: "+"\t\t\t"+marca.getNombre()+"\n"+
            "Estatus: "+"\t\t"+(isValid()?"Activa":"Vencida")+"\n";

  }

  public boolean compararTarjeta(Tarjeta tarjeta){

    return tarjeta.getNumero().equalsIgnoreCase(this.numero);

  }

  public boolean isValid(){
    return (new Date()).before(fechaVence);
  }


  public void setId(int id) {
    this.id=id;
  }

  public int getId() {
    return id;
  }

  public void setNumero(String numero) {
    this.numero=numero;
  }

  public String getNumero() {
    return numero;
  }

  public void setCardHolder(String cardHolder){
    this.cardHolder=cardHolder;
  }

  public String getCardHolder() {
    return cardHolder;
  }

  public void setFechaVence(Date fechaVence){
    this.fechaVence=fechaVence;
  }

  public Date getFechaVence(){
    return fechaVence;
  }

  public void setMarca(Marca marca){
    this.marca=marca;
  }

  public Marca getMarca(){
    return marca;
  }

}
