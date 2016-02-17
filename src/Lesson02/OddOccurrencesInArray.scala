package Lesson02

/**
  * Created by Oleg_Khomutov on 2/16/2016.
  *
  * Task description located here -> https://codility.com/programmers/task/odd_occurrences_in_array/
  */
class OddOccurrencesInArray {
  def solution(A: Array[Int]): Int = {
    var result = 0

    A.foreach(number => result = result ^ number)

    result
  }
}