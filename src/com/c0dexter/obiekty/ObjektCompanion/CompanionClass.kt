package com.c0dexter.obiekty.ObjektCompanion

class CompanionClass {
    // Nie tutaj.


    companion object{
        const val TAG = "CompanionClass"
        const val KEY = "BUNDLE_KEY"

        // W ten sposón możemy odzyskiwać nową instancję, to się przydaje we FRAGMENTACH w Androidzie
        // @JvmStatic - metoda statyczna w rozumieniu Javowymn musi być opatrzona takim słowem kluczowym aby mnożna było się odwołać do tej funkcji w klasie Javowej
        @JvmStatic fun newInstance(): CompanionClass = newInstance()


        /*
         Tutaj umieszczamy stałe lub funkcje, które mają towarzyszyć każdej instancji klasy

         - np. w Javie tworzyliśmy zmienną: public static final String TAG = Class.getName()
         - W Kotlinie nie tworzymy zmiennych, takie dane przechowujemy w companion object
         - przydaje się to w klasach instancjonujących
         - przydaje sie to w przypadku pisania stałych czasu kompilacji
         - korzystanie ze stałych czasu kompilacji 'const val string powoduje że przy wywołaniu pola powoduje wstawienie w to miejsce jego wartości na etapie compilacji
         */
    }
}