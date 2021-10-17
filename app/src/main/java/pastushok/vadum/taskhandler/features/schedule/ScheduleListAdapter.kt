package pastushok.vadum.taskhandler.features.schedule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.databinding.ItemScheduleBinding
import pastushok.vadum.taskhandler.model.entity.db.Event
import javax.inject.Inject

class ScheduleListAdapter @Inject constructor(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var data: MutableList<Event> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ScheduleViewHolder(ItemScheduleBinding.bind(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_schedule,
                parent,
                false
            )
        ))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ScheduleViewHolder).binding.textView3.text = data[position].name
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setData(newData: MutableList<Event>){
        data = newData
        notifyDataSetChanged()
    }

    private class ScheduleViewHolder(val binding: ItemScheduleBinding):RecyclerView.ViewHolder(binding.root)
}