package pastushok.vadum.taskhandler.features.schedule

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.databinding.ItemScheduleBinding
import pastushok.vadum.taskhandler.databinding.PageScheduleBinding
import pastushok.vadum.taskhandler.model.entity.db.Event
import javax.inject.Inject

class SchedulePagerAdapter @Inject constructor(
    private val scheduleListAdapter: ScheduleListAdapter
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var data: MutableMap<String, MutableList<Event>> = mutableMapOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ScheduleViewHolder(PageScheduleBinding.bind(
            LayoutInflater.from(parent.context).inflate(
                R.layout.page_schedule,
                parent,
                false
                )
            ),
            parent.context
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as ScheduleViewHolder).binding
        binding.textView.text = position.toString()

        val manager = LinearLayoutManager((holder as ScheduleViewHolder).context)
        binding.scheduleList.adapter = scheduleListAdapter
        binding.scheduleList.layoutManager = manager
    }

    override fun getItemCount(): Int {
        return 3
    }

    fun setData(newData: MutableMap<String, MutableList<Event>>){
        data = newData
        notifyDataSetChanged()
    }

    private class ScheduleViewHolder(val binding: PageScheduleBinding, val context: Context): RecyclerView.ViewHolder(binding.root)
}