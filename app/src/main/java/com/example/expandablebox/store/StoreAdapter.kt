package com.example.expandablebox.store

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expandablebox.BindingViewHolder
import com.example.expandablebox.databinding.ItemBoxBinding
import com.example.expandablebox.store.viewHolders.ShortcutViewHolder
import com.example.model.StoreItem
import com.example.model.StoreType

class StoreAdapter(val items: List<StoreItem>) :
    RecyclerView.Adapter<BindingViewHolder<StoreItem>>() {

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int = items[position].type

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BindingViewHolder<StoreItem> {

        val inflater = LayoutInflater.from(parent.context)

        //create viewHolders
        when (viewType) {
            StoreType.Shortcut -> {
                val binding = ItemBoxBinding.inflate(inflater, parent, false)
                return ShortcutViewHolder(parent.context, binding)
            }

//            StoreType.Recommended -> {
//
//            }
//
//            StoreType.AdvancedTools -> {
//
//            }
//
//            StoreType.BriefNote -> {
//
//            }
//
//            StoreType.Stocks -> {
//
//            }
            else -> {
                val binding = ItemBoxBinding.inflate(inflater, parent, false)
                return ShortcutViewHolder(parent.context, binding)
            }
        }
    }

    override fun onBindViewHolder(holder: BindingViewHolder<StoreItem>, position: Int) {
        holder.bind(data = items[position], position)
    }

}