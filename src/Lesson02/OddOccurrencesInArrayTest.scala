package Lesson02

import org.scalatest.Suite

/**
  * Created by Oleg_Khomutov on 2/16/2016.
  */
class OddOccurrencesInArrayTest extends Suite {
  def test_OneElement(): Unit = {
    // Arrange
    val A = Array(1)
    val expected = 1

    // Act
    val result = new OddOccurrencesInArray().solution(A)

    // Assert
    assertResult(expected)(result)
  }

  def test_ThreeElements() : Unit = {
    // Arrange
    val A = Array(1, 2, 2)
    val expected = 1

    // Act
    val result = new OddOccurrencesInArray().solution(A)

    // Assert
    assertResult(expected)(result)
  }

  def test_SeveralElements() : Unit = {
    // Arrange
    val A = Array(1, 2, 3, 4, 3, 2, 1)
    val expected = 4

    // Act
    val result = new OddOccurrencesInArray().solution(A)

    // Assert
    assertResult(expected)(result)
  }
}