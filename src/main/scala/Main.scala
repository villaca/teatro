import People._
import People.backstage.{Musician, Staff}
import Play.{Play, PlayCharacter, Story}

object Main {
    def main(args: Array[String]): Unit = {

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
        spielberg.exec

        val person3 = Person.spawn("beltrano", 3, 3)
        val kaufman = new Musician(person3)

        println(kaufman)
        println(kaufman.activity)
        kaufman.exec

        val script = spielberg.writeScript

        var actorsGuild: List[Actor] = List(hamlet)
        var jonOliva = new PlayCharacter(9, actorsGuild)
        var cast: List[PlayCharacter] = List(jonOliva)

        var story = new Story(script, "Shakespeare && Roddenberry", cast)

        var slaves: List[Staff] = List(spielberg, kaufman)

        var midfallNightCode = new Play(story, slaves)

    }
}
