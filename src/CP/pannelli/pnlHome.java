package CP.pannelli;

import CP.ListenerHome;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class pnlHome extends javax.swing.JPanel {

    //PREPARO L'ASCOLTATORE
    private ListenerHome listenerHome;

    public void setListener(ListenerHome listenerHome) {
        this.listenerHome = listenerHome;
    }

    // impostare quella di defoult
    String scelta = "Esercizi consigliati";

    public pnlHome() {
        initComponents();
    }
    
    public void impostaModellino(ImageIcon immagine)
    {
        modellino.setIcon(immagine);
    }

    public String getScelta()
    {
        // FARE METODO SELETTIVO DEL BUTTONGRUP
        if (jRadioButton1.isSelected()) {
            scelta="Calcolatore fabbisogno calorico";
        } else if (jRadioButton2.isSelected()) {
            scelta="Calcolatore idratazione giornaliera";
        } else if (jRadioButton3.isSelected()) {
            scelta="Dieta consigliata";
        } else if (jRadioButton4.isSelected()) {
            scelta="Esercizi consigliati";
        } else {
            JOptionPane.showMessageDialog(null, "Selezionare almeno un opzione", "Errore", JOptionPane.ERROR_MESSAGE);
        }
        return scelta;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        btnAccedi = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        modellino = new javax.swing.JLabel();

        setBackground(new java.awt.Color(92, 209, 255));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        jPanel1.setFocusCycleRoot(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 700));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(190, 216, 212));
        jPanel2.setMaximumSize(new java.awt.Dimension(950, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(950, 700));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setBackground(new java.awt.Color(191, 230, 249));
        jPanel7.setMaximumSize(new java.awt.Dimension(475, 350));
        jPanel7.setMinimumSize(new java.awt.Dimension(475, 350));
        jPanel7.setPreferredSize(new java.awt.Dimension(475, 350));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jPanel3.setBackground(new java.awt.Color(247, 249, 249));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Informazioni relative al tuo fisico ");
        jPanel3.add(jLabel1);

        jPanel7.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(247, 249, 249));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMaximumSize(new java.awt.Dimension(400, 500));
        jPanel5.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jPanel6.setBackground(new java.awt.Color(247, 249, 249));
        jPanel6.setToolTipText("avanti");
        jPanel6.setMaximumSize(new java.awt.Dimension(400, 500));
        jPanel6.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 30));

        jPanel12.setBackground(new java.awt.Color(15, 76, 156));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setForeground(new java.awt.Color(190, 216, 212));
        jPanel12.setMaximumSize(new java.awt.Dimension(350, 60));
        jPanel12.setMinimumSize(new java.awt.Dimension(350, 60));
        jPanel12.setPreferredSize(new java.awt.Dimension(350, 60));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 13));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Calcolo fabbisono energetico");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel12.add(jRadioButton1);

        jPanel6.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(15, 76, 156));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setMaximumSize(new java.awt.Dimension(350, 60));
        jPanel13.setMinimumSize(new java.awt.Dimension(350, 60));
        jPanel13.setPreferredSize(new java.awt.Dimension(350, 60));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 13));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Calcolo idratazione giornaliera");
        jPanel13.add(jRadioButton2);

        jPanel6.add(jPanel13);

        jPanel15.setBackground(new java.awt.Color(15, 76, 156));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setForeground(new java.awt.Color(190, 216, 212));
        jPanel15.setMaximumSize(new java.awt.Dimension(350, 60));
        jPanel15.setMinimumSize(new java.awt.Dimension(350, 60));
        jPanel15.setPreferredSize(new java.awt.Dimension(350, 60));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 13));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Dieta consigliata");
        jPanel15.add(jRadioButton3);

        jPanel6.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(15, 76, 156));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setForeground(new java.awt.Color(190, 216, 212));
        jPanel16.setMaximumSize(new java.awt.Dimension(350, 60));
        jPanel16.setMinimumSize(new java.awt.Dimension(350, 60));
        jPanel16.setPreferredSize(new java.awt.Dimension(350, 60));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 40, 13));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Esercizi di potenziamento fisico");
        jPanel16.add(jRadioButton4);

        jPanel6.add(jPanel16);

        btnAccedi.setBackground(new java.awt.Color(32, 129, 195));
        btnAccedi.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        btnAccedi.setForeground(new java.awt.Color(247, 249, 249));
        btnAccedi.setText("Conferma");
        btnAccedi.setBorderPainted(false);
        btnAccedi.setMaximumSize(new java.awt.Dimension(350, 60));
        btnAccedi.setMinimumSize(new java.awt.Dimension(350, 60));
        btnAccedi.setPreferredSize(new java.awt.Dimension(350, 60));
        btnAccedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccediActionPerformed(evt);
            }
        });
        jPanel6.add(btnAccedi);

        jPanel5.add(jPanel6);

        jPanel7.add(jPanel5);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(191, 230, 249));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMaximumSize(new java.awt.Dimension(400, 630));
        jPanel4.setMinimumSize(new java.awt.Dimension(400, 630));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 630));

        modellino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modellino.setMaximumSize(new java.awt.Dimension(300, 585));
        modellino.setMinimumSize(new java.awt.Dimension(300, 585));
        modellino.setName(""); // NOI18N
        modellino.setPreferredSize(new java.awt.Dimension(300, 585));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(modellino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(modellino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel8.add(jPanel4);

        jPanel2.add(jPanel8);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccediActionPerformed
        // CONFERMA
        listenerHome.actionPerformed(evt);
    }//GEN-LAST:event_btnAccediActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccedi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel modellino;
    // End of variables declaration//GEN-END:variables
}
