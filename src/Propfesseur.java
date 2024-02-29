import java.util.*;
class Professeur extends Personne{
    private ArrayList<Cours> listeCours;
    public Professeur(String id,String nom,String prenom, String telephone,String adresse,ArrayList<Cours> lC){
        super(id,nom,prenom,telephone,adresse);
        listeCours = lC;
    }
    public void setListeCours(ArrayList<Cours> lC){
        listeCours = lC;

    }
    public ArrayList<Cours> getListeCours(){
        return listeCours;
    }

}
