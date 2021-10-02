import de.github.dudrie.hamster.imperative.de.starteSpiel

fun starteKoernerInEckenSpiel(spielNummer: Int) {
    require(spielNummer in 0..2) { "Die Spielnummer $spielNummer ist ungültig. Die Spielnummer muss zwischen 0 und 2 liegen." }

    val territoriumsDatei: String = when (spielNummer) {
        0 -> "territories/koerner_in_ecken_0.json"
        1 -> "territories/koerner_in_ecken_1.json"
        2 -> "territories/koerner_in_ecken_2.json"
        else -> throw RuntimeException("Die Spielnummer $spielNummer wird nicht unterstützt.")
    }

    starteSpiel(territoriumsDatei)
}

fun starteBergsteigerSpiel(spielNummer: Int) {
    require(spielNummer in 0..2) { "Die Spielnummer $spielNummer ist ungültig. Die Spielnummer muss zwischen 0 und 2 liegen." }

    val territoriumsDatei: String = when (spielNummer) {
        0 -> "territories/berg_mit_korn_0.json"
        1 -> "territories/berg_mit_korn_1.json"
        2 -> "territories/berg_mit_korn_2.json"
        else -> throw RuntimeException("Die Spielnummer $spielNummer wird nicht unterstützt.")
    }

    starteSpiel(territoriumsDatei)
}
