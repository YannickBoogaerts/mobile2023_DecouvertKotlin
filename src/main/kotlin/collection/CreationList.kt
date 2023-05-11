package be.technifutur.decouvertekotlin.collection

import be.technifutur.decouvertekotlin.classe.Personne
import be.technifutur.decouvertekotlin.classe.Stagiaire
import java.time.LocalDate

fun createListPersonne1(): List<Personne> {
    return listOf(
        Personne("Dupont", "dede", LocalDate.of(2000, 3, 12)),
        Stagiaire("Doupont", "Toto", LocalDate.of(2000, 3, 12), "Police"),
        Stagiaire("Doupont", "Toto", "2000-03-12", "Police"),
        Personne("Dubois", "Léon", "2000-08-19"),
    )
}

fun createMutableList1(): MutableList<Personne> {
    return listOf(
        Personne("Dupont", "dede", LocalDate.of(2000, 3, 12)),
        Stagiaire("Doupont", "Toto", LocalDate.of(2000, 3, 12), "Police"),
        Stagiaire("Doupont", "Toto", "2000-03-12", "Police"),
        Personne("Dubois", "Léon", "2000-08-19"),
    ).toMutableList()
}

fun createMutableList2(): MutableList<Personne> {
    return mutableListOf(
        Personne("Dupont", "dede", LocalDate.of(2000, 3, 12)),
        Stagiaire("Doupont", "Toto", LocalDate.of(2000, 3, 12), "Police"),
        Stagiaire("Doupont", "Toto", "2000-03-12", "Police"),
        Personne("Dubois", "Léon", "2000-08-19"),
    )
}

fun createPersonneStringList(): List<String> = listOf(
    "Dupont dede 2000-03-12",
    "Dupont Toto 2000-03-12",
    "Dupond Toto 2000-03-12",
    "Dubois Léon 2000-08-19",
    "Dark Vador 2000-03-12",
    "Doe John 2000-03-12",
    "Doe Jane 2000-01-12",
    "Simpson Bart 2000-08-19",
    "Izzi Tony 1984-09-07",
    "Izzi Krystel 1994-07-06",
    "Izzi Sylvia 1994-07-06",
    "Peta Elodie 1987-05-01",
    "Etienne Laporte 1987-01-01",
    "Norris Chuck 1980-09-27",
    "Deloin Alain 1954-11-06",
    "Romeo Jul 2004-07-18",
    "Roulio Michel 1990-09-08", "Mathieu Boussole 1990-04-07", "Jean Vérité 1998-10-02",
    "josef pilsudski 1910-01-01",
    "Steve Jobs 1980-01-01",
    "Bill Gates 1950-01-01",
    "Josef Staline 1910-01-01",
    "John Wayne 1910-01-01",
    "Georges Romero 1910-01-01",
    "Lucio Fulci 1910-01-01",
    "Indiana Jones 1967-09-12", "Bon Jean 1999-02-08", "Racoon Rocket 1989-04-11",
    "Joan Hathaway 2001-01-09" ,"Martin Method 2002-05-08",
    "De_Niro Robert 1943-08-17",
    "Hepburn Audrey 1929-05-04",
    "DiCaprio Leonardo 1974-11-11",
    "Streep Meryl 1949-06-22",
    "Brando Marlon 1924-04-03",
    "Cruise Tom 1962-07-03",
    "Kidman Nicole 1967-06-20",
    "Pitt Brad 1963-12-18",
    "Jolie Angelina 1975-06-04",
    "Depp Johnny 1963-06-09",
    "Clooney George 1961-05-06",
    "Lawrence Jennifer 1990-08-15",
    "Portman Natalie 1981-06-09",
    "Roberts Julia 1967-10-28",
    "Damon Matt 1970-10-08",
    "Smith Will 1968-09-25",
    "Winslet Kate 1975-10-05",
    "Crawford Joan 1905-03-23",
    "Bullock Sandra 1964-07-26",
    "Hanks Tom 1956-07-09",
    "Lewis Daniel 1957-10-30",
    "Blanchett Cate 1969-05-14",
    "Washington Denzel 1954-12-28",
    "Foster Jodie 1962-11-19",
    "Day-Lewis Daniel 1957-04-29",
    "Bogart Humphrey 1899-12-25",
    "Hitchcock Alfred 1899-08-13",
    "Laurent Mélanie 1983-02-21",
    "Stone Emma 1988-11-06",
    "Cotillard Marion 1975-09-30",
    "Ford Harrison 1942-07-13",
    "Phoenix Joaquin 1974-10-28",
    "Winslet Kate 1975-10-05",
    "Caine Michael 1933-03-14",
    "Russell Kurt 1951-03-17",
    "Chaplin Charlie 1889-04-16",
    "Waltz Christoph 1956-10-04",
    "Redford Robert 1936-08-18",
    "Stewart Kristen 1990-04-09",
    "Hopkins Anthony 1937-12-31",
    "Garbo Greta 1905-09-18",
    "Bardem Javier 1969-03-01",
    "Lee Spike 1957-03-20",
    "Olivier Laurence 1907-05-22",
    "Leone Sergio 1929-01-03",
    "Bergman Ingrid 1915-08-29",
    "Kubrick Stanley 1928-07-26",
    "Fonda Jane 1937-12-21",
    "Eastwood Clint 1930-05-31",
    "Gabin Jean 1904-05-17",
    "Almodóvar Pedro 1949-09-25",
    "Riga Tony 2000-01-01",
    "Bonno Jean 2000-04-03",
    )

fun createListPersonne3(): List<Personne> {
    val strings = createPersonneStringList()
    return List(strings.size){num->
        val split = strings[num].split(" ")
        Personne(split[0],split[1],split[2])
    }
}

    fun main() {

        /*var listp = createListPersonne1()
        var copy = listp;
        var listm: MutableList<Personne> = listp.toMutableList()
        val listTest: List<Personne> = listm

        listm.add(Personne("Dubois", "Marcel", "1999-05-06"))

        listm += listp
        listp += listm

        listm.forEach(::println)
        println()
        listp.forEach(::println)
        println()
        copy.forEach(::println)*/

        createListPersonne3().forEach(::println)
    }