package projetoaula09;

public class Aluno {
    private String rgm;
    private String nome;
    private Float nota_parcial;
    private Float nota_reg;

    public Aluno() {
    }

    public Aluno(String rgm, String nome, float nota_parcial, float nota_reg) {
        this.rgm = rgm;
        this.nome = nome;
        this.nota_parcial = nota_parcial;
        this.nota_reg = nota_reg;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getNotaParcial() {
        return nota_parcial;
    }

    public void setNotaParcial(Float nota_parcial) {
        this.nota_parcial = nota_parcial;
    }

    public Float getNotaReg() {
        return nota_reg;
    }

    public void setNotaReg(Float nota_reg) {
        this.nota_reg = nota_reg;
    }

    public Float calcularMedia() {
        return (nota_parcial + nota_reg) / 2;
    }

    public String getStatusNota() {
        Float media = calcularMedia();
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Avaliação Final";
        }
    }

    public void imprimir() {
        Float mediaFinal = calcularMedia();
        System.out.println(
                "Nome: " + nome +
                "\nRGM: " + rgm +
                "\nNota Parcial: " + nota_parcial +
                "\nNota Regimental: " + nota_reg +
                "\nNota final:" + mediaFinal +
                "\nStatus: " + getStatusNota());
    }
}
