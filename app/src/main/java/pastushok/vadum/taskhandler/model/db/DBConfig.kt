package pastushok.vadum.taskhandler.model.db

object DBConfig {

    const val DB_VERSION = 1
    const val DB_NAME = "task_handler_db"

    object Event {
        const val TABLE_NAME = "events"

        object Columns{
            const val NAME = "name"
            const val DATE = "date"
            const val REPEAT = "repeat"
            const val ID = "id"
        }

    }

}