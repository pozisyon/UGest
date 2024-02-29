import java.util.*;
public class Professeur extends Personne{
    private ArrayList<Cours>cEnseiggnes;
    public Professeur(String id,String nom,String prenom, String telephone,String adresse){
        super(id,nom,prenom,telephone,adresse);
         cEnseiggnes = new ArrayList();

    }

    public ArrayList<Cours> getcEnseiggnes() {
        return cEnseiggnes;
    }
    public void setcEnseiggnes(Cours cours){
        cEnseiggnes.add(cours);
    }
}
