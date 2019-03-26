import People._

object Main {
    def main(args: Array[String]): Unit = {
        println("Hello, world!")

        val person = Person.spawn("fulano", 5, 7)
        val hamlet = new Actor(person)

        println(person)
        hamlet.act
        println(hamlet.name)
        println(hamlet)

        val person2 = Person.spawn("ciclano", 8, 10)
        import People.backstage.Director
        val spielberg = new Director(person2)

        println(spielberg)
        println(spielberg.activity)
        spielberg.writeScript
        spielberg.exec

    }
}
