/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2_Estadistica;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P2DoWhile {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String enter;
        int tamano = (int) (Math.random()*9+1);
        int cont = 0;
        int mitad = 0;
        int cont2 = 0;
        int cont3 = 0;
        int max = 0;
        double media = 0;
        int [] almacen = new int[tamano];
        int [] almacen2 = new int[tamano];
        
        System.out.println("Ingrese " + tamano + " números naturales segun se le pida.");
        
        //Llenar espacios

            System.out.println("Ingrese " + tamano + " números naturales segun se le pida.");
        
            do{
                System.out.print((cont+1) + ". ");
                enter = scan.nextLine();

                if(enter.matches("[0-9]+")){
                    almacen[cont] = Integer.parseInt(enter);
                    cont++;
                }else{
                    System.out.println("Favor de ingresar numeros naturales.");
                }
            }while(cont != tamano);
            
            cont = 0;

        //Mediana

            Arrays.sort(almacen);

            if(tamano%2 != 0){
                mitad = tamano/2;
                System.out.println("La mediana es: " + almacen[mitad]);
            }
            else{
                mitad = tamano/2;
                System.out.println("Hay 2 medianas, estas son: " + almacen[mitad-1] + " y " + almacen[mitad]);
            }

        //Media

            do{
                media = media + almacen[cont];
                cont++;
            }while(cont != tamano);
            System.out.println("La media es: " + media/tamano);
            
            cont = 0;

        //Moda

            do{
                do{
                    if(almacen[cont] == almacen[cont2]){
                        cont3++;
                    }
                    cont2++;
                }while(cont2 != almacen2.length);
                
                almacen2[cont] = cont3;
                cont++;
                cont3 = 0;
                cont2 = 0;
                
            }while(cont != almacen2.length);
            cont = 0;
            
            do{
                if(almacen2[cont] > max){
                    max = almacen2[cont];
                }
                cont++;
            }while(cont != almacen2.length);
            
            System.out.print("La moda es: ");
            do{
                if(max == almacen2[cont2]){
                    if(cont2 != 0){
                        if(almacen[cont2] != almacen[(cont2-1)]){
                            System.out.print(almacen[cont2] + " ");
                        }
                    }
                    else{
                        System.out.print(almacen[cont2] + " ");
                    }
                }
                cont2++;
            }while(cont2 != almacen.length);
    }
}
