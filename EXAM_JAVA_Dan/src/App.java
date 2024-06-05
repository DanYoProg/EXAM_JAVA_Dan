import java.util.ArrayList;
import java.util.Scanner;

import entities.Cours;
import services.CoursService;
import services.ModuleCoursRepoService;
import services.ModuleService;

 public class App {
    private static Scanner scanner=new Scanner(System.in);
      
    private static CoursService CoursService=new CoursService();
    private static ModuleService ModuleService=new ModuleService();
    private static ModuleCoursRepoService ModuleCoursRepo=new ModuleCoursRepoService();


   public static Module recherModule(ArrayList<Module> Module, Module module){
        for (Module md : module) {
            if (md.getId()==module.getId()){
                return md;
            }
        }
        return null;
    }

    }



    public static void main(String[] args) throws Exception { 

 int choix, choix_cours;
        Cours cours;
        Module module;
        ArrayList<Cours> cours;
        connexion();

        do {
            System.out.println("---------------- MENU ------------------"); 
            System.out.println("\n1-Creer un Module ");
            System.out.println("2- Lister les Modules");
            System.out.println("3- Créer un cours");
            System.out.println("4- Lister les  tous les cours");
            System.out.println("5- Lister les  les cours  d’un module et d’un professeur");
            System.out.println("6- Quitter");
            choix = scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                module = new module();
                System.out.print("Entrer le Nom du Module: ");
                module.setnom(scanner.nextLine());
                // 
                if (moduleService.insert(module)!=-1){
                    System.out.println("\n*********************  REUSSI **********************\n");
                }else{
                    System.out.println("\n**********************  ECHEC **********************n");
                }
            
                break;


                case 2:
                System.out.println("\n********************** LES MODULES **********************n");
                for (Module cl : moduleService.select()) {
                    System.out.println("Id: "+md.getId());
                    System.out.println("Module: "+cl.getNom()+"\n");
                }
            break;

            case 3:
                        Cours=new ArrayList<>();
                        // 
                        Cours= new cours();
                        // 
                        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Entrer le nom du Cours: ");
                        Cours.setLibelle(scanner.nextLine());
                        System.out.print("Entrer la date du cours: ");
                        Cours.setdate(scanner.nextLine()); 
                        System.out.print("Entrer l heure de debut du Cours: ");
                        Cours.setheureDb(scanner.nextLine());
                        System.out.print("Entrer l heure de Fin du Cours: ");
                        Cours.setheureFin(scanner.nextLine()); 
                        System.out.print("Entrer le nom du professeur de ce Cours: ");
                        Cours.setproffesseur(scanner.nextLine()); 
                        System.out.print("Entrer le nom du module correspondat au cours: ");
                        Cours.setmodule(scanner.nextLine()); 
                        
                        break;
                        
                      

                

    }








}


}
