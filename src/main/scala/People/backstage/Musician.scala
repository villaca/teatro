package People.backstage

import People.Person

class Musician(person: Person) extends Person with Staff {
    override val activity: String = "I set the mood!"
    override def exec(): Unit = println("John Willians is my sheperd.")
}
