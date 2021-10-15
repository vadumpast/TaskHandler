package pastushok.vadum.taskhandler.features.choose_add

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentChooseAddBinding
import pastushok.vadum.taskhandler.features.add_event.AddEventFragment
import pastushok.vadum.taskhandler.features.add_task.AddTaskFragment
import javax.inject.Inject

@AndroidEntryPoint
class ChooseAddFragment: BaseFragment<FragmentChooseAddBinding>(), ChooseAddContract {

    @Inject
    lateinit var presenter: ChooseAddPresenter

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentChooseAddBinding {
        return FragmentChooseAddBinding.bind(inflater.inflate(R.layout.fragment_choose_add, container, false))
    }

    override fun attachToPresenter() {
        presenter.attachView(this)
    }

    override fun initView() {
        binding.ibChooseAddEvent.setOnClickListener { presenter.onAddEventClicked() }
        binding.ibChooseAddTask.setOnClickListener { presenter.onAddTaskClicked() }
    }

    override fun openAddEventFragment() {
        AddEventFragment.start(findNavController())
    }

    override fun openAddTaskFragment() {
        AddTaskFragment.start(findNavController())
    }
}