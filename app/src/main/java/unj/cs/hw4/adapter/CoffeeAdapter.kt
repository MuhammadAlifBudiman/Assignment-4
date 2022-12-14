package unj.cs.hw4.adapter


import androidx.navigation.Navigation.findNavController
import unj.cs.hw4.model.Coffee
import androidx.recyclerview.widget.RecyclerView
import unj.cs.hw4.adapter.CoffeeAdapter.ItemViewHolder
import android.widget.TextView
import android.widget.LinearLayout
import unj.cs.hw4.R
import android.view.ViewGroup
import android.view.LayoutInflater
import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.navigation.findNavController
import unj.cs.hw4.ui.coffee.CoffeeFragmentDirections

class CoffeeAdapter(var context: Context, var dataset: List<Coffee>) :
    RecyclerView.Adapter<ItemViewHolder>() {
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
         val imageView: ImageView = view.findViewById(R.id.imageView2)
         val title: TextView = view.findViewById(R.id.textView3)
         val label: TextView = view.findViewById(R.id.textView4)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(
        holder: ItemViewHolder,
         position: Int
    ) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.title.text = context.resources.getString(item.title)
        holder.label.text = context.resources.getString(item.label)
        holder.itemView.setOnClickListener { v ->
            val action = CoffeeFragmentDirections.actionNavigationListToDetailFragment(item)
            v.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}