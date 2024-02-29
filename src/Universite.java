import java.util.*;
class Universite{
    private String codeU;
    private String nomUniversite;
    private String slogan;
    private Date dateFondation;
    private String email;
    private String telephone;
    private String webSite;
    private String adresse;
    private String codePostale;
    private Ville ville;
    private double longitude;
    private double latitude;

    public Universite(String cU,String nU){
        codeU = cU;
        nomUniversite = nU;
    }
    public Universite(String cU,String nU, String sl){
        codeU = cU;
        nomUniversite = nU;
        slogan = sl;

    }
    public Universite(String cU,String nU, String sl,Date dFond){
        codeU = cU;
        nomUniversite = nU;
        slogan = sl;
        dateFondation = dFond;

    }
    public Universite(String cU,String nU, String sl,Date dFond,String em,String tel,String web){
        codeU = cU;
        nomUniversite = nU;
        slogan = sl;
        dateFondation = dFond;
        email = em;
        telephone = tel;
        webSite = web;

    }

    public Universite(String cU,String nU, String sl,Date dFond,String adr,Ville vil, String cod){
        codeU = cU;
        nomUniversite = nU;
        slogan = sl;
        dateFondation = dFond;
        adresse = adr;
        ville = vil;
        codePostale = cod;


    }
    public Universite(String cU,String nU, String sl,Date dFond,String adr,Ville vil, String cod,double lon,double lat){
        codeU = cU;
        nomUniversite = nU;
        slogan = sl;
        dateFondation = dFond;
        adresse = adr;
        ville = vil;
        codePostale = cod;
        longitude = lon;
        latitude = lat;

    }

    public void setCodeU(String cU) {
        codeU = cU;
    }

    public String getCodeU() {
        return codeU;
    }

    public void setNomUniversite(String nU){
        nomUniversite = nU;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }


    public void setSlogan(String slogan) {
        slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }
    public void setDateFondation(Date dFond){
        dateFondation = dFond;
    }

    public Date getDateFondation(){
        return dateFondation;
    }
    public void setAdresse(String ad){
        adresse = ad;

    }
    public String getAdresse(){
        return adresse;
    }
    private void setEmail(String em){
        email = em;
    }
    private String getEmail(){
        return email;
    }
    private void setTelephone(String tel){
        telephone = tel;
    }
    private String getTelephone(){
        return telephone;
    }
    public void setWebSite(String web){
        webSite = web;
    }
    public String getWebSite(){
        return webSite;
    }
    public void setVille(Ville v){
        ville = v;
    }
    public Ville getVille(){
        return  ville;
    }
    public void setCodePostale(String cod){
        codePostale = cod;
    }
    public String getCodePostale() {
        return codePostale;
    }

    public void setLongitude(double lon) {
        longitude = lon;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double lat) {
        latitude = lat;
    }

    public double getLatitude() {
        return latitude;
    }
}
