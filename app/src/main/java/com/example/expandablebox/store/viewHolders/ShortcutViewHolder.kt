package com.example.expandablebox.store.viewHolders

import android.content.Context
import androidx.core.content.ContextCompat
import com.example.expandablebox.BindingViewHolder
import com.example.expandablebox.R
import com.example.expandablebox.databinding.ItemBoxBinding
import com.example.expandablebox.databinding.ItemShortcutBinding
import com.example.model.StoreItem

class ShortcutViewHolder(private val context: Context, val binding: ItemBoxBinding) :
    BindingViewHolder<StoreItem>(binding) {

    override fun bind(data: StoreItem, position: Int) {
        with(binding) {
//            title.text = data.header
//            title.setTextColor(ContextCompat.getColor(context, R.color.purple_700))
//            subTitle.text = data.subHeader
//            subTitle.setTextColor(ContextCompat.getColor(context, R.color.purple_500))
            //todo set image

            header.text = data.header
            subHeader.text = data.subHeader

        }
    }

}