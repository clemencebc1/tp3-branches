public class Horaire {
    /** la date d'un horaire */
    private String date;
    /** une heure avec precision */
    private String heure;
    /**une salle  */
    private Salle salle;
    /** un cours pour l'horaire */
    private Cours cours;

    public Horaire(String date, String heure, Salle salle){
        this.date = date;
        this.heure = heure;
        this.salle = salle;
        this.cours = null;
    }
    public void ajoute(Cours cours){
        this.cours = cours;
    }
    
    public String getDate(){
        return this.date;
    }
    public String getHeure(){
        return this.heure;
    }
    public Salle getSalle(){
        return this.salle;
    }
    public Cours getCours(){
        return this.cours;
    }
  /*   @Override
    public String toString(){
        return "Le " + this.date + " à " + this.heure + " dans la salle " + this.salle + " pour le cours de " + this.cours;
    }*/
}