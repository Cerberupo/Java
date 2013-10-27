		/*
		 *	Calculen el perímetro y área de un rectángulo dada su base y su altura.
		 *	Calculen el perímetro y área de un círculo dado su radio.
		 *	Calculen el volumen de una esfera dado su radio.
		 *	Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
		 *	Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
		 */

package pro2;

import java.util.Scanner;

public class ej02_geometria_cerberupo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
	
		System.out.println("[0] Perimetro de rectángulo");
		System.out.println("[1] Perimetro de circulo");
		System.out.println("[2] Volumen de esfera");
		System.out.println("[3] Area de una rectangulo");
		System.out.println("[4] Hipotenusa de un triangulo rectangulo");
		System.out.println("Introduzca una opción:");
		
		int opcion;
		
		float dato1, dato2, resultado;
		
		opcion = teclado.nextInt();
		
		if (opcion >-1 & opcion < 5 ) {
			
			switch (opcion) {
			case 0:
				
				System.out.println("Usted a elegido la opcion 0, porfavor introduzca lo siguientes datos:");
				System.out.println("Ancho:");
				dato1 = teclado.nextInt();
				System.out.println("Alto:");
				dato2 = teclado.nextInt();
				dato1 = dato1 * 2;
				dato2 = dato2 * 2;
				resultado = dato1 + dato2;
				System.out.println("Perimetro de rectangulo = " +resultado);
				
				break;
				
			case 1:
				System.out.println("Usted a elegido la opcion 1, porfavor introduzca lo siguientes datos:");
				System.out.println("Radio:");
				dato1 = teclado.nextInt();
				dato1 = dato1 * 2;
				resultado = (float) (dato1 * Math.PI);
				System.out.println("Perimetro de circulo = " + resultado);
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				

			}
			
		} else {
			
			System.out.println("No marco una opcion valida, porfavor ejecute de nuevo el programa");
		}
		
		
		
		

	}

}
