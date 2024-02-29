import java.util.*;
class Etudiant  extends Personne{
    private String codeUniversite;
    private String codeProgramme;
    private ArrayList<Cours> listeCours;
    public Etudiant(String id,String nom,String prenom, String telephone,String adresse,String cU){
        super(id,nom,prenom,telephone,adresse);
        codeUniversite = cU;
    }
    public Etudiant(String id,String nom,String prenom, String telephone,String adresse,String cU,String cP){
        super(id,nom,prenom,telephone,adresse);
        codeUniversite = cU;
        codeProgramme = cP;
    }
    public Etudiant(String id,String nom,String prenom, String telephone,String adresse,String cU,String cP,ArrayList<Cours> lC){
        super(id,nom,prenom,telephone,adresse);
        codeUniversite = cU;
        codeProgramme = cP;
        listeCours = lC;
    }

    public void setCodeUniversite(String cU){
        codeUniversite = cU;
    }
    public String getCodeUniversite(){
        return codeUniversite;
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
