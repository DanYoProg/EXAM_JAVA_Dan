package services;

import java.util.ArrayList;

import entities.ModuleCours;

public class ModuleCoursRepoService {

    private ModuleCoursRepoService moduleCoursRepo= new ModuleCoursRepoService();
    private ModuleRepo moduleRepo= new moduleRepo();
    private CoursRepo coursRepo = new CoursRepo();

    public void insert(ModuleCours moduleCours){
        moduleCoursRepo.insert(modulecours);
    }

    public ArrayList<modulecours> selectByCours(Cours cours){
        ArrayList<ModuleCours> modulecours = ModuleCoursRepoService.allByCours(cours);
        for (int i = 0; i < modulecours.size(); i++) {
            modulecours.get(i).setModule((moduleRepo.oneById(coursRepo.get(i).getModule().getId())));
            modulecours.get(i).setCours(coursRepo.oneById(coursRepo.get(i).getCours().getId()));
        }
        return modulecours;
    }
}
