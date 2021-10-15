package pastushok.vadum.taskhandler.features.schedule

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pastushok.vadum.taskhandler.base.BasePresenter
import pastushok.vadum.taskhandler.model.db.DatabaseManager
import javax.inject.Inject

class SchedulePresenter @Inject constructor(
    private val databaseManager: DatabaseManager,
    ): BasePresenter<ScheduleContract>() {

    override fun onViewAttached() {
        loadData()
    }

    private fun loadData(){
        viewModelScope.launch {
            val events = databaseManager.getAllEvents()
            for(event in events){
                rootView?.showToast(event.name)
            }
        }
    }

}