package pastushok.vadum.taskhandler.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding>: Fragment(), BaseContract {

    private var viewBinding: VB? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return createViewBinding(inflater, container).also { viewBinding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachToPresenter()
        initView()
    }

    protected abstract fun createViewBinding(inflater: LayoutInflater, container: ViewGroup?): VB

    open fun initView() {}

    open fun attachToPresenter() {}




}