import model.*;
import service.PedirEntradaValor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PedirEntradaValor pedirEntradaValor= new PedirEntradaValor();

        //questão 1
        System.out.println("QUESTÃO 1");
        var raio = pedirEntradaValor.solicitarEntradaDouble("Digite o valor do raio: ");
        Circulo circulo = new Circulo(raio);
        System.out.println("Área do circulo: " + circulo.calcularArea());
        System.out.println("Perimetro do circulo: " + circulo.calcularPerimetro());

        //questão 2
        System.out.println();
        System.out.println("QUESTÃO 2");
        var titular = pedirEntradaValor.solicitarEntradaString("Digite o titular: ");
        var saldo = pedirEntradaValor.solicitarEntradaDouble("Digite o saldo: ");
        ContaBancaria contaBancaria = new ContaBancaria(titular, saldo);
        contaBancaria.depositar(420);
        contaBancaria.sacar(50);

        //questão 3
        System.out.println();
        System.out.println("QUESTÃO 3");
        var largura = pedirEntradaValor.solicitarEntradaDouble("Digite a largura: ");
        var altura = pedirEntradaValor.solicitarEntradaDouble("Digite a altura: ");
        Retangulo retangulo = new Retangulo(largura, altura);
        System.out.println("Área do retangulo: " + retangulo.calcularArea());
        System.out.println("Perimetro da retangulo: " + retangulo.calcularPerimetro());

        //questão 4
        System.out.println();
        System.out.println("QUESTÃO 4");
        ArrayList<Double> notas = new ArrayList<>();

        int contadorNotas = 0;
        while (contadorNotas< 4) {
            var nota = pedirEntradaValor.solicitarEntradaDouble("Digite a nota " + (contadorNotas + 1) +" : ");
            notas.add(nota);
            contadorNotas++;
        }

        var nomeAluno = pedirEntradaValor.solicitarEntradaString("Digite o nome: ");
        Aluno aluno = new Aluno(notas,nomeAluno);
        aluno.verificarSituacaoAluno();

        //questão 5
        System.out.println();
        System.out.println("QUESTÃO 5");
        var nomeFuncionario = pedirEntradaValor.solicitarEntradaString("Digite o nome: ");
        var cargo = pedirEntradaValor.solicitarEntradaString("Digite o cargo do funcionário: ");
        var salario = pedirEntradaValor.solicitarEntradaDouble("Digite o salario: ");
        Funcionario funcionario = new Funcionario(nomeFuncionario,cargo,salario);
        var beneficios = pedirEntradaValor.solicitarEntradaDouble("Digite o valor em beneficios: ");
        System.out.println("Salário liquido: " + funcionario.calcularSalarioLiquido(beneficios));

        //questão 6
        System.out.println();
        System.out.println("QUESTÃO 6");
        var nomeProduto = pedirEntradaValor.solicitarEntradaString("Digite o nome do produto: ");
        var precoProduto = pedirEntradaValor.solicitarEntradaDouble("Digite o preço do produto: ");
        var quantidadeEstoque = pedirEntradaValor.solicitarEntradaInt("Digite a quantidade do estoque: ");
        Produto produto = new Produto(nomeProduto,precoProduto,quantidadeEstoque);
        System.out.println("Valor total em estoque: " + produto.calcularValorEmEstoque());
        if (produto.verificarDisponibilidade())
            System.out.println("Produto disponivel");
        else
            System.out.println("Produto indisponivel");
