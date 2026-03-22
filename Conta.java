// Classe base que representa uma conta genérica
// Não colocamos "public" porque só pode haver uma classe pública por arquivo
abstract class Conta {

    // protected permite que as classes filhas acessem esses atributos
    protected String titular;   // Nome do dono da conta
    protected double saldo;     // Saldo disponível

    // Construtor: executado quando um objeto é criado
    // Ele inicializa os atributos obrigatórios
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;       // "this" diferencia atributo da variável do construtor
        this.saldo = saldoInicial;
    }

    // Método para adicionar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;  // Soma o valor ao saldo atual
    }

    // Método para retirar dinheiro
    public void sacar(double valor) {
        // Verifica se há saldo suficiente antes de sacar
        if (valor <= saldo) {
            saldo -= valor;  // Subtrai o valor do saldo
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método que será sobrescrito pelas subclasses
    // Serve para demonstrar polimorfismo
    public void calcularRendimento() {
        System.out.println("Conta comum não possui rendimento específico.");
    }

    // Método para mostrar dados da conta
    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}


// Classe ContaCorrente HERDA de Conta
// "extends" permite reutilizar atributos e métodos da classe mãe
class ContaCorrente extends Conta implements Tributavel {

    // Taxa fixa mensal da conta corrente
    private double taxaManutencao = 20.0;

    // Construtor
    public ContaCorrente(String titular, double saldoInicial) {
        // "super" chama o construtor da classe mãe
        super(titular, saldoInicial);
    }

    // Sobrescrita do método da classe base
    // @Override indica que estamos modificando o comportamento herdado
    @Override
    public void calcularRendimento() {
        saldo -= taxaManutencao; // Desconta taxa ao invés de render juros
        System.out.println("Taxa de manutenção descontada: R$ " + taxaManutencao);
    }
    @Override
    public double calcularTributo(){
        return saldo * 0.01;
    }
}


// Classe ContaPoupanca HERDA de Conta
class ContaPoupanca extends Conta {

    // Percentual de rendimento
    private double taxaRendimento = 0.05; // 5%

    // Construtor
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    // Sobrescrita do método
    @Override
    public void calcularRendimento() {
        // Calcula o valor do rendimento
        double rendimento = saldo * taxaRendimento;

        // Adiciona rendimento ao saldo
        saldo += rendimento;

        System.out.println("Rendimento aplicado: R$ " + rendimento);
    }
}