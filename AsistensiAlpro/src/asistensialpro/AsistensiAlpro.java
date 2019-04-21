/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AsistensiAlpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
        double x,y,m=0;
        double diskriminan, AkarPolinom1, AkarPolinom2, TitikStasioner, KecekunganKurva, NilaiMinimumLokal;
        
        System.out.print("Input : "); 
        int a = input.nextInt();int b = input.nextInt();int c = input.nextInt();
        
        if(a!=0){
        System.out.println(" Polinomial "+ a+ "x^2 +"+ b+ "x +"+ c+ " memiliki");
        
        diskriminan = (b*b)-(4*a*c);
        System.out.println("1." + "Diskriminan              = " + diskriminan);
        
        AkarPolinom1 = (-1*b + Math.sqrt(diskriminan))/(2*a);
        AkarPolinom2 = (-1*b - Math.sqrt(diskriminan))/(2*a);
        System.out.println("2." + "Akar - akar polinomial   = " + AkarPolinom1 + " dan " + AkarPolinom2);
                
        if (m==0){
        x = -1*b/(2*a);
        y = -1*diskriminan/(4*a);
        System.out.println("3." + "Titik Stasioner          = " + "(" + x + "," + y + ")");
            
        if (a>0){
            System.out.println("4." + "Kecekungan Kurva         = Atas ");
        }
        if (a<0){
            System.out.println("4." + "Kecekungan Kurva         = Bawah ");
        }
        
        System.out.println("5." + "Nilai Minimum Lokal      = " + y);   
        }}
        
        else if (a==0){
        System.out.println("Nilai a tidak boleh 0");
}}}
    
        
        
        
         
        
 
 
