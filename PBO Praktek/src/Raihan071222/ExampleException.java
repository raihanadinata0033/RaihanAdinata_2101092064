/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raihan071222;

/**
 *
 * @author ACER
 */
public class ExampleException {
    public static void main(String[] args) {
        try{
            System.out.println(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Indeks ke "+ex.getMessage()+" Tidak Ada");
        }
    }
}
