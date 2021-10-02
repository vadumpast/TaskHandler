package pastushok.vadum.taskhandler.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.WindowInsetsControllerCompat
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<
        VB : ViewBinding
        > : AppCompatActivity() {

    private var viewBinding: VB? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding=createViewBinding(LayoutInflater.from(this)).also {
            setContentView(it.root)
        }
    }

    protected abstract fun createViewBinding(inflater: LayoutInflater): VB
}