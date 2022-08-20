package com.tkroman.kpi.y2022.l1
import scala.collection.mutable
import scala.annotation.tailrec
import scala.Unit
import scala.IndexedSeq
import scala.collection.Iterator
import scala.collection.immutable.IndexedSeq
import munit.Clue.generate

enum List[+A]:
  case Nil
  case Cons(c: List[A], t: A)
  override def toString: String =
    def rec(s: StringBuilder, a: List[A]): String =
      a match
        case Nil =>
          s.append("]").result
        case Cons(h, o) =>
          rec(
            s
              .append(h)
              .append(if o == Nil then "" else ", "),
            o
          )
    rec(new StringBuilder("["), this)
 

def map[A, B](xs: List[A], f: A => B): List[B] = {
  xs match{
    case List.Cons(c, t) => List.Cons(map(c, f), f(t))
    case List.Nil => List.Nil
  }
}

def reverse: List[A] = {
  def rec[A](list: List[A], reversed: List[A] = Nil): List[A] =
    list match
      case List.Nil => reversed
      case List.Cons(t, c) => rec(c, List.Cons(t, reversed))

  rec(this)
}

def getInits: List[List[A]] = {
  def rec(list: List[A], inits: List[List[A]] = Nil): List[List[A]] =
    list match
      case List.Nil => inits
      case List.Cons(t, c) =>
        if inits != Nil then rec(c, List.Cons(List.Cons(t, inits.getHead), inits))
        else rec(c, List.Cons(List.Cons(t, Nil), inits))

  def rev(list: List[List[A]] = rec(this), reversed: List[List[A]] = Nil): List[List[A]] =
    list match
      case List.Nil => reversed
      case List.Cons(t, c) => rev(c, List.Cons(t.reverse, reversed))

  this match
    case List.Nil => List(List())
    case _ => rev()
}
 object ListDemo {

   def scan(xs: List[Int], z: Int): List[Int] = {
     var n = xs.length
     var nl: List[Int] = List()
     nl=z::nl
     for (x <- 0 to n-1) nl=(xs(x)+nl(0))::nl
     nl.reverse
   }
 }

@main def run() =
  println("Hello")



