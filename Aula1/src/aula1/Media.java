/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

/**
 *
 * @author ork
 */
 import java.util.Scanner;

public class Media {
    public static void main (String args []){
        Scanner ler = new Scanner (System.in);
        float a, b, c,  media;
        System.out.print("Nota 1: ");
        a = ler.nextFloat();
        System.out.print("Nota 2: ");
        b = ler.nextFloat();
        System.out.print("Nota 3: ");
        c = ler.nextFloat();
        media =(float)(a+b+c)/3;
        System.out.println("Sua media final eh: " +media);
    }
}
