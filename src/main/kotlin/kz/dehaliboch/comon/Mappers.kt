package kz.dehaliboch.comon

import kz.dehaliboch.database.DBTodoEntity
import kz.dehaliboch.entities.ToDo

fun DBTodoEntity.toToDo() = ToDo(
    id = id,
    title = title,
    isDone = done,
)