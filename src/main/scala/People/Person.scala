package People

class Person{

    private var _name: String = ""
    private var _extroversao: Int = 0
    private var _habEscrita: Int = 0

    def name= _name
    def name_= (newName : String): Unit = {
        _name = newName
    }

    def extroversao = _extroversao
    def extroversao_= (newExtroversao : Int) = {
        _extroversao = newExtroversao
    }

    def habEscrita = _habEscrita
    def habEscrita_= (newHabEscrita : Int) = {
        _habEscrita = newHabEscrita
    }

    override def toString: String = {
        s"My name is ${name}, my extrovertion ranks about ${extroversao} and I took a ${habEscrita} in my last writing test."
    }

}

object Person {

    def spawn(name: String, extroversao: Int, habEscrita: Int) : Person = {
        var person = new Person
        person.name = name
        person.extroversao = extroversao
        person.habEscrita = habEscrita

        person
    }

}
