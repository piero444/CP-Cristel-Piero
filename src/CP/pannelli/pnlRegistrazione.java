
package CP.pannelli;

import CP.Listener;

public class pnlRegistrazione extends javax.swing.JPanel {

    private String nome;
    private String cognome;
    private int eta;
    private String password;

    // DICHIARO  E PREPARO IL METODO PER PRENDERE L'ASCOLTATORE
    private Listener listener;
    
    public void setListener(Listener listener) {
        this.listener = listener;
    }
    public pnlRegistrazione() {
        initComponents();
        btnAvanti.setActionCommand("Avanti");
        Nome.putClientProperty("JTextField.placeholderText", "Esempio: Mario");
        Cognome.putClientProperty("JTextField.placeholderText", "Esempio: Rossi");
    }

     //  METDODI GET PER L'ASCOLTATORE
    public String getNome() {
        return Nome.getText();
    }
    public String getCognome() {
        return Cognome.getText();
    }
    public String getPassword() {
        return new String(PW.getPassword());
    }
    public boolean maschioIsSelected()
    {
        return rdbMaschio.isSelected();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pnlNome = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        Nome = new javax.swing.JTextField();
        pnlCognome = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        Cognome = new javax.swing.JTextField();
        pnlSesso = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rdbMaschio = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        pnlPassword = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        PW = new javax.swing.JPasswordField();
        btnAvanti = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        jButton1.setBackground(new java.awt.Color(15, 76, 156));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("conferma registrazione");
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(950, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(950, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(950, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(92, 209, 255));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        jPanel2.setBackground(new java.awt.Color(191, 230, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 60, 30, 50));
        jPanel2.setMaximumSize(new java.awt.Dimension(650, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 700));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel4.setBackground(new java.awt.Color(191, 230, 249));
        jPanel4.setToolTipText("");
        jPanel4.setMaximumSize(new java.awt.Dimension(550, 650));
        jPanel4.setMinimumSize(new java.awt.Dimension(550, 650));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(550, 650));

        pnlNome.setMaximumSize(new java.awt.Dimension(415, 130));
        pnlNome.setMinimumSize(new java.awt.Dimension(415, 130));
        pnlNome.setOpaque(false);
        pnlNome.setPreferredSize(new java.awt.Dimension(415, 130));
        pnlNome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        jPanel12.setBackground(new java.awt.Color(15, 76, 156));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setForeground(new java.awt.Color(190, 216, 212));
        jPanel12.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel12.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel12.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jLabel7.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inserisci il tuo nome");
        jLabel7.setMaximumSize(new java.awt.Dimension(110, 46));
        jLabel7.setMinimumSize(new java.awt.Dimension(110, 46));
        jPanel12.add(jLabel7);

        pnlNome.add(jPanel12);

        jPanel17.setBackground(new java.awt.Color(15, 76, 156));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setForeground(new java.awt.Color(190, 216, 212));
        jPanel17.setToolTipText("Inserisci il tuo cognome");
        jPanel17.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel17.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel17.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        Nome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nome.setMargin(new java.awt.Insets(2, 10, 2, 10));
        Nome.setMaximumSize(new java.awt.Dimension(300, 30));
        Nome.setMinimumSize(new java.awt.Dimension(300, 30));
        Nome.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel17.add(Nome);

        pnlNome.add(jPanel17);

        jPanel4.add(pnlNome);

        pnlCognome.setBackground(new java.awt.Color(191, 230, 249));
        pnlCognome.setMaximumSize(new java.awt.Dimension(415, 130));
        pnlCognome.setMinimumSize(new java.awt.Dimension(415, 130));
        pnlCognome.setPreferredSize(new java.awt.Dimension(415, 130));

        jPanel19.setBackground(new java.awt.Color(15, 76, 156));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setForeground(new java.awt.Color(190, 216, 212));
        jPanel19.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel19.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel19.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jLabel13.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Inserisci il tuo cognome");
        jLabel13.setMaximumSize(new java.awt.Dimension(110, 46));
        jLabel13.setMinimumSize(new java.awt.Dimension(110, 46));
        jPanel19.add(jLabel13);

        pnlCognome.add(jPanel19);

        jPanel21.setBackground(new java.awt.Color(15, 76, 156));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setForeground(new java.awt.Color(190, 216, 212));
        jPanel21.setToolTipText("Inserisci il tuo cognome");
        jPanel21.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel21.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel21.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        Cognome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Cognome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cognome.setMargin(new java.awt.Insets(2, 10, 2, 10));
        Cognome.setMaximumSize(new java.awt.Dimension(300, 30));
        Cognome.setMinimumSize(new java.awt.Dimension(300, 30));
        Cognome.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel21.add(Cognome);

        pnlCognome.add(jPanel21);

        jPanel4.add(pnlCognome);

        pnlSesso.setBackground(new java.awt.Color(191, 230, 249));
        pnlSesso.setMaximumSize(new java.awt.Dimension(415, 130));
        pnlSesso.setMinimumSize(new java.awt.Dimension(415, 130));
        pnlSesso.setPreferredSize(new java.awt.Dimension(415, 130));

        jPanel20.setBackground(new java.awt.Color(15, 76, 156));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setForeground(new java.awt.Color(190, 216, 212));
        jPanel20.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel20.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel20.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jLabel14.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seleziona il tuo sesso");
        jLabel14.setMaximumSize(new java.awt.Dimension(110, 46));
        jLabel14.setMinimumSize(new java.awt.Dimension(110, 46));
        jPanel20.add(jLabel14);

        pnlSesso.add(jPanel20);

        jPanel22.setBackground(new java.awt.Color(15, 76, 156));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setForeground(new java.awt.Color(190, 216, 212));
        jPanel22.setToolTipText("Inserisci il tuo cognome");
        jPanel22.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel22.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel22.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        buttonGroup1.add(rdbMaschio);
        rdbMaschio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdbMaschio.setForeground(new java.awt.Color(255, 255, 255));
        rdbMaschio.setText("Maschio");
        jPanel1.add(rdbMaschio);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Femmina");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);

        jPanel22.add(jPanel1);

        pnlSesso.add(jPanel22);

        jPanel4.add(pnlSesso);

        pnlPassword.setBackground(new java.awt.Color(191, 230, 249));
        pnlPassword.setMaximumSize(new java.awt.Dimension(415, 130));
        pnlPassword.setMinimumSize(new java.awt.Dimension(415, 130));
        pnlPassword.setPreferredSize(new java.awt.Dimension(415, 130));

        jPanel23.setBackground(new java.awt.Color(15, 76, 156));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel23.setForeground(new java.awt.Color(190, 216, 212));
        jPanel23.setMaximumSize(new java.awt.Dimension(410, 50));
        jPanel23.setMinimumSize(new java.awt.Dimension(410, 50));
        jPanel23.setPreferredSize(new java.awt.Dimension(400, 60));

        jLabel15.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html>Digita la tua password (min 4 max 8) <br> obbligatorio un carattere maiuscolo e un numero<html>");
        jLabel15.setMaximumSize(new java.awt.Dimension(110, 46));
        jLabel15.setMinimumSize(new java.awt.Dimension(110, 46));
        jPanel23.add(jLabel15);

        pnlPassword.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(15, 76, 156));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel24.setForeground(new java.awt.Color(190, 216, 212));
        jPanel24.setMaximumSize(new java.awt.Dimension(400, 50));
        jPanel24.setMinimumSize(new java.awt.Dimension(400, 50));
        jPanel24.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        PW.setMargin(new java.awt.Insets(2, 10, 2, 10));
        PW.setMaximumSize(new java.awt.Dimension(300, 30));
        PW.setMinimumSize(new java.awt.Dimension(300, 30));
        PW.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel24.add(PW);

        pnlPassword.add(jPanel24);

        jPanel4.add(pnlPassword);

        btnAvanti.setBackground(new java.awt.Color(32, 129, 195));
        btnAvanti.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        btnAvanti.setForeground(new java.awt.Color(255, 255, 255));
        btnAvanti.setText("Procedi");
        btnAvanti.setActionCommand("Avanti");
        btnAvanti.setBorderPainted(false);
        btnAvanti.setMaximumSize(new java.awt.Dimension(400, 50));
        btnAvanti.setMinimumSize(new java.awt.Dimension(400, 50));
        btnAvanti.setPreferredSize(new java.awt.Dimension(400, 50));
        btnAvanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvantiActionPerformed(evt);
            }
        });
        jPanel4.add(btnAvanti);

        jPanel2.add(jPanel4);

        add(jPanel2);
        add(filler1);
        add(filler2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnAvantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvantiActionPerformed
        // AVANTI
      //   PASSO IL CONTROLLO DEL EVENTO ALLA CLASSE ASCOLTATORE
      listener.actionPerformed(evt);
    }//GEN-LAST:event_btnAvantiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cognome;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField PW;
    private javax.swing.JButton btnAvanti;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel pnlCognome;
    private javax.swing.JPanel pnlNome;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPanel pnlSesso;
    private javax.swing.JRadioButton rdbMaschio;
    // End of variables declaration//GEN-END:variables
}
