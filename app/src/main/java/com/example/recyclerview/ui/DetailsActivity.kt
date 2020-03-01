package com.example.recyclerview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.R
import com.example.recyclerview.model.ItemModel
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val itemModel = intent.getParcelableExtra<ItemModel>("detailObject")
        img_detail.setImageResource(itemModel.image)
        txt_description.text = itemModel.description
        txt_long_text.text = itemModel.longText
    }
}
