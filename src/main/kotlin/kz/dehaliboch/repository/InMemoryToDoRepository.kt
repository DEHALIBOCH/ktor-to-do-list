package kz.dehaliboch.repository

import kz.dehaliboch.comon.InMemoryDB.todoList
import kz.dehaliboch.entities.ToDo
import kz.dehaliboch.entities.ToDoDraft

class InMemoryToDoRepository : ToDoRepository {

    override fun getAllToDo(): List<ToDo> {
        return todoList
    }

    override fun getToDoById(id: Int): ToDo? {
        return todoList.firstOrNull { toDo -> toDo.id == id }
    }

    override fun addToDo(toDoDraft: ToDoDraft): ToDo {
        val todo = ToDo(
            id = todoList.size + 1,
            title = toDoDraft.title,
            isDone = toDoDraft.isDone,
        )
        todoList.add(todo)

        return todo
    }

    override fun removeToDo(id: Int): Boolean {
        return todoList.removeIf { it.id == id }
    }

    override fun update(id: Int, toDoDraft: ToDoDraft): Boolean {
        val todo = todoList.firstOrNull { it.id == id } ?: return false

        todo.title = toDoDraft.title
        todo.isDone = toDoDraft.isDone

        return true
    }
}