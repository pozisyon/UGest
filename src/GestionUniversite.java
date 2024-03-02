import java.util.*;
public class GestionUniversite {
    ArrayList<Departement> departements =  new ArrayList<Departement>();
    public void creerDepartement(String nomDepart){
        Departement departement = new Departement(nomDepart);
        departements.add(departement);

    }
    public void creerDepartement(String nomDepart,ArrayList<Programme> prog){
        Departement departement = new Departement(nomDepart,prog);
        departements.add(departement);

    }
    public void creerDepartement(String nomDepart,ArrayList<Programme> prog,ArrayList<Professeur> prof){
        Departement departement = new Departement(nomDepart,prog,prof);
        departements.add(departement);

    }
    public ArrayList<Departement> getListeDepartement(){
        return departements;
    }
    public void setListeDepartement(ArrayList<Departement> lDepart){
        departements = lDepart;
    }
    public void listerDepartement(ArrayList<Departement> lDepart){
     for(int i=0; i<lDepart.size();i++){
         System.out.println("\t\t"+(i+1)+"\t"+((Departement)lDepart.get(i)).getNomDepartement());

        }

    }
}
