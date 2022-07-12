/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lembrete;

/**
 *
 * @author ork
 */
import java.util.Scanner;
public class Lembrete {
    private String nome;
    private String descricao;
    private Data date;
    
    /**
     * @param args the command line arguments
     */
    
        public Lembrete ( Data data, String nome_do_lembrete , String descricao ){
            this.nome = nome_do_lembrete;
            this.descricao = descricao;
            this.date = data;
        }
                                               
                                                
        public void Imprime (){
        System.out.printf("Nome do lembrete: " +nome+ "\nData do lembrete: "+date.RetornaData()+"\nDescricao: "+descricao);
         }
        
                    public static class Data{
                    private  int d;
                    private  int m;
                    private  int a;
                       public Data (int dia, int mes, int ano){
                        d = dia;
                        m= mes;
                        a = ano;
                       }

                       public int getDia (int dia){
                       return d;
                       }
                      public String RetornaData (){
                      return d+ "/" + m + "/" +a;   
                        }
                } 
        private static class BlocoDeLembretes{
          private Lembrete [] lista ;
          private int numerodeLembretes;
          private Lembrete [] fim ;
          
          
          public BlocoDeLembretes(){
              lista = new Lembrete [10];
              numerodeLembretes=0;
            }
          public BlocoDeLembretes(int numerodeLembretes){
          lista = new Lembrete [numerodeLembretes];
          }
        
               private Lembrete incluirLembrete (){
                    Lembrete novo =  new Lembrete(new Data (23, 19 , 23), "Args", "Args");
                    this.lista[numerodeLembretes] = novo;
                    this.numerodeLembretes++;
                    Scanner ler = new Scanner (System.in);
                                               System.out.printf("\nNome do lembrete: ");
                                               novo.nome = ler.nextLine();
                                               System.out.println("Descricao do Lembrete: ");
                                               novo.descricao = ler.nextLine();
                                               System.out.println("Dia do Lembrete: ");
                                               novo.date.d= ler.nextInt();
                                               System.out.println("Mes do Lembrete: ");
                                               novo.date.m = ler.nextInt();
                                               System.out.println("Ano do Lembrete: ");
                                               novo.date.a= ler.nextInt(); 
                                               
                                              return new Lembrete( new Data(novo.date.d, novo.date.m, novo.date.a), novo.nome, novo.descricao);
                }
                    
                 
              
                                                
                        public void ImprimeLembrete(){
                        
                         for(int i=0; i<numerodeLembretes; i++)   {
                            lista[i].Imprime();
                       
                         }
                        }
                         public int numeroDeLembretes (){
                       System.out.println("\nNumero de Lembretes: " +this.numerodeLembretes);
                        return numerodeLembretes;
                         } 
                        public Lembrete RemoverLembrete (int numero){
                             Lembrete Listamenor  = lista[numero];
                            for (int i= 0 ; i <= numerodeLembretes; i++){
                             if(i == numero){
                                lista[i]=lista[i+1];
                                numerodeLembretes -=1;
                             }
                           
                            } 
                            return null;     
                           }
                            
                       
                        
                                    private void menu() {
                                       
                                        System.out.println ("Lembretes - A lista contém %d lembretes.\n" +numerodeLembretes);
                                        System.out.println("Escolha uma das seguintes opções:\n1- Adicionar novo lembrete");
                                        System.out.println("2- Remover lembrete");
                                        System.out.println("3- Listar");
                                        System.out.println("4- Busca por data");
                                        System.out.println("5- Busca por nome");
                                        System.out.println("6-Sair");
                                   }  
                        
                        
        }
                                public static void main(String[] args) {
                                    BlocoDeLembretes lista = new BlocoDeLembretes(5);
                                    
                                    int op = 0;
                                        Scanner ler  = new Scanner (System.in);
                                       do {
                                        lista.menu();
                                        op=ler.nextInt();
                                        
                                    switch (op){
                                        case 1:
                                            lista.incluirLembrete();
                                            break;        
                                        case 2: 
                                            int n;
                                            System.out.println("Numero de Lembrete a ser excluido: ");
                                            n = ler.nextInt();
                                            lista.RemoverLembrete(n);
                                            break;
                                    
                                        case 3: 
                                            lista.ImprimeLembrete();
                                            break;
                                    }
                                    }while ( op != 6);
    }  
    
}
        