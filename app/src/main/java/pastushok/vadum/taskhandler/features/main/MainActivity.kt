package pastushok.vadum.taskhandler.features.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.base.BaseActivity
import pastushok.vadum.taskhandler.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(){

    override fun createViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater, null, false)
    }
}