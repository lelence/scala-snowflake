package com.maogogo.snowflake

object Test extends App {

  val id = new ID()

  for (_ <- 0 until 100)
    println(id.next())

}
