package CP;
//  IMPORT DEI PANNELLI

import CP.pannelli.pnlRegistrazione;
import CP.pannelli.pnlRegistrazione1;
import CP.pannelli.pnlHome;
import CP.pannelli.pnlSchermata1;

//  IMPORT DELLE ECCEZIONI
// PER ORA LE HO MESSE TUTTE;
import eccezioni.AltezzaNonValidaException;
import eccezioni.CirconferenzaVitaNonValidaException;
import eccezioni.CognomeNonValidoException;
import eccezioni.EtaNonValidaException;
import eccezioni.LarghezzaSpalleNonValidaException;
import eccezioni.NomeNonValidoException;
import eccezioni.TagliaNonValidaException;
import eccezioni.PasswordNonValidaException;
import eccezioni.PesoNonValidoException;

// IMPORT LIBRERIE PER IMPLEMENTARE ActionListener
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// IMPORT PER FILE
import java.io.*;

//  IMPORT GUI PER JOptionPane
import javax.swing.JOptionPane;

public class Listener implements ActionListener {

    private Utenza utente = new Utenza();

    // ATTRIBUTI PER SCEGLIERE IL MODELLINO
    private int x = 2;
    private int y = 2;
    
    // CREO I PANNELLI PER POTER PRENDERE I DATI 
    private pnlSchermata1 schermata1; // 1

    private pnlRegistrazione re;   // 2.1 registazione
    private pnlRegistrazione1 re1;

    private pnlHome home;

    // DEVO PASSARE QUELLI VERI TRAMITE IL COSTRUTTORE
    public Listener(pnlSchermata1 schermata1, pnlRegistrazione re, pnlRegistrazione1 re1, pnlHome home) {
        this.schermata1 = schermata1;
        this.re = re;
        this.re1 = re1;
        this.home = home;
    }

    // I  JOptionPane  PUOI USARLI PER Conferma (Sì/No):
    //  CATTURA TUTTI GLI EVENTI DEI VARI PANNELLI PER LA REGISTRAZIONE
    public void actionPerformed(ActionEvent e) {

        // PRENDE IL NOME DEL COMANDO ASSEGNATO NEL COSTRUTTORE DEL PANNELLO CHE GENEREA L'ECCEZIONE
        String comando = e.getActionCommand();

        switch (comando) {
            case "Avanti": {
                avanti();
            }
            break;
            case "Conferma registrazione": {
                registrati();
            }
            break;
            case "Registrazione": {
                // DALLA SCHERMATA1 SI PASSA A REGISTRAZIONE

                schermata1.setVisible(false);
                re.setVisible(true);
            }
            break;
            case "Accedi": {
                this.accedi();
            }
            break;
        }
    }

