object Main {
    def main(args: Array[String]): Unit = {
        println("Hello, world!")

        val person = Person.spawn("fulano", 5, 7)
        val hamlet = new Actor(person)

        println(person)
        hamlet.act
        println(hamlet.name)
        println(hamlet)

    }
}
