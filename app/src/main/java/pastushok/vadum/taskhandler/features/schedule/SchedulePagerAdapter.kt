package pastushok.vadum.taskhandler.features.schedule

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pastushok.vadum.taskhandler.R
import pastushok.vadum.taskhandler.databinding.PageScheduleBinding
import pastushok.vadum.taskhandler.model.entity.db.Event
import javax.inject.Inject

class SchedulePagerAdapter @Inject constructor(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var data: MutableList<Pair<String, MutableList<Event>>> = mutableListOf()

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

        val manager = LinearLayoutManager(holder.context)

        binding.textView.text = data[position].first

        val adapter = ScheduleListAdapter()
        adapter.setData(data[position].second)
        binding.scheduleList.adapter = adapter
        binding.scheduleList.layoutManager = manager
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setData(newData: MutableList<Pair<String, MutableList<Event>>>){
        data = newData
        notifyDataSetChanged()
    }

    private class ScheduleViewHolder(val binding: PageScheduleBinding, val context: Context): RecyclerView.ViewHolder(binding.root)
}