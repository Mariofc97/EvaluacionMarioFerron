package mario.ferron.evaluacion;

// UNA CLASE llamada Evaluacion 
//7. Parte 6: Crear el método main (3 puntos). 
//En el método main: 
//• Llama a crearArrayPalabras() y guarda el resultado en una variable. 
//• Llama a mostrarPalabras() para mostrar el contenido. 
//• Llama a buscarExtremos() y muestra la palabra más corta y más larga. 
//• Llama a contarVocalesIniciales() y muestra cuántas palabras empiezan por vocal. 
//• Llama a filtrarPalabrasLargas() y muestra el nuevo array resultante. 

import java.util.Scanner;

public class Evaluacion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String []array = HerramientasEvaluacion.crearArrayPalabras(scan);
		
		System.out.println("Palabras en el array: ");
		HerramientasEvaluacion.mostrarPalabras(array);
		
		System.out.println("Palabra mas corta y mas larga del array: ");
		HerramientasEvaluacion.buscarExtremos(array);
		
		System.out.println("Numero de palabras que empiezan por vocal: ");
		HerramientasEvaluacion.contarVocalesIniciales(array);
		
		System.out.println("Estas son las palabras con mas de 5 caracteres: "); 
		HerramientasEvaluacion.filtrarPalabrasLargas(array);


	}

}
