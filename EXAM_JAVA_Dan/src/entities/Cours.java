package entities;

import java.sql.Date;

public class Cours {
    private int id;
    private String  libelle;
    private Date  date;
    private int heureDb;
    private int heureFin;
    private String proffesseur;
    private String module ;
    public Cours(int id, String libelle, Date date, int heureDb, int heureFin, String proffesseur, String module) {
        this.id = id;
        this.libelle = libelle;
        this.date = date;
        this.heureDb = heureDb;
        this.heureFin = heureFin;
        this.proffesseur = proffesseur;
        this.module = module;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getHeureDb() {
        return heureDb;
    }
    public void setHeureDb(int heureDb) {
        this.heureDb = heureDb;
    }
    public int getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }
    public String getProffesseur() {
        return proffesseur;
    }
    public void setProffesseur(String proffesseur) {
        this.proffesseur = proffesseur;
    }
    public String getModule() {
        return module;
    }
    public void setModule(String module) {
        this.module = module;
    }
 }
