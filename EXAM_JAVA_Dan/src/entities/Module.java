package entities;

import java.util.ArrayList;

public class Module {
    private int id;
    private String  nom;
    public Module(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public int getId() {
        return id;
    }

    
  private ArrayList<ModuleCours> Cours = new ArrayList<>();


    public Module() {
}
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public ArrayList<ModuleCours> getProfs() {
        return profs;
    }
    public void setProfs(ArrayList<ModuleCours> profs) {
        this.profs = profs;
    }
   
}


