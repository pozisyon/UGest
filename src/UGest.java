import java.util.*;
public class UGest {

    public void menuPrincipal(){
        boolean quitter = false;
        while(!quitter){

              System.out.println("*\n\n-----------------------------------   MENU  ----------------------------------------\n");
              System.out.println("\t\t1-Inscription");
              System.out.println("\t\t2-Personnel");
              System.out.println("\t\t3-Programme");
              System.out.println("\t\t4-Cours");
              System.out.println("\t\t5-Departement");
              System.out.println("\t\t5-Quitter");

              System.out.println("\n\tFaites votre choix dans le menu");
              Scanner sc = new Scanner(System.in);
              int choix = sc.nextInt();

              switch (choix) {

                             case 1:
                                 sousMenuInscription();
                                break;
                             case 2:
                                 sousMenuPersonnel();
                                  break;
                             case 3:
                                    sousMenuProgramme();
                                break;
                             case 4:
                                    sousMenuCours();
                                 break;
                             case 5:
                                 sousMenuDepartement();
                                break;
                             case 6:
                                 System.exit(0);
                                 break;


              }


        }


    }
    public void sousMenuDepartement(){
        boolean back = false;
        while(!back){

            System.out.println("*\n\n-----------------------------------   MENU  ----------------------------------------\n");
            System.out.println("\t\t1-Creer Departement");
            System.out.println("\t\t2-Afficher Departement");
            System.out.println("\t\t3-Modifier Departement");
            System.out.println("\t\t4-Retour");

            System.out.println("\n\tFaites votre choix dans le menu");
            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();

            switch (choix) {

                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    back =true;
                    break;

            }


        }

    }
    public void sousMenuPersonnel(){
        boolean back = false;
        while(!back){

            System.out.println("*\n\n-----------------------------------   MENU  ----------------------------------------\n");
            System.out.println("\t\t1-Creer Etudiant");
            System.out.println("\t\t2-Creer Professeur");
            System.out.println("\t\t3-Aficher Etudiant");
            System.out.println("\t\t4-Afficher Professeurt");
            System.out.println("\t\t5-Modifier Etudiant");
            System.out.println("\t\t6-Modifier Professeurt");
            System.out.println("\t\t7-Retour");


            System.out.println("\n\tFaites votre choix dans le menu");
            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();

            switch (choix) {

                case 1:
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    back =true;

                    break;

            }


        }

    }
    public void sousMenuInscription(){
        boolean back = false;
        while(!back){

            System.out.println("*\n\n-----------------------------------   MENU  ----------------------------------------\n");
            System.out.println("\t\t1-Faire une inscription");
            System.out.println("\t\t2-Afficher Inscription");
            System.out.println("\t\t3-Modifier Inscription");
            System.out.println("\t\t4-Retour");

            System.out.println("\n\tFaites votre choix dans le menu");
            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();

            switch (choix) {

                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    back = true;
                    break;

            }


        }

    }
    public void sousMenuCours(){
        boolean back = false;
        while(!back){

            System.out.println("*\n\n-----------------------------------   MENU  ----------------------------------------\n");
            System.out.println("\t\t1-Creer un cours");
            System.out.println("\t\t2-Rechercher un cours");
            System.out.println("\t\t3-Lister cours");
            System.out.println("\t\t4-Retour");

            System.out.println("\n\tFaites votre choix dans le menu");
            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();

            switch (choix) {

                case 1:
                    break;
                case 2:

                    break;
                case 3:
                        System.out.println("La liste des cours:");
                    break;
                case 4:
                    back = true;
                    break;

            }


        }

    }
    public void sousMenuProgramme(){
        boolean back = false;
        while(!back){

            System.out.println("*\n\n-----------------------------------   MENU  ----------------------------------------\n");
            System.out.println("\t\t1-Creer Programme");
            System.out.println("\t\t2-Afficher Programme");
            System.out.println("\t\t3-Modifier Programme");
            System.out.println("\t\t4-Retour");

            System.out.println("\n\tFaites votre choix dans le menu");
            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();

            switch (choix) {

                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    back = true;
                    break;

            }


        }

    }

}
