package Lesson01

/**
  * Created by Oleg_Khomutov on 2/14/2016.
  */
class BinaryGap {
  def solution(N: Int): Int = {
    var buffer = N
    var sequenceHasStarted = false
    var seq = 0
    var longestSeq = 0

    while (buffer > 0) {
      if ((buffer & 1) == 1) {
        if (longestSeq < seq) {
          longestSeq = seq
        }

        seq = 0
        sequenceHasStarted = true
      }
      else {
        if (sequenceHasStarted) seq = seq + 1
      }

      buffer = buffer >>> 1
    }

    longestSeq
  }
}
