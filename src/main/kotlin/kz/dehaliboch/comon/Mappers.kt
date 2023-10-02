package kz.dehaliboch.comon

import kz.dehaliboch.database.DBTodoEntity
import kz.dehaliboch.entities.ToDo
import kz.dehaliboch.entities.ToDoDraft

fun DBTodoEntity.toToDo() = ToDo(
    id = id,
    title = title,
    isDone = done,
)

fun ToDoDraft.toToDo(id: Int) = ToDo(
    id = id,
    title = title,
    isDone = isDone,
)