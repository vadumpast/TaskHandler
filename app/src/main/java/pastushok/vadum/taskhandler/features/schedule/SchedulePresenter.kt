package pastushok.vadum.taskhandler.features.schedule

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pastushok.vadum.taskhandler.base.BasePresenter
import pastushok.vadum.taskhandler.model.db.DatabaseManager
import pastushok.vadum.taskhandler.model.entity.db.Event
import java.util.*
import javax.inject.Inject

class SchedulePresenter @Inject constructor(
    private val databaseManager: DatabaseManager,
    ): BasePresenter<ScheduleContract>() {

    override fun onViewAttached() {
        loadData()
    }

    private fun loadData(){
        val data: MutableList<Pair<String, MutableList<Event>>> = mutableListOf()

        viewModelScope.launch {
            val events = databaseManager.getAllEvents()
            for(event in events){
                rootView?.showToast(event.name)
                val calendar: Calendar = Calendar.getInstance()
                calendar.timeInMillis = event.date

//                val dayOfMonth = calendar.get(Calendar.DAY_OF_WEEK).toString()
//                val month = calendar.get(Calendar.MONTH).toString()
//
//                val day = "$dayOfMonth,$month"

//                data[day]?.add(event) ?: data.put(day, mutableListOf(event))
                data.find { it.first == event.date.toString() }?.second?.add(event) ?: data.add(Pair(event.date.toString(), mutableListOf(event)))

            }
            rootView?.setupViewPager(data)
        }
    }

}