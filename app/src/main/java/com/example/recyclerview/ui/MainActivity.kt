package com.example.recyclerview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ui.adapter.ItemListAdapter
import com.example.recyclerview.R
import com.example.recyclerview.mock.MockList
import com.example.recyclerview.model.ItemModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        val adapter =
            ItemListAdapter(MockList.getMockedItemList() as ArrayList<ItemModel>) { itemModel: ItemModel ->
                itemModelClicked(itemModel)
            }
        recyclerView.adapter= adapter

    }

    private fun itemModelClicked(itemModel : ItemModel) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("detailObject", itemModel)
        startActivity(intent)
    }
}
