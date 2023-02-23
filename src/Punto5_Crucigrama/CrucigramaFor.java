/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5_Crucigrama;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class CrucigramaFor {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String [] almacen = new String[5];
        boolean paso = true;
        boolean salir = false;
        
        System.out.println("Ingrese 5 palabras:");
        
        for(int i = 0; i < 5; i++){
            System.out.print((i+1) + ". ");
            almacen[i] = scan.nextLine();
            
            for (int j = 0; j < 1; j++) {
                if(almacen[i].equals("")){
                    System.out.print("Ingrese un palabra: ");
                    almacen[i] = scan.nextLine();
                    j--;
                }
            }
        }
        
        for(int i = 0; i < 5; i++){
            
            int [] ocupado = new int [almacen[i].length()];
            
            for(int j = 0; j < ocupado.length; j++){
                ocupado[j] = 0;
            }
            
            for(int j = 0; j < 5; j++){
                
                salir = false;
                
                for(int k = 0; k < almacen[i].length(); k++){
                    
                    if(salir){
                        break;
                    }
                    
                    for(int l = 0; l < almacen[j].length(); l++){
                        
                        if(salir){
                            break;
                        }
                        if(!almacen[i].equals(almacen[j])){
                            
                            if(almacen[i].charAt(k) == almacen[j].charAt(l)){
                                
                                if(ocupado[k] == 0){
                                    ocupado[k] = 1;
                                    if(paso){
                                        System.out.print("En la palabra " + almacen[i] + " encajan: ");
                                        paso = false;
                                    }
                                    System.out.print(almacen[j] + " ");
                                    salir = true;
                                }
                            }
                        }   
                    }
                }
            }
            System.out.println("");
            paso = true;
        }
    }
}
