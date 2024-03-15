public class Cours {
    /**liste d'horaires pour un cours*/
    private List<Horaire> horaires;
    /** le cours concerne une matiere */
    private Matiere matiere;
    /**le cours a un professeur */
    private Admin prof;
    /** constructeur de Cours avec deux parametres
     * @param date une date
     * @parama matiere une matiere
    */
    public Cours(Horaire date, Matiere matiere){

    }
    /**deuxieme constructeur de cours contenant seulement un parametre
     * @param horaire un horaire avec une precision a la demi heure
     */
    public Cours(Horaire horaire){

    }
    
}