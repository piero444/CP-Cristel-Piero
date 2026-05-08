package CP;

//  IMPORT DEI PANNELLI
import CP.pannelli.pnlCalcoloFabbisognoCalorico;
import CP.pannelli.pnlCalcoloIdratazione;
import CP.pannelli.pnlDietaConsigliata;
import CP.pannelli.pnlEserciziConsigliati;
import CP.pannelli.pnlHome;
//  IMPORT DELLE ECCEZIONI
// IMPORT LIBRERIE PER IMPLEMENTARE ActionListener

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// IMPORT PER FILE SE CI SERVIRANNO
import java.io.*;

//  IMPORT GUI PER JOptionPane
import javax.swing.JOptionPane;

// 1 prendere dati utente 
public class ListenerHome implements ActionListener {

    private Utenza utente = new Utenza();

    // CREO I PANNELLI
    private pnlCalcoloFabbisognoCalorico cFB;
    private pnlCalcoloIdratazione idratazione;
    private pnlDietaConsigliata dieta;
    private pnlEserciziConsigliati esercizi;
    private pnlHome home;
    
    private String scelta;

    // DEVO PASSARE QUELLI VERI TRAMITE IL COSTRUTTORE
    public ListenerHome(pnlCalcoloFabbisognoCalorico cFB, pnlCalcoloIdratazione idratazione, pnlDietaConsigliata dieta, pnlEserciziConsigliati esercizi,pnlHome home) {
        this.cFB = cFB;
        this.idratazione = idratazione;
        this.dieta = dieta;
        this.esercizi = esercizi;
        this.home=home;
    }

    public void actionPerformed(ActionEvent e) {

        // PRENDE IL NOME DEL COMANDO ASSEGNATO NEL COSTRUTTORE DEL PANNELLO CHE GENEREA L'ECCEZIONE
        String comando = e.getActionCommand();

        switch (comando) {
            case "Ritorna al menu di scelta": {
                // NEL DUBBIO METTO TUTTI INVISIBILI
                cFB.setVisible(false);
                idratazione.setVisible(false);
                dieta.setVisible(false);
                esercizi.setVisible(false);
                
                // E RIMETTO VISIBILE SOLO LA HOME
                home.setVisible(true);
            }
            break;
            case "Salva i miei progressi e il mio modellino": {
                //  CAPIRE A CHE PANNELLO MANDARE 
                scelta= home.getScelta();
                switch(scelta)
                {
                    case"Esercizi consigliati":
                    {
                        home.setVisible(false);
                        esercizi.setVisible(true);
                    }
                    break;
                    case"Calcolatore fabbisogno calorico":
                    {
                        home.setVisible(false);
                        cFB.setVisible(true);
                    }
                    break;
                    case"Calcolatore idratazione giornaliera":
                    {
                        home.setVisible(false);
                        idratazione.setVisible(true);
                    }
                    break;
                    case"Dieta consigliata":
                    {
                        home.setVisible(false);
                        dieta.setVisible(true);
                    }
                    break;
                }
            }
            break;
        }

    }

    //  METODI DEI VARI PULSANTI
}
