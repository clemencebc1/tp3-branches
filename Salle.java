public class Salle {
    /** Le numéro de la salle */
    private String numSalle;

    /** La capacité d'accueil de la salle */
    private int capacite;

    /** Constructeur qui met à jour les attributs de Salle */
    public Salle(String nom, int capacite) {
        this.numSalle = nom;
        this.capacite = capacite;
    }

    /** Récupère le numéro d'une salle
     * @return le numéro de la sallle
     */
    public String getNumSalle() {
        return this.numSalle;
    }

    /** Récupère la capacite d'une salle
     * @return la capacite de la salle
     */
    public int getCapacite() {
        return this.capacite;
    }
}