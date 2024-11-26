/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_verifica;

/**
 *
 * Marrale Lorenzo
 * 
 * All'interno di questa classe vengono dichiarati 3 array ognuno di essi contiente delle informazioni riguardante un docente
 * Vengono poi create 3 diversi metodi i quali ognuno di essi restituisce i valori assegnati precedentemente nell'array
 * 
 */


public class Docenti {
    
    //inizializzazione di 3 array contententi nella posizione 0 il nome del docente e nella posizione 1 la materia che insegna
    private String[] docente_matematica = {"Capo Bastone", "Matematica"};
    private String[] docente_italiano = {"Mario Bros", "italiano"};
    private String[] docente_informatica = {"Buddha", "Informatica"};
    
    
    
    public void informazioni_docente1(){
        
        //stampa informazioni riguardante il primo docente
        System.out.println("Il primo docente si chiama "+ docente_matematica[0] + " e insegna la seguente materia: "+ docente_matematica[1]);
        
    }
    
    public void informazioni_docente2(){
        
        //stampa informazioni riguardante il secondo docente
        System.out.println("Il secondo docente si chiama "+ docente_italiano[0] + " e insegna la seguente materia "+ docente_italiano[1]);
        
    }
    
    public void informazioni_docente3(){
        
        //stampa informazioni riguardante il terzo docente
        System.out.println("Il terzo docente si chiama "+ docente_informatica[0] + " e insegna la seguente materia " + docente_informatica[1]);
        
    }
    
    
}
