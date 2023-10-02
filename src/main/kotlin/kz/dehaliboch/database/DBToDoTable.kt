package kz.dehaliboch.database

import kz.dehaliboch.comon.DatabaseConstants
import org.ktorm.schema.Table
import org.ktorm.schema.boolean
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object DBToDoTable : Table<DBTodoEntity>(tableName = DatabaseConstants.TABLE_NAME) {

    val id = int("id").primaryKey().bindTo { it.id }
    val title = varchar("title").bindTo { it.title }
    val done = boolean("done").bindTo { it.done }
}