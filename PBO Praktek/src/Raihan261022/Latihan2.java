/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raihan261022;

/**
 *
 * @author ACER
 */
public class Latihan2 {
    public static void main( String[] args ){
       int i;
       String days [] = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
       
       i=0;
       while(i<days.length){
           if(i!=0){
               System.out.print(", ");
           }
           System.out.print(days[i]);
           i++;
       }
    } 
}
