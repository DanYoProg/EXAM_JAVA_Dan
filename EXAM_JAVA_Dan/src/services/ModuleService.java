package services;

import java.util.ArrayList;

import repository.ModuleRopo;

public class ModuleService {
 private ModuleRopo classeRepo=new ModuleRopo();

    public int insert(Module module){
        return moduleRepo.insert(module);
    }
 
    public Mdule selectById(int id){
        return classeRepo.oneById(id);
  }

}
