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

    // faz a divisão aleatória das equipes do primeio ciclo
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
                                            // pega os prox alunos da lista
                    equipeAtual.add( lAux.get( j + (i * alunosPorEquipe) )); 
                }
                lEquipes.add(equipeAtual); // armaneza a equipe na lista
            }

            // armazena os alunos que estão na mesma equipe na lista exColegas

            // imprime as equipes com os nomes dos alunos
            /*for () {
                for () {
                }
            }*/

        // se a divisão não for exata, pede para o usuário definir como fazer as divisões
        } else {
            ArrayList<Integer> qtdAlunos = new ArrayList<Integer>();
            Scanner input = new Scanner(System.in);            
            
            System.out.println("Divisao nao exata! Digite como deseja distribuir as equipes. ");
            System.out.print("Digite quantas equipes: ");
            int qtdEquipes = input.nextInt();
            
            // armazena na lista quantos alunos em cada equipe
            for (int i = 0; i < qtdEquipes; i++) {
                System.out.printf("Digite quantos alunos na equipe %d: ", i+1);
                qtdAlunos.add(input.nextInt());
            }
            
            // faz as divisões e armazena os alunos na lista lEquipes
            
            // armazena os alunos que estão na mesma equipe na lista exColegas

            // imprime as equipes com os nomes dos alunos
            /*for () {
                for () {
                }
            }*/
        }
    }
    
    // faz a divisão aleatória das equipes dos demais ciclos
    public void divideEquipes(ArrayList<Aluno> lTurma) {
       
        ArrayList<String> lAux = new ArrayList<String>();
        ArrayList<ArrayList> lEquipes = new ArrayList<>();

        // cria lista de string com nomes dos alunos
        for (int i = 0; i < totalAlunos; i++) {
            lAux.add(lTurma.get(i).getNome());
        }
        
        // verifica se a divisao de equipes é exata
        if (totalAlunos % alunosPorEquipe == 0) {

            int qtdEquipes = totalAlunos / alunosPorEquipe;

            // forma as equipes usando a lAux como base
            // verifica se os alunos já estiveram na mesma equipe antes            

            // armazena os alunos que estão na mesma equipe na lista exColegas

            // imprime as equipes com os nomes dos alunos
            /*for () {
                for () {
                }
            }*/
            
        } else {
            ArrayList<Integer> qtdAlunos = new ArrayList<Integer>();
            Scanner input = new Scanner(System.in);            
            
            System.out.println("Divisao nao exata! Digite como deseja distribuir as equipes. ");
            System.out.print("Digite quantas equipes: ");
            int qtdEquipes = input.nextInt();
            
            // armazena na lista quantos alunos em cada equipe
            for (int i = 0; i < qtdEquipes; i++) {
                System.out.printf("Digite quantos alunos na equipe %d: ", i+1);
                qtdAlunos.add(input.nextInt());
            }
            
            // forma as equipes usando a lAux como base
            // verifica se os alunos já estiveram na mesma equipe antes          
            
            // armazena os alunos que estão na mesma equipe na lista exColegas

            // imprime as equipes com os nomes dos alunos
            /*for () {
                for () {
                }
            }*/
        }
    }
}




