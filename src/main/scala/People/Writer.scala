package People

class Writer(person: Person) extends Person {

    name = person.name
    extroversao = person.extroversao
    habEscrita = person.habEscrita

    def writeScript = {
        "The neverending misadventures of a coder daring go where no coder has gone before."
    }
}
