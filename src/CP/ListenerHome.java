package CP;

//  IMPORT DEI PANNELLI
import CP.pannelli.pnlCalcoloFabbisognoCalorico;
import CP.pannelli.pnlCalcoloIdratazione;
import CP.pannelli.pnlDietaConsigliata1;
import CP.pannelli.pnlEserciziConsigliati;
import CP.pannelli.pnlObbiettivo;
import CP.pannelli.pnlHome;
import CP.pannelli.pnlRegistrazione1;
//  IMPORT DELLE ECCEZIONI
// IMPORT LIBRERIE PER IMPLEMENTARE ActionListener

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// IMPORT PER FILE SE CI SERVIRANNO
import java.io.*;
import javax.swing.ImageIcon;

//  IMPORT GUI PER JOptionPane
import javax.swing.JOptionPane;

// 1 prendere dati utente 
public class ListenerHome implements ActionListener {

    private Utenza utente = new Utenza();

    // CREO I PANNELLI
    private pnlCalcoloFabbisognoCalorico cFB;
    private pnlCalcoloIdratazione idratazione;
    private pnlDietaConsigliata1 dieta;
    private pnlObbiettivo obbiettivo;
    private pnlEserciziConsigliati esercizi;
    private pnlHome home;
    private Listener listener;

    private String scelta;
    private int x;
    private int y;
    private ImageIcon immagine;
    private ImageIcon immagine1;

    // DEVO PASSARE QUELLI VERI TRAMITE IL COSTRUTTORE
    public ListenerHome(pnlCalcoloFabbisognoCalorico cFB, pnlCalcoloIdratazione idratazione, pnlDietaConsigliata1 dieta, pnlObbiettivo obbiettivo, pnlEserciziConsigliati esercizi, pnlHome home, Listener listener) {
        this.cFB = cFB;
        this.idratazione = idratazione;
        this.dieta = dieta;
        this.obbiettivo = obbiettivo;
        this.esercizi = esercizi;
        this.home = home;
        this.listener = listener;
    }

    public void actionPerformed(ActionEvent e) {

        // PRENDE IL NOME DEL COMANDO ASSEGNATO NEL COSTRUTTORE DEL PANNELLO CHE GENEREA L'ECCEZIONE
        String comando = e.getActionCommand();

        x = listener.getXImmagine();
        y = listener.getYImmagine();

        utente = listener.getUtente();

        if (listener.getSesso()) {
            immagine = new ImageIcon(getClass().getResource("/data/ModFemmine/f" + y + x + ".png"));
        } else {
            immagine = new ImageIcon(getClass().getResource("/data/ModMaschi/m" + y + x + ".png"));
        }

        switch (comando) {
            case "Torna alla home": {
                // NEL DUBBIO METTO TUTTI INVISIBILI
                cFB.setVisible(false);
                idratazione.setVisible(false);
                dieta.setVisible(false);
                esercizi.setVisible(false);

                // E RIMETTO VISIBILE SOLO LA HOME
                home.setVisible(true);
            }
            break;
            case "Esercizi": {

                esercizi.impostaModellino(immagine);
                if(obbiettivo.getJ()==0)
                {
                    JOptionPane.showMessageDialog(null, "inserire il peso desiderato", "Errore", JOptionPane.ERROR_MESSAGE);
                }
                if (listener.getSesso()) {
                    immagine1 = new ImageIcon(getClass().getResource("/data/ModFemmine/f" + obbiettivo.getJ() + x + ".png"));
                } else {
                    immagine1 = new ImageIcon(getClass().getResource("/data/ModMaschi/m" + obbiettivo.getJ() + x + ".png"));
                }
                esercizi.impostaModellinoDesiderato(immagine1);
                obbiettivo.setVisible(false);
                esercizi.setVisible(true);
            }
            break;
            case "Conferma": {
                //  CAPIRE A CHE PANNELLO MANDARE 
                scelta = home.getScelta();
                switch (scelta) {
                    case "Esercizi consigliati": {

                        // IMPOSTO LA LABEL E IL MODELLINO
                        obbiettivo();

                        obbiettivo.impostaModellino(immagine);
                        home.setVisible(false);
                        obbiettivo.setVisible(true);
                    }
                    break;
                    case "Calcolatore fabbisogno calorico": {

                        fabbisognoCalorico();

                        cFB.impostaModellino(immagine);

                        home.setVisible(false);
                        cFB.setVisible(true);
                    }
                    break;
                    case "Calcolatore idratazione giornaliera": {

                        idratazione();

                        idratazione.impostaModellino(immagine);

                        home.setVisible(false);
                        idratazione.setVisible(true);
                    }
                    break;
                    case "Dieta consigliata": {

                        dieta();

                        dieta.impostaModellino(immagine);

                        home.setVisible(false);
                        dieta.setVisible(true);
                    }
                    break;
                }
            }
            break;
            case "Calcola f": {
                calcolaFabbisognoCalorico();
            }
            break;
            case "Calcola i": {
                calcolaIdratazioneGiornaliera();
            }
            break;
            case "Calcola dieta": {
                consigliaDieta();
            }
            break;
        }

    }

