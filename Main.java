import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        CalculadoraDeImposto calc = new CalculadoraDeImposto();

        int opcao = -1;
        while (opcao != 0) {

            System.out.println("===== BANCO JAVA =====" ) ;
            System.out.println("1 - criar conta") ;
            System.out.println("2 - listar contas");
            System.out.println("3 - depositar");
            System.out.println("4 - sacar" );
            System.out.println("5 - transferir" );
            System.out.println("6 - consultar saldo") ;
            System.out.println("7 - aplicar rendimento" );
            System.out.println("8 - calcular tributo");
            System.out.println("9 - autenticar gerente");
            System.out.println("0 - sair") ;
            System.out.print("escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("nome do titular: ");
                String nome = scanner.nextLine();

                System.out.println("tipo de conta:");
                System.out.println("1 - corrente");
                System.out.println("2 - poupança");

                int tipo =scanner.nextInt() ;

                System.out.print("saldo inicial: ");
                double saldo= scanner.nextDouble();

                Conta conta= (tipo == 1)
                        ? new ContaCorrente(nome, saldo)
                        : new ContaPoupanca(nome, saldo);

                banco.criarConta(conta);
            }

            else if (opcao== 2) {

                banco.listarContas();
            }

            else if (opcao == 3 || opcao == 4 || opcao == 6 || opcao == 7) {

                System.out.print("número da conta: ");
                int numero = scanner.nextInt() - 1;

                Conta conta = banco.buscarConta(numero);

                if (conta != null){

                    if (opcao == 3){
                        System.out.print("valor do depósito: ");
                        conta.depositar(scanner.nextDouble());
                    }

                    else if (opcao == 4){
                        System.out.print("valor do saque: ");
                        conta.sacar(scanner.nextDouble());
                    }

                    else if(opcao == 6){
                        conta.exibirDados();
                    }

                    else if (opcao == 7){
                        conta.calcularRendimento();
                    }

                } else {
                    System.out.println("conta não encontrada.");
                }

            }

            else if (opcao == 5){

                System.out.print("conta origem: ");
                int origem= scanner.nextInt() - 1;

                System.out.print("conta destino: ");
                int destino= scanner.nextInt() - 1;

                Conta contaOrigem= banco.buscarConta(origem);
                Conta contaDestino= banco.buscarConta(destino);

                if (contaOrigem != null && contaDestino != null) {

                    System.out.print("valor da transferência: ");
                    double valor =scanner.nextDouble();

                    contaOrigem.sacar(valor);
                    contaDestino.depositar(valor);

                } else {
                    System.out.println("conta inválida.");
                }

            }

            else if (opcao == 8){

                System.out.print("número da conta: ");
                int numero = scanner.nextInt() - 1;

                Conta conta = banco.buscarConta(numero);

                if (conta instanceof Tributavel){

                    calc.registrar((Tributavel) conta);
                    System.out.println("tributo: R$ " + ((Tributavel) conta).calcularTributo());

                    System.out.println("total acumulado: R$ " + calc.getTotalImposto());

                } else {
                    System.out.println("essa conta não paga tributo.");
                }
            }

            else if (opcao == 9){

                System.out.print("digite a senha do gerente: ");
                String senha = scanner.next();

                Gerente gerente = new Gerente("admin", "1234");

                if (gerente.autenticar(senha)){
                    System.out.println("acesso autorizado.");
                } else {
                    System.out.println("senha incorreta.");
                }
            }

            else if (opcao == 0) {

                System.out.println("xau");

            }

            else{

                System.out.println("opção inválida.");

            }
        }

        scanner.close();
    }
}