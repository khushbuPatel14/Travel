package com.example.travel.model.attraction


import com.google.gson.annotations.SerializedName

data class AttractionList(
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("products")
    var products: List<Product?>? = null,
    @SerializedName("skip")
    var skip: Int? = null,
    @SerializedName("total")
    var total: Int? = null
) {
    data class Product(
        @SerializedName("brand")
        var brand: String? = null,
        @SerializedName("category")
        var category: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("discountPercentage")
        var discountPercentage: Double? = null,
        @SerializedName("id")
        var id: Int? = null,
        @SerializedName("images")
        var images: List<String?>? = null,
        @SerializedName("price")
        var price: Int? = null,
        @SerializedName("rating")
        var rating: Double? = null,
        @SerializedName("stock")
        var stock: Int? = null,
        @SerializedName("thumbnail")
        var thumbnail: String? = null,
        @SerializedName("title")
        var title: String? = null
    )
}