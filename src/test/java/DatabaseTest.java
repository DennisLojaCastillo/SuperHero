import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseTest {

    //TODO Test Rækkefølge!
    //Arrange
    //Act
    //Assert

    Database database = new Database();

    @BeforeEach
    void setUp() {
        // text fixture
        database.addSuperhero("Peter Parker", "Spider Man", "Spider Power", 1822,9.9);
        database.addSuperhero("Clark Kent", "Super Man", "Superhuman", 1938, 9.9);

    }

    @Test
    void addSuperhero() {
        //TODO Fejlmelding her! FIX!
        //Assert
        assertEquals(database.getHeros().size(),2); //tjekker om der er 1 i listen
        assertTrue(database.getHeros().size() > 0); //Tjekker om den er større end 0
        assertNotEquals(database.getHeros().get(0),null);
    }


}

/* @Test
    void getHeros() {

    }

    @Test
    void searchByAlias() {
    }

    @Test
    void searchByName() {
    }

    @Test
    void searchByPower() {
    }*/ // Metoder til test