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
public class P3DoWhile {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int tam = (int) (Math.random()*23+1);
        int cont = 0;
        String enter;
        String num = "";
        boolean aprobado = true;
        
        String [] name = new String[tam];
        String [] cant = new String[tam];
        String [] precio = new String[tam];
        
        
        do{
            System.out.print("Producto " + (cont+1) + ": ");
            name[cont] = scan.nextLine();
            
            do{
                if(name[cont].matches("")){
                    System.out.print("Ingrese un producto: ");
                    name[cont] = scan.nextLine();
                }
            }while(name[cont].matches(""));
            
            System.out.print("Cantidad del producto: ");
            num = scan.nextLine();
            
            do{
                if(num.matches("[0-9]+")){
                    cant[cont] = num;
                }
                else{
                    System.out.print("Ingrese un número entero: ");
                    num = scan.nextLine();
                    cant[cont] = "a";
                }
            }while(cant[cont].matches("[^0-9]+"));
            
            System.out.print("Precio del producto: ");
            num = scan.nextLine();
            
            do{
                if(num.matches("[0-9]+")){
                    precio[cont] = num;
                }
                else{
                    System.out.print("Ingrese un número entero: ");
                    num = scan.nextLine();
                    precio[cont] = "a";
                }
            }while(precio[cont].matches("[^0-9]+"));
            
            cont++;
        }while(cont != tam);
        
        System.out.println("");
        cont = 0;
        System.out.println("Lista de la compra:");
        System.out.println("Producto \t\t\tCantidad \t\t\tPrecio");
        
        do{
            System.out.println(name[cont] + "\t\t\t\t" + cant[cont] + "\t\t\t\t" + precio[cont]);
            cont++;
        }while(cont != tam);
    }
}
