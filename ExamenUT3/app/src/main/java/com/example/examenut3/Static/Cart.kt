package com.example.examenut3.Static

class Cart
{
    companion object
    {
        val list : ArrayList<Product> = ArrayList();

        fun addItem(code : String, name : String, stock : String, price : String, description : String)
        {
            list.add(Product(code, name, stock, price, description))
        }

        fun removeItem(element : Product)
        {
            list.remove(element)
        }
    }
}