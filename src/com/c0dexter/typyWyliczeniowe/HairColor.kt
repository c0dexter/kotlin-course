package com.c0dexter.typyWyliczeniowe

enum class HairColor(val rgb: Int) {
    BLOND(rgb = 0xfaf0be),
    RUDE(rgb = 0xb06500),
    CZARNE(rgb = 0x000000),
    POPIELATE(rgb = 0xaaaaaa)

}

/*
W Kotlinie enumy mogą być instancjonowane z jakąś wartością
- można więc zmapować sobie w tym przypadku kolory na stałe
- odwołując się później do danego skłądnika enuma mamy dostęp bezpośrednio do jego wartości
 */