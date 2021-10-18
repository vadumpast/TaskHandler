package pastushok.vadum.taskhandler.features.add_event

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import pastushok.vadum.taskhandler.base.BasePresenter
import pastushok.vadum.taskhandler.model.db.DatabaseManager
import pastushok.vadum.taskhandler.model.entity.db.Event
import javax.inject.Inject

class AddEventPresenter @Inject constructor(
    val databaseManager: DatabaseManager
): BasePresenter<AddEventContract>() {

    override fun onViewAttached() {
    }

    fun onAddEventClicked(){
        val name = rootView?.getEventName() ?: return
        val time = rootView?.getEventTime() ?: return
        val repeat = rootView?.getEventRepeat() ?: return

        viewModelScope.launch {
            databaseManager.insertEvent(
                Event(
                    name,
                    time,
                    0,
                    1,
                    repeat
                )
            )
        }


    }
}