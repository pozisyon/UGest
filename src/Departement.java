
import java.util.*;
public class Departement {
    private String nomDepartement;
    private ArrayList<Programme> programme;
    private ArrayList<Professeur>professeur;
    public Departement(String nD, ArrayList<Programme> pr, ArrayList<Professeur>prof){
        nomDepartement = nD;
        programme = pr;
        professeur = prof;

        }
        public void setNomDepartement(String nD){
             nomDepartement=nD;
        }

        public java.lang.String getNomDepartement() {
             return nomDepartement;
         }
         public void setProgrammeDepartement(ArrayList<Programme> pr){
            programme=pr;
         }

    public java.util.ArrayList<Programme> getProgrammeDepartement() {
        return programme;
    }
    public void setProfesseurDepartement(ArrayList<Professeur> prof){
        professeur=prof;
    }

    public java.util.ArrayList<Professeur> getProfesseurDepartement() {
        return professeur;
    }
}
