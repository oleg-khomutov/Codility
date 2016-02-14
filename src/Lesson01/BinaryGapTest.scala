package Lesson01

import org.scalatest.Suite

/**
  * Created by Oleg_Khomutov on 2/14/2016.
  */
class BinaryGapTest extends Suite {
  def test_1_expected_0(): Unit = {
    val result = new BinaryGap().solution(1)
    val expected = 0

    assertResult(expected)(result)
  }
}
