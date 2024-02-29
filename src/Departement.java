class Departement {

    private String codeDepartement;
    private String nomDepartement;

    public Departement(String cd, String nD){
        codeDepartement = cd;
        nomDepartement = nD;
    }
    public void setCodeDepartement(String cd){
        codeDepartement = cd;

    }
    public String getCodeDepartement(){
        return codeDepartement;
    }

    public void setNomDepartement(String nD ){
        nomDepartement = nD;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }
}
