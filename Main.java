import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inicializar os dados do cliente e exibir -> Mostrar primeiro a situação da conta
        String nome = "Nome Sobrenome";
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        int valor = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        //Criar o menu de opções -> Criar separado assim para ficar mais bonito
        String menu = """
                == Digite uma opção ==
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        //Pensar em um jeito aqui do menu não ficar aparecendo sempre que eu for fazer alguma operação
        while(opcao != 4){
            System.out.println(menu);
            opcao = entrada.nextInt();


            //Visualizar o saldo -> Precisa ser dentro do loop já que não cliquei na opção de sair (atualização futura).
            if (opcao == 1){
                System.out.println("== Consulta de saldo ==");
                System.out.println("\n O seu saldo atual é de: R$" + saldo);
            }

            //Enviar valor -> O valor do saldo precisa diminuir e ser exibido no saldo atual caso eu queira verificar
             if(opcao == 2){
                System.out.println("== Enviar Valor ==");
                System.out.println("\nSaldo atual: " + saldo);
                System.out.println("\nDigite o valor a ser enviado: ");
                valor = entrada.nextInt();
                saldo -=  valor;

                System.out.println("Envio realizado com sucesso. Saldo atual: " + saldo);
            }

            //Receber valor -> o valor personalizado precisa ser adicionado no saldo atual
            if (opcao == 3){
                System.out.println("== Receber Valor ==");
                System.out.println("\nSaldo atual: " + saldo);
                System.out.println("\nDigite o valor a ser recebido: ");
                valor = entrada.nextInt();

                saldo += valor;
                System.out.println("Você recebeu uma trasnferência. Saldo atual: " + saldo);
            }
        }
        
        System.out.println("Agradecemos por utilizar nosso serviço! Volte sempre.");
    }
}
