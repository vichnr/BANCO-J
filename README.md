    Projeto desenvolvido pela aluna Crislany Victória, como requisito para obtenção de nota na matéria Projeto de Programação, orientado pelo professor Amaury Nogueira Neto do curso de Ciência da computação na instituição AFYA CENTRO localizada com Maceió - AL.

Nome: Crislany Victória Honório Braz
Matrícula: 1222518055
Disciplina: Projeto de Programação
Professor: Amaury Nogueira Neto

---
    Este projeto teva como objetivo pegar um código inicial de um sistema bancário em Java e evoluir o seu sistema.
O usuário deve:

    1. ir até o Main e iniciar o código


    2. criar a sua conta e escolher entre as opções corrente e poupança


    3. escolher se quer depositar, sacar, transferir, consultar saldo e/ou aplicar rendimento (aplicar rendimento funciona apenas para conta poupança)  
    

    4.para consultar contas anteriores o número da conta é seguida pela ordem de criação 
        
        EX: a primeira conta criada foi de davi e a segunda conta foi de teresa; o número da conta de davi é 1 e a de teresa é 2.
---

PARTE 2 DO README - ALTERAÇÕES E IMPLEMENTAÇÕES DO PROJETO

=== EXPLICAÇÃO DA ARQUITETURA ===
    1. por que Conta é abstrata?
porque ela serve apenas como uma base para ContaCorrente e ContaPoupanca, reutilizando código, resumindo, ela é um módelo base para as outras classes.
    2. por que Tributavel é interface?
porque ele está aí para definir um comportamento, ele represente um objeto /regra que as outras classes devem seguir
    3. como ocorre o polimorfismo no cálculo de imposto?
ele vai acontecer na linha: public void registrar(Tributavel t)
ele vai usar um tipo de Tributavel e não a classe específica, podendo comportar diferentes comportamentos dependendo do objeto

=== EXECUÇÃO DO SISTEMA ATUAL ===
o usuário deve:  
        
        1. ir até o main para executar o código em: 
public class Main {
public static void main(String[] args){
        
        2. criar a sua conta e escolher primeiro uma opção (corrente ou poupança);
        3. após isso, o usuário pode: depositar e sacar;
        4. para fazer transferências, deve haver mais de uma conta, e para saber quantas contas existem, o usuário pode selecionar a opção de gerenciar contas, além de poder consultar o saldo, após indicar qual conta deseja ver o saldo;
        5. aplicar rendimento para apenas para conta poupança, essa conta rende (aumenta saldo);
        6. calcular tributo serve apenas para conta corrente, essa conta não rende, apenas desconta taxa;
        7. autenticar gerente deve ser colocado a senha 1234 para ter acesso;
        8. e por fim, após verificar tudo o usuário pode sair.

=== EXEMPLO DE EXECUÇÃO ===
===== BANCO JAVA =====
1 - criar conta
...
escolha uma opção: 1
nome do titular: sakura
tipo de conta:
1 - corrente
2 - poupança
2
saldo inicial: 100
conta criada com sucesso!! :))

escolha uma opção: 7
número da conta: 1
Rendimento aplicado: R$ 5.0

escolha uma opção: 8
número da conta: 1
essa conta não paga tributo.

escolha uma opção: 9
digite a senha do gerente: 1234
acesso autorizado.