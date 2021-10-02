package pastushok.vadum.taskhandler.base

import androidx.annotation.StringRes

interface BaseContract {

    fun showToast(text: String)

    fun showToast(@StringRes text: Int)
}