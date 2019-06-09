package com.code;
import java.util.Date;

public class Personne {

    private String nom;
    private String prenom;
    private Date date_n;


    public Personne (String n,String p,int j,int m, int a){
        Date d= new Date(a-1900,m,j);
        nom=n; prenom=p; date_n=d;
    }

    public String getNom() {      return nom;   }

    public String getPrenom() {      return prenom;   }

    public Date getDate_n() {      return date_n;   }

   public void setnom (String n){nom=n;}

    public void setPrenom(String prenom) {    this.prenom = prenom;    }

    public void setDate_n(int j,int m,int a){
        Date D= new Date(a-1900,m,j);
        date_n=D;
    }
}