 class Cours {
    private String codeCours;
    private String nomCours;
    private String description;
    private int nbreEtudiant;

    public Cours(String cC, String nC,String des,int nE){
        codeCours = cC;
        nomCours = nC;
        description = des;
        nbreEtudiant = nE;

    }

     public void setCodeCours(String cC) {
         codeCours = cC;
     }
     public String getCodeCours(){
        return codeCours;
     }
     public void setNomCours(String nC){
        nomCours = nC;
     }
     public String getNomCours(){
        return nomCours;
     }
     public void setDescriptionCours(String des){
        description = des;
     }
     public String getDescription(){return description;}
     public void setNombreEtudiantMax(int nE){
        nbreEtudiant= nE;
     }
     public int getNombreEtudiantMax(){
        return nbreEtudiant;
     }
 }
