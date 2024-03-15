import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestSalle {
        @Test
        
        public void testGetCapacite() {
            Salle salle207 = new Salle("207", 30);
            assertEquals(salle207.getCapacite(), 30);
        }
        
        public void testGetNumSalle() {
            Salle salle208 = new Salle("208", 27);
            assertEquals(salle208.getNumSalle(), "207");
        }
        
    }
