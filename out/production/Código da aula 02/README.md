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
===




