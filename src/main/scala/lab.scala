package com.tkroman.kpi.y2022.l1
import scala.collection.mutable
import scala.annotation.tailrec
import scala.Unit
import scala.IndexedSeq
import scala.collection.Iterator
import scala.collection.immutable.IndexedSeq
import munit.Clue.generate

//enum Compared:
  //case Lt

enum List[+A]:
  case Cons(c: List[A], t: A)
  case Nil
 

def map[A, B](xs: List[A], f: A => B): List[B] = {
  xs match{
    case List.Cons(c, t) => List.Cons(map(c, f), f(t))
    case List.Nil => List.Nil
  }
}
 object ListDemo {
  def inits(xs: List[Int]): List[List[Int]] = {
    var n = xs.length
    var nl: List[List[Int]] = List(List())
    for (x <- 1 to n) nl = xs.slice(0, x) :: nl
    nl.reverse
  }

   def scan(xs: List[Int], z: Int): List[Int] = {
     var n = xs.length
     var nl: List[Int] = List()
     nl=z::nl
     for (x <- 0 to n-1) nl=(xs(x)+nl(0))::nl
     nl.reverse
   }
 }

//map = scan + inits




@main def run() =
  println("Hello")



