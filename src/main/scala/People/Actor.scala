package People

class Actor(person: Person) extends Person {

    name = person.name
    extroversao = person.extroversao
    habEscrita = person.habEscrita

    def act: Unit = {
        println(s"${name} says: To be or not to be?")
    }
}
