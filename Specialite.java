package com.code;

import java.util.*;

public class Specialite {

    private String nom;
    private Filiere Filiere;
    private int annee; //ANNEE SCOLAIRE ?
    private List<Etudiant> etd;

    public Specialite(String n,Filiere f,int a){
        nom=n; Filiere=f; annee=a;
    }

    public String getNom() {   return nom;  }

    public void setNom(String nom) {   this.nom = nom;   }

    public int getAnnee() {  return annee;  }

    public Filiere getFiliere() { return Filiere;  }

    public List<Etudiant> getEtd() {
        return etd;
    }


    public void ajoutEtudiant(String nom, String prenom, int j, int m, int a){
        Etudiant etudiant = new Etudiant(nom,prenom,j,m,a);
        etd.add(etudiant);
    }

    public void afficher ()
    {
        for(Etudiant i:this.etd){ i.afficherEtudiant();}
    }
}
