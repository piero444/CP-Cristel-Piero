package CP.pannelli;

import CP.Listener;

public class pnlSchermata1 extends javax.swing.JPanel {

    //private java.awt.Image logo;
    
    private String nome;
    private String cognome;
    private int eta;
    private String password;
    
    // DICHIARO  E PRENDO DAL COSTRUTTORE LA CLASSE ASCOLTATORE
    private Listener listener;
    
    public void setListener(Listener listener) {
        this.listener = listener;
    }
    
     //  METDODI GET PER L'ASCOLTATORE
    public String getNome() {
        return Nome.getText();
    }
    
    public String getCognome() {
        return Cognome.getText();
    }
    
    public String getPassword() {
        return new String(Password.getPassword());
    }
    
    
    public pnlSchermata1() {
        initComponents();
        
        btnRegistrati.setActionCommand("Registrazione");
        btnAccedi.setActionCommand("Accedi");
        Nome.putClientProperty("JTextField.placeholderText", "Esempio: Mario");
        Cognome.putClientProperty("JTextField.placeholderText", "Esempio: Rossi");
        //this.logo = new javax.swing.ImageIcon(getClass().getResource("/data/Logo (2).png")).getImage();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cognome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        btnAccedi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrati = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        jPanel3.setBackground(new java.awt.Color(92, 209, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(840, 450));
        jPanel3.setMinimumSize(new java.awt.Dimension(840, 450));
        jPanel3.setPreferredSize(new java.awt.Dimension(840, 450));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jLabel6.setBackground(new java.awt.Color(247, 249, 249));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/Logo2.png"))); // NOI18N
        jLabel6.setText("jLabel5");
        jLabel6.setMaximumSize(new java.awt.Dimension(425, 415));
        jLabel6.setMinimumSize(new java.awt.Dimension(425, 415));
        jLabel6.setPreferredSize(new java.awt.Dimension(425, 415));
        jPanel3.add(jLabel6);

        jPanel4.setBackground(new java.awt.Color(92, 209, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(350, 415));
        jPanel4.setMinimumSize(new java.awt.Dimension(350, 415));
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 415));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 16));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jLabel1.setText("Nome");
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.add(jLabel1);

        Nome.setBackground(new java.awt.Color(247, 249, 249));
        Nome.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Nome.setMaximumSize(new java.awt.Dimension(300, 50));
        Nome.setMinimumSize(new java.awt.Dimension(300, 50));
        Nome.setPreferredSize(new java.awt.Dimension(300, 50));
        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });
        jPanel4.add(Nome);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jLabel2.setText("Cognome");
        jLabel2.setMaximumSize(new java.awt.Dimension(300, 50));
        jLabel2.setMinimumSize(new java.awt.Dimension(300, 50));
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.add(jLabel2);

        Cognome.setBackground(new java.awt.Color(247, 249, 249));
        Cognome.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        Cognome.setMaximumSize(new java.awt.Dimension(300, 50));
        Cognome.setMinimumSize(new java.awt.Dimension(300, 50));
        Cognome.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.add(Cognome);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jLabel3.setText("Password");
        jLabel3.setMaximumSize(new java.awt.Dimension(300, 50));
        jLabel3.setMinimumSize(new java.awt.Dimension(300, 50));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.add(jLabel3);

        Password.setBackground(new java.awt.Color(247, 249, 249));
        Password.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        Password.setMaximumSize(new java.awt.Dimension(300, 50));
        Password.setMinimumSize(new java.awt.Dimension(300, 50));
        Password.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.add(Password);

        jPanel3.add(jPanel4);

        add(jPanel3);

        jPanel7.setBackground(new java.awt.Color(92, 209, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(840, 220));
        jPanel7.setMinimumSize(new java.awt.Dimension(840, 220));
        jPanel7.setPreferredSize(new java.awt.Dimension(840, 220));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        btnAccedi.setBackground(new java.awt.Color(32, 129, 195));
        btnAccedi.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        btnAccedi.setForeground(new java.awt.Color(247, 249, 249));
        btnAccedi.setText("Accedi");
        btnAccedi.setBorderPainted(false);
        btnAccedi.setMaximumSize(new java.awt.Dimension(600, 50));
        btnAccedi.setMinimumSize(new java.awt.Dimension(600, 50));
        btnAccedi.setPreferredSize(new java.awt.Dimension(600, 50));
        btnAccedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccediActionPerformed(evt);
            }
        });
        jPanel7.add(btnAccedi);

        jLabel4.setBackground(new java.awt.Color(247, 249, 249));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Non hai un account?  Registrati");
        jLabel4.setToolTipText("");
        jLabel4.setMaximumSize(new java.awt.Dimension(600, 33));
        jLabel4.setMinimumSize(new java.awt.Dimension(600, 33));
        jLabel4.setPreferredSize(new java.awt.Dimension(600, 33));
        jPanel7.add(jLabel4);

        btnRegistrati.setBackground(new java.awt.Color(247, 249, 249));
        btnRegistrati.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        btnRegistrati.setForeground(new java.awt.Color(15, 76, 156));
        btnRegistrati.setText("Registrati");
        btnRegistrati.setBorderPainted(false);
        btnRegistrati.setMaximumSize(new java.awt.Dimension(600, 50));
        btnRegistrati.setMinimumSize(new java.awt.Dimension(600, 50));
        btnRegistrati.setPreferredSize(new java.awt.Dimension(600, 50));
        btnRegistrati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistratiActionPerformed(evt);
            }
        });
        jPanel7.add(btnRegistrati);

        jLabel5.setBackground(new java.awt.Color(247, 249, 249));
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(425, 415));
        jLabel5.setMinimumSize(new java.awt.Dimension(425, 415));
        jLabel5.setPreferredSize(new java.awt.Dimension(425, 415));
        jPanel7.add(jLabel5);

        add(jPanel7);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccediActionPerformed
        // ACCEDI
        listener.actionPerformed(evt);
    }//GEN-LAST:event_btnAccediActionPerformed

    private void btnRegistratiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistratiActionPerformed
        // REGISTRATI
        listener.actionPerformed(evt);
    }//GEN-LAST:event_btnRegistratiActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cognome;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btnAccedi;
    private javax.swing.JButton btnRegistrati;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
