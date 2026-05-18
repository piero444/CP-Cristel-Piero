
package CP.pannelli;

import CP.ListenerHome;
import javax.swing.ImageIcon;


public class pnlEserciziConsigliati extends javax.swing.JPanel {

    
    public pnlEserciziConsigliati() {
        initComponents();
    }
    
    private ListenerHome listenerHome;

    public void setListener(ListenerHome listenerHome) {
        this.listenerHome = listenerHome;
    }
    
    public void impostaModellino(ImageIcon immagine)
    {
        modellino.setIcon(immagine);
    }
    
    public void impostaModellinoDesiderato(ImageIcon immagine)
    {
        modellino1.setIcon(immagine);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        modellino = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        modellino1 = new javax.swing.JLabel();
        labelDinamica = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(92, 209, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jButton4.setBackground(new java.awt.Color(32, 129, 195));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Torna alla home");
        jButton4.setMaximumSize(new java.awt.Dimension(600, 30));
        jButton4.setMinimumSize(new java.awt.Dimension(600, 30));
        jButton4.setPreferredSize(new java.awt.Dimension(600, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jPanel8.setBackground(new java.awt.Color(191, 230, 249));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setMaximumSize(new java.awt.Dimension(450, 700));
        jPanel8.setMinimumSize(new java.awt.Dimension(450, 700));
        jPanel8.setPreferredSize(new java.awt.Dimension(450, 700));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 7));

        jPanel6.setBackground(new java.awt.Color(191, 230, 249));
        jPanel6.setForeground(new java.awt.Color(15, 76, 156));
        jPanel6.setMaximumSize(new java.awt.Dimension(260, 27));
        jPanel6.setMinimumSize(new java.awt.Dimension(260, 27));
        jPanel6.setPreferredSize(new java.awt.Dimension(260, 27));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel3.setBackground(new java.awt.Color(190, 216, 212));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Modellino attuale");
        jLabel3.setMaximumSize(new java.awt.Dimension(215, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(215, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(215, 25));
        jPanel6.add(jLabel3);

        jPanel8.add(jPanel6);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel23.setMaximumSize(new java.awt.Dimension(400, 640));
        jPanel23.setMinimumSize(new java.awt.Dimension(400, 640));
        jPanel23.setPreferredSize(new java.awt.Dimension(400, 640));
        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        modellino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modellino.setMaximumSize(new java.awt.Dimension(300, 640));
        modellino.setMinimumSize(new java.awt.Dimension(300, 640));
        modellino.setName(""); // NOI18N
        modellino.setPreferredSize(new java.awt.Dimension(300, 640));
        jPanel23.add(modellino);

        jPanel8.add(jPanel23);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(191, 230, 249));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setMaximumSize(new java.awt.Dimension(450, 700));
        jPanel9.setMinimumSize(new java.awt.Dimension(450, 700));
        jPanel9.setPreferredSize(new java.awt.Dimension(450, 700));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setMaximumSize(new java.awt.Dimension(400, 640));
        jPanel22.setMinimumSize(new java.awt.Dimension(400, 640));
        jPanel22.setPreferredSize(new java.awt.Dimension(400, 640));
        jPanel22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        modellino1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modellino1.setMaximumSize(new java.awt.Dimension(300, 640));
        modellino1.setMinimumSize(new java.awt.Dimension(300, 640));
        modellino1.setName(""); // NOI18N
        modellino1.setPreferredSize(new java.awt.Dimension(300, 640));
        jPanel22.add(modellino1);

        labelDinamica.setBackground(new java.awt.Color(191, 230, 249));
        labelDinamica.setMaximumSize(new java.awt.Dimension(80, 200));
        labelDinamica.setMinimumSize(new java.awt.Dimension(80, 200));
        labelDinamica.setName(""); // NOI18N
        labelDinamica.setPreferredSize(new java.awt.Dimension(80, 200));
        jPanel22.add(labelDinamica);

        jPanel9.add(jPanel22);

        jPanel1.add(jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //    TRONA ALLA HOME
        listenerHome.actionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField labelDinamica;
    private javax.swing.JLabel modellino;
    private javax.swing.JLabel modellino1;
    // End of variables declaration//GEN-END:variables
}
