class Ville {
    private Pays pays;
    private String nomVille;
    public Ville(Pays p, String nV){
        pays = p;
        nomVille = nV;
    }
    public void setNomVille(String nV){
        nomVille = nV;
    }
    public String getNomVille(){
        return nomVille;
    }
    public void setPays(Pays p){
        pays = p;
    }

    public Pays getPays(){
        return pays;
    }
}
