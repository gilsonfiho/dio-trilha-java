package main.set.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int codigoConvite;


    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvite = codigoConvidado;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

 
    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvidado=" + codigoConvite + "]";
    }
    
}
