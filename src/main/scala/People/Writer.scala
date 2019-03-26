package People

class Writer(person: Person) extends Person {

    name = person.name
    extroversao = person.extroversao
    habEscrita = person.habEscrita

    def writeScript = {
        println(s"${name} wonders: How will I thicken this plot?")
    }
}
