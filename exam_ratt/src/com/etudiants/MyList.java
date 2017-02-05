package com.etudiants;

import java.awt.HeadlessException;
import java.awt.List;
import java.util.HashMap;
import java.util.Map;

public class MyList extends List{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Etudiant> collectionEtudiants;

	    public MyList() {
	        super();
	        collectionEtudiants = new HashMap<String, Etudiant>();
	    }
  //le nombre des ligne mt3lka b les listes dyal out 
	    public MyList(int rows) throws HeadlessException {
	        super(rows);
	        collectionEtudiants = new HashMap<String, Etudiant>();
	    }
	    
	    public void AjouterEtudiant(Etudiant etudiant){
	        
	        collectionEtudiants.put(etudiant.getCNE(), etudiant);
	        //this.add(etudiant.getCNE());
	        this.add(etudiant.toString());
	    }
	    
	    public Etudiant getSelectedEtudiant(){
	        
	        Etudiant etudiant= new Etudiant();
	        String cne= this.getSelectedItem();
	        etudiant=(Etudiant) collectionEtudiants.get(cne);
	        return etudiant;
	        }
	    }
