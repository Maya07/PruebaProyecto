

import java.util.*;


public final class TarjetaGestor { 

	public static void main (String args[]){

		

		ArrayList<Tarjeta> tarjetaLista = new ArrayList<Tarjeta>();
		

		MarcaPere pere = new MarcaPere(1, "PERE");
		MarcaSQUA squa = new MarcaSQUA(2, "SQUA");
		MarcaSCO sco = new MarcaSCO(3,"SCO");

		tarjetaLista.add(new Tarjeta(1, "0000 0001","Mayerling Garcia", new GregorianCalendar(2021, 7, 3).getTime(), pere));
		tarjetaLista.add(new Tarjeta(2, "0000 0002","Arevalo Asuaje", new GregorianCalendar(2010, 7, 3).getTime(), squa));
		tarjetaLista.add(new Tarjeta(3, "0000 0003","Gerardo Villaroel", new GregorianCalendar(2018, 7, 3).getTime(), sco));
		tarjetaLista.add(new Tarjeta(4, "0000 0003","Oriana Carrasquel", new GregorianCalendar(2018, 7, 3).getTime(), sco));

		System.out.println(tarjetaLista.get(0).infoTarjeta()+"\n"+
							tarjetaLista.get(1).infoTarjeta()+"\n"+
							tarjetaLista.get(0).infoTarjeta()+"\n");

		System.out.println("Comparando tarjetas por numero: ");

		boolean tarjetaComparacion = tarjetaLista.get(0).compararTarjeta(tarjetaLista.get(1));

		System.out.println("Comparando las tarjetas 0000 0001 de Mayerling Garcia y 0000 0002 de Arevalo Asuaje: "+
							(tarjetaComparacion?"Iguales":"Diferentes"));
		
		tarjetaComparacion = tarjetaLista.get(2).compararTarjeta(tarjetaLista.get(3));

		System.out.println("Comparando las tarjetas 0000 0003 de Gerardo Villaroel y 0000 0003 de Oriana Carrasquel: "+
							(tarjetaComparacion?"Iguales":"Diferentes"));
		

		System.out.println("Introduzca el numero de tarjeta");
		String strTarjeta = System.console().readLine();
		Tarjeta tarjetaEncontrada = null;

		for (Tarjeta tarjeta:tarjetaLista){

			if(tarjeta.getNumero().equalsIgnoreCase(strTarjeta)){
				tarjetaEncontrada = tarjeta;
			}

		}

		if (tarjetaEncontrada!=null){
			if (tarjetaEncontrada.isValid()){
				System.out.println("Introduzca el monto a cancelar");
				String strMonto = System.console().readLine();


				if(strMonto.matches("\\d*")){
					int intMonto = Integer.parseInt(strMonto);
					double importe = (intMonto * tarjetaEncontrada.getMarca().calcularTasa()) + intMonto;

					if (intMonto<1000){
						Operacion operacion = new Operacion(1,importe,tarjetaEncontrada,tarjetaEncontrada.getMarca().calcularTasa(), new Date());

						System.out.println(operacion.infoOperacion());
						
					} else {
						
							System.out.println("Error. Sobrepasa el monto permitido.");
					}
				} else {
					System.out.println("Error. Monto invalido.");
				}

				
			} else {
				System.out.println("Error. Tarjeta Vencida.");
			}

		} else {
			System.out.println("Error. La tarjeta no existe en el sistema.");


		}

		
	 }

		 
	}

	

	

