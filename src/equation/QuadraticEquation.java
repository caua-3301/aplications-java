package equation;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class QuadraticEquation {

    private static double deltaCalc(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    private static double[] sqrtOfEquation(double delta, double a, double b) {
        double[] results = new double[2];
        results[0] = (-b + Math.sqrt(delta)) / (2*a);
        results[1] = (-b - Math.sqrt(delta)) / (2*a);

        return  results;
    }

    public static void main(String[] args) {

        //set my panel to exibition and input of data
        JPanel panelExibition = new JPanel(new GridLayout(0, 6));

        //create inputs
        JTextField inputA = new JTextField();
        JTextField inputB = new JTextField();
        JTextField inputC = new JTextField();

        //add in panel
        panelExibition.add(inputA);
        panelExibition.add(inputB);
        panelExibition.add(inputC);

        //get result of input
        //result = option informate for user, example: CANCEL_OPTION or OK_OPTION;
        double result = JOptionPane.showConfirmDialog(null, panelExibition, "Informe os valores de a b e c respectivamente, consiferando: ax² + bx + c", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            double numberA = Double.parseDouble(inputA.getText());
            double numberB = Double.parseDouble(inputB.getText());
            double numberC = Double.parseDouble(inputC.getText());

            double delta = deltaCalc(numberA, numberB, numberC);

            if (delta >= 0 ) {
                double[] sqrts = sqrtOfEquation(delta, numberA, numberB);

                String output = String.format("As raizes sao: %,.2f e %,.2f", sqrts[0], sqrts[1]);

                JOptionPane.showMessageDialog(null, output);
            }
            else {
                JOptionPane.showMessageDialog(null, "Delta eh negativo");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Operacao cancelada");
        }
    }
}
