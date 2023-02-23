/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto3_ListaCompra;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P3For {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int tam = (int) (Math.random()*23+1);
        String enter;
        String num = "";
        boolean aprobado = true;
        
        String [] name = new String[tam];
        String [] cant = new String[tam];
        String [] precio = new String[tam];
        
        
        for(int i = 0; i != tam; i++){
            
            System.out.print("Producto " + (i+1) + ": ");
            name[i] = scan.nextLine();
            
            for (int j = 0; j < 1; j++) {
                if(name[i].matches("")){
                    System.out.print("Ingrese un producto: ");
                    name[i] = scan.nextLine();
                    j--;
                }
            }
            
            System.out.print("Cantidad del producto: ");
            num = scan.nextLine();
            
            for (int j = 0; j < 1; j++) {
                if(num.matches("[0-9]+")){
                    cant[i] = num;
                }
                else{
                    System.out.print("Ingrese un número entero: ");
                    num = scan.nextLine();
                    j--;
                }
            }
            
            System.out.print("Precio del producto: ");
            num = scan.nextLine();
            
            for (int j = 0; j < 1; j++) {
                if(num.matches("[0-9]+")){
                    precio[i] = num;
                }
                else{
                    System.out.print("Ingrese un número entero: ");
                    num = scan.nextLine();
                    j--;
                }
            }
        }
        
        System.out.println("Lista de la compra:");
        System.out.println("Producto \t\t\tCantidad \t\t\tPrecio");
        
        for(int i = 0; i != tam; i++){
            System.out.println(name[i] + "\t\t\t\t" + cant[i] + "\t\t\t\t" + precio[i]);
        }
    }
}
