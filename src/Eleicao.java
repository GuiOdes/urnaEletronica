import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Eleicao {
    private final Map<Integer, Candidato> candidatos = new HashMap<>();

    private int votosNulos = 0;
    private int votosEmBranco = 0;


    public void addCandidato(int numero, Candidato candidato) {
        candidatos.put(numero, candidato);
        if (candidatos.size() == 5){
            iniciaEleicao();
        }else {
            System.out.printf("%d candidatos cadastrados. Faltam %d.\n", candidatos.size(), 5-candidatos.size());
        }
    }

    public void iniciaEleicao(){
        if (this.candidatos.size() == 5) {
            System.out.println("Eleição iniciada com sucesso!");
        } else {
            System.out.printf("Eleição não pode iniciar com %d candidatos\n", this.candidatos.size());
        }
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
        return this.candidatos.get(numeroCandidato).getNomeCompleto();
    }

    public int getVotosCandidato(int numeroCandidato) {
        return this.candidatos.get(numeroCandidato).getVotos();
    }

    public void votar(int numeroCandidato) {
        Candidato candidato = this.candidatos.get(numeroCandidato);

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
        return candidatos.get(numero);
    }

    public void resetarEleicao() {
        this.votosNulos = 0;
        this.votosEmBranco = 0;

        // percorre todos os candidatos da eleicao para zerar os votos de cada um
        for (Map.Entry<Integer, Candidato> linha : candidatos.entrySet()) {
            linha.getValue().zeraVotos();
        }

        System.out.println("Eleição resetada!");
    }

    public void mostraResultados() {
        Candidato maior = null;
        int aux = 0;
        for (int x = 1; x < 6; x++) {
            if (this.getVotosCandidato(x) > aux){
                maior = this.numeroParaCandidato(x);
            }
            System.out.printf("\n%s : %d votos", this.getNomeCandidato(x), this.getVotosCandidato(x));
        }

        System.out.println("\n\nO vencedor é " + maior);
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
