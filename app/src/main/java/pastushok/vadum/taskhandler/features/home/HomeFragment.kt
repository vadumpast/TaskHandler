package pastushok.vadum.taskhandler.features.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.base.BaseContract
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentHomeBinding
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment: BaseFragment<FragmentHomeBinding>(), BaseContract {

    @Inject
    lateinit var presenter: HomePresenter

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, null, false)
    }

    override fun attachToPresenter() {
        presenter.attachView(this)
    }

    override fun initView() {
        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar(){
        val host: NavHostFragment = childFragmentManager.findFragmentById(R.id.home_navigation_view) as NavHostFragment? ?: return
        val navController = host.navController
        binding.homeNavigationBar.setupWithNavController(navController)
    }



}