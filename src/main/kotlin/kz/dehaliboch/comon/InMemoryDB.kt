package kz.dehaliboch.comon

import kz.dehaliboch.entities.ToDo

object InMemoryDB {

    val todoList = listOf(
        ToDo(1, "Сходить в магазин", false),
        ToDo(2, "Подготовить обед", false),
        ToDo(3, "Почистить дом", false),
        ToDo(4, "Прочитать книгу", false),
        ToDo(5, "Сделать уроки", false),
        ToDo(6, "Посмотреть фильм", false),
        ToDo(7, "Сходить в спортзал", false),
        ToDo(8, "Созвониться с другом", false),
        ToDo(9, "Подготовить презентацию", false),
        ToDo(10, "Посадить цветы", false)
    )
}