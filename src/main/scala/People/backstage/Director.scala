package People.backstage
import People.{Person, Writer}

class Director(person: Person) extends Writer(person: Person) with Staff {
    override val activity = "Direct the play"
    override def exec = println(s"Breaaak the leg!!!")

}
