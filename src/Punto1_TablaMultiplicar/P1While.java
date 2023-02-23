/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1_TablaMultiplicar;

/**
 *
 * @author Julian
 */
public class P1While {
    
    public static void main(String[] args){
        int multiplicando = (int) (Math.random()*2024);
        int multiplicador = (int) (Math.random()*2024);
        int cont = 0;

        while(cont != multiplicador+1){
            System.out.println( multiplicando + "*" + cont + "=" + multiplicando*cont);
            cont++;
        } 
    }
}
