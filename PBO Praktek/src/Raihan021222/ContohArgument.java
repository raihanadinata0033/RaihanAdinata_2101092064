/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raihan021222;

/**
 *
 * @author ACER
 */
public class ContohArgument {
    public static void main(String[] args) {
        try{
        System.out.println("Argumen ke-0 adalah "+ args[0]);
        }
        catch(Exception ex){
            System.out.println("Error Index ke " + ex.getMessage() + "tidak ada");
        }
    }
}
