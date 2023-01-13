

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;

  /**
   * Before is here.
   */
  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1945);
  }

  /**
   * Test case is here.
   */
  @Test
  public void testFirst() {
    assertEquals("John", john.getFirstName());

  }

  /**
   * Test case is here.
   */
  @Test
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  /**
   * Test case is here.
   */
  @Test
  public void testYearOfBirth() {
    assertEquals(1945, john.getYearOfBirth());
  }

}
