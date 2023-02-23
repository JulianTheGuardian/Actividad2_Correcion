/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1_TablaMultiplicar;

/**
 *
 * @author Julian
 */
public class P1For {
    
    public static void main(String[] args){
        
        int multiplicando = (int) (Math.random()*2024);
        int multiplicador = (int) (Math.random()*2024);

        for(int i = 0; i != multiplicador+1; i++){
            System.out.println( multiplicando + "*" + i + "=" + multiplicando*i);
        }
    }
}
