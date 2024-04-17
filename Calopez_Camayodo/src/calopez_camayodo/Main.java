
package calopez_camayodo;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Main extends javax.swing.JFrame {
//    private final double INITIAL_FARE = 15.0;
//    private final double FARE_PER_EXCESS_KM = 2.5;
//    private final double DISCOUNT_RATE = 0.20;
    private int baggageCount = 0;
    
    DefaultListModel<String> listModel;
    
    public Main() {
        initComponents();
        
        listModel = new DefaultListModel<>();
        int baggageCount = 0;
        JButton[] btns = {btnBus, btnHome, btnReport, btnStation, btnTicket, btnUser};        
          for (JButton btn : btns) {
            btn.setBackground(new Color(21,25,28));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(54,81,207));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                     btn.setBackground(new Color(21,25,28));
                }
            });
                    
        }
      JTableHeader header = tableFare.getTableHeader();
      header.setBackground(Color.LIGHT_GRAY);
      
      JComboBox<String> cbOrigin = new JComboBox<>();
      
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnBus = new javax.swing.JButton();
        btnStation = new javax.swing.JButton();
        jtabCenter = new javax.swing.JTabbedPane();
        pnl1 = new javax.swing.JPanel();
        pnl2 = new javax.swing.JPanel();
        pnlRegistryBody = new javax.swing.JPanel();
        pnl3 = new javax.swing.JPanel();
        pnlFareBody = new javax.swing.JPanel();
        pnlHeaderName = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cb_Origin = new javax.swing.JComboBox<>();
        cb_Destination = new javax.swing.JComboBox<>();
        cb_Discount = new javax.swing.JComboBox<>();
        jdateChooser = new com.toedter.calendar.JDateChooser();
        lblBaggage = new javax.swing.JLabel();
        btnDecrease = new javax.swing.JButton();
        btnIncrease = new javax.swing.JButton();
        txtBaggageInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listFare = new javax.swing.JList<>();
        pnl4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFare = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        pnl5 = new javax.swing.JPanel();
        pnl6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(51, 51, 51));
        pnlSide.setPreferredSize(new java.awt.Dimension(120, 80));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        pnlSide.add(jPanel1);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/Home_2.png"))); // NOI18N
        btnHome.setPreferredSize(new java.awt.Dimension(60, 60));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        pnlSide.add(btnHome);

        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/People.png"))); // NOI18N
        btnUser.setPreferredSize(new java.awt.Dimension(60, 60));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        pnlSide.add(btnUser);

        btnTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/Ticket_3.png"))); // NOI18N
        btnTicket.setPreferredSize(new java.awt.Dimension(60, 60));
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        pnlSide.add(btnTicket);

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/Documents.png"))); // NOI18N
        btnReport.setPreferredSize(new java.awt.Dimension(60, 60));
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        pnlSide.add(btnReport);

        btnBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/Bus.png"))); // NOI18N
        btnBus.setPreferredSize(new java.awt.Dimension(60, 60));
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        pnlSide.add(btnBus);

        btnStation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/Stations.png"))); // NOI18N
        btnStation.setPreferredSize(new java.awt.Dimension(60, 60));
        btnStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStationActionPerformed(evt);
            }
        });
        pnlSide.add(btnStation);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnl1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1656, Short.MAX_VALUE)
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );

        jtabCenter.addTab("tab1", pnl1);

        javax.swing.GroupLayout pnlRegistryBodyLayout = new javax.swing.GroupLayout(pnlRegistryBody);
        pnlRegistryBody.setLayout(pnlRegistryBodyLayout);
        pnlRegistryBodyLayout.setHorizontalGroup(
            pnlRegistryBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 992, Short.MAX_VALUE)
        );
        pnlRegistryBodyLayout.setVerticalGroup(
            pnlRegistryBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(pnlRegistryBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(547, Short.MAX_VALUE))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pnlRegistryBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jtabCenter.addTab("tab2", pnl2);

        pnlFareBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 40, 102)));

        pnlHeaderName.setBackground(new java.awt.Color(154, 40, 102));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/Bus.png"))); // NOI18N
        jLabel2.setText("EUNHYE BUS LINER ");

        javax.swing.GroupLayout pnlHeaderNameLayout = new javax.swing.GroupLayout(pnlHeaderName);
        pnlHeaderName.setLayout(pnlHeaderNameLayout);
        pnlHeaderNameLayout.setHorizontalGroup(
            pnlHeaderNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderNameLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeaderNameLayout.setVerticalGroup(
            pnlHeaderNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        cb_Origin.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb_Origin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monumento", "Bagong Barrio", "Balintawak", "Kaingin", "Roosevelt", "North Avenue", "Nepa Q. Mart", "Main Avenue", "Santolan", "Ortigas", "Guadalupe", "Buendia", "One Ayala", "Tramo", "Taft Avenue", "Roxas Boulevard", "MoA", "DFA", "Ayala Malls Manila Bay", "PITX" }));

        cb_Destination.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb_Destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monumento", "Bagong Barrio", "Balintawak", "Kaingin", "Roosevelt", "North Avenue", "Nepa Q. Mart", "Main Avenue", "Santolan", "Ortigas", "Guadalupe", "Buendia", "One Ayala", "Tramo", "Taft Avenue", "Roxas Boulevard", "MoA", "DFA", "Ayala Malls Manila Bay", "PITX" }));

        cb_Discount.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cb_Discount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Student", "Senior", "PWD" }));

        jdateChooser.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jdateChooser.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jdateChooserAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblBaggage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBaggage.setText("Baggage");

        btnDecrease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/Minus.png"))); // NOI18N
        btnDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecreaseActionPerformed(evt);
            }
        });

        btnIncrease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calopez_camayodo/icons/Add.png"))); // NOI18N
        btnIncrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncreaseActionPerformed(evt);
            }
        });

        txtBaggageInput.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txtBaggageInput.setText("0");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Origin");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Destination");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Discount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cb_Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(cb_Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(cb_Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lblBaggage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBaggageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecrease)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncrease))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel4)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel5)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cb_Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDecrease)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBaggage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBaggageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnIncrease))
                        .addGap(27, 27, 27))))
        );

        btnGenerate.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnGenerate.setText("GENERATE");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        listFare.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jScrollPane2.setViewportView(listFare);

        javax.swing.GroupLayout pnlFareBodyLayout = new javax.swing.GroupLayout(pnlFareBody);
        pnlFareBody.setLayout(pnlFareBodyLayout);
        pnlFareBodyLayout.setHorizontalGroup(
            pnlFareBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeaderName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFareBodyLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlFareBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFareBodyLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pnlFareBodyLayout.setVerticalGroup(
            pnlFareBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFareBodyLayout.createSequentialGroup()
                .addComponent(pnlHeaderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFareBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(pnlFareBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pnlFareBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jtabCenter.addTab("tab3", pnl3);

        tableFare.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tableFare.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        tableFare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origin", "Destination", "Discount", "Date", "Baggage", "Fare", "Total Fare"
            }
        ));
        tableFare.setOpaque(false);
        jScrollPane1.setViewportView(tableFare);

        txtSearch.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl4Layout = new javax.swing.GroupLayout(pnl4);
        pnl4.setLayout(pnl4Layout);
        pnl4Layout.setHorizontalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4Layout.createSequentialGroup()
                .addContainerGap(811, Short.MAX_VALUE)
                .addGroup(pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl4Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        pnl4Layout.setVerticalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl4Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        jtabCenter.addTab("tab4", pnl4);

        javax.swing.GroupLayout pnl5Layout = new javax.swing.GroupLayout(pnl5);
        pnl5.setLayout(pnl5Layout);
        pnl5Layout.setHorizontalGroup(
            pnl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1656, Short.MAX_VALUE)
        );
        pnl5Layout.setVerticalGroup(
            pnl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );

        jtabCenter.addTab("tab5", pnl5);

        javax.swing.GroupLayout pnl6Layout = new javax.swing.GroupLayout(pnl6);
        pnl6.setLayout(pnl6Layout);
        pnl6Layout.setHorizontalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1656, Short.MAX_VALUE)
        );
        pnl6Layout.setVerticalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );

        jtabCenter.addTab("tab6", pnl6);

        pnlRoot.add(jtabCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        jtabCenter.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        jtabCenter.setSelectedIndex(1);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // TODO add your handling code here:
        jtabCenter.setSelectedIndex(2);

    }//GEN-LAST:event_btnTicketActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        jtabCenter.setSelectedIndex(3);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        // TODO add your handling code here:
        jtabCenter.setSelectedIndex(4);
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStationActionPerformed
        // TODO add your handling code here
        jtabCenter.setSelectedIndex(5);
    }//GEN-LAST:event_btnStationActionPerformed

    private void btnIncreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncreaseActionPerformed
        // TODO add your handling code here:
      // Increase baggage count when btnIncrease is clicked
    int currentCount = Integer.parseInt(txtBaggageInput.getText());
    currentCount++;
    txtBaggageInput.setText(String.valueOf(currentCount));
    baggageCount = currentCount; // Update the class-level variable
    }//GEN-LAST:event_btnIncreaseActionPerformed

    private void btnDecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecreaseActionPerformed
        // TODO add your handling code here:
        // Decrease baggage count when btnDecrease is clicked
    int currentCount = Integer.parseInt(txtBaggageInput.getText());
    
    if (currentCount > 0) {
        currentCount--;
        txtBaggageInput.setText(String.valueOf(currentCount));
        baggageCount = currentCount; // Update the class-level variable
    } 
        
    }//GEN-LAST:event_btnDecreaseActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
    String origin = cb_Origin.getSelectedItem().toString();
    String destination = cb_Destination.getSelectedItem().toString();
    String discount = cb_Discount.getSelectedItem().toString();
        int numOfBaggage = Integer.parseInt(txtBaggageInput.getText());

    // Get the selected date
    Date selectedDate = jdateChooser.getDate();

    // Validate if the date is null
         if (selectedDate == null) 
        {
            JOptionPane.showMessageDialog(null, "Error: Date cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method
        }

    // Format the date
    String date = new SimpleDateFormat("yyyy-MM-dd").format(selectedDate);

        if (origin.equals(destination)) 
        {
            JOptionPane.showMessageDialog(null, "Error: Origin and destination cannot be the same.", "Error", JOptionPane.ERROR_MESSAGE);
        }   
        else 
        {
        // Calculate distance
        double distance = Math.abs(getDistance(origin) - getDistance(destination));

        // Check if student, PWD, or senior discount is selected
        boolean hasDiscount = discount.equals("Student") || discount.equals("Senior") || discount.equals("PWD");


        // Calculate fare
        double fare = calculateFare(distance, hasDiscount);
               // Calculate baggage fare
        double baggageFare;
        
        if (baggageCount != 0) {
    // If there is baggage, set baggageFare equal to fare
        baggageFare = fare;
    // Multiply fare by (baggageCount)
    baggageFare *= (baggageCount);
        } else {
    // If there is no baggage, set baggageFare to zero
    baggageFare = 0.0;
        }
        

        // Calculate total fare
        double totalFare = baggageFare + fare;


        // Add fare information to the list model
        listModel.addElement("Date: " + date);
        listModel.addElement("Origin: " + origin);
        listModel.addElement("Destination: " + destination);
        listModel.addElement("Discount: " + discount);
        listModel.addElement("Number of Baggage: " + numOfBaggage);
        listModel.addElement("Baggage Fare: PHP " + baggageFare);
        listModel.addElement("Fare: PHP " + fare);
        listModel.addElement("Total Fare: PHP " + totalFare);
        listModel.addElement("--------------------"); // Separator between fares

        listFare.setModel(listModel);
        
        try {
    // Create a FileWriter object with the specified file name ("fare_details.txt")
    FileWriter fileWriter = new FileWriter("fare_details.txt", true); // 'true' for appending to existing file
    
    // Create a BufferedWriter to write to the file
    BufferedWriter writer = new BufferedWriter(fileWriter);
    
    // Write fare information to the file
    writer.write("Date: " + date);
    writer.newLine();
    writer.write("Origin: " + origin);
    writer.newLine();
    writer.write("Destination: " + destination);
    writer.newLine();
    writer.write("Discount: " + discount);
    writer.newLine();
    writer.write("Number of Baggage: " + numOfBaggage);
    writer.newLine();
    writer.write("Baggage Fare: PHP " + baggageFare);
    writer.newLine();
    writer.write("Fare: PHP " + fare);
    writer.newLine();
    writer.write("Total Fare: PHP " + totalFare);
    writer.newLine();
    writer.write("--------------------");
    writer.newLine();
    
    // Close the writer
    writer.close();
    
    // Show a message dialog indicating successful saving
    JOptionPane.showMessageDialog(null, "Fare details saved to fare_details.txt", "Success", JOptionPane.INFORMATION_MESSAGE);
} catch (IOException ex) {
    // Show an error message dialog if an exception occurs during saving
    JOptionPane.showMessageDialog(null, "Error saving fare details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
        }
        
        
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void jdateChooserAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jdateChooserAncestorAdded
        
    }//GEN-LAST:event_jdateChooserAncestorAdded

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    // Get the search text from txtSearch
    String searchText = txtSearch.getText().trim();
        // Check if the search text is empty
    if (searchText.isEmpty()) {
        // If search text is empty, show a message or perform any other desired action
        JOptionPane.showMessageDialog(null, "Please enter a search term.", "Empty Search", JOptionPane.WARNING_MESSAGE);
        return; // Exit the method
    }
    // Clear the existing table data
    DefaultTableModel model = (DefaultTableModel) tableFare.getModel();
    model.setRowCount(0);
    
    try {
        // Create a FileReader object to read from the "fare_details.txt" file
        FileReader fileReader = new FileReader("fare_details.txt");
        
        // Create a BufferedReader to read lines from the file
        BufferedReader reader = new BufferedReader(fileReader);
        
        // Create an ArrayList to store the relevant data for each record
        ArrayList<String> recordData = new ArrayList<>();
        
        // Read the file line by line
        String line;
        while ((line = reader.readLine()) != null) {
            // If the line is a separator, process the record
            if (line.equals("--------------------")) {
                // Check if the record contains the search text
                boolean matchesSearch = false;
                for (String recordLine : recordData) {
                    if (recordLine.contains(searchText)) {
                        matchesSearch = true;
                        break;
                    }
                }
                
                // If the record matches the search text, extract relevant data and add it to the table model
                if (matchesSearch) {
                    // Extract relevant data (Origin, Destination, Discount, Date, Baggage Fare, Fare) from the record
                    String origin = recordData.get(1).substring("Origin: ".length());
                    String destination = recordData.get(2).substring("Destination: ".length());
                    String discount = recordData.get(3).substring("Discount: ".length());
                    String date = recordData.get(0).substring("Date: ".length());
                    String baggageCount = recordData.get(4).substring("Baggage: ".length());
                    String fare = recordData.get(6).substring("Fare: PHP ".length());
                    String totalFare = recordData.get(7).substring("Total Fare: ".length());
                    
                    // Add a row to the table model with the extracted data
                    model.addRow(new Object[]{origin, destination, discount, date, baggageCount, fare, totalFare});
                }
                
                // Clear the record data list for the next record
                recordData.clear();
            } else {
                // Add non-separator lines to the record data list
                recordData.add(line);
            }
        }
        
        // Close the reader
        reader.close();
    } catch (IOException ex) {
        // Show an error message if an exception occurs during reading
        JOptionPane.showMessageDialog(null, "Error reading fare details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }
    private double getDistance(String station) {
    switch (station) {
        case "Monumento":
            return 0.0;
        case "Bagong Barrio":
            return 3.2;
        case "Balintawak":
            return 3.5;
        case "Kaingin":
            return 4.1;
        case "Roosevelt":
            return 4.7;
        case "North Avenue":
            return 5.8;
        case "Nepa Q. Mart":
            return 6.0;
        case "Main Avenue":
            return 6.4;
        case "Santolan":
            return 8.1;
        case "Ortigas":
            return 9.2;
        case "Guadalupe":
            return 10.5;
        case "Buendia":
            return 11.8;
        case "One Ayala":
            return 12.6;
        case "Tramo":
            return 14.2;
        case "Taft Avenue":
            return 16.7;
        case "Roxas Boulevard":
            return 17.9;
        case "MoA":
            return 18.5;
        case "DFA":
            return 19.3;
        case "Ayala Malls Manila Bay":
            return 20.1;
        case "PITX":
            return 21.0;
        default:
            return 0.0;
    }
}
    
private double calculateFare(double distance, boolean hasDiscount) {
    final double INITIAL_FARE = 15.0;
    final double FARE_PER_EXCESS_KM = 2.5;
    final double DISCOUNT_RATE = 0.20; // 20% discount for Student/Senior/PWD

    double fare = INITIAL_FARE;
    if (distance > 5) {
        fare += (distance - 5) * FARE_PER_EXCESS_KM;
    }
    if (hasDiscount) {
        // Calculate the discount separately and subtract it from the fare
        double discountAmount = fare * DISCOUNT_RATE;
        fare -= discountAmount;
    }
    return fare;
}  


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnDecrease;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIncrease;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStation;
    private javax.swing.JButton btnTicket;
    private javax.swing.JButton btnUser;
    private javax.swing.JComboBox<String> cb_Destination;
    private javax.swing.JComboBox<String> cb_Discount;
    private javax.swing.JComboBox<String> cb_Origin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdateChooser;
    private javax.swing.JTabbedPane jtabCenter;
    private javax.swing.JLabel lblBaggage;
    private javax.swing.JList<String> listFare;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnl5;
    private javax.swing.JPanel pnl6;
    private javax.swing.JPanel pnlFareBody;
    private javax.swing.JPanel pnlHeaderName;
    private javax.swing.JPanel pnlRegistryBody;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JTable tableFare;
    private javax.swing.JTextField txtBaggageInput;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
