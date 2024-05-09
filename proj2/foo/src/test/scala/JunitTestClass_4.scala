import org.junit.Assert.assertEquals
import org.junit.Test

class JunitTestClass_4 {

  @Test def testAddition(): Unit = {
    val result = 2 + 2
    assertEquals(4, result)
  }

}
