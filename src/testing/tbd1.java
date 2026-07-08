package testing;

import java.util.Scanner;

public class tbd1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuario = "";
        String senha = "";

        System.out.println(" \n Digite seu usuário: ");
        usuario = entrada.nextLine();

        while (!usuario.equalsIgnoreCase("Gabriel123")) {
            System.out.println(" Favor inserir o usuário correto para prosseguir. ");
            usuario = entrada.nextLine();
        }

        System.out.println("Digite sua senha: ");
        senha = entrada.next();

        int tentativas = 1;
        int limiteMaximo = 3;

        while (!senha.equalsIgnoreCase("Cadeado13") && tentativas < limiteMaximo) {
            System.out.println(" Senha incorreta, restam: " + (limiteMaximo - tentativas) + " tentativas" + "\n Digite novamente: " );
            senha = entrada.nextLine();

            tentativas++;


        }

            if (senha.equals("Cadeado13")){
                System.out.println("Seja bem vindo ao programa Consulta de Média! ");
            } else {
                System.out.println(" Conta bloqueada. ");
                System.exit(0);



            }

        System.out.println(" Dgite sua primeira nota: ");
        Double nota1 = entrada.nextDouble();
        System.out.println(" Digite sua segunda nota: ");
        Double nota2= entrada.nextDouble();
        System.out.println(" Digite sua terceira nota: ");
        Double nota3= entrada.nextDouble();
        System.out.println(" Digite sua quarta nota: ");
        Double nota4= entrada.nextDouble();

        Double total = (nota1 + nota2 + nota3 + nota4);
        Double media = total /4;
        System.out.println(" A sua média é: " + media);

        entrada.close();
    }
}