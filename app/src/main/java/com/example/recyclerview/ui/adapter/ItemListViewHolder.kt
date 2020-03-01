package com.example.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.ItemModel

class ItemListViewHolder (itemView : View): RecyclerView.ViewHolder(itemView){

    fun bindItems(itemModel : ItemModel, clickListener: (ItemModel) -> Unit) {
        val description = itemView.findViewById(R.id.item_textName) as TextView
        val image = itemView.findViewById(R.id.image) as ImageView

        description.text= itemModel.description
        image.setImageResource(itemModel.image)
        itemView.setOnClickListener { clickListener(itemModel) }
    }
}