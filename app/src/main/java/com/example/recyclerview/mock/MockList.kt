package com.example.recyclerview

object MockList {

    fun getMockedItemList(): List<ItemModel> {
        val itemModel1 = ItemModel(
            R.drawable.ic_girl,
            "birinci text",
            "longtext1"
        )
        val itemModel2 = ItemModel(
            R.drawable.ic_girl,
            "ikinci text",
            "longtext2"
        )
        val itemModel3 = ItemModel(
            R.drawable.ic_girl,
            "üçüncü text",
            "longtext3"
        )
        val itemModel4 = ItemModel(
            R.drawable.ic_girl,
            "dördüncü text",
            "longtext4"
        )
        val itemModel5 = ItemModel(
            R.drawable.ic_girl,
            "beşinci text",
            "longtext5"
        )
        val itemModel6 = ItemModel(
            R.drawable.ic_girl,
            "altıncı text",
            "longtext6"
        )
        val itemModel7 = ItemModel(
            R.drawable.ic_girl,
            "yedinci text",
            "longtext7"
        )

        val itemList: ArrayList<ItemModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)

        return itemList
    }

}