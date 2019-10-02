package com.c0dexter.obiekty


sealed class Task {

}

data class Kill(val points: Int) : Task()
data class WIn(val points: Int) : Task()
data class Points(val points: Int) : Task()


object NotATask : Task()
/* object:
- object jest odpowiednikiem klas statycznych
- używamy w sytuacji kiedy coś ma być zadeklarowane na chwilę (jak wyżej)
- lub jak w rozumieniu singletona: występujące 1x
- do obiektu możemy sie odwoływać bez instancjonowania (w Javie było to realizowane za pomocą anonimowych klas wewnętrznych)
 */



fun doStateUpdate(task: Task): Boolean = when (task) {
    is Kill -> true
    is WIn -> true
    is Points -> false
    NotATask -> false
}