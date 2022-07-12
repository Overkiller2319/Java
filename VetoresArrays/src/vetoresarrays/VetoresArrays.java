/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoresarrays;

/**
 *
 * @author ork
 */
import java.util.Scanner;
public class VetoresArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        int [] vet = new int [5];
       
        for(int i = 0 ; i<vet.length; i++){
        System.out.print("Digite o "+(i+1)+"º numero: ");
        vet[i] = ler.nextInt();
        }
        for ( int i=0 ; i<vet.length; i++ ){
        System.out.println(""+(i+1)+"ºValor Digitado = "+vet[i]);
        }
        Inverte(vet);
        imprimeInv(vet);
    }

    
       
                static void Inverte (int[] array){
               int [] vetor = new int [5];
                     for( int i = 0; i <vetor.length ; i++){
                        for ( int j = 4 ; j>=0 ; j-- ){
                            int aux;
                            aux = array[i];
                            array[i]=array[j];
                        }
                     }    
                }
                static void imprimeInv (int [] array){             
                          for( int i = 0; i > 0; i++){
                            System.out.print("%d"+array[i]);
                     }
                     }
}

