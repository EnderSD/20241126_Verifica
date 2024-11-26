/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_verifica;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 * 
 * Creazione di una classe riguardante tutti i dati di uno studente
 * Vengono inizializzate le variabili
 * Dopo che l'utente attrivuisce dei valori alle variabili vengono restituite alcune di esse con una condizione
 * Se il voto risulta essere inferiore a 6 verrà comunicato che lo studente è stato riamandato
 * 
 */
public class studente1 {
    
    
    //inizializzazione variabili di tipo privati riguardanti il primo studente
    private String nome;
    private String cognome;
    private double voto_matematica;
    private double voto_italiano;
    private double voto_informatica;
    private double media_generale;
    
    public void dati_studente1(){
        
        //scanner per far inserire all'utente i dati
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire il nome del primo studente: ");
        nome = scan.nextLine();
        
        
        System.out.println("Inserire il cognome del primo studente");
        cognome = scan.nextLine();
        
        System.out.println("Inserire il voto di matematica");
        voto_matematica = scan.nextDouble();
        
        System.out.println("Inserire il voto di italiano");
        voto_italiano = scan.nextDouble();
        
        System.out.println("Inserisci il voto di informatica");
        voto_informatica = scan.nextDouble();
          
        //parte che svolge il calcolo della media generale
        media_generale =  (voto_matematica + voto_italiano + voto_informatica) / 3;

        
        //stampa dati dello studente
        System.out.println("nome primo studente: "+ nome);
        System.out.println("cognome primo studente: "+ cognome);
        
        
        //serie di if riguardanti gli esiti delle varie materie se il voto inserito è minore di 6 verrà comunicato che lo studente è stato rimandato
        
        if(voto_matematica <6){
            
            System.out.println("Lo studente e' stato rimandato in Matematica! la sua media e' di "+ voto_matematica);
            
        }else{
            
            System.out.println("La nmedia dello studente in matematica e' di "+ voto_matematica);
        }
        
        if(voto_italiano <6){
            
            System.out.println("Lo studente e' stato rimandato in Italiano! la sua media e' di "+ voto_italiano);
            
        }else{
            
            System.out.println("La media dello studente in Italiano e' di " + voto_italiano);
                    
        }
        
        if(voto_informatica <6){
            
            System.out.println("Lo studente e' stato rimandato in Informatica! la sua media e' di " + voto_informatica);
            
        }else{
            
             System.out.println("La media dello studente in Informatica e' di " + voto_informatica);

        }
        
        
        //Stampa della media generale dello studente
        System.out.println("La media generale dello studente e' di " + media_generale);
        
        
        
        
        
    }
    
                  
    
}
