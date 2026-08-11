package Heranca.UpAndDownCastings;

public class Program {

    public static void main(String[] args) throws Exception {

        // UPCASTING: DIGAMOS QUE ESSE DELEGADO FOI COMPRAR UM MCDONALDS E O ATENDENTE NÃO TEM A INFORMAÇÃO QUE ELE É UM DELEGADO,SABE SOMENTE QUE ELE É UMA PESSOA COM UM NOME E UMA IDADE
        Pessoa d2 = new Delegado("Marcos", 32);
        d2.respirar();

        // DOWNCASTING: DIGAMOS QUE O DELEGADO ESTÁ DANDO ENTREVISTA PARA TELEVISÃO, É NECESSÁRIO ESPECIFICAR QUE ELE É UM DELEGADO
        Pessoa d1 = new Delegado("Gabriel", 23);
        Delegado pessoa = (Delegado)d1;
        pessoa.atirar();
        pessoa.delegar();

        Pessoa p1 = new Policial("Oliveira", 27);
        Policial pessoa1 = (Policial)p1;
        pessoa1.prender();
        pessoa1.atirar();













    }
}
