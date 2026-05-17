
package CP.pannelli;

import CP.ListenerHome;
import javax.swing.ImageIcon;

public class pnlDietaConsigliata1 extends javax.swing.JPanel {

    
    //PREPARO L'ASCOLTATORE
    private ListenerHome listenerHome;

    public void setListener(ListenerHome listenerHome) {
        this.listenerHome = listenerHome;
    }
    public pnlDietaConsigliata1() {
        initComponents();
    }

    public void impostaModellino(ImageIcon immagine)
    {
        modellino.setIcon(immagine);
    }
    public void setDietaC(String s)
    {
        lDieta.setText(s);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        lDieta = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        modellino = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(92, 209, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(1000, 800));
        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 800));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setFocusCycleRoot(true);
        jPanel4.setMaximumSize(new java.awt.Dimension(950, 700));
        jPanel4.setMinimumSize(new java.awt.Dimension(950, 700));
        jPanel4.setPreferredSize(new java.awt.Dimension(950, 700));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(191, 230, 249));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 41));

        jPanel7.setMaximumSize(new java.awt.Dimension(850, 610));
        jPanel7.setMinimumSize(new java.awt.Dimension(850, 610));
        jPanel7.setPreferredSize(new java.awt.Dimension(850, 610));

        jPanel1.setMaximumSize(new java.awt.Dimension(430, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(430, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 600));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel8.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel8.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Dieta consigliata");
        jPanel8.add(jLabel2);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(191, 230, 249));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setMaximumSize(new java.awt.Dimension(400, 350));
        jPanel9.setMinimumSize(new java.awt.Dimension(400, 350));
        jPanel9.setPreferredSize(new java.awt.Dimension(400, 450));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setToolTipText("avanti");
        jPanel10.setMaximumSize(new java.awt.Dimension(350, 300));
        jPanel10.setMinimumSize(new java.awt.Dimension(350, 300));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(350, 300));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        jPanel18.setBackground(new java.awt.Color(15, 76, 156));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setForeground(new java.awt.Color(190, 216, 212));
        jPanel18.setMaximumSize(new java.awt.Dimension(280, 60));
        jPanel18.setMinimumSize(new java.awt.Dimension(280, 60));
        jPanel18.setPreferredSize(new java.awt.Dimension(280, 60));
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        jButton4.setBackground(new java.awt.Color(32, 129, 195));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Consiglia");
        jButton4.setActionCommand("Calcola dieta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton4);

        jPanel10.add(jPanel18);

        lDieta.setFont(new java.awt.Font("Segoe Print", 0, 16)); // NOI18N
        lDieta.setMaximumSize(new java.awt.Dimension(280, 200));
        lDieta.setMinimumSize(new java.awt.Dimension(280, 200));
        lDieta.setPreferredSize(new java.awt.Dimension(280, 200));
        jPanel10.add(lDieta);

        jPanel9.add(jPanel10);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setMaximumSize(new java.awt.Dimension(350, 110));
        jPanel11.setMinimumSize(new java.awt.Dimension(350, 110));
        jPanel11.setPreferredSize(new java.awt.Dimension(350, 110));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 25));

        jPanel17.setBackground(new java.awt.Color(15, 76, 156));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setForeground(new java.awt.Color(190, 216, 212));
        jPanel17.setMaximumSize(new java.awt.Dimension(280, 60));
        jPanel17.setMinimumSize(new java.awt.Dimension(280, 60));
        jPanel17.setPreferredSize(new java.awt.Dimension(280, 60));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        jButton3.setBackground(new java.awt.Color(32, 129, 195));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Torna alla home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton3);

        jPanel11.add(jPanel17);

        jPanel9.add(jPanel11);

        jPanel1.add(jPanel9);

        jPanel7.add(jPanel1);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setMaximumSize(new java.awt.Dimension(400, 600));
        jPanel12.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel12.setPreferredSize(new java.awt.Dimension(400, 600));

        modellino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modellino.setMaximumSize(new java.awt.Dimension(300, 585));
        modellino.setMinimumSize(new java.awt.Dimension(300, 585));
        modellino.setName(""); // NOI18N
        modellino.setPreferredSize(new java.awt.Dimension(300, 585));
        jPanel12.add(modellino);

        jPanel7.add(jPanel12);

        jPanel5.add(jPanel7);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // RITRONA ALLA HOME
        listenerHome.actionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // CONSIGLIA DIETA
        listenerHome.actionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lDieta;
    private javax.swing.JLabel modellino;
    // End of variables declaration//GEN-END:variables
}
