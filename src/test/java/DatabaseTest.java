import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DatabaseTest {

    //TODO Test Rækkefølge!

    //Arrange
    //Act
    //Assert

    @Test
    void addSuperhero() {
        //Arrange
        Database database = new Database();

        //Act
        database.addSuperhero("Clark Kent", "Super Man", "Superhuman", 1938, 9.9);

        //Assert
        //assertEquals(database.getHeros().size(),1); Tjekker om der er 1 i listen
        assertTrue(database.getHeros().size() > 0); //Tjekker om den er større end 0
        assertNotEquals(database.getHeros().get(0),null);

    }

    @Test
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
    }
}