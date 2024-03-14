
package myprjjava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class productMenu extends javax.swing.JFrame {

    
    public productMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Price = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Colorway = new javax.swing.JLabel();
        lbl_Quantity = new javax.swing.JLabel();
        comboBox_Class = new javax.swing.JComboBox<>();
        txt_Colorway = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_Price = new javax.swing.JTextField();
        txt_Quantity = new javax.swing.JTextField();
        btn_Close = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        txt_Size = new javax.swing.JTextField();
        lbl_Size = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Price.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lbl_Price.setText("Price:");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        lbl_Colorway.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lbl_Colorway.setText("Colorway:");

        lbl_Quantity.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lbl_Quantity.setText("Quantity:");

        comboBox_Class.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        comboBox_Class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Men's", "Women's" }));
        comboBox_Class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_ClassActionPerformed(evt);
            }
        });

        txt_Colorway.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txt_Colorway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ColorwayActionPerformed(evt);
            }
        });

        txt_Name.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameActionPerformed(evt);
            }
        });

        txt_Price.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txt_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PriceActionPerformed(evt);
            }
        });

        txt_Quantity.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txt_Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_QuantityActionPerformed(evt);
            }
        });

        btn_Close.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_Close.setText("CLOSE");
        btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseActionPerformed(evt);
            }
        });

        btn_Save.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_Save.setText("SAVE");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        txt_Size.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txt_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SizeActionPerformed(evt);
            }
        });

        lbl_Size.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lbl_Size.setText("Size:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lbl_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txt_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBox_Class, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txt_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214)
                                .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Colorway, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txt_Colorway, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(416, 416, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_Colorway, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_Colorway, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(comboBox_Class, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_ClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_ClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_ClassActionPerformed

    private void txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameActionPerformed

    private void txt_ColorwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ColorwayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ColorwayActionPerformed

    private void txt_QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_QuantityActionPerformed

    private void txt_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PriceActionPerformed

    private void btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseActionPerformed
      // mainMenu mainMenu = new mainMenu();
       this.dispose();

    }//GEN-LAST:event_btn_CloseActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\camayodo\\products.txt", true))) {
        String name = txt_Name.getText();
        String colorway = txt_Colorway.getText();
        String quantity = txt_Quantity.getText();
        String price = txt_Price.getText();
        String size = txt_Size.getText();
        String productClass = (String) comboBox_Class.getSelectedItem();

        String record = String.format("%s,%s,%s,%s,%s,%s%n", name, colorway, quantity, price,size, productClass);
        writer.write(record);

        JOptionPane.showMessageDialog(this, "Product saved successfully!");

        
        txt_Name.setText("");
        txt_Colorway.setText("");
        txt_Quantity.setText("");
        txt_Price.setText("");
        txt_Size.setText("");
        comboBox_Class.setSelectedIndex(0);

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error saving product: " + ex.getMessage());
    }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void txt_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SizeActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Save;
    private javax.swing.JComboBox<String> comboBox_Class;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Colorway;
    private javax.swing.JLabel lbl_Price;
    private javax.swing.JLabel lbl_Quantity;
    private javax.swing.JLabel lbl_Size;
    private javax.swing.JTextField txt_Colorway;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Price;
    private javax.swing.JTextField txt_Quantity;
    private javax.swing.JTextField txt_Size;
    // End of variables declaration//GEN-END:variables
}
