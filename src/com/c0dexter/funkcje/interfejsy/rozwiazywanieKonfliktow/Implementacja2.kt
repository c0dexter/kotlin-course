package com.c0dexter.funkcje.interfejsy

import com.c0dexter.funkcje.interfejsy.rozwiazywanieKonfliktow.InterfejsKolizja

class Implementacja2: Interfejs2, InterfejsKolizja { // obydwa interfejsy posiadają funkcje z ciałem o tej samej nazwie, co powoduje kolizje przy implementacji

    // należy zaimplementować abstrakcyjną funkcję z ciałem
    override fun zCialem() {
        super<InterfejsKolizja>.zCialem()       // a w niej przez operator super<odwłoujemy się do konkretnego interfejsu> i wywołujemy funkcje z ciałem
        super<Interfejs2>.zCialem()             // ten sam case jest dla drugiego interfejsu, musimy dopercyzować interface z którego wołamy funkcje
    }

    override val wartosc: String = "ustawionaWartosc"

    override fun abstrakcyjna() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}