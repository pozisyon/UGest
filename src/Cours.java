 class Cours {
    private String codeCours;
    private String nomCours;
    private int credit;

    public Cours(String cC, String nC,int cr){
        codeCours = cC;
        nomCours = nC;
        credit = cr;

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
     public void setNombreCredit(int cr){
        credit = cr;
     }
     public int getNombreCredit(){
        return credit;
     }
 }
