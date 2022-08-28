import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totalAlunos;
        int ciclos;
        
        // cria lista para armazenar todos os alunos 
        ArrayList<Aluno> lTurma = new ArrayList<Aluno>();
        // cria lista para armazenar alunos por equipe em cada ciclo
        ArrayList<Integer> lAlunosPorEquipe = new ArrayList<Integer>();
        // cria lista para armazenar todos os ciclos
        ArrayList<Ciclo> lCiclos = new ArrayList<Ciclo>();

        Scanner input = new Scanner(System.in); 

        // entrada de dados
        System.out.print("Digite quantos alunos na turma: ");
        totalAlunos = input.nextInt();

        // cria um objeto para cada aluno e armazena na lTurma
        for (int i = 0; i < totalAlunos; i++) {
            System.out.printf("Digite o nome do aluno %d: ", i+1);
            String nomeAlunoAtual = input.next();
            // cria objeto para armazenar nome do aluno
            Aluno alunoAtual = new Aluno(nomeAlunoAtual);
            // add cada aluno na lista
            lTurma.add(alunoAtual);
        }

        System.out.print("Digite o numero de ciclos: ");
        ciclos = input.nextInt();

        // armazena os ciclos e o numero de alunos por equipe em suas listas
        for (int i = 0; i < ciclos; i++) {
            System.out.printf("Digite o numero de alunos por equipe do ciclo %d: ", i+1);
            int numeroAlunos = input.nextInt();
            // add numero de alunos por equipe na lista
            lAlunosPorEquipe.add(numeroAlunos);

            // cria objeto para armazenar cada ciclo
            Ciclo cicloAtual = new Ciclo(totalAlunos, numeroAlunos);
            // add cada ciclo na lCiclos
            lCiclos.add(cicloAtual);
        }

        // faz e imprime as divisões das equipes de cada ciclo
        for (int i = 0; i < ciclos; i++) {
            // verifica se é o primeiro ciclo
            if (i == 0) {
                // faz divisão aleatória
                lCiclos.get(i).divideEquipesRandom(lTurma); 
            } else {
                lCiclos.get(i).divideEquipes(lTurma);
            }
        }
    }
}
