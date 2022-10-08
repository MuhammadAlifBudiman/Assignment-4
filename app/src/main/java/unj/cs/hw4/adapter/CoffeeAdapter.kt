package unj.cs.hw4.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

import unj.cs.hw4.placeholder.PlaceholderContent.PlaceholderItem
import unj.cs.hw4.databinding.FragmentCoffeeBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class CoffeeAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<CoffeeAdapter.ViewHolder>() {


    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentCoffeeBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}