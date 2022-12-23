import java.util.ArrayList;
import java.util.List;

public class Turma<T extends Aluno> {

Professor prof;
List<T> alunos;


    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void inserirAluno(T alunos){
        this.alunos.add(alunos);
    }

    public void inserirProf(Professor prof){
        this.prof = prof;
    }

    @Override
    public String toString() {
        return "Prof= " + prof +
                "\nAlunos=" + alunos;
    }
}
