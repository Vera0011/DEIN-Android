package com.example.examenut3.Static

class Product(val code : String, val name : String, val stock : String, val price : String, val description : String)
{

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        if (code != other.code) return false
        if (name != other.name) return false
        if (stock != other.stock) return false
        if (price != other.price) return false
        if (description != other.description) return false

        return true
    }

    override fun hashCode(): Int {
        var result = code.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + stock.hashCode()
        result = 31 * result + price.hashCode()
        result = 31 * result + description.hashCode()
        return result
    }
}