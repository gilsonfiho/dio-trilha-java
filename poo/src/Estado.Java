

public class Estado {
    AC("AC", "Acre", 12, "Norte"),
    AL("AL", "Alagoas", 27, "Nordeste"),
    AP("AP", "Amapá", 16, "Norte"),
    AM("AM", "Amazonas", 13, "Norte"),
    BA("BA", "Bahia", 29, "Nordeste"),
    CE("CE", "Ceará", 23, "Nordeste"),
    DF("DF", "Distrito Federal", 53, "Centro-Oeste"),
    ES("ES", "Espírito Santo", 32, "Sudeste"),
    GO("GO", "Goiás", 52, "Centro-Oeste"),
    MA("MA", "Maranhão", 21, "Nordeste"),
    MT("MT", "Mato Grosso", 51, "Centro-Oeste"),
    MS("MS", "Mato Grosso do Sul", 50, "Centro-Oeste"),
    MG("MG", "Minas Gerais", 31, "Sudeste"),
    PA("PA", "Pará", 15, "Norte"),
    PB("PB", "Paraíba", 25, "Nordeste"),
    PR("PR", "Paraná", 41, "Sul"),
    PE("PE", "Pernambuco", 26, "Nordeste"),
    PI("PI", "Piauí", 22, "Nordeste"),
    RJ("RJ", "Rio de Janeiro", 33, "Sudeste"),
    RN("RN", "Rio Grande do Norte", 24, "Nordeste"),
    RS("RS", "Rio Grande do Sul", 43, "Sul"),
    RO("RO", "Rondônia", 11, "Norte"),
    RR("RR", "Roraima", 14, "Norte"),
    SC("SC", "Santa Catarina", 42, "Sul"),
    SP("SP", "São Paulo", 35, "Sudeste"),
    SE("SE", "Sergipe", 28, "Nordeste"),
    TO("TO", "Tocantins", 17, "Norte");

    private final String sigla;
    private final String nome;
    private final int codigoIbge;
    private final String regiao;

    EstadoBrasileiro(String sigla, String nome, int codigoIbge, String regiao) {
        this.sigla = sigla;
        this.nome = nome;
        this.codigoIbge = codigoIbge;
        this.regiao = regiao;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public String getRegiao() {
        return regiao;
    }

    @Override
    public String toString() {
        return nome + " (" + sigla + ") - IBGE: " + codigoIbge + " - Região: " + regiao;
    }
}