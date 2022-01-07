import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Eleicao {
    private Candidato candidato1;
    private Candidato candidato2;
    private Candidato candidato3;
    private Candidato candidato4;
    private Candidato candidato5;

    private int votosNulos = 0;
    private int votosEmBranco = 0;

    public Eleicao(Candidato candidato1, Candidato candidato2, Candidato candidato3, Candidato candidato4, Candidato candidato5) {
        this.candidato1 = candidato1;
        this.candidato2 = candidato2;
        this.candidato3 = candidato3;
        this.candidato4 = candidato4;
        this.candidato5 = candidato5;

        System.out.println("Eleição iniciada com sucesso!");
    }

    public int getVotosEmBranco() {
        return votosEmBranco;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    private void votoBranco() {
        this.votosEmBranco += this.getVotosEmBranco() + 1;
    }

    private void votoNulo() {
        this.votosNulos += this.getVotosNulos() + 1;
    }

    public String getNomeCandidato(int numeroCandidato) {
        Candidato candidato = numeroParaCandidato(numeroCandidato);
        return candidato.getNomeCompleto();
    }

    public int getVotosCandidato(int numeroCandidato) {
        Candidato candidato = numeroParaCandidato(numeroCandidato);

        return candidato.getVotos();
    }

    public void votar(int numeroCandidato) {
        Candidato candidato = numeroParaCandidato(numeroCandidato);

        if (candidato != null) {
            candidato.addVoto();
        } else if (numeroCandidato == 0) {
            votoBranco();
        } else {
            votoNulo();
        }

        System.out.println("Voto computado!");
    }

    public Candidato numeroParaCandidato(int numero) {
        switch (numero) {
            case 1:
                return candidato1;
            case 2:
                return candidato2;
            case 3:
                return candidato3;
            case 4:
                return candidato4;
            case 5:
                return candidato5;
            default:
                return null;
        }
    }

    private void atualizarPlacar(Candidato candidatoVotado) {

    }

    public void resetarEleicao() {
        this.votosNulos = 0;
        this.votosEmBranco = 0;
        candidato1.zeraVotos();
        candidato2.zeraVotos();
        candidato3.zeraVotos();
        candidato4.zeraVotos();
        candidato5.zeraVotos();

        System.out.println("Eleição resetada!");
    }

    public void mostraResultados() {
        for (int x = 1; x < 6; x++) {
            System.out.printf("\n%s : %d votos", this.getNomeCandidato(x), this.getVotosCandidato(x));
        }
    }

    public void iniciarVotacao() {
        Scanner entrada = new Scanner(System.in);
        int voto = 0;
        while (voto != -1) {
            System.out.print("\nNúmero do candidato -> ");
            voto = entrada.nextInt();
            entrada.nextLine();

            this.votar(voto);
        }
    }
}
