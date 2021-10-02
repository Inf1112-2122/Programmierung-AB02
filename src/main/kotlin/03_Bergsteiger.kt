import de.github.dudrie.hamster.imperative.de.*

fun klettereStufeHoch() {
    dreheNachLinks()
    laufe()
    dreheNachRechts()
    laufe()
}

fun main() {
    // Es sind Zahlen zwischen 0 und 2 erlaubt.
    starteBergsteigerSpiel(2)
    setzeSpielGeschwindigkeit(10.0f)

    while (!liegtEinKornAufDeinemFeld()) {
        while (istVorDirFrei()) {
            laufe()
        }

        klettereStufeHoch()
    }
    sammleKornAuf()

    stoppeSpiel()
}
