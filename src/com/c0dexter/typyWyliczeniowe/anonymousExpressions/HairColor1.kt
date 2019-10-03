package com.c0dexter.typyWyliczeniowe.anonymousExpressions

import java.awt.Color

enum class HairColor1(val rgb: Int) {
    BLOND(rgb = 0xfaf0be) {
        override fun getColor(): Color = Color(rgb)
    },
    RUDE(rgb = 0xb06500) {
        override fun getColor(): Color = Color(rgb)
    },
    CZARNE(rgb = 0x000000){
        override fun getColor(): Color = Color(rgb)
    },
    POPIELATE(rgb = 0xaaaaaa){
        override fun getColor(): Color = Color(rgb)
    };

    // Można utworzyć abstrakcyjne metody, które będą wywoływane dla każdego enuma
    abstract fun getColor(): Color

}