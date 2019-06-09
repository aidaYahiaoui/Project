package com.code;
import java.util.Date;
public class Enseignant extends Personne {
    private String module;
    private String grade;
    private Specialite sp;
    private int nb_heure;


    public Enseignant (String n,String p,int j,int m,int a,String mod,String grd,int nb,Specialite sp){
        super( n, p,j,m,a);
        module=mod;
        grade=grd;
        this.sp=sp;
        nb_heure=nb;
    }

    public Specialite getSp() { return sp; }

    public int getNb_heure() { return nb_heure;  }

    public String getGrade() { return grade; }

    public String getModule() { return module;   }

    public void setGrade(String grade) { this.grade = grade;   }

    public void setNb_heure(int nb_heure) { this.nb_heure = nb_heure;  }

    public void setModule(String module) {  this.module = module; }

    public void setSp(Specialite sp) { this.sp = sp; }
}