package unj.cs.hw4.adapter

import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import unj.cs.hw4.R
import unj.cs.hw4.model.coffee

class CoffeeAdapter(
    private val context: Context,
    private val dataset: List<coffee>
): RecyclerView.Adapter<CoffeeAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val judul: TextView = view.findViewById(R.id.textView3)
        val desc: TextView = view.findViewById(R.id.textView4)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.judul.text = context.resources.getString(item.judul)
        holder.desc.text = context.resources.getString(item.deskripsi)
    }

    override fun getItemCount() = dataset.size
}
