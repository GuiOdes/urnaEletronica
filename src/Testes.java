import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Testes {
    public static void main(String[] args) {

        //Interface.telaInicial(false, null);

        Map<Integer, Candidato> candidatos = new HashMap<>();
        Candidato jonas = new Candidato("Jonas");
        Candidato marcos = new Candidato("Marcos");
        Candidato adrian = new Candidato("adrian");
        Candidato bia = new Candidato("bia");
        Candidato gui = new Candidato("gui");

        candidatos.put(1, jonas);
        candidatos.put(2, marcos);
        candidatos.put(3, bia);
        candidatos.put(4, adrian);
        candidatos.put(5, gui);

        gui.addVoto();
        gui.addVoto();
        gui.addVoto();

        jonas.addVoto();
        jonas.addVoto();
        jonas.addVoto();
        jonas.addVoto();
        jonas.addVoto();
        jonas.addVoto();




    }
}