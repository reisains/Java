package calopez_camayodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterExample {
    private int count = 0; // Initial value

    public CounterExample() {
        JFrame frame = new JFrame("Counter Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());

        JLabel countLabel = new JLabel(Integer.toString(count)); // Label to display count
        panel.add(countLabel);

        JButton plusButton = new JButton("+");
        plusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                countLabel.setText(Integer.toString(count));
            }
        });
        panel.add(plusButton);

        JButton minusButton = new JButton("-");
        minusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (count > 0) {
                    count--;
                    countLabel.setText(Integer.toString(count));
                }
            }
        });
        panel.add(minusButton);

        frame.getContentPane().add(panel);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CounterExample();
            }
        });
    }
}
