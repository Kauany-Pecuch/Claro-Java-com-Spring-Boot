package Principal;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static final double SALARIOBASE = 2000.00;
    static List<String> candidatos = new ArrayList<>(Arrays.asList("FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"));

    public static void main(String[] args) {
        imprimirLista((ArrayList) candidatos);
        List<String> selecionados = selecionaroCandidato((ArrayList) candidatos);
        imprimirLista((ArrayList) selecionados);
        ligarCandidatos((ArrayList) selecionados);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // impirimi lista de nomes com o indice e seu respectivo nome
    static void imprimirLista(ArrayList lista) {
        System.out.println("Os candidatos com seus respecitivos indices são: ");
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + "° Candidato é " + lista.get(i));
            }
        } else {
            System.out.println("Lista vazia");
        }
    }

    static void analisarCandidato(String candidato, double salarioPretendido) {
        if (SALARIOBASE >= salarioPretendido) {
            System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
        } else {
            System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
        }
    }

    static List<String> selecionaroCandidato(ArrayList lista) {
        int quantidadeSelecionados = 0;
        int proximoCandidato = 0;
        List<String> selecionados = new ArrayList<>();

        if (!lista.isEmpty()) {
            while (quantidadeSelecionados < 5 && proximoCandidato < candidatos.size()) {
                String candidato = candidatos.get(proximoCandidato++);
                double valorPedido = valorPretendido();
                analisarCandidato(candidato, valorPedido);
                quantidadeSelecionados++;
                selecionados.add(candidatos.get(proximoCandidato));
            }
        } else {
            System.out.println("Lista vazia");
        }
        return selecionados;
    }

    static void ligarCandidatos(ArrayList lista) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                String candidato = (String) lista.get(i);
                do {
                    atendeu = atender();
                    continuarTentando = !atendeu;
                    if (continuarTentando) {
                        tentativasRealizadas++;
                    } else {
                        System.out.println("CONTATO REALIZADO COM SUCESSO");
                    }
                } while (continuarTentando && tentativasRealizadas < 3);

                if (atendeu) {
                    System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
                } else {
                    System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
                }
            }
        } else {
            System.out.println("Lista vazia");
        }

    }
}
