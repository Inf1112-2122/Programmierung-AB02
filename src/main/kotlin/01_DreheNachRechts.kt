import de.github.dudrie.hamster.imperative.de.dreheNachLinks
import de.github.dudrie.hamster.imperative.de.starteSpiel
import de.github.dudrie.hamster.imperative.de.stoppeSpiel

fun dreheNachRechts() {
    for (i in 1..3) {
        dreheNachLinks()
    }
}

fun main() {
    // Lasse diese Funktion unverändert!
    starteSpiel()
    dreheNachRechts()
    stoppeSpiel()
}
