package heranca.java;
import java.util.Scanner;
public class faculdade {

    public static void main(String[] args) {
        System.out.println("Seja vem-vindo");
        System.out.println("Para continuar seu cadastro, informe seus dados abaixo.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Olá " + nome);


        if (idade >= 18) {
            System.out.println("Você pode começar a faculdade.");
            System.out.println("Qual é a matéria que você tem interesse em aprender? ");
            String materia = scanner.nextLine();
            System.out.println(" Perfeito, a matéria escolhida foi " + materia);

        } else if (idade == 17) {
            System.out.println(" É necessário esperar mais 1 ano para começar a faculdade ");

        } else {
            System.out.println("Você não pode começar a faculdade.");
        }
    Aluno aluno = new Aluno();
        aluno.nome = scanner.nextLine();
        aluno.idade = scanner.nextInt();



}
    }
