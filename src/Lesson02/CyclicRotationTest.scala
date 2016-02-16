package Lesson02

import org.scalatest.Suite

/**
  * Created by Oleg_Khomutov on 2/16/2016.
  */
class CyclicRotationTest extends Suite {
  def test_EmptyArray_returns_EmptyArray():Unit = {
    // Arrange
    val A = Array[Int]()
    val expected = A
    val K = 9

    // Act
    val actual = new CyclicRotation().solution(A, K)

    // Assert
    assertResult(expected)(actual)
  }

  def test_OneElementArray_returns_OneElementArray():Unit = {
    // Arrange
    val A = Array[Int](1)
    val expected = A
    val K = 9

    // Act
    val actual = new CyclicRotation().solution(A, K)

    // Assert
    assertResult(expected)(actual)
  }

  def test_TwoElementArray_returns_ShiftedArray():Unit = {
    // Arrange
    val A = Array[Int](1, 2)
    val expected = Array[Int](2, 1)
    val K = 3

    // Act
    val actual = new CyclicRotation().solution(A, K)

    // Assert
    assertResult(expected)(actual)
  }

  def test_EvenElementsInArray_EvenK_returns_ShiftedArray():Unit = {
    // Arrange
    val A = Array[Int](1, 2, 3, 4, 5, 6)
    val expected = Array[Int](3, 4, 5, 6, 1, 2)
    val K = 4

    // Act
    val actual = new CyclicRotation().solution(A, K)

    // Assert
    assertResult(expected)(actual)
  }

  def test_EvenElementsInArray_OddK_returns_ShiftedArray():Unit = {
    // Arrange
    val A = Array[Int](1, 2, 3, 4, 5, 6)
    val expected = Array[Int](2, 3, 4, 5, 6, 1)
    val K = 5

    // Act
    val actual = new CyclicRotation().solution(A, K)

    // Assert
    assertResult(expected)(actual)
  }

  def test_OddElementsInArray_EvenK_returns_ShiftedArray():Unit = {
    // Arrange
    val A = Array[Int](1, 2, 3, 4, 5, 6, 7)
    val expected = Array[Int](5, 6, 7, 1, 2, 3, 4)
    val K = 3

    // Act
    val actual = new CyclicRotation().solution(A, K)

    // Assert
    assertResult(expected)(actual)
  }

  def test_OddElementsInArray_OddK_returns_ShiftedArray():Unit = {
    // Arrange
    val A = Array[Int](1, 2, 3, 4, 5, 6, 7)
    val expected = Array[Int](4, 5, 6, 7, 1, 2, 3)
    val K = 4

    // Act
    val actual = new CyclicRotation().solution(A, K)

    // Assert
    assertResult(expected)(actual)
  }
}