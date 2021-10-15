package pastushok.vadum.taskhandler.features.add_task

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import dagger.hilt.android.AndroidEntryPoint
import pastushok.vadum.taskhandler.AddNavGraphDirections
import pastushok.vadum.taskhandler.NavGraphDirections
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentAddTaskBinding
import javax.inject.Inject

@AndroidEntryPoint
class AddTaskFragment: BaseFragment<FragmentAddTaskBinding>(), AddTaskContract {

    @Inject
    lateinit var presenter: AddTaskPresenter

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAddTaskBinding {
        return FragmentAddTaskBinding.bind(inflater.inflate(R.layout.fragment_add_task, container, false))
    }

    override fun attachToPresenter() {
        presenter.attachView(this)
    }

    override fun initView() {

    }

    companion object{
        fun start(navController: NavController){
            val direction = AddNavGraphDirections.actionToAddTask()
            navController.navigate(direction)
        }
    }
}