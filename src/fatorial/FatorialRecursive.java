package fatorial;

import javax.swing.JOptionPane;

public class FatorialRecursive {
    public static long fatorialNumber(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * fatorialNumber(number-1);
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero para ter seu fatorial calculado"));

        String output = String.format("O fatorial de %d vale %d", number, fatorialNumber(number));

        JOptionPane.showMessageDialog(null, output);
    }
}
