import org.junit.*;
import static org.junit.Assert.*;

public class PartyTest {

  @Test
  public void newParty_instantiatesCorrectly() {
    Party testParty = new Party(10, "snack", "water", "none");
    assertEquals(true, testParty instanceof Party);
  }

  @Test
  public void newParty_calculatesCost_3250() {
    Party testParty = new Party(10, "full course", "full bar", "live band");
    assertEquals(3250, testParty.calculateCost());
  }
}
