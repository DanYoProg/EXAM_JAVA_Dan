package services;

import entities.Cours;
import repository.CoursRepo;

public class CoursService {

    private CoursRepo coursRopo=new CoursRepo();

    public Cours selectActuelCours(){
        return coursRopo.actuel();
    }

    public Annee selectById(int id){
        return coursRopo.oneById(id);
    }
  
}
