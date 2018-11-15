package doriancortestallergeneral;

import doriancortestallergeneral.DataStructures.List;
import doriancortestallergeneral.DataStructures.Queue;
import doriancortestallergeneral.Models.Client;
import doriancortestallergeneral.Models.TouristPackage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 * @author dcortes
 */
public class Menu extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menuTabs = new javax.swing.JTabbedPane();
        registerClientTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        registerClientTabs = new javax.swing.JTabbedPane();
        registerClientSelectPackageTab = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        registerClientTouristPackageSelect = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        registerClientNextButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        registerClientTourPackageDescriptionPane = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        registerClientSpacesToReserve = new javax.swing.JSpinner();
        registerClientInfoTab = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        registerClientNameField = new javax.swing.JTextField();
        registerClientLastNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registerClientRegisterButton = new javax.swing.JButton();
        registerClientPhoneField = new javax.swing.JFormattedTextField();
        packagesTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        packagesTable = new javax.swing.JTable();
        clientsTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        registerPackageTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        registerPackageNameField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        registerPackageDestinyField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        registerPackageDescriptionField = new javax.swing.JTextArea();
        registerPackageRegisterButton = new javax.swing.JButton();
        addPackageTab = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        addPackagePackageSelect = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        addPackageDescriptionPane = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        addPackageSpacesField = new javax.swing.JSpinner();
        addPackageAddButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        addPackageIdField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travel Agency");
        setResizable(false);

        menuTabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTabsMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Register Client");

        registerClientTabs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        registerClientSelectPackageTab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setText("Select a Tourist Package");

        registerClientTouristPackageSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerClientTouristPackageSelect.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                registerClientTouristPackageSelectPropertyChange(evt);
            }
        });

        jLabel10.setText("Spaces to reserve");

        registerClientNextButton.setText("Next");
        registerClientNextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerClientNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerClientNextButtonActionPerformed(evt);
            }
        });

        registerClientTourPackageDescriptionPane.setEnabled(false);
        jScrollPane1.setViewportView(registerClientTourPackageDescriptionPane);

        jLabel15.setText("Description");

        registerClientSpacesToReserve.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        javax.swing.GroupLayout registerClientSelectPackageTabLayout = new javax.swing.GroupLayout(registerClientSelectPackageTab);
        registerClientSelectPackageTab.setLayout(registerClientSelectPackageTabLayout);
        registerClientSelectPackageTabLayout.setHorizontalGroup(
            registerClientSelectPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerClientSelectPackageTabLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(registerClientSelectPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerClientNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerClientSelectPackageTabLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerClientSpacesToReserve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerClientTouristPackageSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(registerClientSelectPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        registerClientSelectPackageTabLayout.setVerticalGroup(
            registerClientSelectPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerClientSelectPackageTabLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(registerClientSelectPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerClientSelectPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerClientSelectPackageTabLayout.createSequentialGroup()
                        .addComponent(registerClientTouristPackageSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(registerClientSelectPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(registerClientSpacesToReserve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(registerClientNextButton)
                        .addGap(35, 35, 35))
                    .addGroup(registerClientSelectPackageTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        registerClientTabs.addTab("Select a Tourist Package", registerClientSelectPackageTab);

        registerClientInfoTab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registerClientInfoTab.setEnabled(false);

        jLabel6.setText("Name");

        jLabel7.setText("Last Name");

        jLabel8.setText("Phone");

        registerClientRegisterButton.setText("Register Client");
        registerClientRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerClientRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerClientRegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerClientInfoTabLayout = new javax.swing.GroupLayout(registerClientInfoTab);
        registerClientInfoTab.setLayout(registerClientInfoTabLayout);
        registerClientInfoTabLayout.setHorizontalGroup(
            registerClientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerClientInfoTabLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(registerClientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerClientPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerClientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(registerClientNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(registerClientLastNameField)
                        .addComponent(registerClientRegisterButton))
                    .addComponent(jLabel6))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        registerClientInfoTabLayout.setVerticalGroup(
            registerClientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerClientInfoTabLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerClientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerClientLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerClientPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(registerClientRegisterButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        registerClientTabs.addTab("Client Info", registerClientInfoTab);

        javax.swing.GroupLayout registerClientTabLayout = new javax.swing.GroupLayout(registerClientTab);
        registerClientTab.setLayout(registerClientTabLayout);
        registerClientTabLayout.setHorizontalGroup(
            registerClientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerClientTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(registerClientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerClientTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerClientTabLayout.setVerticalGroup(
            registerClientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerClientTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(registerClientTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTabs.addTab("Register Client", registerClientTab);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Tourist Packages");

        packagesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Destiny", "Description", "Reserved Spaces", "Available Busses", "Available Spaces"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        packagesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(packagesTable);
        if (packagesTable.getColumnModel().getColumnCount() > 0) {
            packagesTable.getColumnModel().getColumn(0).setResizable(false);
            packagesTable.getColumnModel().getColumn(1).setResizable(false);
            packagesTable.getColumnModel().getColumn(2).setResizable(false);
            packagesTable.getColumnModel().getColumn(3).setResizable(false);
            packagesTable.getColumnModel().getColumn(4).setResizable(false);
            packagesTable.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout packagesTabLayout = new javax.swing.GroupLayout(packagesTab);
        packagesTab.setLayout(packagesTabLayout);
        packagesTabLayout.setHorizontalGroup(
            packagesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagesTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(packagesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        packagesTabLayout.setVerticalGroup(
            packagesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagesTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        menuTabs.addTab("Tourist Packages", packagesTab);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Clients");

        clientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Last Name", "Phone", "Reserved Packages"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(clientsTable);
        if (clientsTable.getColumnModel().getColumnCount() > 0) {
            clientsTable.getColumnModel().getColumn(0).setResizable(false);
            clientsTable.getColumnModel().getColumn(1).setResizable(false);
            clientsTable.getColumnModel().getColumn(2).setResizable(false);
            clientsTable.getColumnModel().getColumn(3).setResizable(false);
            clientsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout clientsTabLayout = new javax.swing.GroupLayout(clientsTab);
        clientsTab.setLayout(clientsTabLayout);
        clientsTabLayout.setHorizontalGroup(
            clientsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(clientsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        clientsTabLayout.setVerticalGroup(
            clientsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        menuTabs.addTab("Clients", clientsTab);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Register Tourist Package");

        jLabel12.setText("Name");

        jLabel13.setText("Destiny");

        jLabel14.setText("Description");

        registerPackageDescriptionField.setColumns(20);
        registerPackageDescriptionField.setRows(5);
        jScrollPane2.setViewportView(registerPackageDescriptionField);

        registerPackageRegisterButton.setText("Register Tourist Package");
        registerPackageRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPackageRegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPackageTabLayout = new javax.swing.GroupLayout(registerPackageTab);
        registerPackageTab.setLayout(registerPackageTabLayout);
        registerPackageTabLayout.setHorizontalGroup(
            registerPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPackageTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(registerPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(registerPackageDestinyField)
                    .addComponent(registerPackageNameField)
                    .addComponent(registerPackageRegisterButton))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        registerPackageTabLayout.setVerticalGroup(
            registerPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPackageTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPackageNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPackageDestinyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(registerPackageRegisterButton)
                .addGap(44, 44, 44))
        );

        menuTabs.addTab("Register Tourist Package", registerPackageTab);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setText("Add Tourist Package to Client");

        addPackagePackageSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPackagePackageSelect.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                addPackagePackageSelectPropertyChange(evt);
            }
        });

        addPackageDescriptionPane.setEnabled(false);
        jScrollPane5.setViewportView(addPackageDescriptionPane);

        jLabel18.setText("Select a Tourist Package");

        jLabel19.setText("Description");

        jLabel20.setText("Spaces to reserve");

        addPackageSpacesField.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        addPackageAddButton.setText("Add Tourist Package");
        addPackageAddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPackageAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPackageAddButtonActionPerformed(evt);
            }
        });

        jLabel21.setText("Client ID");

        javax.swing.GroupLayout addPackageTabLayout = new javax.swing.GroupLayout(addPackageTab);
        addPackageTab.setLayout(addPackageTabLayout);
        addPackageTabLayout.setHorizontalGroup(
            addPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPackageTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(addPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPackageTabLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addPackageTabLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addPackageTabLayout.createSequentialGroup()
                        .addGroup(addPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addPackageIdField)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addPackageTabLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addPackageSpacesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addPackagePackageSelect, 0, 267, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPackageAddButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(addPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        addPackageTabLayout.setVerticalGroup(
            addPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPackageTabLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel17)
                .addGap(39, 39, 39)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(addPackageIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(addPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPackageTabLayout.createSequentialGroup()
                        .addComponent(addPackagePackageSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(addPackageTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(addPackageSpacesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPackageAddButton))
                    .addGroup(addPackageTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        menuTabs.addTab("Add Tourist Package to Client", addPackageTab);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("Travel Agency");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTabs)
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(menuTabs, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuTabsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTabsMouseClicked
        updateTouristsPackagesTable();
        updateClientsTable();
        resetClientForm();
    }//GEN-LAST:event_menuTabsMouseClicked

    private void registerPackageRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPackageRegisterButtonActionPerformed
        registerTouristPackage();
    }//GEN-LAST:event_registerPackageRegisterButtonActionPerformed

    private void registerClientNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerClientNextButtonActionPerformed
        registerClientNext();
    }//GEN-LAST:event_registerClientNextButtonActionPerformed

    private void registerClientTouristPackageSelectPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_registerClientTouristPackageSelectPropertyChange
        if (touristPackages != null && touristPackages.length() > 0 && registerClientTouristPackageSelect.getSelectedIndex() >= 0) {
            TouristPackage tp = (TouristPackage) touristPackages.get(registerClientTouristPackageSelect.getSelectedIndex());
            registerClientTourPackageDescriptionPane.setText(tp.getDescription());
        }
    }//GEN-LAST:event_registerClientTouristPackageSelectPropertyChange

    private void addPackagePackageSelectPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_addPackagePackageSelectPropertyChange
        if (touristPackages != null && touristPackages.length() > 0 && registerClientTouristPackageSelect.getSelectedIndex() >= 0) {
            TouristPackage tp = (TouristPackage) touristPackages.get(registerClientTouristPackageSelect.getSelectedIndex());
            addPackageDescriptionPane.setText(tp.getDescription());
        }
    }//GEN-LAST:event_addPackagePackageSelectPropertyChange

    private void registerClientRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerClientRegisterButtonActionPerformed
        registerClient();
    }//GEN-LAST:event_registerClientRegisterButtonActionPerformed

    private void addPackageAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPackageAddButtonActionPerformed
        addTouristPackagesToClient();
    }//GEN-LAST:event_addPackageAddButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPackageAddButton;
    private javax.swing.JTextPane addPackageDescriptionPane;
    private javax.swing.JTextField addPackageIdField;
    private javax.swing.JComboBox<String> addPackagePackageSelect;
    private javax.swing.JSpinner addPackageSpacesField;
    private javax.swing.JPanel addPackageTab;
    private javax.swing.JPanel clientsTab;
    private javax.swing.JTable clientsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane menuTabs;
    private javax.swing.JPanel packagesTab;
    private javax.swing.JTable packagesTable;
    private javax.swing.JPanel registerClientInfoTab;
    private javax.swing.JTextField registerClientLastNameField;
    private javax.swing.JTextField registerClientNameField;
    private javax.swing.JButton registerClientNextButton;
    private javax.swing.JFormattedTextField registerClientPhoneField;
    private javax.swing.JButton registerClientRegisterButton;
    private javax.swing.JPanel registerClientSelectPackageTab;
    private javax.swing.JSpinner registerClientSpacesToReserve;
    private javax.swing.JPanel registerClientTab;
    private javax.swing.JTabbedPane registerClientTabs;
    private javax.swing.JTextPane registerClientTourPackageDescriptionPane;
    private javax.swing.JComboBox<String> registerClientTouristPackageSelect;
    private javax.swing.JTextArea registerPackageDescriptionField;
    private javax.swing.JTextField registerPackageDestinyField;
    private javax.swing.JTextField registerPackageNameField;
    private javax.swing.JButton registerPackageRegisterButton;
    private javax.swing.JPanel registerPackageTab;
    // End of variables declaration//GEN-END:variables

    private final List clients;
    private final List touristPackages;

    /**
     * Creates new form Menu
     */
    public Menu() {
        clients = new List(Client.class);        
        touristPackages = new List(TouristPackage.class, 5);

        TouristPackage tp1 = new TouristPackage("Volcan Miravalles", "Guanacaste", "Una zona muy bonita de Costa Rica, conozca los paisajes  de la zona norte de nuestro pais.");
        TouristPackage tp2 = new TouristPackage("Volcan Arenal", "Alajuela", "Conozca la fortuna de San Carlos, aguas termales y el volcan");
        TouristPackage tp3 = new TouristPackage("Volcan Irazu", "Cartago", "Un hermoso volcan, se hara parada tambien un bosque muy bonito");
        touristPackages.add(tp1);
        touristPackages.add(tp2);
        touristPackages.add(tp3);

        Client c1 = new Client("Mario", "Salas", "6666 6666");
        Client c2 = new Client("Natalia", "Morales", "7777 7777");
        Client c3 = new Client("Carlos", "Aguilar", "8888 8888");

        tp1.reserve(c1, 4);
        tp2.reserve(c2, 2);
        tp3.reserve(c3, 5);

        clients.add(c1);
        clients.add(c2);
        clients.add(c3);

        setWindowsTheme();
        initComponents();
        updateTouristsPackagesTable();
        updateClientsTable();
        registerClientTabs.setEnabledAt(1, false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    /**
     * Sets Windows theme
     */
    private void setWindowsTheme() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
    }

    /**
     * Resets Tourist Package Form
     */
    private void resetTouristPackageForm() {
        registerPackageNameField.setText("");
        registerPackageDestinyField.setText("");
        registerPackageDescriptionField.setText("");
    }

    /**
     * Registers a Tourist Package
     */
    private void registerTouristPackage() {

        String packageName = registerPackageNameField.getText();
        String packageDestiny = registerPackageDestinyField.getText();
        String packageDescription = registerPackageDescriptionField.getText();

        if (packageName.isEmpty() || packageDestiny.isEmpty() || packageDescription.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields");
            return;
        }

        TouristPackage tPackage = new TouristPackage(packageName, packageDestiny, packageDescription);
        TouristPackage lost = null;

        if (touristPackages.getAvailableSpace() == 0) {
            TouristPackage less = (TouristPackage) touristPackages.get(0);
            if (touristPackages.length() > 1) {
                for (int i = 1; i < touristPackages.length(); i++) {
                    TouristPackage ctp = (TouristPackage) touristPackages.get(i);
                    if (ctp.getReservedSpaces() < less.getReservedSpaces()) {
                        less = ctp;
                    }
                }
            }

            touristPackages.remove(less);

            for (int i = 0; i < less.getRegisteredClients().length(); i++) {
                Client client = (Client) less.getRegisteredClients().get(i);
                client.getTouristPackagesReserved().remove(less);
            }

            lost = less;
        }

        touristPackages.add(tPackage);
        resetTouristPackageForm();
        JOptionPane.showMessageDialog(this, "Tourist Package added successfully!");

        if (lost != null) {
            JOptionPane.showMessageDialog(this, lost.getName() + " deleted " + lost.getReservedSpaces() + " lost");
        }
    }

    /**
     * Updates Tourists Packages Table
     */
    private void updateTouristsPackagesTable() {
        DefaultTableModel tableModel = (DefaultTableModel) packagesTable.getModel();
        tableModel.setRowCount(0);
        String[] packageNames = new String[touristPackages.length()];
        for (int i = 0; i < touristPackages.length(); i++) {
            TouristPackage tp = (TouristPackage) touristPackages.get(i);
            tableModel.addRow(new Object[]{tp.getName(), tp.getDestiny(), tp.getDescription(), tp.getReservedSpaces(), tp.getAvailableBusses().length(), tp.getAvailableSpaces()});
            packageNames[i] = tp.getName();
        }
        DefaultComboBoxModel selectModel = new DefaultComboBoxModel(packageNames);
        registerClientTouristPackageSelect.setModel(selectModel);
        addPackagePackageSelect.setModel(selectModel);
    }

    /**
     * Resets Client form
     */
    private void resetClientForm() {
        registerClientNameField.setText("");
        registerClientLastNameField.setText("");
        registerClientPhoneField.setText("");
        registerClientSpacesToReserve.setValue(1);
        registerClientTabs.setEnabledAt(0, true);
        registerClientTabs.setSelectedIndex(0);
        registerClientTabs.setEnabledAt(1, false);
    }

    /**
     * Handles Register Client Select Tourist Package Section
     */
    private void registerClientNext() {
        TouristPackage tp = (TouristPackage) touristPackages.get(registerClientTouristPackageSelect.getSelectedIndex());
        int spaces = (int) registerClientSpacesToReserve.getValue();
        if (spaces < 1 || spaces > 5 || registerClientTouristPackageSelect.getSelectedItem() == null || registerClientTouristPackageSelect.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sorry there aren't Tourist Packages available");
            return;
        } else if (!tp.isAvailable(spaces)) {
            JOptionPane.showMessageDialog(this, "Sorry there isn't enough space in this Tourist Package to fulfill your space request");
            return;
        }
        registerClientTabs.setEnabledAt(1, true);
        registerClientTabs.setSelectedIndex(1);
        registerClientTabs.setEnabledAt(0, false);
    }

    /**
     * Reserves a tourist package
     *
     * @param touristPackage Tourist Package
     * @param client Client
     * @param spaces Spaces
     */
    private void reserveTouristPackage(TouristPackage touristPackage, Client client, int spaces) {

        if (!touristPackage.isAvailable(spaces)) {
            JOptionPane.showMessageDialog(this, "Sorry there isn't enough space in this Tourist Package to fulfill your space request");
            return;
        }

        int availableBussesBeforeReservation = touristPackage.getAvailableBusses().length();
        touristPackage.reserve(client, spaces);
        JOptionPane.showMessageDialog(this, "Spaces reserved successfully");

        if (touristPackage.getAvailableBusses().length() < availableBussesBeforeReservation) {
            Queue fullBus = (Queue) touristPackage.getFullBusses().peek();
            List pClients = new List(Client.class);
            List counts = new List(Integer.class);

            for (int i = 0; i < touristPackage.getRegisteredClients().length(); i++) {
                Client registeredClient = (Client) touristPackage.getRegisteredClients().get(i);

                if (fullBus.contains(registeredClient) && !pClients.contains(registeredClient)) {
                    pClients.add(registeredClient);
                    counts.add(fullBus.count(registeredClient));
                }
            }

            String bussInfo = "";

            for (int i = 0; i < pClients.length(); i++) {
                Client c = (Client) pClients.get(i);
                bussInfo += "x" + ((int) counts.get(i)) + " " + c.getName() + " " + c.getLastName() + "\n";
            }
            JOptionPane.showMessageDialog(this, "Buss with destiny to " + touristPackage.getDestiny() + " is full!\nHere is the info about the passengers:\n" + bussInfo);
        }

    }

    /**
     * Registers a Client
     */
    private void registerClient() {
        String name = registerClientNameField.getText();
        String lastName = registerClientLastNameField.getText();
        String phone = registerClientPhoneField.getText();

        if (name.isEmpty() || lastName.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields");
            return;
        }

        Client client = new Client(name, lastName, phone);
        int spaces = (int) registerClientSpacesToReserve.getValue();
        TouristPackage tp = (TouristPackage) touristPackages.get(registerClientTouristPackageSelect.getSelectedIndex());
        clients.add(client);
        JOptionPane.showMessageDialog(this, "Client added successfully!");
        reserveTouristPackage(tp, client, spaces);

        resetClientForm();
    }

    /**
     * Updates Clients table
     */
    private void updateClientsTable() {
        DefaultTableModel tableModel = (DefaultTableModel) clientsTable.getModel();
        tableModel.setRowCount(0);
        for (int i = 0; i < clients.length(); i++) {
            Client c = (Client) clients.get(i);
            tableModel.addRow(new Object[]{i, c.getName(), c.getLastName(), c.getPhone(), c.getTouristPackagesReserved().length()});
        }
    }

    /**
     * Resets the Add Tourist Package to a Client form
     */
    private void resetAddTouristPackageToClientForm() {
        addPackageIdField.setText("");
        addPackagePackageSelect.setSelectedIndex(0);
        addPackageSpacesField.setValue(1);
    }

    /**
     * Adds Tourist Packages to a Client
     */
    private void addTouristPackagesToClient() {
        int id = -1;

        try {
            if (addPackageIdField.getText().isEmpty()) {
                throw new Exception();
            }
            id = Integer.parseInt(addPackageIdField.getText());
            if (id < 0 || id > clients.length()) {
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Client ID");
            return;
        }

        Client client = (Client) clients.get(id);
        TouristPackage tp = (TouristPackage) touristPackages.get(addPackagePackageSelect.getSelectedIndex());
        int spaces = (int) addPackageSpacesField.getValue();

        if (tp.getRegisteredClients().contains(client)) {
            JOptionPane.showMessageDialog(this, "This client has already reserved spaces for this Tourist Package");
        } else if (tp.getAvailableSpaces() < spaces) {
            JOptionPane.showMessageDialog(this, "Sorry there isn't enough space in this Tourist Package to fulfill your space request");
        } else {
            reserveTouristPackage(tp, client, spaces);            
            resetAddTouristPackageToClientForm();            
        }
    }

}
