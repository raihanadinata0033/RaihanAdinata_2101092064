/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_11.Latihan_1;


/**
 *
 * @author HAMBA ALLAH
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student;
        
        Komputer komputer=new Komputer();
        
        student=komputer;
        
        student.setName("Raihan");
        student.setAddress("Bukittinggi");
        student.setAge(20);
        student.setMathGrade(90.0);
        student.setEnglishGrade(81.0);
        student.setScienceGrade(85.0);
        student.setKomputer(95.0);
        System.out.println("Nama : "+student.getName());
        System.out.println("Umur : "+student.getAge());
        System.out.println("Alamat : "+student.getAddress());
        System.out.println("Nilai MTK : "+student.getMathGrade());
        System.out.println("Nilai B.inggris : "+student.getEnglishGrade());
        System.out.println("Nilai Science : "+student.getScienceGrade());
        System.out.println(student.getKomputer());
    
    }
}
