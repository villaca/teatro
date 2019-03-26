package People.backstage

import People.Person

class Musician(person: Person) extends Person with Staff {

    name = person.name
    extroversao = person.extroversao
    habEscrita = person.habEscrita

    override val activity: String = "I set the mood!"
    override def exec(): Unit = println("John Willians is my sheperd.")
}
