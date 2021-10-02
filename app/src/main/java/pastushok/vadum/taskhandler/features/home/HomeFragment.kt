package pastushok.vadum.taskhandler.features.home

import android.view.LayoutInflater
import android.view.ViewGroup
import pastushok.vadum.taskhandler.base.BaseFragment
import pastushok.vadum.taskhandler.databinding.FragmentHomeBinding

class HomeFragment: BaseFragment<FragmentHomeBinding>() {

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, null, false)
    }

}