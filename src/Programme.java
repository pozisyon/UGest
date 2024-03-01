import java.util.*;
public class Programme {
    private int codeProgramme;
    private String nomProgramme;
    private ArrayList<Cours> cours;
    public Programme(int code, String nom, ArrayList<Cours>cours){
        codeProgramme = code;
        nomProgramme= nom;
        cours = cours;

    }

    public void setCodeProgramme(int codeProgramme) {
        this.codeProgramme = codeProgramme;
    }

    public int getCodeProgramme() {
        return codeProgramme;
    }
    public void setNomProgramme(String nom){
        nomProgramme = nom;
    }

    public java.lang.String getNomProgramme() {
        return nomProgramme;
    }

    public void setCoursProgramme(java.util.ArrayList<Cours> cours) {
        this.cours = cours;
    }

    public java.util.ArrayList<Cours> getCoursProgramme() {
        return cours;
    }
}
