package CP.pannelli;

import CP.Listener;
import CP.Taglia;
import javax.swing.JSpinner;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class pnlRegistrazione1 extends javax.swing.JPanel {

    private Listener listener;
    private boolean sesso;
    public void setListener(Listener listener) {
        this.listener = listener;
    }
    public void getSesso(boolean sesso)
    {
        this.sesso=sesso;
    }
    public pnlRegistrazione1() {
        initComponents();
        //  AGGIUNGERE I PANNELLI DEL MODELLINNO METTERE VISIBILE SOLO 1 DI DEFOUTL 
        // RICORDATI DI SETTARE LA POSIZIONE ALLA FINE
        
        /*AscoltatoreSpinner ascoltatore = new AscoltatoreSpinner();
        spnPeso.addChangeListener(ascoltatore);
        spnAltezza.addChangeListener(ascoltatore);*/
        btnConferma.setActionCommand("Conferma registrazione");

        // Colore di sfondo del pannello (F7F9F9 della tua palette)
        this.setBackground(new java.awt.Color(247, 249, 249));
// Stile del Bottone "Conferma"
        btnConferma.setBackground(new java.awt.Color(32, 129, 195)); // Blu scuro palette
        btnConferma.setForeground(java.awt.Color.WHITE); // Scritta bianca
        btnConferma.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
// Stile del riquadro "Camerino" (pnlModellino)
        pnlModellino.setBackground(java.awt.Color.WHITE);
        pnlModellino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 129, 195), 2));

        // Sfondo del pannello principale (quello che contiene tutto)
        this.setBackground(new java.awt.Color(247, 249, 249));
        // Stile per il "Camerino" (il pannello che hai chiamato pnlModellino)
        pnlModellino.setBackground(java.awt.Color.WHITE);
        pnlModellino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 129, 195), 2));
        // Stile per il bottone di conferma
        btnConferma.setBackground(new java.awt.Color(32, 129, 195));
        btnConferma.setForeground(java.awt.Color.WHITE);
        btnConferma.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnAltezza = new javax.swing.JSpinner();
        spnPeso = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        pnlModellino = new javax.swing.JPanel();
        btnConferma = new javax.swing.JButton();
        spnEtà = new javax.swing.JSpinner();
        spnPesoDesiderato = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTaglia = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));

        spnAltezza.setModel(new javax.swing.SpinnerNumberModel(50, 50, 250, 1));
        spnAltezza.setMaximumSize(new java.awt.Dimension(30, 20));
        spnAltezza.setMinimumSize(new java.awt.Dimension(30, 20));
        spnAltezza.setPreferredSize(new java.awt.Dimension(30, 20));

        spnPeso.setModel(new javax.swing.SpinnerNumberModel(20, 20, 200, 1));
        spnPeso.setMaximumSize(new java.awt.Dimension(30, 20));
        spnPeso.setMinimumSize(new java.awt.Dimension(30, 20));
        spnPeso.setPreferredSize(new java.awt.Dimension(30, 20));
        spnPeso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPesoStateChanged(evt);
            }
        });

        jLabel3.setText("Digita la tua taglia abituale:");

        pnlModellino.setBackground(new java.awt.Color(255, 255, 255));
        pnlModellino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlModellino.setMaximumSize(new java.awt.Dimension(300, 400));
        pnlModellino.setMinimumSize(new java.awt.Dimension(300, 400));
        pnlModellino.setPreferredSize(new java.awt.Dimension(300, 400));

        javax.swing.GroupLayout pnlModellinoLayout = new javax.swing.GroupLayout(pnlModellino);
        pnlModellino.setLayout(pnlModellinoLayout);
        pnlModellinoLayout.setHorizontalGroup(
            pnlModellinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        pnlModellinoLayout.setVerticalGroup(
            pnlModellinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnConferma.setText("Conferma registrazione");
        btnConferma.setMaximumSize(new java.awt.Dimension(170, 40));
        btnConferma.setMinimumSize(new java.awt.Dimension(170, 40));
        btnConferma.setPreferredSize(new java.awt.Dimension(170, 40));
        btnConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfermaActionPerformed(evt);
            }
        });

        spnEtà.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        spnEtà.setMaximumSize(new java.awt.Dimension(30, 20));
        spnEtà.setMinimumSize(new java.awt.Dimension(30, 20));
        spnEtà.setPreferredSize(new java.awt.Dimension(30, 20));

        spnPesoDesiderato.setModel(new javax.swing.SpinnerNumberModel(33, 20, 200, 1));
        spnPesoDesiderato.setMaximumSize(new java.awt.Dimension(50, 20));
        spnPesoDesiderato.setMinimumSize(new java.awt.Dimension(50, 20));
        spnPesoDesiderato.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel1.setText("Digita la tua età:");

        jLabel2.setText("Digita la tua altezza:");

        jLabel4.setText("Digita il tuo peso:");

        jLabel5.setText("Digita il peso a cui desideri arrivare");

        cmbTaglia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL", "" }));
        cmbTaglia.setMaximumSize(new java.awt.Dimension(50, 20));
        cmbTaglia.setMinimumSize(new java.awt.Dimension(50, 20));
        cmbTaglia.setPreferredSize(new java.awt.Dimension(50, 20));
        cmbTaglia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTagliaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(btnConferma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbTaglia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnPesoDesiderato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(spnEtà, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(spnAltezza, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlModellino, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(438, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlModellino, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(spnEtà, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(spnAltezza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spnPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(spnPesoDesiderato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbTaglia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(btnConferma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    public Taglia getTaglia() {

        String s = (String) cmbTaglia.getSelectedItem();
        return Taglia.valueOf(s);
    }

    private void btnConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfermaActionPerformed
        //  CONFERMA REGISTRAZIONE

        //   PASSO IL CONTROLLO DEL EVENTO ALLA CLASSE ASCOLTATORE
        listener.actionPerformed(evt);
    }//GEN-LAST:event_btnConfermaActionPerformed

    private void cmbTagliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTagliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTagliaActionPerformed

    private void spnPesoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPesoStateChanged

    }//GEN-LAST:event_spnPesoStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConferma;
    private javax.swing.JComboBox<String> cmbTaglia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlModellino;
    private javax.swing.JSpinner spnAltezza;
    private javax.swing.JSpinner spnEtà;
    private javax.swing.JSpinner spnPeso;
    private javax.swing.JSpinner spnPesoDesiderato;
    // End of variables declaration//GEN-END:variables

    // CLASSE ASCOLTATORE PER IL MODELLINO
    private class AscoltatoreSpinner implements ChangeListener {

        private int x = 2;
        private int y = 2;

        private int peso;
        private int altezza;

        public void stateChanged(ChangeEvent e) {
            JSpinner spinner = (JSpinner) e.getSource();

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

        // METODI UTILI
        private void scambiaModellinoM(int peso, int altezza) {

            calcolaMPeso(peso);
            calcolaMAltezza(altezza);
            // CAMBIA MODELLINO MASCHILE
            
        }
        private void scambiaModellinoF(int peso, int altezza) {

            calcolaFPeso(peso);
            calcolaFAltezza(altezza);
            
            // DISPOSIZIONE PESO ALTEZZA
            if(x <3 && y==3) // magri
            {
                
            }
            else // grasso
            {
                
            }
            if(x==3 && y<3) // grassi
            {
                
            }
            else // magro
            {
                
            }
            // CAMBIA MODELLINO FEMMINILE
            // USANDO LA VISIBILITà
            
        }

        // METODI PER CALCOLARE L'IMMAGINE GIUSTA DALLA MATRICE 3X3
        //  4 METODI 2 PER L'UOMO 2 PER LA DONNA
        private void calcolaMPeso(int peso) {
            if (peso < 60) {
                x = 1;
            } else if(peso <=80){
                x = 2;
            }
            else{
                x=3;
            }

        }

        private void calcolaMAltezza(int altezza) {
            if (altezza < 150) {
                y = 1;
            } else if (altezza <= 175) {
                y = 2;
            } else {
                y = 3;
            }
        }

        private void calcolaFPeso(int peso) {
            if (peso < 50) {
                x = 1;
            } else if(peso <=70){
                x = 2;
            }else{
                x=3;
            }

        }

        private void calcolaFAltezza(int altezza) {
            if (altezza < 110) {
                y = 1;
            } else if (altezza <= 165) {
                y = 2;
            } else {
                y = 3;
            }
        }

    }

}
