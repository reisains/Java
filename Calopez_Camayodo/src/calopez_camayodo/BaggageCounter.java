
package calopez_camayodo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class BaggageCounter {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaggageCounterFrame().setVisible(true);
            }
        });
    }
}

class BaggageCounterFrame extends JFrame {
    public int count = 0;
    private JLabel lblBaggageInput;

    public BaggageCounterFrame() {
        initComponents();
    }

    private void initComponents() {
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setTitle("Baggage Counter");
//        setResizable(false);
//
//        lblBaggageInput = new JLabel();
//        lblBaggageInput.setText(String.valueOf(count));
//        lblBaggageInput.setBounds(100, 50, 100, 30);
//        add(lblBaggageInput);

        JButton btnDecrease = new JButton("-");
        btnDecrease.setBounds(50, 100, 50, 30);
        btnDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                lblBaggageInput.setText(String.valueOf(count));
            }
        });
        add(btnDecrease);

        JButton btnIncrease = new JButton("+");
        btnIncrease.setBounds(150, 100, 50, 30);
        btnIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                lblBaggageInput.setText(String.valueOf(count));
            }
        });
        add(btnIncrease);

//        setSize(250, 200);
//        setLayout(null);
//        setLocationRelativeTo(null);
//        setVisible(true);
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}