package perfect;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PerfectNumber {

    private static boolean isDivisible(int number, int divisor) {
        return (number%divisor == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumTotal = 0;

        int theNumber = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

        for (int divisor = theNumber-1; divisor > 0; divisor--) {
            sumTotal += isDivisible(theNumber, divisor) ? divisor : 0;
        }

        String result = String.format("O numero eh %s", sumTotal == theNumber ? "perfeito" : "nao perfeito");

        JOptionPane.showMessageDialog(null, result);

        sc.close();
    }
}
