package kz.dehaliboch.repository

import kz.dehaliboch.entities.ToDo

interface ToDoRepository {

    fun getAllToDo() : List<ToDo>

    fun getToDoById(id: Int) : ToDo?
}