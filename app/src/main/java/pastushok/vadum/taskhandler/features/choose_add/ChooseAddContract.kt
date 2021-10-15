package pastushok.vadum.taskhandler.features.choose_add

import pastushok.vadum.taskhandler.base.BaseContract

interface ChooseAddContract: BaseContract {

    fun openAddEventFragment()

    fun openAddTaskFragment()
}