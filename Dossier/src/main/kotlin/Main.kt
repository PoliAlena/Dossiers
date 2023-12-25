val FIO : MutableList<String> = mutableListOf("Поливчак Алена Олеговна","Федорова Варвара Максимовна","Прудова Виктория Александровна")
val post : MutableList<String> = mutableListOf("Директор","Бухгалтер","Разработчик")

fun main() {
    var run = true
    while (run) {
        println("Что вы хотите сделать?")
        println("1 - Добавить досье")
        println("2 - Вывести все досье")
        println("3 - Удалить досье")
        println("4 - Поиск по ФИО")
        println("5 - Выход")
        val answer = readln().toIntOrNull()
        when (answer) {
            1 -> add()
            2 -> out()
            3 -> delete()
            4 -> search()
            5 -> run = false
            else -> println("Ваш ответ некорректен")
        }
    }
}
private fun add()
{
    println("Добавить досье")
    println("Введите ФИО: ")
    val f = readln()
    println("Введите должность: ")
    val p = readln()
    if(f.toIntOrNull() == null && p.toIntOrNull() == null) {

        post.add(p)
        FIO.add(f)
    }
    else{
        println("Ваш ответ некорректен")
    }

}
private fun out()
{
    println("Вывести все досье")
    val dossier = FIO.zip(post){ff, pp -> "$ff - $pp"}
    for (doss in dossier) print(doss + " / ")
    println()
}
private fun delete()
{
    println("Удалить досье")
    println("Введите ФИО: ")
    val f = readln()
    if(f.toIntOrNull() == null) {
        val i = FIO.indexOf(f)
        post.removeAt(i)
        FIO.remove(f)
    }
    else{
        println("Ваш ответ некорректен")
    }
}
private fun search()
{
    println("Поиск по ФИО")
    print("Введите ФИО: ")
    val f = readln()

    if(f.toIntOrNull() == null ) {

        val i = FIO.indexOf(f)
        val dossier = FIO.zip(post){ff, pp -> "$ff - $pp"}
        println(dossier[i])
    }
    else{
        println("Ваш ответ некорректен")
    }
}
