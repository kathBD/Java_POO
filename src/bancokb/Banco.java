package bancokb;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Banco extends javax.swing.JFrame {

    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<String> listaTipoCuenta = new ArrayList<String>();
    DefaultTableModel modelMovs = new DefaultTableModel();
    Cliente cliente;
    Cuenta cuenta;

    public Banco() {
        initComponents();
        this.setTitle("Banco KB");
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/bancobk.png"));
        this.setIconImage(img);
        lblogo.setIcon(new ImageIcon(img.getScaledInstance(lblogo.getWidth(), lblogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
        modelMovs.addColumn("CUENTA");
        modelMovs.addColumn("FECHA");
        modelMovs.addColumn("TIPO");
        modelMovs.addColumn("MONTO");
        tblMovimientos.setModel(modelMovs);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarCliente1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboCuentaCliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboTipoCuenta = new javax.swing.JComboBox<>();
        btnAgregarTCTA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMontoAgregar = new javax.swing.JTextField();
        btnAgregarCuenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cboClienteConsulta = new javax.swing.JComboBox<>();
        cboConsultaTcta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboTipoMovimiento = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtMontoMovimiento = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btnAgregarMoviento = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbltelef = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        lblSaldo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bancobk.png"))); // NOI18N
        lblogo.setText("Lo");
        getContentPane().add(lblogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 150, 170));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Teléfono:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel1.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 170, 30));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, 30));
        jPanel1.add(txtEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 170, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        btnAgregarCliente1.setBackground(new java.awt.Color(255, 204, 0));
        btnAgregarCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregarCliente1.setText("Agregar Cliente");
        btnAgregarCliente1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCliente1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 290, 230));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        cboCuentaCliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(cboCuentaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de Cuenta:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        cboTipoCuenta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.add(cboTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, 30));

        btnAgregarTCTA.setText("+");
        btnAgregarTCTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTCTAActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarTCTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 73, -1, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Monto:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel2.add(txtMontoAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, 30));

        btnAgregarCuenta.setBackground(new java.awt.Color(255, 204, 0));
        btnAgregarCuenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregarCuenta.setText("Agregar Cuenta");
        btnAgregarCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 320, 240));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboClienteConsulta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cboClienteConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClienteConsultaActionPerformed(evt);
            }
        });
        jPanel3.add(cboClienteConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, 30));

        cboConsultaTcta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cboConsultaTcta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaTctaActionPerformed(evt);
            }
        });
        jPanel3.add(cboConsultaTcta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 140, 30));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Tipo de Cuenta:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Tipo de Movimeinto:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        cboTipoMovimiento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cboTipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEPOSITO", "RETIRO" }));
        jPanel3.add(cboTipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 140, 30));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Monto:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));
        jPanel3.add(txtMontoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 120, 30));

        jButton4.setText("Agregar Cuenta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        btnAgregarMoviento.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarMoviento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregarMoviento.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMoviento.setText("Agregar Movimiento");
        btnAgregarMoviento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarMoviento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMovientoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarMoviento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Cliente:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 840, 160));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Nombre:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblNombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, 20));

        jLabel13.setText("Teléfono:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lbltelef.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel4.add(lbltelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 20));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel4.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, 20));

        jLabel16.setText("Email:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel17.setText("Tipo de cta:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lbltipo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel4.add(lbltipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 110, 20));

        jLabel19.setText("Monto:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblMonto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel4.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 230, 200));

        tblMovimientos.setBackground(new java.awt.Color(204, 153, 0));
        tblMovimientos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMovimientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 530, 190));

        lblSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(51, 153, 255));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("$10,000.00 Co");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 710, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 255));
        jLabel14.setText("SALDO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 710, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
       cliente=listaClientes.get(cboCuentaCliente.getSelectedIndex());
        Cuenta cuenta = new Cuenta();
        cuenta.setTipoCuenta(listaTipoCuenta.get(cboTipoCuenta.getSelectedIndex()));
        cuenta.setMontoInicial(Double.parseDouble(txtMontoAgregar.getText()));
        cliente.addCuenta(cuenta);
        
        Movimiento m = new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/mm/yyyy").format(new Date()));
        m.setTipoMovimiento("APERTURA");
        m.setMonto(Double.parseDouble(txtMontoAgregar.getText()));
        cuenta.addMovimiento(m);
        borrarFormCuenta();
        refrescarBoxCuentas();
        verMovimientos();
        
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed
       
     public void refrescarBoxCuentas(){
         cliente=listaClientes.get(cboClienteConsulta.getSelectedIndex());
         int i =0;
         ArrayList<String>cuentas = new ArrayList<String>();
         for (Cuenta c : cliente.getMiscuentas()){
             cuentas.add(c.getTipoCuenta());
         }
         cboClienteConsulta.setModel(new DefaultComboBoxModel(cuentas.toArray()));
     }
    public void borrarFormCuenta(){
           cboCuentaCliente.setSelectedIndex(0);
           cboTipoCuenta.setSelectedIndex(0);
           txtMontoAgregar.setText(" ");
       }
    private void btnAgregarMovientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMovientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMovientoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAgregarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliente1ActionPerformed
        Cliente c = new Cliente();
        c.setNombre(txtNombreCliente.getText());
        c.setTelefono(txtTelefonoCliente.getText());
        c.setEmail(txtEmailCliente.getText());
        listaClientes.add(c);
        borrarFormCliente();
        llenarBoxClientes();
    }//GEN-LAST:event_btnAgregarCliente1ActionPerformed

    private void btnAgregarTCTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTCTAActionPerformed
        String tipoCuenta = JOptionPane.showInputDialog(this, "TIPO CUENTA");
        listaTipoCuenta.add(tipoCuenta);
        llenarBoxTipoCuenta();
        
    }//GEN-LAST:event_btnAgregarTCTAActionPerformed

    private void cboConsultaTctaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaTctaActionPerformed
             // TODO add your handling code here:
    }//GEN-LAST:event_cboConsultaTctaActionPerformed

    private void cboClienteConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteConsultaActionPerformed
       
        refrescarBoxCuentas();    
         verMovimientos();
        verDatos();
    }//GEN-LAST:event_cboClienteConsultaActionPerformed
      public String aMoneda(double cantidad){
          cantidad = Math.round(cantidad*100.0)/100.0;
          DecimalFormat formato=new DecimalFormat("$ #, ###.##  Pesos");
          return formato.format(cantidad);
      }
      
    public void verDatos(){  //impremir datos
        cliente=listaClientes.get(cboClienteConsulta.getSelectedIndex());
        lblNombre.setText(cliente.getNombre());
        lbltelef.setText(cliente.getTelefono());
        lblEmail.setText(cliente.getEmail());
        
        if(!cliente.getMiscuentas().isEmpty()){
            cuenta=cliente.getMiscuentas().get(cboConsultaTcta.getSelectedIndex());
            lbltipo.setText(cuenta.getTipoCuenta());
            lblMonto.setText(aMoneda(cuenta.getMontoInicial()));
        }else{
             lbltipo.setText("Sin cuenta");
             lblMonto.setText("Sin Cuenta");
        }
        
    }
     
    public void verMovimientos(){ //llenar tabla
        
    }
    public void llenarBoxTipoCuenta() {
        Object tipos[] = new Object[listaTipoCuenta.size()];
        int i = 0;
        for (String tipo : listaTipoCuenta) {
            tipos[i] = tipo;
            i++;

        }
        cboTipoCuenta.setModel(new DefaultComboBoxModel(tipos));
       

    }
    public void llenarBoxClientes() {

        Object clientes[] = new Object[listaClientes.size()];
        int i = 0;
        for (Cliente c : listaClientes) {
            clientes[i] = c.getNombre();
            i++;

        }
        cboCuentaCliente.setModel(new DefaultComboBoxModel(clientes));
        cboClienteConsulta.setModel(new DefaultComboBoxModel(clientes));
    }

    public void borrarFormCliente() {
        txtNombreCliente.setText(" ");
        txtTelefonoCliente.setText(" ");
        txtEmailCliente.setText(" ");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente1;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnAgregarMoviento;
    private javax.swing.JButton btnAgregarTCTA;
    private javax.swing.JComboBox<String> cboClienteConsulta;
    private javax.swing.JComboBox<String> cboConsultaTcta;
    private javax.swing.JComboBox<String> cboCuentaCliente;
    private javax.swing.JComboBox<String> cboTipoCuenta;
    private javax.swing.JComboBox<String> cboTipoMovimiento;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblogo;
    private javax.swing.JLabel lbltelef;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JTable tblMovimientos;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtMontoAgregar;
    private javax.swing.JTextField txtMontoMovimiento;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables

}
