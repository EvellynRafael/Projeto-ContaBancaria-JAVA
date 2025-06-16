import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        // Inicializar os dados do cliente e exibir -> Mostrar primeiro a situação da conta
        String nome = "Nome Sobrenome";
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int valor;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        // Criar o menu de opções
        String menu = """
                == Digite uma opção ==
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (true) {
            System.out.println(menu);
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("== Consulta de saldo ==");
                    System.out.println("\nO seu saldo atual é de: R$" + saldo);
                    break;
                    
                case 2:
                    System.out.println("== Enviar Valor ==");
                    System.out.println("\nSaldo atual: " + saldo);
                    System.out.println("\nDigite o valor a ser enviado: ");
                    valor = entrada.nextInt();

                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= valor;
                        System.out.println("Envio realizado com sucesso. Saldo atual: " + saldo);
                    }
                    break;
                    
                case 3:
                    System.out.println("== Receber Valor ==");
                    System.out.println("\nSaldo atual: " + saldo);
                    System.out.println("\nDigite o valor a ser recebido: ");
                    valor = entrada.nextInt();

                    saldo += valor;
                    System.out.println("Você recebeu uma transferência. Saldo atual: " + saldo);
                    break;
                    
                case 4:
                    System.out.println("Agradecemos por utilizar nosso serviço! Volte sempre.");
                    entrada.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
