import java.util.ArrayList;

class Banco{
    private ArrayList<Conta>contas = new ArrayList<>();

    public void criarConta(Conta conta) {
        for(Conta c:contas){
            if (c.titular.equalsIgnoreCase(conta.titular)){
                System.out.println("já existe uma conta com este titular!!!!!!");
                return;
            }
        }

        contas.add(conta);
        System.out.println("conta criada com sucesso!! :))");
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("nenhuma conta cadastrada.");
            return;
        }


        for (int i = 0; i < contas.size(); i++) {
            System.out.println("conta " + (i + 1));
            contas.get(i).exibirDados();
            System.out.println("-------------------");
        }
    }

    public Conta buscarConta(int indice) {
        if (indice<0 || indice >= contas.size()) {
            System.out.println("conta não encontrada.");
            return null;
        }
        return contas.get(indice);
    }


    public boolean temContas() {
        return !contas.isEmpty();
    }
}