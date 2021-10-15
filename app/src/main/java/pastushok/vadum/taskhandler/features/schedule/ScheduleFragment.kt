package pastushok.vadum.taskhandler.features.schedule

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentScheduleBinding
import pastushok.vadum.taskhandler.databinding.FragmentSettingsBinding
import javax.inject.Inject

@AndroidEntryPoint
class ScheduleFragment: BaseFragment<FragmentScheduleBinding>(), ScheduleContract {

    @Inject
    lateinit var presenter: SchedulePresenter
    @Inject
    lateinit var adapter:SchedulePagerAdapter

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentScheduleBinding {
        return FragmentScheduleBinding.inflate(inflater, container, false)
    }

    override fun attachToPresenter() {
        presenter.attachView(this)
    }

    override fun setupViewPager(/*data: MutableMap<String, List<String>>*/){
        binding.viewPagerSchedule.adapter = adapter
    }

}