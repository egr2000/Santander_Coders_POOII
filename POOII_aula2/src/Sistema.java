public class Sistema {

    public static void main(String[] args) {


        Professor professor = new Professor("Eduardo");
        Professor profJS = new Professor("Professor JS");
        Professor profJava = new Professor("Professor Java");

        Turma matematica = new Turma();
        Turma turmaJS = new Turma();
        Turma turmaJava = new Turma();

        Aluno aline = new Aluno("Aline");
        Aluno samuel = new Aluno("Samuel");
        Aluno francisco = new Aluno("Francisco");

        AlunoJava alunoJava1 = new AlunoJava("AlunoJava1");
        AlunoJava alunoJava2 = new AlunoJava("AlunoJava2");
        AlunoJava alunoJava3 = new AlunoJava("AlunoJava3");

        AlunoJS alunoJS1 = new AlunoJS("AlunoJS1");
        AlunoJS alunoJS2 = new AlunoJS("AlunoJS2");
        AlunoJS alunoJS3 = new AlunoJS("AlunoJS3");

        matematica.inserirAluno(alunoJava1);
        matematica.inserirAluno(alunoJS1);
        matematica.inserirAluno(francisco);
        matematica.inserirProf(professor);

        turmaJS.inserirProf(profJS);
        turmaJS.inserirAluno(alunoJS1);
        turmaJS.inserirAluno(alunoJS2);
        turmaJS.inserirAluno(alunoJS3);

        turmaJava.inserirProf(profJava);
        turmaJava.inserirAluno(alunoJava1);
        turmaJava.inserirAluno(alunoJava2);
        turmaJava.inserirAluno(alunoJava3);

        System.out.println("Turma Matemática:\n"+matematica);
        System.out.println("Turma Java:\n"+turmaJava);
        System.out.println("Turma JS:\n"+turmaJS);
    }
}
