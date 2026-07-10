package classe;

public class Pessoa {

    static String nome;
    static double peso;

     Pessoa(){
     }
     Pessoa(String nome, double peso){
         this.nome = nome;
         this.peso = peso;

         }
         void comer(Comida comida){
         this.peso += comida.peso;

     }
     String apresentar(){
         return "Olá, eu sou " + nome + "e peso " + peso + "KG.";
     }

}
