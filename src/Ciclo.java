import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ciclo {
    private int totalAlunos;
    private int alunosPorEquipe;

    // construtor
    public Ciclo(int totalAlunos, int alunosPorEquipe) {
        this.totalAlunos = totalAlunos;
        this.alunosPorEquipe = alunosPorEquipe;
    }


    public void divideEquipesRandom(ArrayList<Aluno> lTurma) {

        ArrayList<String> lAux = new ArrayList<String>();
        ArrayList<ArrayList> lEquipes = new ArrayList<>();

        // cria lista de string com nomes dos alunos
        for (int i = 0; i < totalAlunos; i++) {
            lAux.add(lTurma.get(i).getNome());
        }

        Collections.shuffle(lAux); // randomiza a lista

        // verifica se a divisao de equipes é exata
        if (totalAlunos % alunosPorEquipe == 0) {

            int qtdEquipes = totalAlunos / alunosPorEquipe;

            // forma as equipes
            for (int i = 0; i < qtdEquipes; i++) {
                ArrayList<String> equipeAtual = new ArrayList<String>();

                // pega a quantidade de alunos e armazena na equipe
                for(int j = 0; j < alunosPorEquipe; j++) {
                    equipeAtual.add( lAux.get( j + (i * alunosPorEquipe) )); // pega os prox alunos da lista
                }
                lEquipes.add(equipeAtual); // armaneza a equipe na lista
            }

            // armazena os exColegas


            // imprime as equipes
            /*for () {
                for () {

                }
            }*/

        // pede para o usuário definir como fazer as divisões
        } else {
            ArrayList<Integer> qtdAlunos = new ArrayList<Integer>();
            Scanner input = new Scanner(System.in);

            System.out.println("Divisao nao exata! Digite como deseja distribuir as equipes. ");
            System.out.print("Digite quantas equipes: ");

            int qtdEquipes = input.nextInt();

            for (int i = 0; i < qtdEquipes; i++) {
                System.out.printf("Digite quantos alunos na equipe %d: ", i+1);
                qtdAlunos.add(input.nextInt());
            }

        }
    }

    public void divideEquipes(ArrayList<Aluno> lTurma) {
        // verifica se a divisao de equipes é igual
        if (totalAlunos % alunosPorEquipe == 0) {
            // equipes com mesmo numero de alunos
            // armazenar na lista

        } else {
            // equipes com diferente numero de alunos
            // calculo para saber a distribuiçao das equipes
        }

        // armazena os exColegas

    }
}




