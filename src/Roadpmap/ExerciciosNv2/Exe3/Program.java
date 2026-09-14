package Roadpmap.ExerciciosNv2.Exe3;

public class Program {

    public static void main(String[] args) {
        NumeroComplexo primeiro = new NumeroComplexo(3, 4);
        NumeroComplexo segundo = new NumeroComplexo(1, -2);

        System.out.println("Primeiro número: " + primeiro);
        System.out.println("Segundo número: " + segundo);

        // Cada operação usa uma cópia, pois os métodos alteram o próprio objeto.
        NumeroComplexo soma = new NumeroComplexo(primeiro.getNumeroReal(), primeiro.getNumeroImaginario());
        soma.somar(segundo);
        System.out.println("\nSoma: " + soma);

        NumeroComplexo subtracao = new NumeroComplexo(primeiro.getNumeroReal(), primeiro.getNumeroImaginario());
        subtracao.subtrair(segundo);
        System.out.println("Subtração: " + subtracao);

        NumeroComplexo multiplicacao = new NumeroComplexo(primeiro.getNumeroReal(), primeiro.getNumeroImaginario());
        multiplicacao.multiplicar(segundo);
        System.out.println("Multiplicação: " + multiplicacao);

        NumeroComplexo divisao = new NumeroComplexo(primeiro.getNumeroReal(), primeiro.getNumeroImaginario());
        divisao.dividir(segundo);
        System.out.println("Divisão: " + divisao);

        NumeroComplexo igualAoPrimeiro = new NumeroComplexo(3, 4);
        System.out.println("\nPrimeiro é igual ao segundo? " + primeiro.equals(segundo));
        System.out.println("Primeiro é igual a outro 3 + 4i? " + primeiro.equals(igualAoPrimeiro));

        NumeroComplexo alterado = new NumeroComplexo(0, 0);
        alterado.setNumeroReal(2.5);
        alterado.setNumeroImaginario(-1.5);
        System.out.println("\nNúmero após usar os setters: " + alterado);
        System.out.println("Parte real: " + alterado.getNumeroReal());
        System.out.println("Parte imaginária: " + alterado.getNumeroImaginario());

        try {
            primeiro.dividir(new NumeroComplexo(0, 0));
        } catch (ArithmeticException e) {
            System.out.println("\nDivisão por zero: " + e.getMessage());
        }
    }
}
