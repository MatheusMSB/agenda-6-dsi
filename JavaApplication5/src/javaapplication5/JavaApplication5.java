package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Digite o numero final da placa do veículo:");
        int numeroFinalPlaca = scanner.nextInt();
        
        switch (numeroFinalPlaca) {
            case 1 -> System.out.println("Pagamento do IPVA até 30/4");
            case 2 -> System.out.println("Pagamento do IPVA até 31/5");
            case 3 -> System.out.println("Pagamento do IPVA até 30/6");
            case 4 -> System.out.println("Pagamento do IPVA até 31/7");
            case 5 -> System.out.println("Pagamento do IPVA até 31/8");
            case 6 -> System.out.println("Pagamento do IPVA até 30/9");
            case 7 -> System.out.println("Pagamento do IPVA até 31/10");
            case 8 -> System.out.println("Pagamento do IPVA até 30/11");
            case 9, 0 -> System.out.println("Pagamento do IPVA até 31/12");
            default -> System.out.println("O número digitado esta incorreto. Por favor, digite um número de 0 a 9");
        }   
    }
    
}
