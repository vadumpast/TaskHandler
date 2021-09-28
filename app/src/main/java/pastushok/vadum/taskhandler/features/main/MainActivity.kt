package pastushok.vadum.taskhandler.features.main

import android.view.LayoutInflater
import pastushok.vadum.taskhandler.base.BaseActivity
import pastushok.vadum.taskhandler.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun createViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater, null, false)
    }
}