import java.util.*;
class Etudiant  extends Personne{

    private String codeProgramme;
    private String codePermanent;
    private ArrayList<Cours> listeCours;

    public Etudiant(String nom,String prenom, String telephone,String adresse,String cP){
        super(nom,prenom,telephone,adresse);

        codeProgramme = cP;
    }
    public Etudiant(String nom,String prenom, String telephone,String adresse,String cPermanent,String cP,ArrayList<Cours> lC){
        super(nom,prenom,telephone,adresse);
        codePermanent = cPermanent;
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
    public void setCodePermanent(String codeP){
        codePermanent = codeP;
    }
    public String getCodePermanent(){
        return codePermanent;
    }

}
