/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

public class Menu {
    public int menu(){
        System.out.println("1----------------------Potencia");
        System.out.println("2----------------------Imprimir");
        System.out.println("3----------------------Salir");
       
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