    //  METODI DEI VARI PULSANTI
    // GESTIONE FEEDBACK (LABEL)
    private void esercizi() {

        // COMANDO PER IMPOSTARE LA LABEL
        // nome pnl.setLabel(" feedback ");
        switch (y) // PESO
        {
            case 1: {
                switch (x) // ALTEZZA
                {
                    case 1: {

                    }
                    break;
                    case 2: {

                    }
                    break;
                    case 3: {

                    }
                    break;
                }
            }
            break;
            case 2: {

            }
            break;
            case 3: {

            }
            break;
        }

    }

    private void fabbisognoCalorico() {

    }

    private void idratazione() {

    }

    private void dieta() {

    }

    private void obbiettivo() {

    }

    private void calcolaFabbisognoCalorico() {
        double bmr;
        if (utente.getSesso())// DONNA 
        {
            bmr = 447.593 + (9.247 * utente.getPeso()) + (3.098 * utente.getAltezza()) - (4.330 * utente.getEta());
            cFB.setFabbisogno("<html>Il tuo fabbisogno e' <br>" + bmr + " Kcal/Giorno<br>Questa e' una stima approssimativa</html>");
        } else //    UOMO
        {
            bmr = 88.362 + (13.397 * utente.getPeso()) + (4.799 * utente.getAltezza()) - (5.677 * utente.getEta());
            cFB.setFabbisogno("<html>Il tuo fabbisogno e' <br>" + bmr + " Kcal/Giorno<br>Questa e' una stima approssimativa</html>");
        }
    }

    private void calcolaIdratazioneGiornaliera() {
        double mlPerKg, base;

        if (utente.getEta() < 30) {
            mlPerKg = 40;
        } else if (utente.getEta() <= 55) {
            mlPerKg = 35;
        } else {
            mlPerKg = 30;
        }
        // MOLTIPLICO PER IL PESO
        base = (utente.getPeso() * mlPerKg);

        idratazione.setCalcoloIdratazione("<html>ti è consigliato bere<br>" + base + " Millilitri al giorno<br>se fai attivita fisica devi aggiungere 500 ml per ogni ora in muovimento</html>");
    }

    private void consigliaDieta() {
        double altezzaMetri = utente.getAltezza() / 100.0;
        double bmi = utente.getPeso() / (altezzaMetri * altezzaMetri);

        String dieta1;

        if (bmi < 18.5) {
            // SOTTOPESO
            dieta1 = "<html>Sei sottopeso<br>" + "Colazione abbondante con avena e frutta, pranzo con pasta e legumi,<br>" + "cena con carne/pesce e verdure, 2 spuntini con frutta secca e yogurt.</html>";
        } else if (bmi < 25) {
            // NORMOPESO
            dieta1 = "<html>Sei normopeso<br>" + "Colazione con yogurt e cereali, pranzo con riso/pasta con verdure,<br>" + "cena con proteine magre e insalata, spuntino con frutta fresca.</html>";
        } else {
            // SOVRAPPESO
            dieta1 = "<html>Sei sovrappeso <br>" + "Colazione con fiocchi d avena e te verde, pranzo con insalata proteica,<br>" + "cena con pesce al vapore e verdure grigliate, no spuntini.</html>";
        }

        dieta.setDietaC(dieta1);
    }
}
