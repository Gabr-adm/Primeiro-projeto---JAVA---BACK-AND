package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FuncionariosTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionarios> funcionariosList = new ArrayList<>();

        System.out.println("Digite a quantidade de funcionários: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Funcionário: #" + (i+1));
            sc.nextLine();

            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Salário: ");
            double salario = sc.nextDouble();

            funcionariosList.add(new Funcionarios(id, nome, salario));
        }

        for (Funcionarios funcionarios: funcionariosList){
            System.out.println(funcionarios);
            System.out.println();
        }


        System.out.println("Digite o id do funcionário que recebrá o aumento: ");
        int buscarId = sc.nextInt();

        Funcionarios escolhido = null;

        for (Funcionarios funcionario: funcionariosList){
            if(buscarId == funcionario.getId()){
                escolhido = funcionario;
                break;
            }
        }
        if (escolhido != null){
            System.out.println("Quantos porcento será o aumento? ");
            double aumento = sc.nextInt();
            escolhido.aumentarSalario(aumento);
            System.out.println("Salário do funcionário " + escolhido.getNome() + " foi atualizado.");
            System.out.println("Salário atual: " + escolhido.getSalario());

        }

    }
}
