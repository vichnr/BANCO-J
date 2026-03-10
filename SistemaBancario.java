// Classe principal deve ser pública
// O nome do arquivo deve ser igual ao nome da classe pública
public class SistemaBancario {

    // Método main: ponto de entrada do programa
    public static void main(String[] args) {

        // POLIMORFISMO:
        // A variável é do tipo Conta (classe mãe)
        // Mas o objeto real é ContaCorrente
        Conta conta1 = new ContaCorrente("João", 1000);

        // Mesmo tipo de referência, objeto diferente
        Conta conta2 = new ContaPoupanca("Maria", 1000);

        System.out.println("**** Conta Corrente ***");

        // Executa a versão sobrescrita da ContaCorrente
        conta1.calcularRendimento();

        // Método herdado da classe base
        conta1.exibirDados();

        System.out.println("\n=== Conta Poupança ===");

        // Executa a versão sobrescrita da ContaPoupanca
        conta2.calcularRendimento();

        conta2.exibirDados();
    }
}