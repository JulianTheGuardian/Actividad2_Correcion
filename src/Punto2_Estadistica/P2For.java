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
public class P2For {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String enter;
        int tamano = (int) (Math.random()*9+1);
        int mitad = 0;
        int cont3 = 0;
        int max = 0;
        double media = 0;
        int [] almacen = new int[tamano];
        int [] almacen2 = new int[tamano];
        
        System.out.println("Ingrese " + tamano + " números naturales segun se le pida.");
        
        //Llenar espacios

            System.out.println("Ingrese " + tamano + " números naturales segun se le pida.");
        
            for(int i=0; i != tamano; i++){
                System.out.print((i+1) + ". ");
                enter = scan.nextLine();

                if(enter.matches("[0-9]+")){
                    almacen[i] = Integer.parseInt(enter);
                }else{
                    System.out.println("Favor de ingresar numeros naturales.");
                    i--;
                }
            }

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

            for(int i=0 ; i != tamano; i++){
                media = media + almacen[i];
            }
            
            System.out.println("La media es: " + media/tamano);

        //Moda
            
            for(int i=0; i != almacen2.length; i++){
                for(int j=0; j != almacen2.length;j++){
                    if(almacen[i] == almacen[j]){
                        cont3++;
                    }
                }
                almacen2[i] = cont3;
                cont3 = 0;
            }
            
            for(int i=0;i != almacen2.length;i++){
                if(almacen2[i] > max){
                    max = almacen2[i];
                }
            }
            
            System.out.print("La moda es: ");
            for(int i=0; i != almacen.length;i++){
                if(max == almacen2[i]){
                    if(i != 0){
                        if(almacen[i] != almacen[(i-1)]){
                            System.out.print(almacen[i] + " ");
                        }
                    }
                    else{
                        System.out.print(almacen[i] + " ");
                    }
                }
            }
    }
}
