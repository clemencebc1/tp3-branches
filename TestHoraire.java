import org.junit.*;
import static org.junit.Assert.assertEquals;


public class TestHoraire {
    @Test 
    public void testgetDate(){
        Salle salle = new Salle("2", 15 );
        Horaire horaire = new Horaire("01-10-2018", "15", salle);
        Matiere matiere = new Matiere();
        Cours cours1 = new Cours(horaire, matiere);
        assertEquals(horaire.getDate(), "01-10-2018");

    }
    @Test 
    public void testgetHeure(){
        Salle salle = new Salle("2", 15 );
        Horaire horaire = new Horaire("01-10-2018", "15", salle);
        assertEquals(horaire.getHeure(), "15");

    }
    @Test 
    public void testgetSalle(){
        Salle salle = new Salle("2", 15 );
        Horaire horaire = new Horaire("01-10-2018", "15", salle);
        assertEquals(horaire.getSalle(), salle);
    }

    @Test 
    public void testAjoute(){
        Salle salle = new Salle("2", 15 );
        Horaire horaire = new Horaire("01-10-2018", "15", salle);
        Matiere matiere = new Matiere();
        Cours cours1 = new Cours(horaire, matiere);
        horaire.ajoute(cours1);
    }
}