    //  METODI PER LETTURA E SCRITTURA SU FILE
    // GESTIRE DUE UTENTI OMONIMI
    public void leggiUtente() {
        // PRIMA DI LEGGERE L'UTENTE 
        //METTO IM MINUSCOLO IL NOME E COGNOME PER CONVENZIONE
        //utente.setNome(utente.getNome().toLowerCase());
        //utente.setCognome(utente.getCognome().toLowerCase());

        // PERO ORA NON SERVE PERCHè LO FACCIO GIà QUANDO CNTROLLO L'ESISTENZA
        try {
            FileInputStream f = new FileInputStream("src/data/utenti/" + utente.getNome() + utente.getCognome() + ".dat");
            ObjectInputStream fIN = new ObjectInputStream(f);

            this.utente = (Utenza) fIN.readObject();

        } catch (IOException e) {
             JOptionPane.showMessageDialog(null, "Errore di I/O del file", "Errore", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "Errore classe non trovata", "Errore", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void scriviUtente() {
        // PRIMA DI SALVARE L'UTENTE 
        //METTO IM MINUSCOLO IL NOME E COGNOME PER CONVENZIONE
        utente.setNome(utente.getNome().toLowerCase());
        utente.setCognome(utente.getCognome().toLowerCase());

        try {
            FileOutputStream f = new FileOutputStream("src/data/utenti/" + utente.getNome() + utente.getCognome() + ".dat");
            ObjectOutputStream fOUT = new ObjectOutputStream(f);

            fOUT.writeObject(utente);

            fOUT.flush();
            fOUT.close();
        } catch (IOException e)// INPUT / OUTPUT
        {
            JOptionPane.showMessageDialog(null, "Errore di I/O del file", "Errore", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e)// ECCEZIONE GENERALE
        {
            JOptionPane.showMessageDialog(null, "C'è un eccezione", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    //  METODI DEI VARI PULSANTI
    private void accedi() {

        // PRENDO I DATI
        utente.setNome(schermata1.getNome());
        utente.setCognome(schermata1.getCognome());
        utente.setPassword(schermata1.getPassword());

        // VERIFICO LA VALIDITà
        try {
            //  UTILIZZO I METODI STATICI PER LA VALIDAZIONE
            utente.validazionePW();
            utente.controllaNome();
            utente.controllaCognome();

        } catch (PasswordNonValidaException ex) {
            JOptionPane.showMessageDialog(null, "Password non valida", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (CognomeNonValidoException ex) {
            JOptionPane.showMessageDialog(null, "Cognome non valido", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (NomeNonValidoException ex) {
            JOptionPane.showMessageDialog(null, "Nome non valido", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // METTO NOME E COGNOME IN MINUSCOLO PER CONVENZIONE
        utente.setNome(utente.getNome().toLowerCase());
        utente.setCognome(utente.getCognome().toLowerCase());

        //  VALIDITà UTENZA
        File f = new File("src/data/utenti/" + utente.getNome() + utente.getCognome() + ".dat");

        String pw = utente.getPassword();
        if (f.exists()) {  //  L'UTENTE ESISTE

            leggiUtente(); // 

            if (pw.equals(utente.getPassword())) {
                // Accesso consentito

                // PW CORRETTA VADO ALLA HOME
                schermata1.setVisible(false);
                home.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Accesso negato password errata", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        } else {// File non trovato
            JOptionPane.showMessageDialog(null, "Accesso negato credenziali inesistenti", "Errore", JOptionPane.ERROR_MESSAGE);
        }
    }

    // PRIMO PANNELLO REGISTRAZIONE
    private void avanti() {
        //   AVANTI PANNELLO REGISTRAZIONE

        // PRENDO I DATI
        utente.setNome(re.getNome());
        utente.setCognome(re.getCognome());
        utente.setEta(re.getEta());
        utente.setPassword(re.getPassword());

        // CONTROLLARE VALIDITà DI TUTTI I DATI
        try {
            //  UTILIZZO I METODI STATICI PER LA VALIDAZIONE
            utente.validazionePW();
            utente.controllaNome();
            utente.controllaCognome();
            utente.controllaEta();

            // I METDI LANCIANO ECCEZIONI 
        } catch (PasswordNonValidaException ex) {

            //   metterlo centrato                                         
            JOptionPane.showMessageDialog(null, "Password non valida", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (EtaNonValidaException ex) {
            JOptionPane.showMessageDialog(null, "Età non valida", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (CognomeNonValidoException ex) {
            JOptionPane.showMessageDialog(null, "Cognome non valido", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (NomeNonValidoException ex) {
            JOptionPane.showMessageDialog(null, "Nome non valido", "Errore", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // DA REGISTRAZIONE A REGISTRAZIONE1
        re.setVisible(false);
        re1.setVisible(true);
    }

    // PASSAGGIO FINALE DELLA REGISTRAZIONE
    private void registrati() {
        //  CONFERMA REGISTRAZIONE

        //  PRENDO I DATI DAI JSpinner E DAL JComboBox
        utente.setEta(re1.getEta());
        utente.setAltezza(re1.getAltezza());
        utente.setPeso(re1.getPeso());
        utente.setTagliaAbituale(re1.getTaglia());

        // CONTROLLARE VALIDITà DI TUTTI I DATI
        try {
            utente.controllaEta();
            utente.controllaAltezza();
            utente.controllaPeso();
            utente.controllaTaglia();

        } catch (EtaNonValidaException ex) {
            JOptionPane.showMessageDialog(null, "Età non valida", "Errore", JOptionPane.ERROR_MESSAGE);
        } catch (AltezzaNonValidaException ex) {
            JOptionPane.showMessageDialog(null, "Altezza non valida", "Errore", JOptionPane.ERROR_MESSAGE);
        } catch (PesoNonValidoException ex) {
            JOptionPane.showMessageDialog(null, "Peso non valido", "Errore", JOptionPane.ERROR_MESSAGE);
        } catch (TagliaNonValidaException ex) {
            JOptionPane.showMessageDialog(null, "Taglia non valida", "Errore", JOptionPane.ERROR_MESSAGE);
        }

        // SCRIVERE SUI FILE CON IL NOME COGNOME E PW
        if (utente.getNome() == null) //  CONTROLLO CHE HO IL NOME COGNOME E PW
        {
            JOptionPane.showMessageDialog(null, "Errore nome vuoto", "Errore", JOptionPane.ERROR_MESSAGE);
            // JoptionPane errore
            return;
        }

        //  UNA VOLTA SALVATE LE CREDENZIALI SI CAMBIA PANNELLO
        scriviUtente();

        // ANDARE ALLA HOME O Schermata1 
        re1.setVisible(false);
        schermata1.setVisible(true);
    }

}
