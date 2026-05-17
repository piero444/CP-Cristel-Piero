package CP.pannelli;

import CP.Listener;
import CP.Taglia;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JSpinner;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class pnlRegistrazione1 extends javax.swing.JPanel {

    private Listener listener;
    private boolean sesso;
    private int x;
    private int y;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setSesso(boolean sesso) {
        this.sesso = sesso;
    }

    public boolean getSesso() {
        return sesso;
    }

    public pnlRegistrazione1() {
        initComponents();

        AscoltatoreSpinner a1 = new AscoltatoreSpinner(spnEtà);
        spnEtà.addChangeListener(a1);
        spnEtà.addMouseListener(a1);

        AscoltatoreSpinner a2 = new AscoltatoreSpinner(spnAltezza);
        spnAltezza.addChangeListener(a2);
        spnAltezza.addMouseListener(a2);

        AscoltatoreSpinner a3 = new AscoltatoreSpinner(spnPeso);
        spnPeso.addChangeListener(a3);
        spnPeso.addMouseListener(a3);
    }

    //  METDODI GET PER L'ASCOLTATORE
    public int getEta() {
        return (int) spnEtà.getValue();
    }

    public int getAltezza() {
        return (int) spnAltezza.getValue();
    }

    public int getPeso() {
        return (int) spnPeso.getValue();
    }

    public void setAltezza(int altezza) {
        spnAltezza.setValue(altezza);
    }

    public void setPeso(int peso) {
        spnPeso.setValue(peso);
    }

    public void modellinoDefautl(ImageIcon immagine) {
        modellino.setIcon(immagine);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        spnEtà = new javax.swing.JSpinner();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        spnAltezza = new javax.swing.JSpinner();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        spnPeso = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        modellino = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Registrati = new javax.swing.JButton();

        setBackground(new java.awt.Color(92, 209, 255));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 4, 45));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 500));
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 650));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel2.setBackground(new java.awt.Color(191, 230, 249));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 60, 30, 50));
        jPanel2.setMaximumSize(new java.awt.Dimension(450, 545));
        jPanel2.setMinimumSize(new java.awt.Dimension(450, 545));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 545));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));
        jPanel4.setToolTipText("avanti");
        jPanel4.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel4.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        jPanel12.setBackground(new java.awt.Color(15, 76, 156));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setForeground(new java.awt.Color(190, 216, 212));
        jPanel12.setMaximumSize(new java.awt.Dimension(400, 60));
        jPanel12.setMinimumSize(new java.awt.Dimension(400, 60));
        jPanel12.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jLabel7.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>Inserisci la tua <br>età<html>");
        jLabel7.setMaximumSize(new java.awt.Dimension(130, 50));
        jLabel7.setMinimumSize(new java.awt.Dimension(130, 50));
        jLabel7.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel12.add(jLabel7);

        spnEtà.setModel(new javax.swing.SpinnerNumberModel(2, null, 99, 1));
        spnEtà.setMaximumSize(new java.awt.Dimension(70, 30));
        spnEtà.setMinimumSize(new java.awt.Dimension(70, 30));
        spnEtà.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel12.add(spnEtà);

        jPanel4.add(jPanel12);

        jPanel14.setBackground(new java.awt.Color(15, 76, 156));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setForeground(new java.awt.Color(247, 249, 249));
        jPanel14.setMaximumSize(new java.awt.Dimension(400, 60));
        jPanel14.setMinimumSize(new java.awt.Dimension(400, 60));
        jPanel14.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jLabel9.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>Inserisci la tua <br>altezza<html>");
        jLabel9.setMaximumSize(new java.awt.Dimension(130, 50));
        jLabel9.setMinimumSize(new java.awt.Dimension(130, 50));
        jLabel9.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel14.add(jLabel9);

        spnAltezza.setModel(new javax.swing.SpinnerNumberModel(50, 50, 250, 1));
        spnAltezza.setMaximumSize(new java.awt.Dimension(70, 30));
        spnAltezza.setMinimumSize(new java.awt.Dimension(70, 30));
        spnAltezza.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel14.add(spnAltezza);

        jPanel4.add(jPanel14);

        jPanel13.setBackground(new java.awt.Color(15, 76, 156));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setMaximumSize(new java.awt.Dimension(400, 60));
        jPanel13.setMinimumSize(new java.awt.Dimension(400, 60));
        jPanel13.setPreferredSize(new java.awt.Dimension(400, 60));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jLabel8.setFont(new java.awt.Font("Verdana Pro Cond Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<html>Inserisci il tuo<br> peso<html>");
        jLabel8.setMaximumSize(new java.awt.Dimension(130, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(130, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel13.add(jLabel8);

        spnPeso.setModel(new javax.swing.SpinnerNumberModel(20, 20, 300, 1));
        spnPeso.setMaximumSize(new java.awt.Dimension(70, 30));
        spnPeso.setMinimumSize(new java.awt.Dimension(70, 30));
        spnPeso.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel13.add(spnPeso);

        jPanel4.add(jPanel13);

        jPanel2.add(jPanel4);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(191, 230, 249));
        jPanel3.setToolTipText("");
        jPanel3.setMaximumSize(new java.awt.Dimension(500, 545));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 545));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 545));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jPanel6.setBackground(new java.awt.Color(191, 230, 249));
        jPanel6.setForeground(new java.awt.Color(15, 76, 156));
        jPanel6.setMaximumSize(new java.awt.Dimension(260, 45));
        jPanel6.setMinimumSize(new java.awt.Dimension(260, 45));
        jPanel6.setPreferredSize(new java.awt.Dimension(260, 45));

        jLabel3.setBackground(new java.awt.Color(190, 216, 212));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Anteprima modellino");
        jPanel6.add(jLabel3);

        jPanel3.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setMaximumSize(new java.awt.Dimension(420, 440));
        jPanel7.setMinimumSize(new java.awt.Dimension(420, 440));
        jPanel7.setPreferredSize(new java.awt.Dimension(420, 440));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 30));

        modellino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modellino.setMaximumSize(new java.awt.Dimension(200, 385));
        modellino.setMinimumSize(new java.awt.Dimension(200, 385));
        modellino.setName(""); // NOI18N
        modellino.setPreferredSize(new java.awt.Dimension(200, 385));
        jPanel7.add(modellino);

        jPanel3.add(jPanel7);

        jPanel1.add(jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(40, 40, 40, 40));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        Registrati.setBackground(new java.awt.Color(32, 129, 195));
        Registrati.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Registrati.setForeground(new java.awt.Color(255, 255, 255));
        Registrati.setText("Conferma registrazione");
        Registrati.setToolTipText("");
        Registrati.setBorderPainted(false);
        Registrati.setMaximumSize(new java.awt.Dimension(950, 50));
        Registrati.setMinimumSize(new java.awt.Dimension(950, 50));
        Registrati.setPreferredSize(new java.awt.Dimension(950, 50));
        Registrati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistratiActionPerformed(evt);
            }
        });
        jPanel5.add(Registrati);

        jPanel1.add(jPanel5);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void RegistratiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistratiActionPerformed
        //   PASSO IL CONTROLLO DEL EVENTO ALLA CLASSE ASCOLTATORE
        listener.actionPerformed(evt);
    }//GEN-LAST:event_RegistratiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrati;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel modellino;
    private javax.swing.JSpinner spnAltezza;
    private javax.swing.JSpinner spnEtà;
    private javax.swing.JSpinner spnPeso;
    // End of variables declaration//GEN-END:variables

    // CLASSE ASCOLTATORE PER IL MODELLINO
    private class AscoltatoreSpinner extends java.awt.event.MouseAdapter implements ChangeListener {

        private javax.swing.JSpinner spinner;

        public AscoltatoreSpinner(javax.swing.JSpinner spinner) {
            this.spinner = spinner;
        }

        private ImageIcon immagine;

        private int peso = getPeso();
        private int altezza = getAltezza();

        public void stateChanged(ChangeEvent e) {
            JSpinner spinner = (JSpinner) e.getSource();
            if (listener == null) {
                return; // PER SICUREZZA
            }
            sesso = listener.getSesso();
            if (spinner == spnPeso) {
                peso = getPeso();
                if (sesso) {
                    // FEMMINA
                    scambiaModellinoF(peso, altezza);
                } else {
                    // MASCHIO
                    scambiaModellinoM(peso, altezza);
                }
            } else if (spinner == spnAltezza) {
                altezza = getAltezza();
                if (sesso) {
                    // FEMMINA
                    scambiaModellinoF(peso, altezza);
                } else {
                    // MASCHIO
                    scambiaModellinoM(peso, altezza);
                }
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent e) {
            javax.swing.JSpinner.DefaultEditor editor
                    = (javax.swing.JSpinner.DefaultEditor) spinner.getEditor();
            editor.getTextField().setText("");
        }

        // METODI UTILI
        private void scambiaModellinoM(int peso, int altezza) {

            calcolaMPeso(peso);
            calcolaMAltezza(altezza);
            // CAMBIA MODELLINO MASCHILE

            immagine = new ImageIcon(getClass().getResource("/data/ModMaschi/m" + y + x + ".png"));
            modellino.setIcon(immagine);

        }

        private void scambiaModellinoF(int peso, int altezza) {

            calcolaFPeso(peso);
            calcolaFAltezza(altezza);

            // CAMBIA MODELLINO FEMMINILE
            immagine = new ImageIcon(getClass().getResource("/data/ModFemmine/f" + y + x + ".png"));
            modellino.setIcon(immagine);

        }

        // METODI PER CALCOLARE L'IMMAGINE GIUSTA DALLA MATRICE 3X3
        //  4 METODI 2 PER L'UOMO 2 PER LA DONNA
        private void calcolaMPeso(int peso) {
            if (peso < 60) {
                y = 1;
            } else if (peso <= 80) {
                y = 2;
            } else {
                y = 3;
            }

        }

        private void calcolaMAltezza(int altezza) {
            if (altezza < 150) {
                x = 1;
            } else if (altezza <= 175) {
                x = 2;
            } else {
                x = 3;
            }
        }

        private void calcolaFPeso(int peso) {
            if (peso < 50) {
                y = 1;
            } else if (peso <= 70) {
                y = 2;
            } else {
                y = 3;
            }

        }

        private void calcolaFAltezza(int altezza) {
            if (altezza < 110) {
                x = 1;
            } else if (altezza <= 165) {
                x = 2;
            } else {
                x = 3;
            }
        }

    }

}
