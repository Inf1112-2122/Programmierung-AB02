import de.github.dudrie.hamster.imperative.de.*

fun laufeZurNaechstenWand() {
    while(istVorDirFrei()) {
        laufe()
    }
}

fun laufeZurRechtenOberenEcke() {
    laufeZurNaechstenWand()
    dreheNachLinks()
    laufeZurNaechstenWand()
}

fun sammleAlleKoernerAufDeinemFeld() {
    while (liegtEinKornAufDeinemFeld()) {
        sammleKornAuf()
    }
}

fun geheZurNaechstenEckeUndSammleAlleKoerner() {
    dreheNachLinks()
    laufeZurNaechstenWand()
    sammleAlleKoernerAufDeinemFeld()
}

fun main() {
    // Es sind Zahlen zwischen 0 und 2 erlaubt.
    starteKoernerInEckenSpiel(2)
    setzeSpielGeschwindigkeit(10.0f)

    laufeZurRechtenOberenEcke()
    sammleAlleKoernerAufDeinemFeld()

    for (ecke in 1..3) {
        geheZurNaechstenEckeUndSammleAlleKoerner()
    }

    stoppeSpiel()
}

