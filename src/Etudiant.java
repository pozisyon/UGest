import java.util.*;
class Etudiant  extends Personne{

    private String codeProgramme;
    private ArrayList<Cours> listeCours;

    public Etudiant(String id,String nom,String prenom, String telephone,String adresse,String cP){
        super(id,nom,prenom,telephone,adresse);

        codeProgramme = cP;
    }
    public Etudiant(String id,String nom,String prenom, String telephone,String adresse,String cP,ArrayList<Cours> lC){
        super(id,nom,prenom,telephone,adresse);
        codeProgramme = cP;
        listeCours = lC;
    }



    public void setCodeProgramme(String cP){
        codeProgramme = cP;
    }
    public String getCodeProgramme(){
        return codeProgramme;
    }

    public void setListeCours(ArrayList<Cours> lC){
        listeCours = lC;

    }
    public ArrayList<Cours> getListeCours(){
        return listeCours;
    }

}
