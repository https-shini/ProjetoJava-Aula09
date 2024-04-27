package projetoaula09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Aluno> listaAlunos;
    private Scanner scanner;

    public Menu() {
        listaAlunos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Pesquisar Aluno");
            System.out.println("3 - Listar Todos os Alunos");
            System.out.println("4 - Créditos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    pesquisarAluno();
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    creditos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    private void cadastrarAluno() {
        System.out.println("\nCadastro de Aluno");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RGM: ");
        String rgm = scanner.nextLine();
        System.out.print("Nota Parcial: ");
        float notaParcial = scanner.nextFloat();
        System.out.print("Nota Regimental: ");
        float notaRegimental = scanner.nextFloat();

        Aluno aluno = new Aluno(rgm, nome, notaParcial, notaRegimental);
        listaAlunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private void pesquisarAluno() {
        System.out.print("\nDigite o RGM do aluno: ");
        String rgm = scanner.nextLine();

        for (Aluno aluno : listaAlunos) {
            if (aluno.getRgm().equals(rgm)) {
                aluno.imprimir();
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    private void listarAlunos() {
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("\nLista de Alunos:");
        for (Aluno aluno : listaAlunos) {
            aluno.imprimir();
            System.out.println();
        }
    }
    
    private void creditos() {
        System.out.println("\nAbaixo está os criadores deste projeto:" +
                "\nNome: Eduardho Carneiro Costa | RGM: 33393834" +
                "\nNome: Flávio Caramit Gomes    | RGM: 34637109" +
                "\nNome: Guilherme de Souza Cruz | RGM: 34032207");
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
