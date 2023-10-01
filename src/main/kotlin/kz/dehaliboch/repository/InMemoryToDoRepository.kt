package kz.dehaliboch.repository

import kz.dehaliboch.comon.InMemoryDB
import kz.dehaliboch.entities.ToDo

class InMemoryToDoRepository : ToDoRepository {

    override fun getAllToDo(): List<ToDo> {
        return InMemoryDB.todoList
    }

    override fun getToDoById(id: Int): ToDo? {
        return InMemoryDB.todoList.firstOrNull { toDo -> toDo.id == id }
    }
}