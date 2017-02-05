package com.etudiants;



public class Etudiant {
	
	
    private String CNE;
    private String Nom;
    private String Prenom;
    private String sex;
    private String filiere;
    private String semestre;

    public Etudiant() {
        CNE="";
        Nom="Anonyme";
        Prenom="";
        sex="";
        filiere="";
        semestre="";
    }
    
    public Etudiant(String CNE, String Nom, String Prenom) {
        this.CNE = CNE;
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    public Etudiant(String CNE, String Nom, String Prenom, String sex, String filiere, String semestre) {
        this.CNE = CNE;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.sex = sex;
        this.filiere = filiere;
        this.semestre = semestre;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    
    public String getCNE() {
        return CNE;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    @Override
    public String toString() {
        return CNE ;
    }
}
