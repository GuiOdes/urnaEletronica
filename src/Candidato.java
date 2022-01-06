public class Candidato {
    private static int numeroCandidatos = 0;
    private String nomeCompleto;
    private final int numeroCandidato;
    private int votos = 0;

    public Candidato(String nome) {
        this.numeroCandidato = Candidato.numeroCandidatos + 1;
        this.nomeCompleto = nome;
        numeroCandidatos++;
    }

    public void addVoto(){
        this.votos += 1;
    }

    public void zeraVotos(){
        this.votos = 0;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public static int getNumeroCandidatos() {
        return numeroCandidatos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getVotos() {
        return votos;
    }
}