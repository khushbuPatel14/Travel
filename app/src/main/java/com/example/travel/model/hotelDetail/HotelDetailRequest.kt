package com.example.travel.model.hotelDetail


import com.google.gson.annotations.SerializedName



data class HotelDetailRequest (
    @SerializedName("contentId")
    var contentId: String? = null,
    @SerializedName("checkIn")
    var checkIn: String? = null,
    @SerializedName("checkOut")
    var checkOut: String? = null,
    @SerializedName("rooms")
    var rooms: List<Room?>? = null
) : java.io.Serializable {
    data class Room(
        @SerializedName("adults")
        var adults: Int? = null,
        @SerializedName("childrenAges")
        var childrenAges: List<Int?>? = null
    ) : java.io.Serializable
}