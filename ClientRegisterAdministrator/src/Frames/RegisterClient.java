package Frames;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegisterClient extends javax.swing.JFrame {

    public RegisterClient() {
        initComponents();
    }

    private void clearFields() {
        this.jTextField_ID_Client.setText("");
        this.jComboBox_Type_ID.setSelectedIndex(0);
        this.jTextField_Name.setText("");
        this.jTextField_LastName.setText("");
        this.jTextField_Address.setText("");
        this.jTextField_Phone.setText("");
        this.jComboBox_City.setSelectedIndex(0);
        this.jTextField_BirthDate.setText("");
        this.jTextField_DateAdmission.setText("");
    }

    private boolean validateField(String field) {
        return field.isEmpty();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Image1 = new javax.swing.JLabel();
        jLabel1_title = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        jLabel_subtitle = new javax.swing.JLabel();
        jLabel_ID_Client = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_ID_Type = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabel_LastName = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelCity = new javax.swing.JLabel();
        jLabelBirthdate = new javax.swing.JLabel();
        jLabelDateAdmission = new javax.swing.JLabel();
        jTextField_ID_Client = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_LastName = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();
        btn_AddClient = new javax.swing.JButton();
        jTextField_BirthDate = new javax.swing.JTextField();
        jTextField_DateAdmission = new javax.swing.JTextField();
        btn_DeleteClient = new javax.swing.JButton();
        jComboBox_Type_ID = new javax.swing.JComboBox<>();
        jComboBox_City = new javax.swing.JComboBox<>();
        btn_SearchClient = new javax.swing.JButton();
        jTextField_SearchClient = new javax.swing.JTextField();
        btn_Help = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Change = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de Registros de Clientes");
        setLocationByPlatform(true);
        setName("frameRegistroCliente"); // NOI18N

        Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/office.jpg"))); // NOI18N
        Image1.setText("jLabel1");

        jLabel1_title.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1_title.setText("¡Registre los Clientes!");
        jLabel1_title.setToolTipText("");
        jLabel1_title.setPreferredSize(new java.awt.Dimension(135, 16));

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee2.png"))); // NOI18N

        jLabel_subtitle.setText("Complete la informacion de sus clientes.");

        jLabel_ID_Client.setText("ID Cliente *");

        jLabel_ID_Type.setText("TIpo de identificación");

        jLabelName.setText("Nombre *");

        jLabel_LastName.setText("Apellidos *");

        jLabel_Address.setText("DIrección");

        jLabelPhone.setText("Telefono");

        jLabelCity.setText("Ciudad");

        jLabelBirthdate.setText("Fecha de Nacimiento");

        jLabelDateAdmission.setText("Fecha de Ingreso");

        tblClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "TIpo ID", "Nombres", "Apellidos", "Dirección", "Telefono", "Ciudad", "F.Nacimiento", "F.Ingreso"
            }
        ));
        jScrollPane1.setViewportView(tblClient);

        btn_AddClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnplus.png"))); // NOI18N
        btn_AddClient.setText("Agregar Cliente");
        btn_AddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddClientActionPerformed(evt);
            }
        });

        btn_DeleteClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btndelete.png"))); // NOI18N
        btn_DeleteClient.setText("Eliminar Cliente");
        btn_DeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteClientActionPerformed(evt);
            }
        });

        jComboBox_Type_ID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NACIONAL", "EXTRANJERO", "RESIDENTE", "PASAPORTE", "DIMEX" }));

        jComboBox_City.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartago", "San Jose", "Heredia", "Alajuela", "Limon", "Puntarenas", "Guanacaste" }));

        btn_SearchClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnuser.png"))); // NOI18N
        btn_SearchClient.setText("Buscar Cliente");
        btn_SearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchClientActionPerformed(evt);
            }
        });

        btn_Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnhelp.png"))); // NOI18N
        btn_Help.setText("AYUDA");
        btn_Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HelpActionPerformed(evt);
            }
        });

        btn_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnExit.png"))); // NOI18N
        btn_Exit.setText("Salir");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        btn_Change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnexchange.png"))); // NOI18N
        btn_Change.setText("Modificar");
        btn_Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_subtitle)
                                    .addComponent(jLabel1_title, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(137, 137, 137)
                                .addComponent(image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCity)
                                    .addComponent(jTextField_ID_Client)
                                    .addComponent(jTextField_LastName)
                                    .addComponent(jComboBox_City, 0, 193, Short.MAX_VALUE)
                                    .addComponent(jLabel_ID_Client)
                                    .addComponent(jLabel_LastName)
                                    .addComponent(btn_AddClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelBirthdate)
                                    .addComponent(jTextField_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(jLabel_Address)
                                    .addComponent(jLabel_ID_Type)
                                    .addComponent(btn_Change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_BirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(jComboBox_Type_ID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDateAdmission)
                                    .addComponent(jLabelPhone)
                                    .addComponent(jLabelName)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(jTextField_Phone)
                                    .addComponent(jTextField_DateAdmission)
                                    .addComponent(btn_DeleteClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTextField_SearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_SearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Help, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1_title, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel_subtitle))
                    .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelName)
                        .addComponent(jLabel_ID_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_ID_Client))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_Type_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ID_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPhone)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_LastName)
                        .addComponent(jLabel_Address)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCity)
                    .addComponent(jLabelBirthdate)
                    .addComponent(jLabelDateAdmission))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DateAdmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Change, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btn_DeleteClient, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_AddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_SearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SearchClient))
                    .addComponent(btn_Help, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btn_Exit)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddClientActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblClient.getModel();

        Object[] row = new Object[9];

        row[0] = this.jTextField_ID_Client.getText();
        row[1] = this.jComboBox_Type_ID.getSelectedItem().toString();
        row[2] = this.jTextField_Name.getText();
        row[3] = this.jTextField_LastName.getText();
        row[4] = this.jTextField_Address.getText();
        row[5] = this.jTextField_Phone.getText();
        row[6] = this.jComboBox_City.getSelectedItem().toString();
        row[7] = this.jTextField_BirthDate.getText();
        row[8] = this.jTextField_DateAdmission.getText();

        model.addRow(row);
        tblClient.setModel(model);
        clearFields();
    }//GEN-LAST:event_btn_AddClientActionPerformed

    private void btn_DeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteClientActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblClient.getModel();
        int index = tblClient.getSelectedRow();

        if (index < 0) {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una fila de la tabla");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Eliminar el registro? ");
            if (JOptionPane.OK_OPTION == confirm) {
                model.removeRow(index);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }//GEN-LAST:event_btn_DeleteClientActionPerformed

    private void btn_SearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchClientActionPerformed

        String nameClient = this.jTextField_SearchClient.getText();
        if (nameClient.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo esta vacio",
                    "Buscar Cliente", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Buscando informacion cliente "
                    + nameClient + " ...",
                    "Buscar Cliente", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_SearchClientActionPerformed

    private void btn_HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HelpActionPerformed
        JOptionPane.showMessageDialog(null, "¿ En que te puedo ayudar Usuario ?",
                "Ayuda", JOptionPane.INFORMATION_MESSAGE);
//        Help help = new Help();
//        help.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btn_HelpActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChangeActionPerformed
        int rowSelect = this.tblClient.getSelectedRow();
        if (rowSelect >= 0) {
            jTextField_ID_Client.setText(tblClient.getValueAt(rowSelect, 0).toString());

            jComboBox_Type_ID.setSelectedItem(tblClient.getValueAt(rowSelect, 1).toString());
            jTextField_Name.setText(tblClient.getValueAt(rowSelect, 2).toString());
            jTextField_LastName.setText(tblClient.getValueAt(rowSelect, 3).toString());
            jTextField_Address.setText(tblClient.getValueAt(rowSelect, 4).toString());
            jTextField_Phone.setText(tblClient.getValueAt(rowSelect, 5).toString());
            jComboBox_City.setSelectedItem(tblClient.getValueAt(rowSelect, 6).toString());
            jTextField_BirthDate.setText(tblClient.getValueAt(rowSelect, 7).toString());
            jTextField_DateAdmission.setText(tblClient.getValueAt(rowSelect, 8).toString());

            DefaultTableModel model = (DefaultTableModel) tblClient.getModel();

            model.removeRow(rowSelect);
        } else {
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
    }//GEN-LAST:event_btn_ChangeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image1;
    private javax.swing.JButton btn_AddClient;
    private javax.swing.JButton btn_Change;
    private javax.swing.JButton btn_DeleteClient;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Help;
    private javax.swing.JButton btn_SearchClient;
    private javax.swing.JLabel image2;
    private javax.swing.JComboBox<String> jComboBox_City;
    private javax.swing.JComboBox<String> jComboBox_Type_ID;
    private javax.swing.JLabel jLabel1_title;
    private javax.swing.JLabel jLabelBirthdate;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelDateAdmission;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_ID_Client;
    private javax.swing.JLabel jLabel_ID_Type;
    private javax.swing.JLabel jLabel_LastName;
    private javax.swing.JLabel jLabel_subtitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_BirthDate;
    private javax.swing.JTextField jTextField_DateAdmission;
    private javax.swing.JTextField jTextField_ID_Client;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_SearchClient;
    private javax.swing.JTable tblClient;
    // End of variables declaration//GEN-END:variables
}
