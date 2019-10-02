package com.c0dexter.pieczetowanieKlas

/*
PIECZĘTOWANIE:
- używane w specyficznych sytuacjach np. w stanowych aplikacjach czasu rzeczywistego lub w grze która działa z szybkością 30 FPS sprawdzany jest stan aplikacji i podejmowane są decyzje co 1 klatkę gry
- w tym przypadku omówiony jest silnk gry do którego 30x na 1s spływają taski. Silnik spodziewa się konkretnego obiektu
- ZAPEWNIAMY silnik o tym, że to co zejdzie 30x/s będzie z określnego typu, żadnego innego jak tego zadeklarowanego i na tej podstawie zostaną wykonane instrukcje
- związane jest to z wyrażeniem WHEN (jednak nie ma w tym przypadku ELSE - instrukcja ELSE prowadzi do niestabilności aplikacji)
- mamy zastezeżoną hierarchię klas: możemy stwierdzić że wystąpią wyłącznie określone przez nas stany (dlatego nie ma ELSE)
- obsługa zapieczętowanych klas odbywa się w instrukcjach WHEN

 Przy wykonywaniu operacji 30x/s debugowanie jest prawie niemożliwe, dlatego zapieczętowane klasy są nieocenioną pomocą
 */


sealed class Task {    // 'sealed' - słowo kluczowe oznaczające zapieczętowanie

    /*
    Zapieczętowana klasa ma chronioną hierarchię klas, czyli:
    - może posiadać podklasy
    - podklasy muszą być zadeklarowane w tym samym pliku (muszą być zapieczętowane z tą klasą, w typ przapadku z Taskiem)
    - podklasy muszą rozszerzać klasę zapieczętowaną
    - natomiast klasy rozszerzające podklasy klasy zapieczętowanej mogą być w oddzielnych plikach

    Klasa zapieczętowana nie może mieć prywatnych konstruktorów
    Klasa zapieczętowana jest abstrakcyjna, więce nie można jej zainstancjonować
     */

}

data class Kill(val points: Int):Task()
data class WIn(val points: Int):Task()
data class Points(val points: Int):Task()
object NotATask:Task()


fun doStateUpdate(task: Task): Boolean = when(task){
    is Kill -> true
    is WIn -> true
    is Points -> false
    NotATask -> false
}