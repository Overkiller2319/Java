/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

/**
 *
 * @author ork
 */
import java.util.Scanner;
public class Aula1 {

    /**
     * @param args the command line arguments
     */
     public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Qual seu nome: ");
        String nome = entrada.nextLine();  
        System.out.println ("Qual a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Ola, " +nome + ". Sua idade eh: " +idade);
     
     }
    

    
    
    
}
