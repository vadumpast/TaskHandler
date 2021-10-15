package pastushok.vadum.taskhandler.features.add

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentAddBinding
import javax.inject.Inject

@AndroidEntryPoint
class AddFragment: BaseFragment<FragmentAddBinding>(), AddContract {

    @Inject
    lateinit var presenter: AddPresenter

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAddBinding {
        return FragmentAddBinding.bind(inflater.inflate(R.layout.fragment_add, container, false))
    }

    override fun attachToPresenter() {
        presenter.attachView(this)
    }

    override fun initView() {

    }
}