package Roadpmap.Generics;


import java.util.ArrayList;
import java.util.List;

// criando a classe genérica que permitirá possuir classes de diferentes tipos
public class BolsaNinja<T> {

    // lista que armazenará mais de um tipo de ferramenta
     private List<T> ferramentas;

     //criado o construtor que por sua vez receberá uma classe indicando o seu tipo e armazenando em "ferramentas"
     public BolsaNinja(){
         this.ferramentas = new ArrayList<>();
     }


     // metodo criado para adicionar os itens na "bolsa ninja" (classe)
     public void adicionarFerramenta (T ferramenta){
         ferramentas.add(ferramenta);
     }

     //metodo criado para imprimir a lista de ferramentas que tem dentro da bolsa ninja
     public void mostrarFerramenta(){
         for (T ferramenta: ferramentas){
             System.out.println(ferramenta);
         }
     }



}
