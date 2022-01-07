import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {

        Candidato jonas = new Candidato("Jonas Almeida Santana");
        Candidato lucas = new Candidato("Lucas Costa Santos");
        Candidato peres = new Candidato("Peres Divino Jacinto");
        Candidato divino = new Candidato("Divino Pinto");
        Candidato sofia = new Candidato("Sofia de Deus");

        //Eleicao eleicao1 = new Eleicao(jonas, lucas, peres, divino, sofia);

        Eleicao eleicao1 = new Eleicao();

        eleicao1.addCandidato(1, jonas);
        eleicao1.addCandidato(2, lucas);
        eleicao1.addCandidato(3, peres);
        eleicao1.addCandidato(4, divino);
        eleicao1.addCandidato(5, sofia);

    }
}
