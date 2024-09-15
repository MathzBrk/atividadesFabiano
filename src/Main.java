import model.*;
import service.PedirEntradaValor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PedirEntradaValor pedirEntradaValor= new PedirEntradaValor();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a questão que deseja corrigir (1 a 20): ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("QUESTÃO 1");
                var raio = pedirEntradaValor.solicitarEntradaDouble("Digite o valor do raio: ");
                Circulo circulo = new Circulo(raio);
                System.out.println("Área do circulo: " + circulo.calcularArea());
                System.out.println("Perímetro do circulo: " + circulo.calcularPerimetro());
                break;

            case 2:
                System.out.println("QUESTÃO 2");
                var titular = pedirEntradaValor.solicitarEntradaString("Digite o titular: ");
                var saldo = pedirEntradaValor.solicitarEntradaDouble("Digite o saldo: ");
                ContaBancaria contaBancaria = new ContaBancaria(titular, saldo);
                contaBancaria.depositar(420);
                contaBancaria.sacar(50);
                break;

            case 3:
                System.out.println("QUESTÃO 3");
                var largura = pedirEntradaValor.solicitarEntradaDouble("Digite a largura: ");
                var altura = pedirEntradaValor.solicitarEntradaDouble("Digite a altura: ");
                Retangulo retangulo = new Retangulo(largura, altura);
                System.out.println("Área do retângulo: " + retangulo.calcularArea());
                System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                break;

            case 4:
                System.out.println("QUESTÃO 4");
                ArrayList<Double> notas = new ArrayList<>();
                int contadorNotas = 0;
                while (contadorNotas < 4) {
                    var nota = pedirEntradaValor.solicitarEntradaDouble("Digite a nota " + (contadorNotas + 1) + ": ");
                    notas.add(nota);
                    contadorNotas++;
                }
                var nomeAluno = pedirEntradaValor.solicitarEntradaString("Digite o nome: ");
                Aluno aluno = new Aluno(notas, nomeAluno);
                aluno.verificarSituacaoAluno();
                break;

            case 5:
                System.out.println("QUESTÃO 5");
                var nomeFuncionario = pedirEntradaValor.solicitarEntradaString("Digite o nome: ");
                var cargo = pedirEntradaValor.solicitarEntradaString("Digite o cargo do funcionário: ");
                var salario = pedirEntradaValor.solicitarEntradaDouble("Digite o salário: ");
                Funcionario funcionario = new Funcionario(nomeFuncionario, cargo, salario);
                var beneficios = pedirEntradaValor.solicitarEntradaDouble("Digite o valor em benefícios: ");
                System.out.println("Salário líquido: " + funcionario.calcularSalarioLiquido(beneficios));
                break;

            case 6:
                System.out.println("QUESTÃO 6");
                var nomeProduto = pedirEntradaValor.solicitarEntradaString("Digite o nome do produto: ");
                var precoProduto = pedirEntradaValor.solicitarEntradaDouble("Digite o preço do produto: ");
                var quantidadeEstoque = pedirEntradaValor.solicitarEntradaInt("Digite a quantidade do estoque: ");
                Produto produtoTeste = new Produto(nomeProduto, precoProduto, quantidadeEstoque);
                System.out.println("Valor total em estoque: " + produtoTeste.calcularValorEmEstoque());
                System.out.println(produtoTeste.verificarDisponibilidade() ? "Produto disponível" : "Produto indisponível");
                break;

            case 7:
                System.out.println("QUESTÃO 7");
                var lado1 = pedirEntradaValor.solicitarEntradaDouble("Digite o valor do lado 1: ");
                var lado2 = pedirEntradaValor.solicitarEntradaDouble("Digite o lado 2: ");
                var lado3 = pedirEntradaValor.solicitarEntradaDouble("Digite o lado 3: ");
                Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                System.out.println(triangulo.isTrianguloValido() ? "Triângulo válido" : "Triângulo inválido");
                System.out.println("Área do triângulo: " + triangulo.calculaArea());
                break;

            case 8:
                System.out.println("QUESTÃO 8");
                var marca = pedirEntradaValor.solicitarEntradaString("Digite a marca: ");
                var modelo = pedirEntradaValor.solicitarEntradaString("Digite o modelo: ");
                var velocidade = pedirEntradaValor.solicitarEntradaInt("Digite a velocidade: ");
                Carro carro = new Carro(marca, modelo, velocidade);
                carro.exibirVelocidade();
                carro.frear();
                carro.exibirVelocidade();
                carro.acelerar();
                carro.exibirVelocidade();
                break;

            case 9:
                System.out.println("QUESTÃO 9");
                var nomePaciente = pedirEntradaValor.solicitarEntradaString("Digite o nome do paciente: ");
                var idadePaciente = pedirEntradaValor.solicitarEntradaInt("Digite a idade do paciente: ");
                Paciente paciente = new Paciente(nomePaciente, idadePaciente);
                Consulta consulta = new Consulta("Consulta 1", "Virose", paciente);
                paciente.adicionarConsulta(consulta);
                paciente.exibirConsultas();
                break;

            case 10:
                System.out.println("QUESTÃO 10");
                var tituloLivro = pedirEntradaValor.solicitarEntradaString("Digite o título do livro: ");
                var autorLivro = pedirEntradaValor.solicitarEntradaString("Digite o autor do livro: ");
                var numeroPaginas = pedirEntradaValor.solicitarEntradaInt("Digite o número de páginas: ");
                Livro livro = new Livro(tituloLivro, autorLivro, numeroPaginas);
                livro.emprestar();
                System.out.println(livro.isDisponivel() ? "Livro disponível" : "Livro indisponível");
                livro.devolverLivro();
                System.out.println(livro.isDisponivel() ? "Livro disponível" : "Livro indisponível");
                break;

            case 11:
                System.out.println("QUESTÃO 11");
                var nomePessoa = pedirEntradaValor.solicitarEntradaString("Digite o nome da pessoa: ");
                var idadePessoa = pedirEntradaValor.solicitarEntradaInt("Digite a idade da pessoa: ");
                var profissaoPessoa = pedirEntradaValor.solicitarEntradaString("Digite a profissão da pessoa: ");
                Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa, profissaoPessoa);
                var dataNascimentoStr = pedirEntradaValor.solicitarEntradaString("Digite a data de nascimento (dd/MM/yyyy): ");
                LocalDate dataNascimento = null;

                try {
                    dataNascimento = LocalDate.parse(dataNascimentoStr, formatador);
                } catch (DateTimeParseException e) {
                    System.out.println("Data inválida, por favor digite no formato dd/MM/yyyy");
                    return;
                }
                System.out.println(pessoa.calcularIdadeEmAnoBissexto(dataNascimento));
                pessoa.exibirPessoa();
                break;

            case 12:
                System.out.println("QUESTÃO 12");
                var nomeInstituicao = pedirEntradaValor.solicitarEntradaString("Digite o nome da instituição: ");
                Banco banco = new Banco(nomeInstituicao);
                banco.abrirConta(pedirEntradaValor.solicitarEntradaString("Digite o titular: "), pedirEntradaValor.solicitarEntradaDouble("Digite o saldo: "));
                banco.cadastrarCliente(pedirEntradaValor.solicitarEntradaString("Digite o nome do cliente: "), pedirEntradaValor.solicitarEntradaString("Digite o CPF: "));
                banco.listarContas();
                banco.sacar(1, 200);
                banco.depositar(1, 420);
                break;

            case 13:
                System.out.println("QUESTÃO 13");
                Produto produto = new Produto(pedirEntradaValor.solicitarEntradaString("Digite o nome do produto: "), pedirEntradaValor.solicitarEntradaDouble("Digite o preço do produto: "), pedirEntradaValor.solicitarEntradaInt("Digite a quantidade do estoque: "));
                LojaVirtual lojaVirtual = new LojaVirtual(pedirEntradaValor.solicitarEntradaString("Digite o nome da loja: "), pedirEntradaValor.solicitarEntradaString("Digite a descrição da loja: "));
                lojaVirtual.cadastrarProduto(produto);
                List<Compra> compras = new ArrayList<>();
                Compra compra = new Compra(produto, pedirEntradaValor.solicitarEntradaInt("Digite quantos produtos foram comprados: "));
                compras.add(compra);
                lojaVirtual.gerarCarrinhoDeCompras(compras, pedirEntradaValor.solicitarEntradaDouble("Digite o percentual de desconto para o carrinho: "));
                lojaVirtual.calcularValorTotalCompra(compra);
                break;

            case 14:
                System.out.println();
                System.out.println("QUESTÃO 14");
                Agenda agenda = new Agenda();
                agenda.adicionarContato(new Contato(pedirEntradaValor.solicitarEntradaInt("Digite o número do telefone: "), pedirEntradaValor.solicitarEntradaString("Digite o nome do contato: ")));
                agenda.editarNomeContato(pedirEntradaValor.solicitarEntradaString("Digite o novo nome do contato: "), pedirEntradaValor.solicitarEntradaInt("Digite o número do contato que deseja alterar: "));
                agenda.removerContatoPorNome(pedirEntradaValor.solicitarEntradaString("Digite o nome do contato que deseja remover: "));
                break;

            case 15:
                System.out.println();
                System.out.println("QUESTÃO 15");
                MaquinaDeVendas maquinaDeVendas = new MaquinaDeVendas();
                maquinaDeVendas.inserirDinheiroCliente(pedirEntradaValor.solicitarEntradaDouble("Digite o valor que o cliente colocou na máquina: "));
                Produto produto1 = new Produto("Refrigerante", 5.00, 10);
                Produto produto2 = new Produto("Água Mineral", 3.00, 20);
                Produto produto3 = new Produto("Chocolate", 4.50, 15);
                Produto produto4 = new Produto("Biscoito", 2.75, 25);
                Produto produto5 = new Produto("Suco de Laranja", 6.00, 8);
                Produto produto6 = new Produto("Chiclete", 1.50, 50);
                maquinaDeVendas.adicionarProduto(produto1);
                maquinaDeVendas.adicionarProduto(produto2);
                maquinaDeVendas.adicionarProduto(produto3);
                maquinaDeVendas.adicionarProduto(produto4);
                maquinaDeVendas.adicionarProduto(produto5);
                maquinaDeVendas.adicionarProduto(produto6);
                maquinaDeVendas.exibirEstoque();
                maquinaDeVendas.selecionarProduto(pedirEntradaValor.solicitarEntradaString("Digite o nome do produto que deseja: "));
                System.out.println("Aqui está seu troco: " + maquinaDeVendas.retornarTroco());
                break;

            case 16:
                System.out.println();
                System.out.println("QUESTÃO 16");
                System.out.println("O jogador que descartar todas as cartas primeiro ganha!!!");
                JogoCartas jogoCartas = new JogoCartas(4);
                jogoCartas.adicionarJogador("Pedro");
                jogoCartas.adicionarJogador("Matheus");
                jogoCartas.adicionarJogador("Ana");
                jogoCartas.adicionarJogador("Duda");
                boolean jogoContinua = true;

                while (jogoContinua) {
                   jogoCartas.exibirMaoJogadores();
                    int jogadorIndex = pedirEntradaValor.solicitarEntradaInt("Escolha o jogador que vai jogar (1-4): ") - 1;
                    List<Carta> maoJogador = jogoCartas.getMaoJogador(jogadorIndex);
                    System.out.println("Mão do jogador " + (jogadorIndex + 1) + ": " + maoJogador);
                    int cartaIndex = pedirEntradaValor.solicitarEntradaInt("Escolha a carta para jogar (0-" + (maoJogador.size() - 1) + "): ");
                    boolean cartaJogada = jogoCartas.jogarCarta(jogadorIndex, cartaIndex);

                    if (maoJogador.isEmpty()) {
                        System.out.println("Parabéns! O jogador " + (jogadorIndex + 1) + " (" + jogoCartas.getNomeJogador(jogadorIndex) + ") venceu o jogo!");
                        jogoContinua = false;
                    }

                    if (!cartaJogada) {
                        System.out.println("Jogada inválida. Tente novamente.");
                    }
                }
                break;

            case 17:
                System.out.println();
                System.out.println("QUESTÃO 17");
                RedeSocial redeSocial = new RedeSocial();
                Usuario usuario1 = new Usuario("Pedro");
                Usuario usuario2 = new Usuario("Ana");
                Usuario usuario3 = new Usuario("Matheus");
                Usuario usuario4 = new Usuario("Duda");
                redeSocial.adicionarUsuario(usuario1);
                redeSocial.adicionarUsuario(usuario2);
                redeSocial.adicionarUsuario(usuario3);
                redeSocial.adicionarUsuario(usuario4);
                redeSocial.adicionarAmigo(usuario1, usuario2);
                redeSocial.adicionarAmigo(usuario1, usuario3);
                redeSocial.adicionarAmigo(usuario2, usuario4);
                redeSocial.adicionarAmigo(usuario3, usuario4);
                redeSocial.listarUsuarios();
                usuario1.criarPost("Olá");
                usuario2.publicarMensagem("Mensagem");
                usuario3.comentarEmPost(1, "Comentar em Post");
                Usuario usuario = redeSocial.buscarUsuarioPorId(1);
                if (usuario != null) {
                    System.out.println("Encontrado!");
                } else {
                    System.out.println("Não Encontrado!");
                }
                break;

            case 18:
                System.out.println();
                System.out.println("QUESTÃO 18");
                Biblioteca biblioteca = new Biblioteca();
                Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);
                Livro livro2 = new Livro("1984", "George Orwell", 328);
                Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien", 310);
                Livro livro4 = new Livro("Dom Casmurro", "Machado de Assis", 208);
                Livro livro5 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 223);

                biblioteca.cadastrarLivro(livro1);
                biblioteca.cadastrarLivro(livro2);
                biblioteca.cadastrarLivro(livro3);
                biblioteca.cadastrarLivro(livro4);
                biblioteca.cadastrarLivro(livro5);

                biblioteca.fazerEmprestimo(livro1);
                biblioteca.fazerEmprestimo(livro2);

                biblioteca.devolverLivro(livro1);
                biblioteca.devolverLivro(livro3);

                biblioteca.verificarDisponibilidade(livro1);
                biblioteca.listarLivros();
                break;

            case 19:
                System.out.println();
                System.out.println("QUESTÃO 19");
                Calendario calendario = new Calendario();
                calendario.exibirCalendarioDoMes(12, 1998);

                String dataEntrada = pedirEntradaValor.solicitarEntradaString("Digite a data para verificação de feriado (dd/MM/yyyy): (Obs: Alguns feriados não estão na lista)");

                LocalDate data = null;

                try {
                    data = LocalDate.parse(dataEntrada, formatador);
                } catch (DateTimeParseException e) {
                    System.out.println("Data inválida. Por favor, digite no formato dd/MM/yyyy.");
                    break;
                }

                boolean isFeriado = calendario.verificarFeriado(data);
                System.out.println("A data " + data + " é um feriado? " + (isFeriado ? "Sim" : "Não"));
                break;

            case 20:
                System.out.println();
                System.out.println("QUESTÃO 20");
                JogoAdivinhacao jogoAdivinhacao = new JogoAdivinhacao();
                jogoAdivinhacao.darPalpite();
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 14 e 20.");
                break;
        }
        scanner.close();
    }
}
