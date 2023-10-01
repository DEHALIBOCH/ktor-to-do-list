package kz.dehaliboch.repository

import kz.dehaliboch.entities.ToDo
import kz.dehaliboch.entities.ToDoDraft

interface ToDoRepository {

    fun getAllToDo(): List<ToDo>

    fun getToDoById(id: Int): ToDo?

    fun addToDo(toDoDraft: ToDoDraft): ToDo

    fun removeToDo(id: Int): Boolean

    fun update(id: Int, toDoDraft: ToDoDraft): Boolean
}