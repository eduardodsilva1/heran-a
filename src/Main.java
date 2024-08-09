import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        int idadeAluno;
        while (true) {
            System.out.println("Digite a idade do aluno:");
            if (scanner.hasNextInt()) {
                idadeAluno = scanner.nextInt();
                break;
            } else {
                System.out.println("Insira um número para a idade do aluno. (EX: 18, 25, 36");
                scanner.next();
            }
        }
        scanner.nextLine();

        System.out.println("Digite o nome do usuário:");
        String nomeUsuario = scanner.nextLine();

        int idadeUsuario;
        while (true) {
            System.out.println("Digite a idade do usuario:");
            if (scanner.hasNextInt()) {
                idadeUsuario = scanner.nextInt();
                break;
            } else {
                System.out.println("Insira um número para a idade do usuario. (EX: 18, 25, 36");
                scanner.next();
            }
        }
        scanner.nextLine();

        Alunos alunos = new Alunos(nomeAluno, idadeAluno);
        Usuario usuario = new Usuario(nomeUsuario, idadeUsuario);

        System.out.println("Aluno = " + alunos.getNome() + ".");
        System.out.println("Idade do aluno = " + alunos.getIdade() + " anos.");
        System.out.println("Usuario = " + usuario.getNome() + ".");
        System.out.println("Idade do usuario = " + usuario.getIdade() + " anos.");

        scanner.close();
    }
}


