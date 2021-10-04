package pastushok.vadum.taskhandler.features.tasks

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentTasksBinding
import javax.inject.Inject

@AndroidEntryPoint
class TasksFragment: BaseFragment<FragmentTasksBinding>(), TasksContract {

    @Inject
    lateinit var presenter:TasksPresenter

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTasksBinding {
        return FragmentTasksBinding.inflate(inflater, container, false)
    }

    override fun attachToPresenter() {
        presenter.attachView(this)
    }
}