package CP;

//  IMPORT DEL PANNELLO
import CP.pannelli.pnlRegistrazione1;

//  IMPORT DELLE ECCEZIONI

// IMPORT LIBRERIE PER IMPLEMENTARE non vanno più bene
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// IMPORT PER I FILE
import java.io.*;

public class ListenerModelli {

    //  9 IMMAGINI .PNG DINAMICHE 
    // OGNI VOLTA CHE CI SERVE LA RICALCOLIAMO
    // PER COMODITà POSSIAMO METTERE IL METODO STATICO
    // OPPURE UNA MINI INTERFACCIA CHE OGNUNO SI CREA IL PROPRIO METODO
    // UTILE PER INDICARE IL PANNELLO E NO DOVER RITORNARE L'IMMAGINE
    
    // DICHIARO IL PANNELLO
    private pnlRegistrazione1 re1;
    
    public ListenerModelli(pnlRegistrazione1 re1)
    {
        this.re1=re1;
    }
    
   switch(comando)
   {
       case "peso":
       {
           // PRENDERE E VALIDARE IL PESO
           
           calcolaMPeso(pesoP);
           
           this.scambiaModellino(peso, altezza);
       }
           break;
       case "altezza":
       {
           // PRENDERE E VALIDARE ALTEZZA
           
           calcolaMAltezza(altezzaP);
           
           this.scambiaModellino(peso,  altezza);
       }
           break;
           
   }
    
    // METODO PER SCAMBIARE IMMAGINE 
    private void scambiaModellino(int peso, int altezza)
    {
        
        this.calcolaModellino(peso, altezza);
        
    }
    
    // METODI PER CALCOLARE L'IMMAGINE GIUSTA DALLA MATRICE 3X3
    private void calcolaMPeso(int peso)
    {
        if(peso< )
        {
            x=1;
        }
        else if(peso <= )
        {
            x=2;
        }
        else
        {
            x=3;
        }
        
        
    }
    private void calcolaMAltezza(int altezza)
    {
        if(altezza< )
        {
            y=1;
        }
        else if(altezza <= )
        {
            y=2;
        }
        else
        {
            y=3;
        }
    }
}


