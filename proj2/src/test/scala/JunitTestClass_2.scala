import org.junit.Assert.assertEquals
import org.junit.Test

class JunitTestClass_2 {

  @Test def testAddition_2(): Unit = {
    val result = 2 + 2
    assertEquals(4, result)
  }

}
