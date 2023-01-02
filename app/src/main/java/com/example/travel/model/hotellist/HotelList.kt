package com.example.travel.model.hotellist


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class HotelList (
    @SerializedName("data")
    var data: Data? = null
) : Parcelable {
    data class Data(
        @SerializedName("AppPresentation_queryAppListV2")
        var appPresentationQueryAppListV2: List<AppPresentationQueryAppV2?>? = null
    ) {
        data class AppPresentationQueryAppV2(
            @SerializedName("availableSorts")
            var availableSorts: List<AvailableSort?>? = null,
            @SerializedName("barItems")
            var barItems: List<BarItem?>? = null,
            @SerializedName("commerce")
            var commerce: Commerce? = null,
            @SerializedName("container")
            var container: Container? = null,
            @SerializedName("datePickerConfig")
            var datePickerConfig: DatePickerConfig? = null,
            @SerializedName("filters")
            var filters: Filters? = null,
            @SerializedName("impressions")
            var impressions: List<Impression?>? = null,
            @SerializedName("mapSections")
            var mapSections: List<MapSection?>? = null,
            @SerializedName("quickLinks")
            var quickLinks: Any? = null,
            @SerializedName("sections")
            var sections: List<Section?>? = null,
            @SerializedName("skippedSections")
            var skippedSections: List<String?>? = null,
            @SerializedName("status")
            var status: Status? = null,
            @SerializedName("trackingKey")
            var trackingKey: String? = null,
            @SerializedName("__typename")
            var typename: String? = null,
            @SerializedName("updatedClusterIds")
            var updatedClusterIds: Any? = null
        ) {
            data class AvailableSort(
                @SerializedName("isAscending")
                var isAscending: Boolean? = null,
                @SerializedName("isSelected")
                var isSelected: Boolean? = null,
                @SerializedName("name")
                var name: String? = null,
                @SerializedName("surfaces")
                var surfaces: List<String?>? = null,
                @SerializedName("title")
                var title: Title? = null,
                @SerializedName("tooltipV2")
                var tooltipV2: Any? = null,
                @SerializedName("trackingKey")
                var trackingKey: String? = null,
                @SerializedName("trackingTitle")
                var trackingTitle: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class Title(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )
            }

            data class BarItem(
                @SerializedName("buttonText")
                var buttonText: ButtonText? = null,
                @SerializedName("stableDiffingType")
                var stableDiffingType: String? = null,
                @SerializedName("surfaces")
                var surfaces: List<String?>? = null,
                @SerializedName("trackingKey")
                var trackingKey: String? = null,
                @SerializedName("trackingTitle")
                var trackingTitle: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class ButtonText(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )
            }

            data class Commerce(
                @SerializedName("attractionCommerce")
                var attractionCommerce: AttractionCommerce? = null,
                @SerializedName("hotelCommerce")
                var hotelCommerce: HotelCommerce? = null,
                @SerializedName("lastUpdated")
                var lastUpdated: String? = null,
                @SerializedName("restaurantCommerce")
                var restaurantCommerce: RestaurantCommerce? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class AttractionCommerce(
                    @SerializedName("endDate")
                    var endDate: String? = null,
                    @SerializedName("pax")
                    var pax: List<Pax?>? = null,
                    @SerializedName("setByUser")
                    var setByUser: Boolean? = null,
                    @SerializedName("startDate")
                    var startDate: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("updated")
                    var updated: Any? = null
                ) {
                    data class Pax(
                        @SerializedName("ageBand")
                        var ageBand: String? = null,
                        @SerializedName("count")
                        var count: Int? = null,
                        @SerializedName("endAge")
                        var endAge: Any? = null,
                        @SerializedName("maxTravelersPerBooking")
                        var maxTravelersPerBooking: Any? = null,
                        @SerializedName("minTravelersPerBooking")
                        var minTravelersPerBooking: Any? = null,
                        @SerializedName("startAge")
                        var startAge: Any? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class HotelCommerce(
                    @SerializedName("checkIn")
                    var checkIn: String? = null,
                    @SerializedName("checkOut")
                    var checkOut: String? = null,
                    @SerializedName("rooms")
                    var rooms: List<Room?>? = null,
                    @SerializedName("setByUser")
                    var setByUser: Boolean? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("updated")
                    var updated: Any? = null
                ) {
                    data class Room(
                        @SerializedName("adults")
                        var adults: Int? = null,
                        @SerializedName("childrenAges")
                        var childrenAges: List<Any?>? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class RestaurantCommerce(
                    @SerializedName("partySize")
                    var partySize: Int? = null,
                    @SerializedName("reservationTime")
                    var reservationTime: String? = null,
                    @SerializedName("setByUser")
                    var setByUser: Boolean? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("updated")
                    var updated: Any? = null
                )
            }

            data class Container(
                @SerializedName("datePicker")
                var datePicker: DatePicker? = null,
                @SerializedName("navTitle")
                var navTitle: Any? = null,
                @SerializedName("plusMarketingBanner")
                var plusMarketingBanner: Any? = null,
                @SerializedName("route")
                var route: Route? = null,
                @SerializedName("searchGhostText")
                var searchGhostText: Any? = null,
                @SerializedName("searchTitle")
                var searchTitle: SearchTitle? = null,
                @SerializedName("showMapToggle")
                var showMapToggle: Boolean? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class DatePicker(
                    @SerializedName("commerceType")
                    var commerceType: String? = null,
                    @SerializedName("configuration")
                    var configuration: Configuration? = null,
                    @SerializedName("lastSelectableDate")
                    var lastSelectableDate: String? = null,
                    @SerializedName("surfaces")
                    var surfaces: List<String?>? = null,
                    @SerializedName("timeZoneOffset")
                    var timeZoneOffset: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Configuration(
                        @SerializedName("configType")
                        var configType: String? = null,
                        @SerializedName("maxAdultsPerRoom")
                        var maxAdultsPerRoom: Int? = null,
                        @SerializedName("maxChildrenPerRoom")
                        var maxChildrenPerRoom: Int? = null,
                        @SerializedName("maxRooms")
                        var maxRooms: Int? = null,
                        @SerializedName("maxStayLength")
                        var maxStayLength: Int? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class Route(
                    @SerializedName("fragment")
                    var fragment: Any? = null,
                    @SerializedName("nonCanonicalUrl")
                    var nonCanonicalUrl: String? = null,
                    @SerializedName("page")
                    var page: String? = null,
                    @SerializedName("typedParams")
                    var typedParams: TypedParams? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("url")
                    var url: String? = null
                ) {
                    data class TypedParams(
                        @SerializedName("contentType")
                        var contentType: String? = null,
                        @SerializedName("geoId")
                        var geoId: Int? = null,
                        @SerializedName("isCollectionView")
                        var isCollectionView: Any? = null,
                        @SerializedName("isList")
                        var isList: Boolean? = null,
                        @SerializedName("isMap")
                        var isMap: Any? = null,
                        @SerializedName("isNearby")
                        var isNearby: Any? = null,
                        @SerializedName("nearLocationId")
                        var nearLocationId: Any? = null,
                        @SerializedName("nearLocationType")
                        var nearLocationType: Any? = null,
                        @SerializedName("pagee")
                        var pagee: Any? = null,
                        @SerializedName("routingFilters")
                        var routingFilters: Any? = null,
                        @SerializedName("sort")
                        var sort: Any? = null,
                        @SerializedName("sortOrder")
                        var sortOrder: Any? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class SearchTitle(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )
            }

            data class DatePickerConfig(
                @SerializedName("attractionProductDatePickerConfig")
                var attractionProductDatePickerConfig: Any? = null,
                @SerializedName("hotelDatePickerConfig")
                var hotelDatePickerConfig: HotelDatePickerConfig? = null,
                @SerializedName("lastSelectableDate")
                var lastSelectableDate: String? = null,
                @SerializedName("restaurantDatePickerConfig")
                var restaurantDatePickerConfig: RestaurantDatePickerConfig? = null,
                @SerializedName("surfaces")
                var surfaces: List<String?>? = null,
                @SerializedName("timeZoneOffset")
                var timeZoneOffset: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class HotelDatePickerConfig(
                    @SerializedName("maxStayLength")
                    var maxStayLength: Int? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class RestaurantDatePickerConfig(
                    @SerializedName("numDisplayOptions")
                    var numDisplayOptions: Int? = null,
                    @SerializedName("reservationRange")
                    var reservationRange: ReservationRange? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class ReservationRange(
                        @SerializedName("maxDate")
                        var maxDate: String? = null,
                        @SerializedName("maxTime")
                        var maxTime: String? = null,
                        @SerializedName("minDate")
                        var minDate: String? = null,
                        @SerializedName("minTime")
                        var minTime: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }
            }

            data class Filters(
                @SerializedName("availableFilterGroups")
                var availableFilterGroups: List<AvailableFilterGroup?>? = null,
                @SerializedName("showAllText")
                var showAllText: ShowAllText? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class AvailableFilterGroup(
                    @SerializedName("filters")
                    var filters: List<Filter?>? = null,
                    @SerializedName("groupType")
                    var groupType: String? = null,
                    @SerializedName("name")
                    var name: String? = null,
                    @SerializedName("tooltip")
                    var tooltip: Any? = null,
                    @SerializedName("trackingKey")
                    var trackingKey: String? = null,
                    @SerializedName("trackingTitle")
                    var trackingTitle: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Filter(
                        @SerializedName("collapsed")
                        var collapsed: Boolean? = null,
                        @SerializedName("filterType")
                        var filterType: String? = null,
                        @SerializedName("locations")
                        var locations: List<Location?>? = null,
                        @SerializedName("maxDistance")
                        var maxDistance: Double? = null,
                        @SerializedName("maxValue")
                        var maxValue: Double? = null,
                        @SerializedName("minDistance")
                        var minDistance: Double? = null,
                        @SerializedName("minValue")
                        var minValue: Double? = null,
                        @SerializedName("name")
                        var name: String? = null,
                        @SerializedName("selectedDistance")
                        var selectedDistance: Any? = null,
                        @SerializedName("selectedRangeEnd")
                        var selectedRangeEnd: Double? = null,
                        @SerializedName("selectedRangeStart")
                        var selectedRangeStart: Double? = null,
                        @SerializedName("surfaces")
                        var surfaces: List<String?>? = null,
                        @SerializedName("title")
                        var title: String? = null,
                        @SerializedName("tooltip")
                        var tooltip: Any? = null,
                        @SerializedName("trackingKey")
                        var trackingKey: String? = null,
                        @SerializedName("trackingTitle")
                        var trackingTitle: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null,
                        @SerializedName("unitFormat")
                        var unitFormat: UnitFormat? = null,
                        @SerializedName("values")
                        var values: List<Value?>? = null
                    ) {
                        data class Location(
                            @SerializedName("count")
                            var count: Any? = null,
                            @SerializedName("isSelected")
                            var isSelected: Boolean? = null,
                            @SerializedName("object")
                            var objectX: Object? = null,
                            @SerializedName("selectedAccessibilityString")
                            var selectedAccessibilityString: SelectedAccessibilityString? = null,
                            @SerializedName("tooltip")
                            var tooltip: Any? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("unselectedAccessibilityString")
                            var unselectedAccessibilityString: UnselectedAccessibilityString? = null,
                            @SerializedName("value")
                            var value: String? = null
                        ) {
                            data class Object(
                                @SerializedName("location")
                                var location: Location? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Location(
                                    @SerializedName("names")
                                    var names: Names? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                ) {
                                    data class Names(
                                        @SerializedName("name")
                                        var name: String? = null,
                                        @SerializedName("__typename")
                                        var typename: String? = null
                                    )
                                }
                            }

                            data class SelectedAccessibilityString(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class UnselectedAccessibilityString(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class UnitFormat(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class Value(
                            @SerializedName("count")
                            var count: Any? = null,
                            @SerializedName("filterName")
                            var filterName: String? = null,
                            @SerializedName("isSelected")
                            var isSelected: Boolean? = null,
                            @SerializedName("object")
                            var objectX: Object? = null,
                            @SerializedName("selectedAccessibilityString")
                            var selectedAccessibilityString: SelectedAccessibilityString? = null,
                            @SerializedName("tooltip")
                            var tooltip: Tooltip? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("unselectedAccessibilityString")
                            var unselectedAccessibilityString: UnselectedAccessibilityString? = null,
                            @SerializedName("value")
                            var value: String? = null
                        ) {
                            data class Object(
                                @SerializedName("minimumRatingValue")
                                var minimumRatingValue: Int? = null,
                                @SerializedName("tag")
                                var tag: Tag? = null,
                                @SerializedName("text")
                                var text: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Tag(
                                    @SerializedName("localizedName")
                                    var localizedName: String? = null,
                                    @SerializedName("tagId")
                                    var tagId: Int? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class SelectedAccessibilityString(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class Tooltip(
                                @SerializedName("dialog")
                                var dialog: Any? = null,
                                @SerializedName("icon")
                                var icon: String? = null,
                                @SerializedName("labelText")
                                var labelText: Any? = null,
                                @SerializedName("popUpText")
                                var popUpText: PopUpText? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class PopUpText(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class UnselectedAccessibilityString(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }
                    }
                }

                data class ShowAllText(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )
            }

            data class Impression(
                @SerializedName("data")
                var `data`: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            )

            data class MapSection(
                @SerializedName("anchor")
                var anchor: Any? = null,
                @SerializedName("center")
                var center: Any? = null,
                @SerializedName("clusterId")
                var clusterId: String? = null,
                @SerializedName("content")
                var content: List<Content?>? = null,
                @SerializedName("pins")
                var pins: List<Pin?>? = null,
                @SerializedName("stableDiffingType")
                var stableDiffingType: String? = null,
                @SerializedName("trackingKey")
                var trackingKey: String? = null,
                @SerializedName("trackingTitle")
                var trackingTitle: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class Content(
                    @SerializedName("badge")
                    var badge: Badge? = null,
                    @SerializedName("bubbleRating")
                    var bubbleRating: BubbleRating? = null,
                    @SerializedName("cardLink")
                    var cardLink: CardLink? = null,
                    @SerializedName("cardPhoto")
                    var cardPhoto: CardPhoto? = null,
                    @SerializedName("cardTitle")
                    var cardTitle: CardTitle? = null,
                    @SerializedName("closureInfo")
                    var closureInfo: Any? = null,
                    @SerializedName("commerceButtons")
                    var commerceButtons: Any? = null,
                    @SerializedName("descriptiveText")
                    var descriptiveText: Any? = null,
                    @SerializedName("distance")
                    var distance: Any? = null,
                    @SerializedName("isSaved")
                    var isSaved: Boolean? = null,
                    @SerializedName("labels")
                    var labels: List<Label?>? = null,
                    @SerializedName("merchandisingText")
                    var merchandisingText: Any? = null,
                    @SerializedName("primaryInfo")
                    var primaryInfo: PrimaryInfo? = null,
                    @SerializedName("saveId")
                    var saveId: SaveId? = null,
                    @SerializedName("secondaryInfo")
                    var secondaryInfo: Any? = null,
                    @SerializedName("stableDiffingType")
                    var stableDiffingType: String? = null,
                    @SerializedName("trackingKey")
                    var trackingKey: String? = null,
                    @SerializedName("trackingTitle")
                    var trackingTitle: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Badge(
                        @SerializedName("size")
                        var size: String? = null,
                        @SerializedName("type")
                        var type: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null,
                        @SerializedName("year")
                        var year: String? = null
                    )

                    data class BubbleRating(
                        @SerializedName("numberReviews")
                        var numberReviews: NumberReviews? = null,
                        @SerializedName("rating")
                        var rating: Double? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    ) {
                        data class NumberReviews(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class CardLink(
                        @SerializedName("accessibilityString")
                        var accessibilityString: AccessibilityString? = null,
                        @SerializedName("route")
                        var route: Route? = null,
                        @SerializedName("text")
                        var text: Any? = null,
                        @SerializedName("trackingContext")
                        var trackingContext: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null,
                        @SerializedName("webviewRoute")
                        var webviewRoute: Any? = null
                    ) {
                        data class AccessibilityString(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class Route(
                            @SerializedName("fragment")
                            var fragment: Any? = null,
                            @SerializedName("nonCanonicalUrl")
                            var nonCanonicalUrl: String? = null,
                            @SerializedName("page")
                            var page: String? = null,
                            @SerializedName("typedParams")
                            var typedParams: TypedParams? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("url")
                            var url: String? = null
                        ) {
                            data class TypedParams(
                                @SerializedName("contentId")
                                var contentId: String? = null,
                                @SerializedName("contentType")
                                var contentType: String? = null,
                                @SerializedName("spAttributionToken")
                                var spAttributionToken: Any? = null,
                                @SerializedName("__typename")
                                var typename: String? = null,
                                @SerializedName("wasPlusShown")
                                var wasPlusShown: Any? = null
                            )
                        }
                    }

                    data class CardPhoto(
                        @SerializedName("sizes")
                        var sizes: Sizes? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    ) {
                        data class Sizes(
                            @SerializedName("maxHeight")
                            var maxHeight: Int? = null,
                            @SerializedName("maxWidth")
                            var maxWidth: Int? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("urlTemplate")
                            var urlTemplate: String? = null
                        )
                    }

                    data class CardTitle(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class Label(
                        @SerializedName("text")
                        var text: Text? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    ) {
                        data class Text(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class PrimaryInfo(
                        @SerializedName("text")
                        var text: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class SaveId(
                        @SerializedName("id")
                        var id: String? = null,
                        @SerializedName("type")
                        var type: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class Pin(
                    @SerializedName("fallbackIcon")
                    var fallbackIcon: String? = null,
                    @SerializedName("geoPoint")
                    var geoPoint: GeoPoint? = null,
                    @SerializedName("icon")
                    var icon: Icon? = null,
                    @SerializedName("isSaved")
                    var isSaved: Boolean? = null,
                    @SerializedName("saveId")
                    var saveId: SaveId? = null,
                    @SerializedName("trackingKey")
                    var trackingKey: String? = null,
                    @SerializedName("trackingTitle")
                    var trackingTitle: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class GeoPoint(
                        @SerializedName("latitude")
                        var latitude: Double? = null,
                        @SerializedName("longitude")
                        var longitude: Double? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class Icon(
                        @SerializedName("activeName")
                        var activeName: String? = null,
                        @SerializedName("name")
                        var name: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class SaveId(
                        @SerializedName("id")
                        var id: String? = null,
                        @SerializedName("type")
                        var type: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }
            }

            data class Section(
                @SerializedName("adSizes")
                var adSizes: List<String?>? = null,
                @SerializedName("adUnitId")
                var adUnitId: String? = null,
                @SerializedName("background")
                var background: Any? = null,
                @SerializedName("clusterId")
                var clusterId: String? = null,
                @SerializedName("divider")
                var divider: String? = null,
                @SerializedName("groupName")
                var groupName: GroupName? = null,
                @SerializedName("link")
                var link: Link? = null,
                @SerializedName("nullableText")
                var nullableText: NullableText? = null,
                @SerializedName("sectionType")
                var sectionType: String? = null,
                @SerializedName("singleCardContent")
                var singleCardContent: SingleCardContent? = null,
                @SerializedName("spacing")
                var spacing: String? = null,
                @SerializedName("stableDiffingType")
                var stableDiffingType: String? = null,
                @SerializedName("targetingParams")
                var targetingParams: List<TargetingParam?>? = null,
                @SerializedName("tooltip")
                var tooltip: Tooltip? = null,
                @SerializedName("trackingKey")
                var trackingKey: String? = null,
                @SerializedName("trackingTitle")
                var trackingTitle: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) : Parcelable {
                constructor(parcel: Parcel) : this(
                    parcel.createStringArrayList(),
                    parcel.readString(),
                    TODO("background"),
                    parcel.readString(),
                    parcel.readString(),
                    TODO("groupName"),
                    TODO("link"),
                    TODO("nullableText"),
                    parcel.readString(),
                    TODO("singleCardContent"),
                    parcel.readString(),
                    parcel.readString(),
                    TODO("targetingParams"),
                    TODO("tooltip"),
                    parcel.readString(),
                    parcel.readString(),
                    parcel.readString()
                )

                override fun describeContents(): Int {
                    TODO("Not yet implemented")
                }

                override fun writeToParcel(p0: Parcel?, p1: Int) {

                }

                companion object CREATOR : Parcelable.Creator<Section> {
                    override fun createFromParcel(parcel: Parcel): Section {
                        return Section(parcel)
                    }

                    override fun newArray(size: Int): Array<Section?> {
                        return arrayOfNulls(size)
                    }
                }
            }

            data class GroupName(
                @SerializedName("debugValueKey")
                var debugValueKey: Any? = null,
                @SerializedName("string")
                var string: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            )

            data class Link(
                @SerializedName("accessibilityString")
                var accessibilityString: AccessibilityString? = null,
                @SerializedName("autoLoad")
                var autoLoad: Boolean? = null,
                @SerializedName("route")
                var route: Route? = null,
                @SerializedName("routeKey")
                var routeKey: RouteKey? = null,
                @SerializedName("text")
                var text: Text? = null,
                @SerializedName("trackingContext")
                var trackingContext: String? = null,
                @SerializedName("__typename")
                var typename: String? = null,
                @SerializedName("updateToken")
                var updateToken: String? = null
            ) {
                data class AccessibilityString(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class Route(
                    @SerializedName("fragment")
                    var fragment: Any? = null,
                    @SerializedName("nonCanonicalUrl")
                    var nonCanonicalUrl: String? = null,
                    @SerializedName("page")
                    var page: String? = null,
                    @SerializedName("typedParams")
                    var typedParams: TypedParams? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("url")
                    var url: String? = null
                ) {
                    data class TypedParams(
                        @SerializedName("contentType")
                        var contentType: String? = null,
                        @SerializedName("geoId")
                        var geoId: Int? = null,
                        @SerializedName("isCollectionView")
                        var isCollectionView: Any? = null,
                        @SerializedName("isList")
                        var isList: Boolean? = null,
                        @SerializedName("isMap")
                        var isMap: Any? = null,
                        @SerializedName("isNearby")
                        var isNearby: Any? = null,
                        @SerializedName("nearLocationId")
                        var nearLocationId: Any? = null,
                        @SerializedName("nearLocationType")
                        var nearLocationType: Any? = null,
                        @SerializedName("pagee")
                        var pagee: String? = null,
                        @SerializedName("routingFilters")
                        var routingFilters: Any? = null,
                        @SerializedName("sort")
                        var sort: Any? = null,
                        @SerializedName("sortOrder")
                        var sortOrder: Any? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class RouteKey(
                    @SerializedName("fragment")
                    var fragment: Any? = null,
                    @SerializedName("nonCanonicalUrl")
                    var nonCanonicalUrl: Any? = null,
                    @SerializedName("page")
                    var page: String? = null,
                    @SerializedName("typedParams")
                    var typedParams: Any? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("url")
                    var url: Any? = null
                )

                data class Text(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )
            }

            data class NullableText(
                @SerializedName("debugValueKey")
                var debugValueKey: Any? = null,
                @SerializedName("string")
                var string: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            )

            data class SingleCardContent(
                @SerializedName("badge")
                var badge: Badge? = null,
                @SerializedName("bubbleRating")
                var bubbleRating: BubbleRating? = null,
                @SerializedName("cardLink")
                var cardLink: CardLink? = null,
                @SerializedName("cardPhotos")
                var cardPhotos: List<CardPhoto?>? = null,
                @SerializedName("cardTitle")
                var cardTitle: CardTitle? = null,
                @SerializedName("closureInfo")
                var closureInfo: Any? = null,
                @SerializedName("commerceButtons")
                var commerceButtons: CommerceButtons? = null,
                @SerializedName("commerceInfo")
                var commerceInfo: CommerceInfo? = null,
                @SerializedName("descriptiveText")
                var descriptiveText: Any? = null,
                @SerializedName("distance")
                var distance: Any? = null,
                @SerializedName("isSaved")
                var isSaved: Boolean? = null,
                @SerializedName("labels")
                var labels: List<Label?>? = null,
                @SerializedName("primaryInfo")
                var primaryInfo: PrimaryInfo? = null,
                @SerializedName("saveId")
                var saveId: SaveId? = null,
                @SerializedName("secondaryInfo")
                var secondaryInfo: Any? = null,
                @SerializedName("stableDiffingType")
                var stableDiffingType: String? = null,
                @SerializedName("trackingKey")
                var trackingKey: String? = null,
                @SerializedName("trackingTitle")
                var trackingTitle: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class Badge(
                    @SerializedName("size")
                    var size: String? = null,
                    @SerializedName("type")
                    var type: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("year")
                    var year: String? = null
                )

                data class BubbleRating(
                    @SerializedName("numberReviews")
                    var numberReviews: NumberReviews? = null,
                    @SerializedName("rating")
                    var rating: Float? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class NumberReviews(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class CardLink(
                    @SerializedName("accessibilityString")
                    var accessibilityString: Any? = null,
                    @SerializedName("route")
                    var route: Route? = null,
                    @SerializedName("text")
                    var text: Any? = null,
                    @SerializedName("trackingContext")
                    var trackingContext: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("webviewRoute")
                    var webviewRoute: Any? = null
                ) {
                    data class Route(
                        @SerializedName("fragment")
                        var fragment: Any? = null,
                        @SerializedName("nonCanonicalUrl")
                        var nonCanonicalUrl: String? = null,
                        @SerializedName("page")
                        var page: String? = null,
                        @SerializedName("typedParams")
                        var typedParams: TypedParams? = null,
                        @SerializedName("__typename")
                        var typename: String? = null,
                        @SerializedName("url")
                        var url: String? = null
                    ) {
                        data class TypedParams(
                            @SerializedName("contentId")
                            var contentId: String? = null,
                            @SerializedName("contentType")
                            var contentType: String? = null,
                            @SerializedName("spAttributionToken")
                            var spAttributionToken: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("wasPlusShown")
                            var wasPlusShown: Any? = null
                        )
                    }
                }

                data class CardPhoto(
                    @SerializedName("sizes")
                    var sizes: Sizes? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Sizes(
                        @SerializedName("maxHeight")
                        var maxHeight: Int? = null,
                        @SerializedName("maxWidth")
                        var maxWidth: Int? = null,
                        @SerializedName("__typename")
                        var typename: String? = null,
                        @SerializedName("urlTemplate")
                        var urlTemplate: String? = null
                    )
                }

                data class CardTitle(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var hotelName: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class CommerceButtons(
                    @SerializedName("firstCommerceButton")
                    var firstCommerceButton: Any? = null,
                    @SerializedName("secondCommerceButton")
                    var secondCommerceButton: Any? = null,
                    @SerializedName("singleButton")
                    var singleButton: SingleButton? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class SingleButton(
                        @SerializedName("commerceTrackingUrl")
                        var commerceTrackingUrl: Any? = null,
                        @SerializedName("link")
                        var link: Link? = null,
                        @SerializedName("__typename")
                        var typename: String? = null,
                        @SerializedName("variant")
                        var variant: String? = null
                    ) {
                        data class Link(
                            @SerializedName("accessibilityString")
                            var accessibilityString: AccessibilityString? = null,
                            @SerializedName("externalUrl")
                            var externalUrl: String? = null,
                            @SerializedName("text")
                            var text: Text? = null,
                            @SerializedName("trackingContext")
                            var trackingContext: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        ) {
                            data class AccessibilityString(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class Text(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }
                    }
                }

                data class CommerceInfo(
                    @SerializedName("commerceSummary")
                    var commerceSummary: Any? = null,
                    @SerializedName("commerceType")
                    var commerceType: String? = null,
                    @SerializedName("cta")
                    var cta: Cta? = null,
                    @SerializedName("details")
                    var details: Details? = null,
                    @SerializedName("loadingMessage")
                    var loadingMessage: LoadingMessage? = null,
                    @SerializedName("priceForDisplay")
                    var priceForDisplay: PriceForDisplay? = null,
                    @SerializedName("pricingPeriod")
                    var pricingPeriod: Any? = null,
                    @SerializedName("provider")
                    var provider: String? = null,
                    @SerializedName("strikethroughPrice")
                    var strikethroughPrice: Any? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Cta(
                        @SerializedName("accessibilityString")
                        var accessibilityString: Any? = null,
                        @SerializedName("externalUrl")
                        var externalUrl: String? = null,
                        @SerializedName("text")
                        var text: Text? = null,
                        @SerializedName("trackingContext")
                        var trackingContext: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    ) {
                        data class Text(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class Details(
                        @SerializedName("text")
                        var text: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class LoadingMessage(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class PriceForDisplay(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class Label(
                    @SerializedName("text")
                    var text: Text? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Text(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class PrimaryInfo(
                    @SerializedName("text")
                    var text: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class SaveId(
                    @SerializedName("id")
                    var id: String? = null,
                    @SerializedName("type")
                    var type: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )
            }

            data class TargetingParam(
                @SerializedName("key")
                var key: String? = null,
                @SerializedName("__typename")
                var typename: String? = null,
                @SerializedName("values")
                var values: List<String?>? = null
            )

            data class Tooltip(
                @SerializedName("text")
                var text: Text? = null,
                @SerializedName("tooltip")
                var tooltip: Tooltip? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class Text(
                    @SerializedName("htmlString")
                    var htmlString: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class Tooltip(
                    @SerializedName("dialog")
                    var dialog: Dialog? = null,
                    @SerializedName("icon")
                    var icon: String? = null,
                    @SerializedName("labelText")
                    var labelText: LabelText? = null,
                    @SerializedName("popUpText")
                    var popUpText: PopUpText? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Dialog(
                        @SerializedName("buttonV2")
                        var buttonV2: Any? = null,
                        @SerializedName("content")
                        var content: Content? = null,
                        @SerializedName("dialogType")
                        var dialogType: String? = null,
                        @SerializedName("title")
                        var title: Title? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    ) {
                        data class Content(
                            @SerializedName("htmlString")
                            var htmlString: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class Title(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class LabelText(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class PopUpText(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }
            }

            data class Status(
                @SerializedName("message")
                var message: Any? = null,
                @SerializedName("pollingStatus")
                var pollingStatus: PollingStatus? = null,
                @SerializedName("success")
                var success: Boolean? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class PollingStatus(
                    @SerializedName("delayForNextPollInMillis")
                    var delayForNextPollInMillis: Int? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("updateToken")
                    var updateToken: String? = null
                )
            }
        }
    }

    constructor(parcel: Parcel) : this() {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<HotelList> {
        override fun createFromParcel(parcel: Parcel): HotelList {
            return HotelList(parcel)
        }

        override fun newArray(size: Int): Array<HotelList?> {
            return arrayOfNulls(size)
        }
    }
}
