package pastushok.vadum.taskhandler.features.settings

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentSettingsBinding
import javax.inject.Inject

@AndroidEntryPoint
class SettingsFragment: BaseFragment<FragmentSettingsBinding>(), SettingsContract {

    @Inject
    lateinit var presenter:SettingsPresenter

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSettingsBinding {
        return FragmentSettingsBinding.inflate(inflater, container, false)
    }

    override fun attachToPresenter() {
        presenter.attachView(this)
    }
}