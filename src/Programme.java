public class Programme {
    private String codeProgramme;
    private String nomProgramme;
    public Programme(String codeP, String nomP){
        codeProgramme = codeP;
        nomProgramme = nomP;

    }

    public void setCodeProgramme(String codeP) {
        codeProgramme = codeP;
    }
    public String getCodeProgramme(){
        return codeProgramme;
    }
    public void setNomProgramme(String nomP){
        nomProgramme = nomP;

    }
    public String getNomProgramme(){
        return nomProgramme;
    }

}
