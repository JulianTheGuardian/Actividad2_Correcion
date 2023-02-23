/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto4_ReversaPalabra;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P4While {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cont;
        String rotar;
        
        System.out.print("Ingrese la frase o texto que desea dar vuelta: ");
        rotar = scan.nextLine();
        cont =  rotar.length()-1;
        
        while(cont >= 0){
            System.out.print(rotar.charAt(cont));
            cont--;
        }
        System.out.println("");
    }
}
