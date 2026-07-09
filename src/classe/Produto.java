package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(){

    }

    Produto(String nomeInicial){
        nome = nomeInicial;
    }
    Produto(String nome, double preco, double desconto) {
      this.preco = preco;
       this.nome = nome;
     this.desconto = desconto;

     this.nome = "Carne";
     this.preco = 81.50;
     this.desconto = 0.25;

        System.out.println(nome + preco);
    }

    double precoComDesconto(){
        return preco *(1 - desconto);


    }
}