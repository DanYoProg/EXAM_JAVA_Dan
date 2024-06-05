package entities;

public class ModuleCours {
private int id;
private String Module_nom
private int Cours_id;
public ModuleCours(int id, String module_nom, int cours_id) {
    this.id = id;
    Module_nom = module_nom;
    Cours_id = cours_id;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getModule_nom() {
    return Module_nom;
}
public void setModule_nom(String module_nom) {
    Module_nom = module_nom;
}
public int getCours_id() {
    return Cours_id;
}
public void setCours_id(int cours_id) {
    Cours_id = cours_id;
}
}
