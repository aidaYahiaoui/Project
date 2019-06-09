package com.code;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Date;

//a suuprimer c juste pour essayer des var aleatoires
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        //Créer liste specialitées
        //LinkedList<Specialite> Sp = new LinkedList<Specialite>();
        List<Specialite> Sp = new ArrayList<Specialite>();

        Specialite S1 = new Specialite("ISIL", Filiere.Informatique, 2019);
        Specialite S2 = new Specialite("ACAD", Filiere.Informatique, 2019);
        Specialite S3 = new Specialite("GTR", Filiere.Informatique, 2019);
        Specialite S4 = new Specialite("STAT", Filiere.mathematique, 2019);
        Specialite S5 = new Specialite("RO", Filiere.RechercheOperationnelle, 2019);

        Sp.add(S1); Sp.add(S2); Sp.add(S3); Sp.add(S4); Sp.add(S5);

        // test affichage de la liste des specialite
       /* for(int i =0; i< Sp.size(); i++)
        {
            System.out.println(Sp.get(i).getNom());
        }*/


       //Creer la liste des Enseignants

        List<Enseignant> listeEnseigant = new ArrayList<Enseignant>();

        Enseignant Ens1= new Enseignant("DJouada","Moussa",20,01,1993,"POO","doctorant",12,S1);
        Enseignant Ens2= new Enseignant("Ahmed","Nacer",20,01,1990,"POO","doctorant",12,S2);
        Enseignant Ens3= new Enseignant("Hemmal","ahmed",20,01,1960,"gl","Professeur",12,S3);
        Enseignant Ens4= new Enseignant("Bencheikhe","Mohamed",04,02,1954,"ProbaStat","maitre assistant A",6,S4);
        Enseignant Ens5= new Enseignant("Mm","Asma",20,01,1993,"stat","Maitre assistant A",12,S5);

        listeEnseigant.add(Ens1);listeEnseigant.add(Ens2);listeEnseigant.add(Ens3);listeEnseigant.add(Ens4);listeEnseigant.add(Ens5);

        //test affichage pour la liste des Enseignant
      /* for(int i =0; i< listeEnseigant.size(); i++)
        {
            SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("nom  "+listeEnseigant.get(i).getNom()+"  prenom  "+listeEnseigant.get(i).getPrenom()+"  date N  "+formater.format(listeEnseigant.get(i).getDate_n())+
                   "  module  "+ listeEnseigant.get(i).getModule()+"  grade  "+ listeEnseigant.get(i).getGrade()+
                    "  nb heure  "+listeEnseigant.get(i).getNb_heure()+"  Sp  "+listeEnseigant.get(i).getSp().getNom());

        }*/
        //test d4qjout sur les listes
      /*  List<Etudiant> listEtudiant = new ArrayList<>();
        int x=0;
        do {
        System.out.println("donner les information necs:");
        Scanner sc = new Scanner(System.in);
        System.out.println("nom:");
        String nom  =sc.nextLine();
        System.out.println("prenom:");
        String prenom  =sc.nextLine();
        System.out.println("Date_n:");
        System.out.println("j:");int j =sc.nextInt();
        System.out.println("m");int m =sc.nextInt();
        System.out.println("a");int a =sc.nextInt();
        System.out.println("Specialité:");
        String specialite  =sc.nextLine();
        Etudiant et =new Etudiant(nom,prenom,j,m,a);

        System.out.println("press 1 to exit ");
        x =sc.nextInt();
        listEtudiant.add(et);
        } while (x==0);
        Etudiant et =new Etudiant("aida","yahiaoui",1,2,2102);
        listEtudiant.add(1,et);
        int i=0;
        for (Etudiant E:listEtudiant)
        {
            listEtudiant.get(i).afficherEtudiant();
            i++;
        }*/
      String s=new String("AIDA");
       boolean w=s.equalsIgnoreCase("aida");
        System.out.println("w="+w);


        /* LISTER ETUDIANTS D'UNE SPECIALITEE
         // on a Sp : la liste chainée des specialitées
          lire(specialité) // a partir de l'interface, specialité de type string
          for (Specialite spe:Sp)
             {if(spe.getNom=specialité){spe.afficherListe;}
         */

        /* LISTER ETUDIANTS D'UN ENSEIGNAT
         // on a Sp : la liste chainée des specialitées Ent : la liste des enseignants
          lire(enseignant) // a partir de l'interface, specialité de type string
          for (Enseigant prof:Ent)
             {if(prof.getNom=enseignant){specialité=prof.getSp;}
          for (Specialite spe:Sp)
             {if(spe.getNom=specialité){spe.afficherListe;}
         */
    }

}