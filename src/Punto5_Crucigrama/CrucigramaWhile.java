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
public class CrucigramaWhile {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String [] almacen = new String[5];
        boolean paso = true;
        boolean salir = false;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int w = 0;
        int e = 0;
        int r = 0;
        int t = 0;
        
        System.out.println("Ingrese 5 palabras:");
        
        while(w < 5){
            System.out.print((w+1) + ". ");
            almacen[w] = scan.nextLine();
            
            while(e < 1){
                if(almacen[w].equals("")){
                    System.out.print("Ingrese un palabra: ");
                    almacen[w] = scan.nextLine();
                    e--;
                }
                e++;
            }
            w++;
        }
        
        while(t < 5 ){
            almacen[t] = almacen[t].toLowerCase();
            t++;
        }
        
        while(i < 5){
            
            int [] ocupado = new int [almacen[i].length()];
            
            while(r < ocupado.length){
                ocupado[r] = 0;
                r++;
            }
            r = 0;
            
            while(j < 5){
                
                salir = false;
                
                while(k < almacen[i].length()){
                    
                    if(salir){
                        break;
                    }
                    
                    while(l < almacen[j].length()){
                        
                        if(salir){
                            break;
                        }
                        if(!almacen[i].equals(almacen[j])){
                            
                            if(almacen[i].charAt(k) == almacen[j].charAt(l)){
                                
                                if(ocupado[k] == 0){
                                    ocupado[k] = 1;
                                    if(paso){
                                        System.out.print("En la palabra " + almacen[i].toUpperCase().charAt(0) + almacen[i].substring(1) + " encajan: ");
                                        paso = false;
                                    }
                                    System.out.print(almacen[j] + " ");
                                    salir = true;
                                }
                            }
                        }
                        l++;
                    }
                    k++;
                    l = 0;
                }
                j++;
                k = 0;
            }
            i++;
            j = 0;
            
            System.out.println("");
            paso = true;
        }
    }
}
