package fr.umontpellier.iut.exo1;

import java.time.LocalDate;

public class GestionEtudiants {

    public class Etudiant{
        private String Nom;
        private String Prenom;
        private LocalDate Date_de_naissance;
        private String Adresse_mail;

        public Etudiant(String nom, String prenom, LocalDate date_de_naissance, String adresse_mail, String adresse_postale) {
            Nom = nom;
            Prenom = prenom;
            Date_de_naissance = date_de_naissance;
            Adresse_mail = adresse_mail;
            Adresse_postale = adresse_postale;
        }

        public String toString(){
            String str= "L'étudiant " + Nom + Prenom + " est né le " + Date_de_naissance + " ,son adresse mail est : " + Adresse_mail + " et son adresse postale :" + Adresse_postale;
            return str;
        }

        public void setNom(String Nouveau_nom){
            Nom = Nouveau_nom;
        }

        private String Adresse_postale;

    }

    public static void main(String[] args) {

    }
}
