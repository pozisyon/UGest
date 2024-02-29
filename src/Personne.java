class Personne {
    private String id;
    private String nom;
    private String prenom;
    private String telephone;
    private String adresse;


    public Personne(String i,String n,String p, String tel,String adr){
        id = i;
        nom = n;
        prenom = p;
        telephone = tel;
        adresse = adr;

    }
    public void setId(String i){
        id = i;
    }
    public String getId(){
        return id;
    }
    public void setNom(String n){
        nom = n;
    }
    public String getNom(){
        return nom;
    }
    public void setPrenom(String p){
        prenom = p;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setAdresse(String adr){
        adresse = adr;
    }
    public String getAdresse(){
        return adresse;
    }
    public void setTelephone(String tel){
        telephone = tel;
    }
    public String getTelephone(){
        return telephone;
    }
}
