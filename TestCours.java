import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestCours {
    @Test 
    public void testgetHoraire(){
        Salle salle = new Salle("2", 15 );
        Horaire horaire = new Horaire("01-10-2018", "15", salle);
        Matiere matiere = new Matiere();
        Cours cours1 = new Cours(horaire, matiere);
        assertEquals(cours1.getHoraire(), horaire);
    }
}
