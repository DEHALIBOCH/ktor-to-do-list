package kz.dehaliboch.database

import org.ktorm.entity.Entity

interface DBTodoEntity : Entity<DBTodoEntity> {

    companion object : Entity.Factory<DBTodoEntity>()

    val id: Int
    val title: String
    val done: Boolean
}