//
        //questão 7
        System.out.println();
        System.out.println("QUESTÃO 7");
        var lado1 = pedirEntradaValor.solicitarEntradaDouble("Digite o valor do lado 1: ");
        var lado2 = pedirEntradaValor.solicitarEntradaDouble("Digite o lado 2: ");
        var lado3 = pedirEntradaValor.solicitarEntradaDouble("Digite o lado 3: ");
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        if(triangulo.isTrianguloValido())
            System.out.println("Triangulo valido");
        else
            System.out.println("Triangulo invalido");
        System.out.println("Área do triangulo: " + triangulo.calculaArea());

        //questão 8
        System.out.println();
        System.out.println("QUESTÃO 8");
        var marca = pedirEntradaValor.solicitarEntradaString("Digite a marca: ");
        var modelo = pedirEntradaValor.solicitarEntradaString("Digite o modelo: ");
        var velocidade = pedirEntradaValor.solicitarEntradaInt("Digite a velocidade: ");
        Carro carro = new Carro(marca,modelo,velocidade);
        carro.exibirVelocidade();
        carro.frear();
        carro.exibirVelocidade();
        carro.acelerar();
        carro.exibirVelocidade();

        //questão 9
        System.out.println();
        System.out.println("QUESTÃO 9");
        var nomePaciente = pedirEntradaValor.solicitarEntradaString("Digite o nome do paciente: ");
        var idadePaciente = pedirEntradaValor.solicitarEntradaInt("Digite a idade do paciente: ");
        Paciente paciente = new Paciente(nomePaciente,idadePaciente);
        Consulta consulta = new Consulta("Consulta 1", "Virose", paciente);
        paciente.adicionarConsulta(consulta);
        paciente.exibirConsultas();

       //questão 10
        System.out.println();
        System.out.println("QUESTÃO 10");
        var tituloLivro = pedirEntradaValor.solicitarEntradaString("Digite a titulo do livro: ");
        var autorLivro = pedirEntradaValor.solicitarEntradaString("Digite o autor do livro: ");
        var numeroPaginas = pedirEntradaValor.solicitarEntradaInt("Digite a numero de paginas: ");
        Livro livro = new Livro(tituloLivro,autorLivro,numeroPaginas);
        livro.emprestar();
        if(livro.isDisponivel())
            System.out.println("Livro disponivel");
        else
            System.out.println("Livro indisponivel");
        livro.devolverLivro();
        if(livro.isDisponivel())
            System.out.println("Livro disponivel");
        else
            System.out.println("Livro indisponivel");

        //questão 11
        System.out.println();
        System.out.println("QUESTÃO 11");
        var nomePessoa = pedirEntradaValor.solicitarEntradaString("Digite o nome do pessoa: ");
        var idadePessoa = pedirEntradaValor.solicitarEntradaInt("Digite a idade da pessoa: ");
        var profissaoPessoa = pedirEntradaValor.solicitarEntradaString("Digite a profissão da pessoa: ");
        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa, profissaoPessoa);
        var dataNascimentoStr = pedirEntradaValor.solicitarEntradaString("Digite a data de nascimento (dd/MM/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = null;

        try {
            dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida, por favor digite no formato dd/MM/yyyy");
            return;
        }
        System.out.println(pessoa.calcularIdadeEmAnoBissexto(dataNascimento));
        pessoa.exibirPessoa();

        //questão 12
        System.out.println();
        System.out.println("QUESTÃO 12");
        var nomeInstituiçao = pedirEntradaValor.solicitarEntradaString("Digite o nome da instituição: ");
        Banco banco = new Banco(nomeInstituiçao);
        banco.abrirConta(pedirEntradaValor.solicitarEntradaString("Digite o titular: "), pedirEntradaValor.solicitarEntradaDouble("Digite o saldo: "));
        banco.cadastrarCliente(pedirEntradaValor.solicitarEntradaString("Digite o nome do cliente: "), pedirEntradaValor.solicitarEntradaString("Digite o cpf: "));
        banco.listarContas();
        banco.sacar(1, 200);
        banco.depositar(1,420);

        //questão 13
        System.out.println();
        System.out.println("QUESTÃO 13");
        LojaVirtual lojaVirtual = new LojaVirtual(pedirEntradaValor.solicitarEntradaString("Digite o nome da loja: "), pedirEntradaValor.solicitarEntradaString("Digite a descrição da loja: "));
        lojaVirtual.cadastrarProduto(produto); // produto da questão 6
        List<Compra> compras = new ArrayList<>();
        Compra compra = new Compra(produto, pedirEntradaValor.solicitarEntradaInt("Digite quantos produtos foram comprados: "));
        compras.add(compra);
        lojaVirtual.gerarCarrinhoDeCompras(compras, pedirEntradaValor.solicitarEntradaDouble("Digite o percentual de desconto para o carrinho: "));
        lojaVirtual.calcularValorTotalCompra(compra);

        //questão 14
        System.out.println();
        System.out.println("QUESTÃO 14");
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato(pedirEntradaValor.solicitarEntradaInt("Digite o numero do telefone: "), pedirEntradaValor.solicitarEntradaString("Digite o nome do contato: ")));
        agenda.editarNomeContato(pedirEntradaValor.solicitarEntradaString("Digite o nome novo de contato: "), pedirEntradaValor.solicitarEntradaInt("Digite o numero do contato que deseja alterar: "));
        agenda.removerContatoPorNome(pedirEntradaValor.solicitarEntradaString("Digite o nome do contato que deseja remover: "));













    }
}
