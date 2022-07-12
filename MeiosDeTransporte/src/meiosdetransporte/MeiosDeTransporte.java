/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author ork
 */
import java.util.Scanner;
public class MeiosDeTransporte {
        public static class Veiculo{
        public String marca;
        public int qtdRodas;
        public String modelo;
        public int velocidade = 20 ; 
    /**
     * @param args the command line arguments
     */
       
             
        
        public void acelerar (int valor) {
            this.velocidade = valor + this.velocidade;
        }
        public void frear (int valor){
            this.velocidade -= valor ;
        }
       public void imprimirinformacoes(){
       System.out.println(" Marca: "+marca);
       System.out.println("Quantidade de rodas: "+qtdRodas);
       System.out.println("Modelo: " +modelo);
       System.out.println("Velocidade: " +velocidade);
       }
      
        }
        
       private static class Bicicleta extends Veiculo {
          private int numMarchas = 10;
          boolean bagageiro = false;
          public String marca = "Caloi"; 
          public int qtdRodas = 2;
          public String modelo= "Air Software";
          public int velocidade =20;
          
          
          
          public void imprimirinformacoes(){
       System.out.println(" Marca: "+this.marca );
       System.out.println("Quantidade de rodas: "+this.qtdRodas);
       System.out.println("Modelo: " +this.modelo);
       System.out.println("Velocidade: " +super.velocidade);
       System.out.println("Numero de marchas "+numMarchas);
       System.out.println("Bagageiro "+bagageiro);
       } 
 }  
       private static class Automovel extends Veiculo {
           private double potenciaDoMotor = 180.55;
           
       public void imprimirinformacoes(){
        System.out.println("Potencia do Motor: "+potenciaDoMotor);
       }
       }
       
       private static class Carro extends Automovel{
       private int qtdPortas = 4;
       public String marca = "Ford"; 
       public int qtdRodas = 4;
       public String modelo= "Fiesta";
       
     
       
       public void imprimirinformacoes(){
       System.out.println(" Marca: "+this.marca );
       System.out.println("Quantidade de rodas: "+this.qtdRodas);
       System.out.println("Modelo: " +this.modelo);
       System.out.println("Velocidade: " +super.velocidade);
       System.out.println("Potencia do motor "+super.potenciaDoMotor);
       } 
      }
       private static class CadastroDeVeiculos {
          public  Veiculo [] lista;
          public int tamanho = 5; 
          public int cont ;  
          
          public CadastroDeVeiculos() {
              lista = new Veiculo[tamanho];
              cont = 0 ;
            }
          private Veiculo inserir (Veiculo nova){
                lista[cont++] = nova;
                
                if(lista.length > tamanho){
                Veiculo [] novaLista = new Veiculo[2 * tamanho];
                for(int i=0 ; i<tamanho; i++){
                novaLista[i] = lista[i];
                }
                lista=novaLista;
                lista[tamanho++] = nova;
                }
                return nova;
          }
            
        
       public Veiculo retornaItem (int posicao){
           if(posicao > lista.length){
            return null;
            }else {
               System.out.println("Item "+posicao+"\nInformacao: ");
               lista[posicao].imprimirinformacoes();
               return this.lista[posicao];
           }
       }
       public void imprimir (){
       for(int i =0 ; i < cont; i++ ){
           System.out.println("\n");
           lista[i].imprimirinformacoes();
           
       }
       }
      public int tamanho (){
         System.out.println ("Numero de elementos inseridos na lista: "+this.cont);
          return this.cont ;
     }
       
       
       }
    public static void main(String[] args) {
        // TODO code application logic here
        Bicicleta Bike = new Bicicleta(); 
        Carro Car = new Carro();
        Bike.acelerar(12);
        Car.acelerar(40);
  
        
        CadastroDeVeiculos veiculos = new CadastroDeVeiculos();
        veiculos.inserir( Car);
        veiculos.inserir(Bike);
        veiculos.inserir(Car);
        veiculos.tamanho();
        veiculos.imprimir(); 
        System.out.println("\n-------Retornar item------");
        veiculos.retornaItem(1);
        Car.frear(15);
        Bike.frear(25);
        veiculos.imprimir();
    
    
    
    } 
}
