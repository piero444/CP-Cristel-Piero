package CP.pannelli;

import CP.Listener;
import CP.ListenerHome;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class pnlObbiettivo extends javax.swing.JPanel {

    private Listener listener;
    private boolean sesso;
    private int j;

    public pnlObbiettivo() {
        initComponents();

        AscoltatoreSpinner a1 = new AscoltatoreSpinner(spnPesoD);
        spnPesoD.addChangeListener(a1);
        ((javax.swing.JSpinner.DefaultEditor) spnPesoD.getEditor()).getTextField().addMouseListener(a1);
    }

    //PREPARO L'ASCOLTATORE
    private ListenerHome listenerHome;

    public void setListener(ListenerHome listenerHome) {
        this.listenerHome = listenerHome;
    }

    public void setListener1(Listener listener) {
        this.listener = listener;
    }

    public void impostaModellino(ImageIcon immagine) {
        modellino.setIcon(immagine);
    }

    public int getPesoD() {
        return (int) spnPesoD.getValue();
    }

    public int getJ() {
        return j;
    }
    public int getJ(boolean sesso) {
        int peso = getPesoD();

        if (sesso) {
            if (peso < 50) {
                j = 1;
            } else if (peso <= 70) {
                j = 2;
            } else {
                j = 3;
            }
        } else {
            if (peso < 60) {
                j = 1;
            } else if (peso <= 80) {
                j = 2;
            } else {
                j = 3;
            }
        }

        return j;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        modellino = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        spnPesoD = new javax.swing.JSpinner();
        jPanel22 = new javax.swing.JPanel();
        modellino1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(92, 209, 255));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

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
        add(jButton4);

        jPanel8.setBackground(new java.awt.Color(191, 230, 249));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setMaximumSize(new java.awt.Dimension(450, 700));
        jPanel8.setMinimumSize(new java.awt.Dimension(450, 700));
        jPanel8.setPreferredSize(new java.awt.Dimension(450, 700));

        jPanel6.setBackground(new java.awt.Color(191, 230, 249));
        jPanel6.setForeground(new java.awt.Color(15, 76, 156));
        jPanel6.setMaximumSize(new java.awt.Dimension(260, 45));
        jPanel6.setMinimumSize(new java.awt.Dimension(260, 45));
        jPanel6.setPreferredSize(new java.awt.Dimension(260, 45));

        jLabel3.setBackground(new java.awt.Color(190, 216, 212));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Modellino attuale");
        jPanel6.add(jLabel3);

        jPanel8.add(jPanel6);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel23.setMaximumSize(new java.awt.Dimension(400, 640));
        jPanel23.setMinimumSize(new java.awt.Dimension(400, 640));
        jPanel23.setPreferredSize(new java.awt.Dimension(400, 640));
        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        modellino.setMaximumSize(new java.awt.Dimension(300, 637));
        modellino.setMinimumSize(new java.awt.Dimension(300, 637));
        modellino.setName(""); // NOI18N
        modellino.setPreferredSize(new java.awt.Dimension(300, 637));
        jPanel23.add(modellino);

        jPanel8.add(jPanel23);

        add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(191, 230, 249));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setMaximumSize(new java.awt.Dimension(450, 700));
        jPanel9.setMinimumSize(new java.awt.Dimension(450, 700));
        jPanel9.setPreferredSize(new java.awt.Dimension(450, 700));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jPanel19.setBackground(new java.awt.Color(191, 230, 249));
        jPanel19.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel19.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel19.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jPanel20.setBackground(new java.awt.Color(191, 230, 249));
        jPanel20.setForeground(new java.awt.Color(15, 76, 156));
        jPanel20.setMaximumSize(new java.awt.Dimension(300, 45));
        jPanel20.setMinimumSize(new java.awt.Dimension(300, 45));
        jPanel20.setPreferredSize(new java.awt.Dimension(300, 45));

        jLabel14.setBackground(new java.awt.Color(190, 216, 212));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Modellino desiderato");
        jPanel20.add(jLabel14);

        jPanel19.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(15, 76, 156));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setMaximumSize(new java.awt.Dimension(300, 60));
        jPanel21.setMinimumSize(new java.awt.Dimension(300, 60));
        jPanel21.setPreferredSize(new java.awt.Dimension(300, 60));
        jPanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jLabel15.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html>Inserisci peso a cui<br> deisderi arrivare<html>");
        jLabel15.setMaximumSize(new java.awt.Dimension(106, 46));
        jLabel15.setMinimumSize(new java.awt.Dimension(106, 46));
        jPanel21.add(jLabel15);

        spnPesoD.setModel(new javax.swing.SpinnerNumberModel(20, 20, 300, 1));
        spnPesoD.setMaximumSize(new java.awt.Dimension(70, 30));
        spnPesoD.setMinimumSize(new java.awt.Dimension(70, 30));
        spnPesoD.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel21.add(spnPesoD);

        jPanel19.add(jPanel21);

        jPanel9.add(jPanel19);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setMaximumSize(new java.awt.Dimension(400, 500));
        jPanel22.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel22.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        modellino1.setMaximumSize(new java.awt.Dimension(300, 497));
        modellino1.setMinimumSize(new java.awt.Dimension(300, 497));
        modellino1.setName(""); // NOI18N
        modellino1.setPreferredSize(new java.awt.Dimension(300, 497));
        jPanel22.add(modellino1);

        jPanel9.add(jPanel22);

        jButton3.setBackground(new java.awt.Color(15, 76, 156));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Consiglia esercizi");
        jButton3.setActionCommand("Esercizi");
        jButton3.setMaximumSize(new java.awt.Dimension(200, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3);

        jButton5.setBackground(new java.awt.Color(15, 76, 156));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Consiglia dieta");
        jButton5.setActionCommand("Consiglia dieta");
        jButton5.setMaximumSize(new java.awt.Dimension(200, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(200, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5);

        add(jPanel9);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //   CONSIGLIA ESERCIZI
        listenerHome.actionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //    TRONA ALLA HOME
        listenerHome.actionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         //   CONSIGLIA DIETA
        listenerHome.actionPerformed(evt);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel modellino;
    private javax.swing.JLabel modellino1;
    private javax.swing.JSpinner spnPesoD;
    // End of variables declaration//GEN-END:variables
    // CLASSE ASCOLTATORE PER IL MODELLINO
    private class AscoltatoreSpinner extends java.awt.event.MouseAdapter implements ChangeListener {

        private javax.swing.JSpinner spinner;

        public AscoltatoreSpinner(javax.swing.JSpinner spinner) {
            this.spinner = spinner;
        }

        private ImageIcon immagine;

        private int peso = getPesoD();

        public void stateChanged(ChangeEvent e) {
            JSpinner spinner = (JSpinner) e.getSource();

            if (listener == null) {
                return; // PER SICUREZZA
            }
            sesso = listener.getSesso();
            peso = getPesoD();
            if (listener.getSesso()) {
                // FEMMINA
                scambiaModellinoF(peso);
            } else {
                // MASCHIO
                scambiaModellinoM(peso);
            }
            // RI DA IL FOCUS ALLA FINESTRA COSI DA POTER VEDEERE IL CAMBIAMENTO NEL MODELLINO
            javax.swing.SwingUtilities.invokeLater(() -> requestFocusInWindow());
        }

        public void mouseClicked(java.awt.event.MouseEvent e) {
            javax.swing.JSpinner.DefaultEditor editor
                    = (javax.swing.JSpinner.DefaultEditor) spinner.getEditor();
            editor.getTextField().setText("");
        }

        // METODI UTILI
        private void scambiaModellinoM(int peso) {

            calcolaMPeso(peso);
            // CAMBIA MODELLINO MASCHILE

            immagine = new ImageIcon(getClass().getResource("/data/ModMaschi/m" + listener.getAltezza() + j + ".png"));
            // ESTRAE L'IMMAGINE DALL'ICONA ORIGINALE, LA RIDIMENSIONA A 234X500 PIXEL  (PER MANTENERE LE PROPORZIONI)
                // USANDO L'ALGORITMO SCALE_SMOOTH PER NON PERDERE QUALITÀ, E LA RACCHIUDE 
                // IN UN NUOVO OGGETTO IMAGEICON ADATTO ALLA JLABEL.
             immagine = new ImageIcon(immagine.getImage().getScaledInstance(234, 500, java.awt.Image.SCALE_SMOOTH));
            modellino1.setIcon(immagine);

        }

        private void scambiaModellinoF(int peso) {

            calcolaFPeso(peso);

            // CAMBIA MODELLINO FEMMINILE
            immagine = new ImageIcon(getClass().getResource("/data/ModFemmine/f" + listener.getAltezza() + j + ".png"));
            // ESTRAE L'IMMAGINE DALL'ICONA ORIGINALE, LA RIDIMENSIONA A 234X500 PIXEL  (PER MANTENERE LE PROPORZIONI)
                // USANDO L'ALGORITMO SCALE_SMOOTH PER NON PERDERE QUALITÀ, E LA RACCHIUDE 
                // IN UN NUOVO OGGETTO IMAGEICON ADATTO ALLA JLABEL.
             immagine = new ImageIcon(immagine.getImage().getScaledInstance(234, 500, java.awt.Image.SCALE_SMOOTH));
            modellino1.setIcon(immagine);

        }

        private void calcolaMPeso(int peso) {
            if (peso < 60) {
                j = 1;
            } else if (peso <= 80) {
                j = 2;
            } else {
                j = 3;
            }

        }

        private void calcolaFPeso(int peso) {
            if (peso < 50) {
                j = 1;
            } else if (peso <= 70) {
                j = 2;
            } else {
                j = 3;
            }

        }

    }

}
