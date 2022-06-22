package com.tkroman.kpi.y2022.l1

import munit.FunSuite

class OptionalSuite extends FunSuite {
  test("list map") {
    val expected = List.Nil
    val actual = map(List.Nil, (a) => "Hello")
    assertEquals(actual, expected)
  }
}