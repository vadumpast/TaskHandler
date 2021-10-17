package pastushok.vadum.taskhandler.features.schedule

import pastushok.vadum.taskhandler.base.BaseContract
import pastushok.vadum.taskhandler.model.entity.db.Event

interface ScheduleContract: BaseContract {

    fun setupViewPager(data: MutableList<Pair<String, MutableList<Event>>>)
}