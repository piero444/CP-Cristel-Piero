package CP;

//  IMPORT DEI PANNELLI
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
    // DEVO PASSARE QUELLI VERI TRAMITE IL COSTRUTTORE
    public void actionPerformed(ActionEvent e) {

        // PRENDE IL NOME DEL COMANDO ASSEGNATO NEL COSTRUTTORE DEL PANNELLO CHE GENEREA L'ECCEZIONE
        String comando = e.getActionCommand();

        switch (comando) {
            case "": {

            }
            break;
        }

    }

    //  METODI DEI VARI PULSANTI
}
