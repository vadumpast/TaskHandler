package pastushok.vadum.taskhandler.base

import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BasePresenter<T: BaseContract>: ViewModel(){

    protected var rootView: T? = null

    fun attachView(view: T){
        rootView = view
        onViewAttached()
    }

    open fun onViewAttached() {}
}