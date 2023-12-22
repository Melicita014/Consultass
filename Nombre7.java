//¿Cuántas de las cadenas contienen la subcadena “zar”?
public class Nombre7 {

	public static void main(String[] args) {

		String Nombres[] = {"Sue","Anna","Zarlotte","Anna","Mike","William","Ed","Zara"};
	
		String palabra = "zar"; // El conjunto de letras que estamosbuscando.
		
		
		int contador = 0; //El contador para saber cuantos nombres tienen ese conjunto de letras
		
		for (int i = 0; i < Nombres.length; i++) { //Bucle para recorrer cada posicion de la tabla.
			  Nombres[i] = Nombres[i].toLowerCase();
			if (Nombres[i].indexOf(palabra) >= 0 ) { //El método indexOf()devuelve 1 si contiene lo que le hemos pedido. Eso significa que cumpliria la condicion y subiria uno  al contador.
				contador++;  
			}
		}
		//Para mostrar en pantalla el resultado:
		System.out.println("Hay exactamente " + contador + " nombres que contiene la subcadena 'zar'.");


	}

}
