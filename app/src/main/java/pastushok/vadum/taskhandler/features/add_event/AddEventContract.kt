package pastushok.vadum.taskhandler.features.add_event

import pastushok.vadum.taskhandler.base.BaseContract

interface AddEventContract: BaseContract {

    fun getEventName(): String

    fun getEventTime(): Long

    fun getEventRepeat(): Long

}