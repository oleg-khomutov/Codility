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

  def test_5_expected_1(): Unit = {
    val result = new BinaryGap().solution(5)
    val expected = 1

    assertResult(expected)(result)
  }

  def test_6_expected_0(): Unit = {
    val result = new BinaryGap().solution(6)
    val expected = 0

    assertResult(expected)(result)
  }

  def test_9_expected_2(): Unit = {
    val result = new BinaryGap().solution(9)
    val expected = 2

    assertResult(expected)(result)
  }

  def test_11_expected_1(): Unit = {
    val result = new BinaryGap().solution(11)
    val expected = 1

    assertResult(expected)(result)
  }

  def test_16_expected_0(): Unit = {
    val result = new BinaryGap().solution(16)
    val expected = 0

    assertResult(expected)(result)
  }

  def test_19_expected_2(): Unit = {
    val result = new BinaryGap().solution(19)
    val expected = 2

    assertResult(expected)(result)
  }

  def test_20_expected_1(): Unit = {
    val result = new BinaryGap().solution(20)
    val expected = 1

    assertResult(expected)(result)
  }

  def test_42_expected_1(): Unit = {
    val result = new BinaryGap().solution(42)
    val expected = 1

    assertResult(expected)(result)
  }

  def test_328_expected_2(): Unit = {
    val result = new BinaryGap().solution(328)
    val expected = 2

    assertResult(expected)(result)
  }

  def test_1024_expected_0(): Unit = {
    val result = new BinaryGap().solution(1024)
    val expected = 0

    assertResult(expected)(result)
  }

  def test_1162_expected_3(): Unit = {
    val result = new BinaryGap().solution(1162)
    val expected = 3

    assertResult(expected)(result)
  }

  def test_51712_expected_2(): Unit = {
    val result = new BinaryGap().solution(51712)
    val expected = 2

    assertResult(expected)(result)
  }

  def test_66561_expected_9(): Unit = {
    val result = new BinaryGap().solution(66561)
    val expected = 9

    assertResult(expected)(result)
  }

  def test_561892_expected_3(): Unit = {
    val result = new BinaryGap().solution(561892)
    val expected = 3

    assertResult(expected)(result)
  }

  def test_6291457_expected_20(): Unit = {
    val result = new BinaryGap().solution(6291457)
    val expected = 20

    assertResult(expected)(result)
  }

  def test_74901729_expected_4(): Unit = {
    val result = new BinaryGap().solution(74901729)
    val expected = 4

    assertResult(expected)(result)
  }

  def test_805306369_expected_27(): Unit = {
    val result = new BinaryGap().solution(805306369)
    val expected = 27

    assertResult(expected)(result)
  }

  def test_1073741825_expected_29(): Unit = {
    val result = new BinaryGap().solution(1073741825)
    val expected = 29

    assertResult(expected)(result)
  }

  def test_1376796946_expected_5(): Unit = {
    val result = new BinaryGap().solution(1376796946)
    val expected = 5

    assertResult(expected)(result)
  }

  def test_1610612737_expected_28(): Unit = {
    val result = new BinaryGap().solution(1610612737)
    val expected = 28

    assertResult(expected)(result)
  }

  def test_2147483647_expected_0(): Unit = {
    val result = new BinaryGap().solution(2147483647)
    val expected = 0

    assertResult(expected)(result)
  }
}