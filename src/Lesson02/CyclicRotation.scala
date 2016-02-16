package Lesson02

/**
  * Created by Oleg_Khomutov on 2/16/2016.
  *
  * Task description located here -> https://codility.com/programmers/task/cyclic_rotation/
  *
  * This is a solution with space complexity O(n). Need to think about solution with space
  * complexity O(1), there should be something with accumulating sums.
  */
class CyclicRotation {
  def solution(A: Array[Int], K: Int): Array[Int] = {
    if (A.length < 2)
      return A

    val result = new Array[Int](A.length)
    var currentIndex = K % A.length

    for (number <- A) {
      if (currentIndex > (result.length - 1))
        currentIndex = 0

      result(currentIndex) = number

      currentIndex = currentIndex + 1
    }

    result
  }
}