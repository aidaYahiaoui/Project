package com.code;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Etudiant extends Personne {
    private int matricule;
    static int mat = 0;


    public Etudiant(String n, String p, int j, int m, int a) {
        super(n, p, j, m, a);
        matricule = mat;
        mat++;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void afficherEtudiant() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nom:" + this.getNom() + "\nPrenom:" + this.getPrenom() + "\nMatricule" + this.matricule + "\nDate de naissance:" + formater.format(this.getDate_n()));
    }
}