/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO code application logic here
		int cond = 1;
		double arreglo[] = new double[15];
		Scanner scan = new Scanner(System.in);
		imprimir imp = new imprimir();

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("--------------------------------------------");
			Menu m = new Menu();
			cond = m.menu();
			double base = 0, exponente = 0;
			if (cond < 1 || cond > 3) {
				System.out.println("Opción erronea");
				break;
			} else if (cond == 2 || cond == 3) {
				break;
			}

			System.out.println("Base");
			arreglo[i] = scan.nextInt();
			base = arreglo[i];

			System.out.println("Exponente");
			i++;
			arreglo[i] = scan.nextInt();
			exponente = arreglo[i];

			i++;
			arreglo[i] = Math.pow(base, exponente);

			if (i == 11) {
				System.out.println("Solo queda espacio para una potencia");
			}

		}
		System.out.println("--------------------------------------------");
		if (cond == 2) {

			imp.impresion(arreglo);
		}

		imp.impresion(arreglo);

	}

}
