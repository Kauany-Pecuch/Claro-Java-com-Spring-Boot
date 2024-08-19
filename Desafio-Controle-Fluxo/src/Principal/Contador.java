package Principal;

import Principal.ParametrosInvalidosException;
import javax.swing.JOptionPane;

public class Contador {

    static boolean vericarNums(int num1, int num2) {
        boolean prosseguir = true;
        if (num1 >= num2) {
            prosseguir = false;

        } else {
            prosseguir = true;
        }
        return prosseguir;
    }

    static void contar() throws ParametrosInvalidosException {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        boolean prosseguir = vericarNums(num1, num2);
        if (prosseguir == false) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");

        } else {
            for (int i = num1; i <= num2; i++) {
                JOptionPane.showMessageDialog(null, i);
            }
        }
    }

    static void contador() {
        try {
            contar(); // Chama o método que pode lançar exceção
        } catch (ParametrosInvalidosException e) {
            // Exibe a mensagem de erro usando JOptionPane
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
