//1. Crea un proyecto nuevo denominado Evaluacion y un paquete que tenga tu nombre, 
//apellidos y la palabra evaluacion: "nombre.apellidos.evaluacion" (1 punto). 

//EN UNA CLASE llamada HerramientasEvaluacion 

//2. Parte 1: Crear un array de cadenas y llenarlo con palabras introducidas por el usuario 
//(1 punto). 
//Escribe una función crearArrayPalabras que: 
//• Pida al usuario cuántas palabras quiere introducir (entre 1 y 20). 
//• Lea esas palabras desde teclado. 
//• Devuelva el array de palabras. 

//3. Parte 2: Mostrar las palabras almacenadas (1 punto). 
//Escribe una función mostrarPalabras que reciba el array de palabras, lo recorra y las 
//imprima en pantalla. 

//4. Parte 3: Buscar la palabra más larga y la más corta (1 punto). 
//Escribe una función buscarExtremos que: 
//• Reciba el array de palabras. 
//• Devuelva la palabra más larga y la palabra más corta. 

//5. Parte 4: Contar cuántas palabras empiezan por vocal (1 punto). 
//Escribe una función contarVocalesIniciales que: 
//• Reciba el array de palabras. 
//• Devuelva cuántas palabras comienzan por vocal. 

//6. Parte 5: Crear un nuevo array solo con las palabras que tengan más de 5 caracteres 
//(1 punto). 
//Escribe una función filtrarPalabrasLargas que: 
//• Reciba el array de palabras. 
//• Devuelva un nuevo array con solo las palabras que tengan más de 5 letras. 

package mario.ferron.evaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class HerramientasEvaluacion {

	public static String[] crearArrayPalabras(Scanner scan) {

		int tamanoArray = 0;
		String[] array = null;

		System.out.println("Introduce el numero de palabras que quieres en el array (entre 1 - 20): ");
		tamanoArray = scan.nextInt();
		scan.nextLine();

		if (tamanoArray >= 0 && tamanoArray <= 20) {

			array = new String[tamanoArray];

			for (int i = 0; i < tamanoArray; i++) {
				System.out.println("Introduce la palabra " + (i + 1) + ": ");
				array[i] = scan.nextLine();
			}
		} else {
			System.out.println("Tamaño incorrecto");
		}
		return array;

	}

	public static void mostrarPalabras(String[] array) {
		System.out.print("[" + "\t");
		for (String palabra : array) {
			System.out.print(palabra + "\t");
		}
		System.out.println("]");
	}

	public static String[] buscarExtremos(String[] array) {
		String minimo = array[0];
		String maximo = array[0];
		for (String palabra : array) {
			if (palabra.length() < minimo.length()) {
				minimo = palabra;
			}
			if (palabra.length() > maximo.length()) {
				maximo = palabra;
			}
		}
		String[] extremos = { minimo, maximo };
		System.out.println(Arrays.toString(extremos));
		return extremos;
	}

	public static int contarVocalesIniciales(String[] array) {

		int contador = 0;
		for (String palabra : array) {
			char inicial = Character.toLowerCase(palabra.charAt(0));
			if (inicial == 'a' || inicial == 'e' || inicial == 'i' || inicial == 'o' || inicial == 'u') {
				contador++;
			}
		}
		System.out.println(contador);
		return contador;
	}
	
	public static String[] filtrarPalabrasLargas(String[] array) {
		String[] PalabrasLargas = null;
		String palabra = null;
		
		for (int i = 0; i < array.length; i++) {
			PalabrasLargas[i] = palabra;
		}
		
		return PalabrasLargas;
	}

}
