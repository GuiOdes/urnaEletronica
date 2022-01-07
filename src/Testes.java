import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Candidato jonas = new Candidato("Jonas Almeida Santana");
        Candidato lucas = new Candidato("Lucas Costa Santos");
        Candidato peres = new Candidato("Peres Divino Jacinto");
        Candidato divino = new Candidato("Divino Pinto");
        Candidato sofia = new Candidato("Sofia de Deus");

        Eleicao eleicao1 = new Eleicao(jonas, lucas, peres, divino, sofia);

        eleicao1.iniciarVotacao();

        eleicao1.mostraResultados();



        //System.out.println(eleicao1.getVotosCandidato(1));

        //Map<Integer, String> candidatos = new HashMap<>();

    }
}
