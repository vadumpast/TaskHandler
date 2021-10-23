package pastushok.vadum.taskhandler.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.databinding.ElThDatepickerBinding

class THDatePicker constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
    ): ConstraintLayout(context, attrs, defStyleAttr) {

    private var binding: ElThDatepickerBinding

    init {
        val view = LayoutInflater.from(context).inflate(
            R.layout.el_th_datepicker,
            this,
            false
        )
        binding = ElThDatepickerBinding.bind(view)
        initAttrs(attrs)
    }

    private fun initAttrs(attrs: AttributeSet?){
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.THDatePicker,
            0,
            0
        ).apply {


        }
    }




}