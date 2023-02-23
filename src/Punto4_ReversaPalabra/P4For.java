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
public class P4For {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String rotar;
        
        System.out.print("Ingrese la frase o texto que desea dar vuelta: ");
        rotar = scan.nextLine();
        
        for(int i = rotar.length()-1; i >= 0; i--){
            System.out.print(rotar.charAt(i));
        }
        System.out.println("");
    }
    
}
