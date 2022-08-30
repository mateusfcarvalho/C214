public class Professor {

    private String nome_do_professor;
    private String horario_de_atendimento;
    private String periodo;

    public Professor (String nome_do_professor, String horario_de_atendimento, String periodo){
        this.nome_do_professor = nome_do_professor;
        this.horario_de_atendimento = horario_de_atendimento;
        this.periodo = periodo;
    }

    public String getNome_do_professor() {
        return nome_do_professor;
    }

    public void setNome(String nome) {
        this.nome_do_professor = nome_do_professor;
    }

    public String getHorario_de_atendimento() {
        return horario_de_atendimento;
    }

    public void setHorario_de_atendimento(String horario_de_atendimento) {

        this.horario_de_atendimento = horario_de_atendimento;
    }

    public String getPeriodo() {

        return periodo;
    }

    public void setPeriodo(String arma) {
        this.periodo = periodo;
    }

/*
    {"nomeDoProfessor": "<nome_do_professor",
    "horarioDeAtendimento": "<horario_de_atendimento",
    "periodo": "<integral_ou_noturno>"}
    */

}
