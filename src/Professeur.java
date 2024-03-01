import java.util.*;
public class Professeur extends Personne{
    private ArrayList<Cours>cEnseiggnes;
    private String codeEmploye;
    public Professeur(String nom,String prenom, String telephone,String adresse,String codeEmp){
        super(nom,prenom,telephone,adresse);
         cEnseiggnes = new ArrayList();
         codeEmploye = codeEmp;

    }

    public ArrayList<Cours> getcEnseiggnes() {
        return cEnseiggnes;
    }
    public void setcEnseiggnes(Cours cours){
        cEnseiggnes.add(cours);
    }

    public void setCodeEmploye(java.lang.String codeEmploye) {
        this.codeEmploye = codeEmploye;
    }
    public String getCodeEmploye(){
        return codeEmploye;
    }
}
