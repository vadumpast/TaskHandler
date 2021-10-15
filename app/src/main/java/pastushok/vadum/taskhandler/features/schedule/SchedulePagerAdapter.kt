package pastushok.vadum.taskhandler.features.schedule

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.databinding.ItemScheduleBinding
import javax.inject.Inject

class SchedulePagerAdapter @Inject constructor(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ScheduleViewHolder(ItemScheduleBinding.bind(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_schedule,
                parent,
                false
                )
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ScheduleViewHolder).binding.textView.text = position.toString()
    }

    override fun getItemCount(): Int {
        return 3
    }

    class ScheduleViewHolder(val binding: ItemScheduleBinding): RecyclerView.ViewHolder(binding.root)
}