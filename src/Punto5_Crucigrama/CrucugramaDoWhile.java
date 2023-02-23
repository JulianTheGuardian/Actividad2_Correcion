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
public class CrucugramaDoWhile {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String [] almacen = new String[5];
        boolean paso = true;
        boolean salir = false;
        int c = 0;
        int v = 0;
        int b = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        
        System.out.println("Ingrese 5 palabras:");
        
        do{
            System.out.print((c+1) + ". ");
            almacen[c] = scan.nextLine();
            
            do{
                if(almacen[c].equals("")){
                    System.out.print("Ingrese un palabra: ");
                    almacen[c] = scan.nextLine();
                    v--;
                }
                v++;
            }while(v<5);
            c++;
        }while(c<5);
        
        do{
            
            int [] ocupado = new int [almacen[i].length()];
            
            do{
                ocupado[b] = 0;
                b++;
            }while(b < ocupado.length);
            b = 0;
            
            do{
                
                salir = false;
                
                do{
                    
                    if(salir){
                        break;
                    }
                    
                    do{
                        
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
                        l++;
                    }while(l < almacen[j].length());
                    l = 0;
                    
                    k++;
                }while(k < almacen[i].length());
                k = 0;
                
                j++;
            }while(j <5);
            j = 0;
            
            System.out.println("");
            paso = true;
            i++;
        }while(i<5);
    }
}
