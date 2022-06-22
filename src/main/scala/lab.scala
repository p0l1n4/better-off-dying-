package com.tkroman.kpi.y2022.l1
import scala.collection.mutable
import scala.annotation.tailrec
import scala.Unit
import scala.IndexedSeq
import scala.collection.Iterator
import scala.collection.immutable.IndexedSeq

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


//функції нижче невдалі, але я про всяк випадок їх залишила, так, вони без сенсу для Вас, вибачте
/* def inits[A](xs: List[A]): Iterator[List[A]] = {

}

def scan[A](xs: List[A], z: A, f: A => A): List[A] = {
  xs match{
    case List.Nil => List.Nil
    case List.Cons(c, t) => List.Cons.scan("z")((c, t) => c + t)
  }
}

def minMax[A](xs: List[A], comparator: (A, A) => Compared): (A, A) = {
  xs match{

  }
} */


@main def run() =
  println("Hello")



