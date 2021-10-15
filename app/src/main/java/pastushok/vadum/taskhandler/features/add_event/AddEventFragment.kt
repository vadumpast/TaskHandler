package pastushok.vadum.taskhandler.features.add_event

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import dagger.hilt.android.AndroidEntryPoint
import pastushok.vadum.taskhandler.AddNavGraphDirections
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentAddEventBinding
import javax.inject.Inject

@AndroidEntryPoint
class AddEventFragment: BaseFragment<FragmentAddEventBinding>(), AddEventContract {

    @Inject
    lateinit var presenter: AddEventPresenter

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAddEventBinding {
        return FragmentAddEventBinding.bind(inflater.inflate(R.layout.fragment_add_event, container, false))
    }

    override fun attachToPresenter() {
        presenter.attachView(this)
    }

    override fun initView() {
    }

    companion object{
        fun start(navController: NavController){
            val direction = AddNavGraphDirections.actionToAddEvent()
            navController.navigate(direction)
        }
    }
}