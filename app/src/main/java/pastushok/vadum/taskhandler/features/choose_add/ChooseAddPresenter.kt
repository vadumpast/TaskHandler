package pastushok.vadum.taskhandler.features.choose_add

import pastushok.vadum.taskhandler.base.BasePresenter
import javax.inject.Inject

class ChooseAddPresenter @Inject constructor(): BasePresenter<ChooseAddContract>() {

    fun onAddEventClicked(){
        rootView?.openAddEventFragment()
    }

    fun onAddTaskClicked(){
        rootView?.openAddTaskFragment()
    }

}