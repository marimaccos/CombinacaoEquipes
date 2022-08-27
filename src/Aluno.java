import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<String> exColega;

    // construtor
    public Aluno(String nome){
        this.setNome(nome);
        exColega = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addExColega (String exColegaNome) {
        exColega.add(exColegaNome);
    }

    public ArrayList<String> getExColega() {
        return exColega;
    }
}
