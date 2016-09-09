import org.junit.*;
import static org.junit.Assert.*;

public class PartyTest {

  @Test
  public void newParty_instantiatesCorrectly() {
    Party testParty = new Party(10, "snack", "water", "none");
    assertEquals(true, testParty instanceof Party);
  }

}
