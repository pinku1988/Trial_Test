package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("A1B");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("B");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("C");
  }

}
