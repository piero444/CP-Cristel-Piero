package CP;
//  IMPORTO TUTTI I PANNELLI
import CP.pannelli.pnlRegistrazione;
import CP.pannelli.pnlRegistrazione1;
import CP.pannelli.pnlHome;
import CP.pannelli.pnlSchermata1;

import CP.pannelli.pnlCalcoloFabbisognoCalorico;
import CP.pannelli.pnlCalcoloIdratazione;
import CP.pannelli.pnlDietaConsigliata1;
import CP.pannelli.pnlEserciziConsigliati;
import CP.pannelli.pnlObbiettivo;

public class frmPrincipale extends javax.swing.JFrame {

    // DICHIARO LA CLASSE ASCOLTATORE
    private Listener listener;

    // ALTRI ASCOLTATORI PER DOPO LA REGISTRAZIONE
    private ListenerHome listenerHome;

    // DICHIARO TUTTI I PANNELLI 
    private pnlSchermata1 schermata1;
    private pnlRegistrazione re;
    private pnlRegistrazione1 re1;
    private pnlHome home;

    // ALTRI PANNELLI PER DOPO LA REGISTRAZIONE
    private pnlCalcoloFabbisognoCalorico cFB;
    private pnlCalcoloIdratazione idratazione;
    private pnlDietaConsigliata1 dieta;
    private pnlObbiettivo obbiettivo;
    private pnlEserciziConsigliati esercizi;

    public frmPrincipale() {
        initComponents();

        // SETTO LA DIMENSIONE E LA POSIZIONE DELLA FINESTRA
        setSize(1000, 800);
        setLocationRelativeTo(null);

        // IMPOSTO IL LAYOUT A NULL PER PORTE METTERE I PANNELLI LIBERAMENTE
        setLayout(null);
        //BLOCCO LA POSSIBILITA' DI MODIFICARE LE DIMENSIONI DELLA FINESTRA
        setResizable(false);
        //  COSTRUISCO TUTTI PANNELLI
        schermata1 = new pnlSchermata1();
        re = new pnlRegistrazione();
        re1 = new pnlRegistrazione1();
        home = new pnlHome();

        //  PASSO TUTTI I PANNELLI AL ASCOLTATORE
        //      THIS PER PASSARE QUESTO FRAME
        listener = new Listener(this,schermata1, re, re1, home);

        this.setTitle("Schermata accesso");
        
        // PASSO TRAMITE IL METODO SET L'ASCOLTATORE
        re.setListener(listener);
        re1.setListener(listener);
        schermata1.setListener(listener);

        // AGGIUNGO OGNI PANNELLO AL FRAME
        add(schermata1);
        add(re);
        add(re1);
        add(home);

        // SETTO LA POSIZIONE E LA DIMENSIONE DEI PANNELLI
        schermata1.setBounds(0, 0, 1000, 800);
        re.setBounds(0, 0, 1000, 800);
        re1.setBounds(0, 0, 1000, 800);
        home.setBounds(0, 0, 1000, 800);

        // SETTO LE VISIBLITà PER FARE IN MODO CHE ALL'INIZIO SI VEDA SOLO SCHERMATA1
        schermata1.setVisible(true);
        re.setVisible(false);
        re1.setVisible(false);
        home.setVisible(false);

        // QUI  AGGIUNGO I PANNELLI E I DUE ASCOLTATORI CHE GESTIRANNO GLI EVENTI FINTA LA REGISTRAZIONE
        
        cFB = new pnlCalcoloFabbisognoCalorico();
        idratazione = new pnlCalcoloIdratazione();
        dieta = new pnlDietaConsigliata1();
        obbiettivo=new pnlObbiettivo();
        esercizi = new pnlEserciziConsigliati();

        listenerHome = new ListenerHome(cFB, idratazione, dieta,obbiettivo, esercizi,home,listener);
        
        home.setListener(listenerHome);
        cFB.setListener(listenerHome);
        idratazione.setListener(listenerHome);
        dieta.setListener(listenerHome);
        obbiettivo.setListener(listenerHome);
        obbiettivo.setListener1(listener);
        esercizi.setListener(listenerHome);

        add(cFB);
        add(idratazione);
        add(dieta);
        add(obbiettivo);
        add(esercizi);

        cFB.setBounds(0, 0, 1000, 800);
        idratazione.setBounds(0, 0, 1000, 800);
        dieta.setBounds(0, 0, 1000, 800);
        obbiettivo.setBounds(0, 0, 1000, 800);
        esercizi.setBounds(0, 0, 1000, 800);

        cFB.setVisible(false);
        idratazione.setVisible(false);
        dieta.setVisible(false);
        obbiettivo.setVisible(false);
        esercizi.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
        com.formdev.flatlaf.FlatLightLaf.setup();
        javax.swing.UIManager.put( "Component.arc", 12 );
    } catch (Exception ex) {
        System.err.println("Errore setup FlatLaf");
    }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
