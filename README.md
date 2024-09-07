Exercicios de Java sobre programação orientada a objetos
Questões:
1. Crie uma classe chamada “Círculo” que possua um atributo para armazenar o raio e
métodos para calcular a área e o perímetro do círculo.
2. Implemente uma classe chamada “ContaBancária” que possua atributos para armazenar
o número da conta, nome do titular e saldo. Adicione métodos para realizar depósitos e
saques.
3. Crie uma classe chamada “Retângulo” que possua atributos para armazenar a largura e
a altura. Implemente métodos para calcular a área e o perímetro do retângulo.
4. Implemente uma classe chamada “Aluno” que possua atributos para armazenar o nome,
a matrícula e as notas de um aluno. Adicione métodos para calcular a média das notas
e verificar a situação do aluno (aprovado ou reprovado).
5. Crie uma classe chamada “Funcionário” com atributos para armazenar o nome, o salário
e o cargo do funcionário. Implemente métodos para calcular o salário líquido,
considerando descontos de impostos e benefícios.
6. Implemente uma classe chamada “Produto” que possua atributos para armazenar o
nome, o preço e a quantidade em estoque. Adicione métodos para calcular o valor total
em estoque e verificar se o produto está disponível.
7. Crie uma classe chamada “Triângulo” com atributos para armazenar os três lados do
triângulo. Implemente métodos para verificar se é um triângulo válido e calcular sua área.
8. Implemente uma classe chamada “Carro” com atributos para armazenar a marca, o
modelo e a velocidade atual do carro. Adicione métodos para acelerar, frear e exibir a
velocidade atual.
9. Crie uma classe chamada “Paciente” que possua atributos para armazenar o nome, a
idade e o histórico de consultas de um paciente. Implemente métodos para adicionar
uma nova consulta ao histórico e exibir as consultas realizadas.
10. Implemente uma classe chamada “Livro” com atributos para armazenar o título, o autor
e o número de páginas do livro. Adicione métodos para emprestar o livro, devolvê-lo e
verificar se está disponível.
11. Crie uma classe chamada “Pessoa” que possua atributos para armazenar nome, idade
e profissão. Implemente métodos para calcular a idade em anos bissextos e exibir
informações da pessoa.
12. Implemente uma classe chamada “Banco” que represente uma instituição financeira.
Essa classe deve conter métodos para cadastrar clientes, abrir contas bancárias e
realizar operações como saques, depósitos e transferências.
13. Crie uma classe chamada “LojaVirtual” que represente uma plataforma de vendas online.
Essa classe deve ter funcionalidades para cadastrar produtos, gerar carrinho de
compras, aplicar descontos e calcular o valor total da compra.
14. Implemente uma classe chamada “Agenda” que represente uma agenda telefônica. Essa
classe deve permitir adicionar, editar e remover contatos, além de buscar por contatos a
partir de um nome ou número de telefone.
15. Crie uma classe chamada “MáquinaDeVendas” que simule uma máquina de venda de
produtos. Essa classe deve permitir cadastrar produtos, selecionar um produto para
compra, inserir dinheiro, retornar o troco e exibir o estoque disponível.
16. Implemente uma classe chamada “JogoCartas” que represente um jogo de cartas
simples, como o Uno. Essa classe deve ter métodos para embaralhar as cartas, distribuir
as cartas aos jogadores e permitir jogadas.
17. Crie uma classe chamada “RedeSocial” que represente uma rede social online. Essa
classe deve ter funcionalidades para adicionar amigos, publicar mensagens, comentar
em posts e buscar por usuários.
18. Implemente uma classe chamada “Biblioteca” que represente uma biblioteca virtual.
Essa classe deve permitir cadastrar livros, fazer empréstimos, devolver livros e verificar
a disponibilidade de um livro.
19. Crie uma classe chamada “Calendario” que represente um calendário anual. Essa classe
deve ter métodos para exibir o calendário de um determinado mês, verificar se uma data
é feriado e calcular a diferença de dias entre duas datas.
20. Implemente uma classe chamada “JogoAdivinhacao” que represente um jogo de
adivinhação. Essa classe deve gerar um número aleatório, permitir que o jogador faça
palpites e informar se o palpite está correto, informando se é maior ou menor que o
número gerado.

Ferramentas e Conceitos Utilizados
1. Java Collections Framework
ArrayList: Utilizado para armazenar listas dinâmicas de objetos, como produtos em MaquinaDeVendas e livros em Biblioteca.
2. Java Stream API
Stream: Utilizado para processar coleções de objetos de forma funcional, como filtrar produtos disponíveis e buscar posts em RedeSocial.
3. Optional
Optional: Utilizado para evitar NullPointerException e representar valores que podem estar ausentes. Exemplo: ao buscar um produto ou um usuário em MaquinaDeVendas e RedeSocial.
4. Gerador de Números Aleatórios
Random: Utilizado para gerar números aleatórios, como o número aleatório em JogoAdivinhacao.
5. Manipulação de Datas e Horas
LocalDate e Period: Utilizados em Calendario para calcular diferenças de dias entre datas e verificar feriados.
6. Scanner
Scanner: Utilizado para leitura de entrada do usuário, como para receber palpites em JogoAdivinhacao e inserir dinheiro em MaquinaDeVendas.
7. Exceções
Tratamento de Exceções: Utilizado para gerenciar erros e validar entradas, como ao fazer empréstimos em Biblioteca e retornar troco em MaquinaDeVendas.
8. Métodos Funcionais
forEach, filter, map: Utilizados em operações de stream para processamento de coleções, como ao buscar e filtrar dados em RedeSocial e MaquinaDeVendas.
9. Gerenciamento de Estado
Atributos e Métodos de Instância: Utilizados para armazenar e gerenciar o estado dos objetos, como o estado dos livros em Biblioteca e produtos em MaquinaDeVendas.
10. Classes e Objetos
Definição e Manipulação de Classes: Criadas para representar entidades como Produto, Livro, Usuario, Emprestimo, e Post, que encapsulam dados e comportamentos específicos do domínio da aplicação.
11. Operações Matemáticas e Lógicas
Cálculos e Comparações: Realizados para determinar valores de troco, verificar disponibilidade e calcular descontos, entre outros.
