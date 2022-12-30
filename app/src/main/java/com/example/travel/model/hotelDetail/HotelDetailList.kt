package com.example.travel.model.hotelDetail


import com.google.gson.annotations.SerializedName

data class HotelDetailList(
    @SerializedName("data")
    var data: Data? = null
) {
    data class Data(
        @SerializedName("AppPresentation_queryAppDetailV2")
        var appPresentationQueryAppDetailV2: List<AppPresentationQueryAppDetailV2?>? = null
    ) {
        data class AppPresentationQueryAppDetailV2(
            @SerializedName("commerce")
            var commerce: Commerce? = null,
            @SerializedName("container")
            var container: Container? = null,
            @SerializedName("datePickerConfig")
            var datePickerConfig: DatePickerConfig? = null,
            @SerializedName("impressions")
            var impressions: List<Impression?>? = null,
            @SerializedName("sections")
            var sections: List<Section?>? = null,
            @SerializedName("skippedSections")
            var skippedSections: List<Any?>? = null,
            @SerializedName("status")
            var status: Status? = null,
            @SerializedName("__typename")
            var typename: String? = null,
            @SerializedName("updatedClusterIds")
            var updatedClusterIds: List<Any?>? = null
        ) {
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
                        var childrenAges: List<Int?>? = null,
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
                @SerializedName("isSaved")
                var isSaved: Boolean? = null,
                @SerializedName("navTitle")
                var navTitle: String? = null,
                @SerializedName("saveId")
                var saveId: SaveId? = null,
                @SerializedName("shareInfo")
                var shareInfo: ShareInfo? = null,
                @SerializedName("__typename")
                var typename: String? = null
            ) {
                data class SaveId(
                    @SerializedName("id")
                    var id: String? = null,
                    @SerializedName("type")
                    var type: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class ShareInfo(
                    @SerializedName("emailBody")
                    var emailBody: EmailBody? = null,
                    @SerializedName("emailSubject")
                    var emailSubject: EmailSubject? = null,
                    @SerializedName("nonEmailMessage")
                    var nonEmailMessage: NonEmailMessage? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("webUrl")
                    var webUrl: String? = null
                ) {
                    data class EmailBody(
                        @SerializedName("htmlString")
                        var htmlString: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class EmailSubject(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class NonEmailMessage(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }
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

            data class Impression(
                @SerializedName("data")
                var `data`: String? = null,
                @SerializedName("__typename")
                var typename: String? = null
            )

            data class Section(
                @SerializedName("about")
                var about: String? = null,
                @SerializedName("accessibleTags")
                var accessibleTags: Any? = null,
                @SerializedName("adSizes")
                var adSizes: List<String?>? = null,
                @SerializedName("adUnitId")
                var adUnitId: String? = null,
                @SerializedName("address")
                var address: Address? = null,
                @SerializedName("albumPhotos")
                var albumPhotos: List<AlbumPhoto?>? = null,
                @SerializedName("anchor")
                var anchor: Anchor? = null,
                @SerializedName("background")
                var background: Any? = null,
                @SerializedName("bookViaHotelWebsite")
                var bookViaHotelWebsite: Any? = null,
                @SerializedName("bookViaHotelWebsiteSubtitle")
                var bookViaHotelWebsiteSubtitle: BookViaHotelWebsiteSubtitle? = null,
                @SerializedName("center")
                var center: Center? = null,
                @SerializedName("clusterId")
                var clusterId: String? = null,
                @SerializedName("contactLinks")
                var contactLinks: List<ContactLink?>? = null,
                @SerializedName("distance")
                var distance: Any? = null,
                @SerializedName("divider")
                var divider: Any? = null,
                @SerializedName("galleryLink")
                var galleryLink: GalleryLink? = null,
                @SerializedName("gettingThere")
                var gettingThere: GettingThere? = null,
                @SerializedName("heroContent")
                var heroContent: List<HeroContent?>? = null,
                @SerializedName("hotelCommerceInfo")
                var hotelCommerceInfo: HotelCommerceInfo? = null,
                @SerializedName("hotelWebsite")
                var hotelWebsite: Any? = null,
                @SerializedName("improveThisListingRoute")
                var improveThisListingRoute: ImproveThisListingRoute? = null,
                @SerializedName("labels")
                var labels: List<Any?>? = null,
                @SerializedName("link")
                var link: Any? = null,
                @SerializedName("locationId")
                var locationId: LocationId? = null,
                @SerializedName("managementCenterRoute")
                var managementCenterRoute: Any? = null,
                @SerializedName("name")
                var name: String? = null,
                @SerializedName("neighborhood")
                var neighborhood: Any? = null,
                @SerializedName("nonNullContent")
                var nonNullContent: List<NonNullContent?>? = null,
                @SerializedName("nullableContent")
                var nullableContent: List<NullableContent?>? = null,
                @SerializedName("nullableText")
                var nullableText: NullableText? = null,
                @SerializedName("numberReviews")
                var numberReviews: Int? = null,
                @SerializedName("ownerStatus")
                var ownerStatus: Any? = null,
                @SerializedName("photoCTA")
                var photoCTA: PhotoCTA? = null,
                @SerializedName("photoCount")
                var photoCount: Int? = null,
                @SerializedName("pins")
                var pins: List<Pin?>? = null,
                @SerializedName("plusOfferNoLongerAvailableNotice")
                var plusOfferNoLongerAvailableNotice: Any? = null,
                @SerializedName("primaryOfferV2")
                var primaryOfferV2: Any? = null,
                @SerializedName("rankingDetailsV2")
                var rankingDetailsV2: RankingDetailsV2? = null,
                @SerializedName("rating")
                var rating: Double? = null,
                @SerializedName("reviewCTA")
                var reviewCTA: ReviewCTA? = null,
                @SerializedName("reviewsLink")
                var reviewsLink: ReviewsLink? = null,
                @SerializedName("route")
                var route: Route? = null,
                @SerializedName("sectionDescription")
                var sectionDescription: SectionDescription? = null,
                @SerializedName("sectionTitle")
                var sectionTitle: SectionTitle? = null,
                @SerializedName("sectionType")
                var sectionType: String? = null,
                @SerializedName("showMore")
                var showMore: ShowMore? = null,
                @SerializedName("similarHotels")
                var similarHotels: SimilarHotels? = null,
                @SerializedName("spacing")
                var spacing: String? = null,
                @SerializedName("sponsoredBy")
                var sponsoredBy: Any? = null,
                @SerializedName("stableDiffingType")
                var stableDiffingType: String? = null,
                @SerializedName("state")
                var state: String? = null,
                @SerializedName("tabs")
                var tabs: List<Tab?>? = null,
                @SerializedName("tags")
                var tags: Any? = null,
                @SerializedName("tagsSubsection")
                var tagsSubsection: TagsSubsection? = null,
                @SerializedName("targetingParams")
                var targetingParams: List<TargetingParam?>? = null,
                @SerializedName("tooltip")
                var tooltip: Any? = null,
                @SerializedName("trackingKey")
                var trackingKey: String? = null,
                @SerializedName("trackingTitle")
                var trackingTitle: String? = null,
                @SerializedName("__typename")
                var typename: String? = null,
                @SerializedName("viewAll")
                var viewAll: Any? = null
            ) {
                data class Address(
                    @SerializedName("address")
                    var address: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class AlbumPhoto(
                    @SerializedName("data")
                    var `data`: Data? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Data(
                        @SerializedName("attribution")
                        var attribution: Attribution? = null,
                        @SerializedName("caption")
                        var caption: String? = null,
                        @SerializedName("id")
                        var id: Int? = null,
                        @SerializedName("photoSizeDynamic")
                        var photoSizeDynamic: PhotoSizeDynamic? = null,
                        @SerializedName("publishedDateTime")
                        var publishedDateTime: String? = null,
                        @SerializedName("sizes")
                        var sizes: List<Size?>? = null,
                        @SerializedName("thumbsUpVotes")
                        var thumbsUpVotes: Int? = null,
                        @SerializedName("__typename")
                        var typename: String? = null,
                        @SerializedName("uploadDateTime")
                        var uploadDateTime: String? = null
                    ) {
                        data class Attribution(
                            @SerializedName("text")
                            var text: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class PhotoSizeDynamic(
                            @SerializedName("maxHeight")
                            var maxHeight: Int? = null,
                            @SerializedName("maxWidth")
                            var maxWidth: Int? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("urlTemplate")
                            var urlTemplate: String? = null
                        )

                        data class Size(
                            @SerializedName("height")
                            var height: Int? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("url")
                            var url: String? = null,
                            @SerializedName("width")
                            var width: Int? = null
                        )
                    }
                }

                data class Anchor(
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

                data class BookViaHotelWebsiteSubtitle(
                    @SerializedName("htmlString")
                    var htmlString: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class Center(
                    @SerializedName("latitude")
                    var latitude: Double? = null,
                    @SerializedName("longitude")
                    var longitude: Double? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class ContactLink(
                    @SerializedName("clickTrackingUrl")
                    var clickTrackingUrl: Any? = null,
                    @SerializedName("icon")
                    var icon: Any? = null,
                    @SerializedName("link")
                    var link: Link? = null,
                    @SerializedName("linkType")
                    var linkType: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Link(
                        @SerializedName("accessibilityString")
                        var accessibilityString: Any? = null,
                        @SerializedName("route")
                        var route: Route? = null,
                        @SerializedName("text")
                        var text: Text? = null,
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
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

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

                data class GalleryLink(
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
                            @SerializedName("albumId")
                            var albumId: Any? = null,
                            @SerializedName("galleryConfig")
                            var galleryConfig: String? = null,
                            @SerializedName("locationIdStr")
                            var locationIdStr: String? = null,
                            @SerializedName("offset")
                            var offset: Any? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }
                }

                data class GettingThere(
                    @SerializedName("sectionTitle")
                    var sectionTitle: SectionTitle? = null,
                    @SerializedName("transportItems")
                    var transportItems: List<TransportItem?>? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class SectionTitle(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class TransportItem(
                        @SerializedName("transitAndTravel")
                        var transitAndTravel: TransitAndTravel? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    ) {
                        data class TransitAndTravel(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }
                }

                data class HeroContent(
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class HotelCommerceInfo(
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
                    var updated: Boolean? = null
                ) {
                    data class Room(
                        @SerializedName("adults")
                        var adults: Int? = null,
                        @SerializedName("childrenAges")
                        var childrenAges: List<Int?>? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class ImproveThisListingRoute(
                    @SerializedName("accessibilityString")
                    var accessibilityString: Any? = null,
                    @SerializedName("route")
                    var route: Route? = null,
                    @SerializedName("text")
                    var text: Text? = null,
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
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class Text(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class LocationId(
                    @SerializedName("id")
                    var id: String? = null,
                    @SerializedName("placeType")
                    var placeType: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class NonNullContent(
                    @SerializedName("bubbleRating")
                    var bubbleRating: BubbleRating? = null,
                    @SerializedName("cardLink")
                    var cardLink: CardLink? = null,
                    @SerializedName("cardPhoto")
                    var cardPhoto: CardPhoto? = null,
                    @SerializedName("cardTitle")
                    var cardTitle: CardTitle? = null,
                    @SerializedName("distance")
                    var distance: Distance? = null,
                    @SerializedName("primaryInfo")
                    var primaryInfo: PrimaryInfo? = null,
                    @SerializedName("stableDiffingType")
                    var stableDiffingType: String? = null,
                    @SerializedName("trackingKey")
                    var trackingKey: String? = null,
                    @SerializedName("trackingTitle")
                    var trackingTitle: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
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
                        var hotelName: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class Distance(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class PrimaryInfo(
                        @SerializedName("text")
                        var text: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class NullableContent(
                    @SerializedName("icon")
                    var icon: Any? = null,
                    @SerializedName("list")
                    var list: List<NullableList>? = null,
                    @SerializedName("standaloneItem")
                    var standaloneItem: StandaloneItem? = null,
                    @SerializedName("title")
                    var title: Title? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class NullableList(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class StandaloneItem(
                        @SerializedName("text")
                        var text: String? = null,
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

                data class NullableText(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class PhotoCTA(
                    @SerializedName("accessibilityString")
                    var accessibilityString: Any? = null,
                    @SerializedName("route")
                    var route: Route? = null,
                    @SerializedName("text")
                    var text: Text? = null,
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
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class Text(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
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

                data class RankingDetailsV2(
                    @SerializedName("route")
                    var route: Route? = null,
                    @SerializedName("text")
                    var text: Text? = null,
                    @SerializedName("trackingContext")
                    var trackingContext: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
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
                            @SerializedName("contentType")
                            var contentType: String? = null,
                            @SerializedName("geoId")
                            var geoId: Int? = null,
                            @SerializedName("isCollectionView")
                            var isCollectionView: Any? = null,
                            @SerializedName("isList")
                            var isList: Any? = null,
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

                    data class Text(
                        @SerializedName("text")
                        var text: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class ReviewCTA(
                    @SerializedName("accessibilityString")
                    var accessibilityString: Any? = null,
                    @SerializedName("route")
                    var route: Route? = null,
                    @SerializedName("text")
                    var text: Text? = null,
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
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class Text(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class ReviewsLink(
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
                            @SerializedName("contentType")
                            var contentType: String? = null,
                            @SerializedName("detailId")
                            var detailId: Int? = null,
                            @SerializedName("pagee")
                            var pagee: Any? = null,
                            @SerializedName("routingFilters")
                            var routingFilters: Any? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }
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
                        @SerializedName("contentId")
                        var contentId: String? = null,
                        @SerializedName("contentType")
                        var contentType: String? = null,
                        @SerializedName("geoId")
                        var geoId: Any? = null,
                        @SerializedName("routingFilters")
                        var routingFilters: Any? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class SectionDescription(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class SectionTitle(
                    @SerializedName("debugValueKey")
                    var debugValueKey: Any? = null,
                    @SerializedName("string")
                    var string: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                )

                data class ShowMore(
                    @SerializedName("accessibilityString")
                    var accessibilityString: Any? = null,
                    @SerializedName("route")
                    var route: Route? = null,
                    @SerializedName("text")
                    var text: Text? = null,
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
                            @SerializedName("geoId")
                            var geoId: Any? = null,
                            @SerializedName("routingFilters")
                            var routingFilters: Any? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class Text(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class SimilarHotels(
                    @SerializedName("accessibilityString")
                    var accessibilityString: Any? = null,
                    @SerializedName("route")
                    var route: Route? = null,
                    @SerializedName("text")
                    var text: Text? = null,
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
                            @SerializedName("contentType")
                            var contentType: String? = null,
                            @SerializedName("geoId")
                            var geoId: Int? = null,
                            @SerializedName("isCollectionView")
                            var isCollectionView: Any? = null,
                            @SerializedName("isList")
                            var isList: Any? = null,
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

                    data class Text(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class Tab(
                    @SerializedName("content")
                    var content: List<Content?>? = null,
                    @SerializedName("initialTab")
                    var initialTab: Boolean? = null,
                    @SerializedName("searchLink")
                    var searchLink: SearchLink? = null,
                    @SerializedName("seeMore")
                    var seeMore: SeeMore? = null,
                    @SerializedName("seeMoreV2")
                    var seeMoreV2: SeeMoreV2? = null,
                    @SerializedName("tabSearchHint")
                    var tabSearchHint: TabSearchHint? = null,
                    @SerializedName("tabTitle")
                    var tabTitle: TabTitle? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class Content(
                        @SerializedName("allAnswerLink")
                        var allAnswerLink: AllAnswerLink? = null,
                        @SerializedName("allAnswerLinkV2")
                        var allAnswerLinkV2: Any? = null,
                        @SerializedName("answerActionText")
                        var answerActionText: AnswerActionText? = null,
                        @SerializedName("askAQuestionLink")
                        var askAQuestionLink: AskAQuestionLink? = null,
                        @SerializedName("bubbleRatingText")
                        var bubbleRatingText: BubbleRatingText? = null,
                        @SerializedName("cardLink")
                        var cardLink: Any? = null,
                        @SerializedName("count")
                        var count: Int? = null,
                        @SerializedName("disclaimer")
                        var disclaimer: Disclaimer? = null,
                        @SerializedName("helpfulVote")
                        var helpfulVote: HelpfulVote? = null,
                        @SerializedName("htmlText")
                        var htmlText: HtmlText? = null,
                        @SerializedName("htmlTitle")
                        var htmlTitle: HtmlTitle? = null,
                        @SerializedName("initiallyCollapsed")
                        var initiallyCollapsed: Boolean? = null,
                        @SerializedName("keywords")
                        var keywords: List<Any?>? = null,
                        @SerializedName("labels")
                        var labels: List<Any?>? = null,
                        @SerializedName("ownerResponse")
                        var ownerResponse: Any? = null,
                        @SerializedName("photoCTA")
                        var photoCTA: PhotoCTA? = null,
                        @SerializedName("photos")
                        var photos: List<Any?>? = null,
                        @SerializedName("poiName")
                        var poiName: String? = null,
                        @SerializedName("postingGuidelinesLink")
                        var postingGuidelinesLink: PostingGuidelinesLink? = null,
                        @SerializedName("publishedDate")
                        var publishedDate: PublishedDate? = null,
                        @SerializedName("question")
                        var question: Question? = null,
                        @SerializedName("rating")
                        var rating: Double? = null,
                        @SerializedName("ratingCountsV2")
                        var ratingCountsV2: RatingCountsV2? = null,
                        @SerializedName("ratingFilterId")
                        var ratingFilterId: String? = null,
                        @SerializedName("reviewActions")
                        var reviewActions: List<ReviewAction?>? = null,
                        @SerializedName("reviewCTA")
                        var reviewCTA: ReviewCTA? = null,
                        @SerializedName("reviewCountText")
                        var reviewCountText: ReviewCountText? = null,
                        @SerializedName("reviewRating")
                        var reviewRating: Int? = null,
                        @SerializedName("safetyText")
                        var safetyText: Any? = null,
                        @SerializedName("searchFilterId")
                        var searchFilterId: String? = null,
                        @SerializedName("stableDiffingType")
                        var stableDiffingType: String? = null,
                        @SerializedName("subRatings")
                        var subRatings: SubRatings? = null,
                        @SerializedName("submitAnswerAction")
                        var submitAnswerAction: SubmitAnswerAction? = null,
                        @SerializedName("submitQuestionAction")
                        var submitQuestionAction: SubmitQuestionAction? = null,
                        @SerializedName("subratings")
                        var subratings: List<Subrating?>? = null,
                        @SerializedName("supplierName")
                        var supplierName: Any? = null,
                        @SerializedName("tip")
                        var tip: Tip? = null,
                        @SerializedName("tipText")
                        var tipText: TipText? = null,
                        @SerializedName("tooltip")
                        var tooltip: Any? = null,
                        @SerializedName("topAnswer")
                        var topAnswer: TopAnswer? = null,
                        @SerializedName("trackingKey")
                        var trackingKey: String? = null,
                        @SerializedName("trackingTitle")
                        var trackingTitle: String? = null,
                        @SerializedName("translatedByGoogle")
                        var translatedByGoogle: Boolean? = null,
                        @SerializedName("__typename")
                        var typename: String? = null,
                        @SerializedName("userProfile")
                        var userProfile: UserProfile? = null
                    ) {
                        data class AllAnswerLink(
                            @SerializedName("accessibilityString")
                            var accessibilityString: Any? = null,
                            @SerializedName("route")
                            var route: Route? = null,
                            @SerializedName("text")
                            var text: Text? = null,
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
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class Text(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class AnswerActionText(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class AskAQuestionLink(
                            @SerializedName("accessibilityString")
                            var accessibilityString: Any? = null,
                            @SerializedName("route")
                            var route: Route? = null,
                            @SerializedName("text")
                            var text: Text? = null,
                            @SerializedName("trackingContext")
                            var trackingContext: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("webviewRoute")
                            var webviewRoute: WebviewRoute? = null
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
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class Text(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class WebviewRoute(
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
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }
                        }

                        data class BubbleRatingText(
                            @SerializedName("text")
                            var text: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class Disclaimer(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

//                        data class Filters(
//                            @SerializedName("availableFilterGroups")
//                            var availableFilterGroups: List<AvailableFilterGroup?>? = null,
//                            @SerializedName("showAllText")
//                            var showAllText: ShowAllText? = null,
//                            @SerializedName("__typename")
//                            var typename: String? = null
//                        ) {
//                            data class AvailableFilterGroup(
//                                @SerializedName("filter")
//                                var filter: Filter? = null,
//                                @SerializedName("filters")
//                                var filters: List<Filter?>? = null,
//                                @SerializedName("groupType")
//                                var groupType: String? = null,
//                                @SerializedName("name")
//                                var name: String? = null,
//                                @SerializedName("tooltip")
//                                var tooltip: Any? = null,
//                                @SerializedName("trackingKey")
//                                var trackingKey: String? = null,
//                                @SerializedName("trackingTitle")
//                                var trackingTitle: String? = null,
//                                @SerializedName("__typename")
//                                var typename: String? = null
//                            ) {
//                                data class Filter(
//                                    @SerializedName("name")
//                                    var name: String? = null,
//                                    @SerializedName("surfaces")
//                                    var surfaces: List<Any?>? = null,
//                                    @SerializedName("title")
//                                    var title: String? = null,
//                                    @SerializedName("tooltip")
//                                    var tooltip: Any? = null,
//                                    @SerializedName("trackingKey")
//                                    var trackingKey: String? = null,
//                                    @SerializedName("trackingTitle")
//                                    var trackingTitle: String? = null,
//                                    @SerializedName("__typename")
//                                    var typename: String? = null,
//                                    @SerializedName("values")
//                                    var values: List<Value?>? = null
//                                ) {
//                                    data class Value(
//                                        @SerializedName("count")
//                                        var count: Int? = null,
//                                        @SerializedName("isSelected")
//                                        var isSelected: Boolean? = null,
//                                        @SerializedName("object")
//                                        var objectX: Object? = null,
//                                        @SerializedName("selectedAccessibilityString")
//                                        var selectedAccessibilityString: SelectedAccessibilityString? = null,
//                                        @SerializedName("tooltip")
//                                        var tooltip: Any? = null,
//                                        @SerializedName("__typename")
//                                        var typename: String? = null,
//                                        @SerializedName("unselectedAccessibilityString")
//                                        var unselectedAccessibilityString: UnselectedAccessibilityString? = null,
//                                        @SerializedName("value")
//                                        var value: String? = null
//                                    ) {
//                                        data class Object(
//                                            @SerializedName("text")
//                                            var text: String? = null,
//                                            @SerializedName("__typename")
//                                            var typename: String? = null
//                                        )
//
//                                        data class SelectedAccessibilityString(
//                                            @SerializedName("debugValueKey")
//                                            var debugValueKey: Any? = null,
//                                            @SerializedName("string")
//                                            var string: String? = null,
//                                            @SerializedName("__typename")
//                                            var typename: String? = null
//                                        )
//
//                                        data class UnselectedAccessibilityString(
//                                            @SerializedName("debugValueKey")
//                                            var debugValueKey: Any? = null,
//                                            @SerializedName("string")
//                                            var string: String? = null,
//                                            @SerializedName("__typename")
//                                            var typename: String? = null
//                                        )
//                                    }
//                                }
//
//                                data class Filter(
//                                    @SerializedName("name")
//                                    var name: String? = null,
//                                    @SerializedName("surfaces")
//                                    var surfaces: List<Any?>? = null,
//                                    @SerializedName("title")
//                                    var title: String? = null,
//                                    @SerializedName("tooltip")
//                                    var tooltip: Any? = null,
//                                    @SerializedName("trackingKey")
//                                    var trackingKey: String? = null,
//                                    @SerializedName("trackingTitle")
//                                    var trackingTitle: String? = null,
//                                    @SerializedName("__typename")
//                                    var typename: String? = null,
//                                    @SerializedName("values")
//                                    var values: List<Value?>? = null
//                                ) {
//                                    data class Value(
//                                        @SerializedName("count")
//                                        var count: Int? = null,
//                                        @SerializedName("isSelected")
//                                        var isSelected: Boolean? = null,
//                                        @SerializedName("object")
//                                        var objectX: Object? = null,
//                                        @SerializedName("selectedAccessibilityString")
//                                        var selectedAccessibilityString: SelectedAccessibilityString? = null,
//                                        @SerializedName("tooltip")
//                                        var tooltip: Any? = null,
//                                        @SerializedName("__typename")
//                                        var typename: String? = null,
//                                        @SerializedName("unselectedAccessibilityString")
//                                        var unselectedAccessibilityString: UnselectedAccessibilityString? = null,
//                                        @SerializedName("value")
//                                        var value: String? = null
//                                    ) {
//                                        data class Object(
//                                            @SerializedName("minimumRatingValue")
//                                            var minimumRatingValue: Int? = null,
//                                            @SerializedName("text")
//                                            var text: String? = null,
//                                            @SerializedName("__typename")
//                                            var typename: String? = null
//                                        )
//
//                                        data class SelectedAccessibilityString(
//                                            @SerializedName("debugValueKey")
//                                            var debugValueKey: Any? = null,
//                                            @SerializedName("string")
//                                            var string: String? = null,
//                                            @SerializedName("__typename")
//                                            var typename: String? = null
//                                        )
//
//                                        data class UnselectedAccessibilityString(
//                                            @SerializedName("debugValueKey")
//                                            var debugValueKey: Any? = null,
//                                            @SerializedName("string")
//                                            var string: String? = null,
//                                            @SerializedName("__typename")
//                                            var typename: String? = null
//                                        )
//                                    }
//                                }
//                            }

                            data class ShowAllText(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class HelpfulVote(
                            @SerializedName("hasVotedReviewHelpful")
                            var hasVotedReviewHelpful: Boolean? = null,
                            @SerializedName("helpfulVoteAction")
                            var helpfulVoteAction: HelpfulVoteAction? = null,
                            @SerializedName("helpfulVotes")
                            var helpfulVotes: HelpfulVotes? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        ) {
                            data class HelpfulVoteAction(
                                @SerializedName("objectId")
                                var objectId: String? = null,
                                @SerializedName("objectType")
                                var objectType: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class HelpfulVotes(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class HtmlText(
                            @SerializedName("htmlString")
                            var htmlString: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class HtmlTitle(
                            @SerializedName("htmlString")
                            var htmlString: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class PhotoCTA(
                            @SerializedName("accessibilityString")
                            var accessibilityString: Any? = null,
                            @SerializedName("route")
                            var route: Route? = null,
                            @SerializedName("text")
                            var text: Text? = null,
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
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class Text(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class PostingGuidelinesLink(
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

                        data class PublishedDate(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class Question(
                            @SerializedName("actions")
                            var actions: Actions? = null,
                            @SerializedName("memberProfile")
                            var memberProfile: MemberProfile? = null,
                            @SerializedName("text")
                            var text: String? = null,
                            @SerializedName("thumbsUpAction")
                            var thumbsUpAction: Any? = null,
                            @SerializedName("thumbsUpCount")
                            var thumbsUpCount: Any? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("writtenDate")
                            var writtenDate: WrittenDate? = null
                        ) {
                            data class Actions(
                                @SerializedName("deleteAction")
                                var deleteAction: DeleteAction? = null,
                                @SerializedName("reportAction")
                                var reportAction: ReportAction? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class DeleteAction(
                                    @SerializedName("authenticateUser")
                                    var authenticateUser: Boolean? = null,
                                    @SerializedName("lcid")
                                    var lcid: Any? = null,
                                    @SerializedName("pid")
                                    var pid: Int? = null,
                                    @SerializedName("pstid")
                                    var pstid: Any? = null,
                                    @SerializedName("tpcid")
                                    var tpcid: Int? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null,
                                    @SerializedName("webUrl")
                                    var webUrl: WebUrl? = null
                                ) {
                                    data class WebUrl(
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
                                }

                                data class ReportAction(
                                    @SerializedName("authenticateUser")
                                    var authenticateUser: Boolean? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null,
                                    @SerializedName("webUrl")
                                    var webUrl: WebUrl? = null
                                ) {
                                    data class WebUrl(
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
                                }
                            }

                            data class MemberProfile(
                                @SerializedName("avatar")
                                var avatar: Avatar? = null,
                                @SerializedName("contributionCount")
                                var contributionCount: Any? = null,
                                @SerializedName("displayName")
                                var displayName: String? = null,
                                @SerializedName("hometown")
                                var hometown: Any? = null,
                                @SerializedName("localizedDisplayName")
                                var localizedDisplayName: LocalizedDisplayName? = null,
                                @SerializedName("profileLink")
                                var profileLink: ProfileLink? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Avatar(
                                    @SerializedName("data")
                                    var `data`: Data? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                ) {
                                    data class Data(
                                        @SerializedName("attribution")
                                        var attribution: Attribution? = null,
                                        @SerializedName("caption")
                                        var caption: String? = null,
                                        @SerializedName("id")
                                        var id: Int? = null,
                                        @SerializedName("photoSizeDynamic")
                                        var photoSizeDynamic: PhotoSizeDynamic? = null,
                                        @SerializedName("publishedDateTime")
                                        var publishedDateTime: String? = null,
                                        @SerializedName("sizes")
                                        var sizes: List<Size?>? = null,
                                        @SerializedName("thumbsUpVotes")
                                        var thumbsUpVotes: Int? = null,
                                        @SerializedName("__typename")
                                        var typename: String? = null,
                                        @SerializedName("uploadDateTime")
                                        var uploadDateTime: String? = null
                                    ) {
                                        data class Attribution(
                                            @SerializedName("text")
                                            var text: String? = null,
                                            @SerializedName("__typename")
                                            var typename: String? = null
                                        )

                                        data class PhotoSizeDynamic(
                                            @SerializedName("maxHeight")
                                            var maxHeight: Int? = null,
                                            @SerializedName("maxWidth")
                                            var maxWidth: Int? = null,
                                            @SerializedName("__typename")
                                            var typename: String? = null,
                                            @SerializedName("urlTemplate")
                                            var urlTemplate: String? = null
                                        )

                                        data class Size(
                                            @SerializedName("height")
                                            var height: Int? = null,
                                            @SerializedName("__typename")
                                            var typename: String? = null,
                                            @SerializedName("url")
                                            var url: String? = null,
                                            @SerializedName("width")
                                            var width: Int? = null
                                        )
                                    }
                                }

                                data class LocalizedDisplayName(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )

                                data class ProfileLink(
                                    @SerializedName("accessibilityString")
                                    var accessibilityString: AccessibilityString? = null,
                                    @SerializedName("route")
                                    var route: Route? = null,
                                    @SerializedName("text")
                                    var text: Text? = null,
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
                                            var contentId: Any? = null,
                                            @SerializedName("contentType")
                                            var contentType: Any? = null,
                                            @SerializedName("tab")
                                            var tab: Any? = null,
                                            @SerializedName("__typename")
                                            var typename: String? = null,
                                            @SerializedName("username")
                                            var username: String? = null
                                        )
                                    }

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

                            data class WrittenDate(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class RatingCountsV2(
                            @SerializedName("averageBar")
                            var averageBar: AverageBar? = null,
                            @SerializedName("excellentBar")
                            var excellentBar: ExcellentBar? = null,
                            @SerializedName("poorBar")
                            var poorBar: PoorBar? = null,
                            @SerializedName("terribleBar")
                            var terribleBar: TerribleBar? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("veryGoodBar")
                            var veryGoodBar: VeryGoodBar? = null
                        ) {
                            data class AverageBar(
                                @SerializedName("count")
                                var count: Count? = null,
                                @SerializedName("isSelected")
                                var isSelected: Boolean? = null,
                                @SerializedName("label")
                                var label: Label? = null,
                                @SerializedName("percentage")
                                var percentage: Int? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Count(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )

                                data class Label(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class ExcellentBar(
                                @SerializedName("count")
                                var count: Count? = null,
                                @SerializedName("isSelected")
                                var isSelected: Boolean? = null,
                                @SerializedName("label")
                                var label: Label? = null,
                                @SerializedName("percentage")
                                var percentage: Int? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Count(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )

                                data class Label(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class PoorBar(
                                @SerializedName("count")
                                var count: Count? = null,
                                @SerializedName("isSelected")
                                var isSelected: Boolean? = null,
                                @SerializedName("label")
                                var label: Label? = null,
                                @SerializedName("percentage")
                                var percentage: Int? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Count(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )

                                data class Label(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class TerribleBar(
                                @SerializedName("count")
                                var count: Count? = null,
                                @SerializedName("isSelected")
                                var isSelected: Boolean? = null,
                                @SerializedName("label")
                                var label: Label? = null,
                                @SerializedName("percentage")
                                var percentage: Int? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Count(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )

                                data class Label(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class VeryGoodBar(
                                @SerializedName("count")
                                var count: Count? = null,
                                @SerializedName("isSelected")
                                var isSelected: Boolean? = null,
                                @SerializedName("label")
                                var label: Label? = null,
                                @SerializedName("percentage")
                                var percentage: Int? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Count(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )

                                data class Label(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }
                        }

                        data class ReviewAction(
                            @SerializedName("actionName")
                            var actionName: ActionName? = null,
                            @SerializedName("actionType")
                            var actionType: String? = null,
                            @SerializedName("authenticateUser")
                            var authenticateUser: Boolean? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("webUrl")
                            var webUrl: WebUrl? = null
                        ) {
                            data class ActionName(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class WebUrl(
                                @SerializedName("accessibilityString")
                                var accessibilityString: Any? = null,
                                @SerializedName("externalUrl")
                                var externalUrl: String? = null,
                                @SerializedName("text")
                                var text: Any? = null,
                                @SerializedName("trackingContext")
                                var trackingContext: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class ReviewCTA(
                            @SerializedName("accessibilityString")
                            var accessibilityString: Any? = null,
                            @SerializedName("route")
                            var route: Route? = null,
                            @SerializedName("text")
                            var text: Text? = null,
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
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class Text(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class ReviewCountText(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class SubRatings(
                            @SerializedName("data")
                            var `data`: Data? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        ) {
                            data class Data(
                                @SerializedName("subRatings")
                                var subRatings: SubRatings? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class SubRatings(
                                    @SerializedName("cleanliness")
                                    var cleanliness: Double? = null,
                                    @SerializedName("location")
                                    var location: Double? = null,
                                    @SerializedName("service")
                                    var service: Double? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null,
                                    @SerializedName("value")
                                    var value: Double? = null
                                )
                            }
                        }

                        data class SubmitAnswerAction(
                            @SerializedName("authenticateUser")
                            var authenticateUser: Boolean? = null,
                            @SerializedName("lcid")
                            var lcid: Int? = null,
                            @SerializedName("pid")
                            var pid: Int? = null,
                            @SerializedName("pstid")
                            var pstid: Any? = null,
                            @SerializedName("tpcid")
                            var tpcid: Int? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("webUrl")
                            var webUrl: WebUrl? = null
                        ) {
                            data class WebUrl(
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
                        }

                        data class SubmitQuestionAction(
                            @SerializedName("authenticateUser")
                            var authenticateUser: Boolean? = null,
                            @SerializedName("lcid")
                            var lcid: Int? = null,
                            @SerializedName("pid")
                            var pid: Int? = null,
                            @SerializedName("pstid")
                            var pstid: Any? = null,
                            @SerializedName("tpcid")
                            var tpcid: Any? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("webUrl")
                            var webUrl: WebUrl? = null
                        ) {
                            data class WebUrl(
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
                        }

                        data class Subrating(
                            @SerializedName("label")
                            var label: Label? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("value")
                            var value: Value? = null
                        ) {
                            data class Label(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class Value(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class Tip(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class TipText(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )

                        data class TopAnswer(
                            @SerializedName("actions")
                            var actions: Actions? = null,
                            @SerializedName("memberProfile")
                            var memberProfile: MemberProfile? = null,
                            @SerializedName("text")
                            var text: String? = null,
                            @SerializedName("thumbsUpAction")
                            var thumbsUpAction: ThumbsUpAction? = null,
                            @SerializedName("thumbsUpCount")
                            var thumbsUpCount: Int? = null,
                            @SerializedName("__typename")
                            var typename: String? = null,
                            @SerializedName("writtenDate")
                            var writtenDate: WrittenDate? = null
                        ) {
                            data class Actions(
                                @SerializedName("deleteAction")
                                var deleteAction: DeleteAction? = null,
                                @SerializedName("reportAction")
                                var reportAction: ReportAction? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class DeleteAction(
                                    @SerializedName("authenticateUser")
                                    var authenticateUser: Boolean? = null,
                                    @SerializedName("lcid")
                                    var lcid: Any? = null,
                                    @SerializedName("pid")
                                    var pid: Int? = null,
                                    @SerializedName("pstid")
                                    var pstid: Int? = null,
                                    @SerializedName("tpcid")
                                    var tpcid: Any? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null,
                                    @SerializedName("webUrl")
                                    var webUrl: WebUrl? = null
                                ) {
                                    data class WebUrl(
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
                                }

                                data class ReportAction(
                                    @SerializedName("authenticateUser")
                                    var authenticateUser: Boolean? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null,
                                    @SerializedName("webUrl")
                                    var webUrl: WebUrl? = null
                                ) {
                                    data class WebUrl(
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
                                }
                            }

                            data class MemberProfile(
                                @SerializedName("avatar")
                                var avatar: Avatar? = null,
                                @SerializedName("contributionCount")
                                var contributionCount: Any? = null,
                                @SerializedName("displayName")
                                var displayName: String? = null,
                                @SerializedName("hometown")
                                var hometown: Any? = null,
                                @SerializedName("localizedDisplayName")
                                var localizedDisplayName: LocalizedDisplayName? = null,
                                @SerializedName("profileLink")
                                var profileLink: ProfileLink? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Avatar(
                                    @SerializedName("data")
                                    var `data`: Data? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                ) {
                                    data class Data(
                                        @SerializedName("attribution")
                                        var attribution: Attribution? = null,
                                        @SerializedName("caption")
                                        var caption: String? = null,
                                        @SerializedName("id")
                                        var id: Int? = null,
                                        @SerializedName("photoSizeDynamic")
                                        var photoSizeDynamic: PhotoSizeDynamic? = null,
                                        @SerializedName("publishedDateTime")
                                        var publishedDateTime: String? = null,
                                        @SerializedName("sizes")
                                        var sizes: List<Size?>? = null,
                                        @SerializedName("thumbsUpVotes")
                                        var thumbsUpVotes: Int? = null,
                                        @SerializedName("__typename")
                                        var typename: String? = null,
                                        @SerializedName("uploadDateTime")
                                        var uploadDateTime: String? = null
                                    ) {
                                        data class Attribution(
                                            @SerializedName("text")
                                            var text: String? = null,
                                            @SerializedName("__typename")
                                            var typename: String? = null
                                        )

                                        data class PhotoSizeDynamic(
                                            @SerializedName("maxHeight")
                                            var maxHeight: Int? = null,
                                            @SerializedName("maxWidth")
                                            var maxWidth: Int? = null,
                                            @SerializedName("__typename")
                                            var typename: String? = null,
                                            @SerializedName("urlTemplate")
                                            var urlTemplate: String? = null
                                        )

                                        data class Size(
                                            @SerializedName("height")
                                            var height: Int? = null,
                                            @SerializedName("__typename")
                                            var typename: String? = null,
                                            @SerializedName("url")
                                            var url: String? = null,
                                            @SerializedName("width")
                                            var width: Int? = null
                                        )
                                    }
                                }

                                data class LocalizedDisplayName(
                                    @SerializedName("debugValueKey")
                                    var debugValueKey: Any? = null,
                                    @SerializedName("string")
                                    var string: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )

                                data class ProfileLink(
                                    @SerializedName("accessibilityString")
                                    var accessibilityString: AccessibilityString? = null,
                                    @SerializedName("route")
                                    var route: Route? = null,
                                    @SerializedName("text")
                                    var text: Text? = null,
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
                                            var contentId: Any? = null,
                                            @SerializedName("contentType")
                                            var contentType: Any? = null,
                                            @SerializedName("tab")
                                            var tab: Any? = null,
                                            @SerializedName("__typename")
                                            var typename: String? = null,
                                            @SerializedName("username")
                                            var username: String? = null
                                        )
                                    }

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

                            data class ThumbsUpAction(
                                @SerializedName("authenticateUser")
                                var authenticateUser: Boolean? = null,
                                @SerializedName("lcid")
                                var lcid: Any? = null,
                                @SerializedName("pid")
                                var pid: Int? = null,
                                @SerializedName("pstid")
                                var pstid: Int? = null,
                                @SerializedName("tpcid")
                                var tpcid: Any? = null,
                                @SerializedName("__typename")
                                var typename: String? = null,
                                @SerializedName("webUrl")
                                var webUrl: WebUrl? = null
                            ) {
                                data class WebUrl(
                                    @SerializedName("accessibilityString")
                                    var accessibilityString: Any? = null,
                                    @SerializedName("externalUrl")
                                    var externalUrl: String? = null,
                                    @SerializedName("text")
                                    var text: Any? = null,
                                    @SerializedName("trackingContext")
                                    var trackingContext: String? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null
                                )
                            }

                            data class WrittenDate(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class UserProfile(
                            @SerializedName("avatar")
                            var avatar: Avatar? = null,
                            @SerializedName("contributionCount")
                            var contributionCount: ContributionCount? = null,
                            @SerializedName("displayName")
                            var displayName: String? = null,
                            @SerializedName("hometown")
                            var hometown: String? = null,
                            @SerializedName("localizedDisplayName")
                            var localizedDisplayName: LocalizedDisplayName? = null,
                            @SerializedName("profileLink")
                            var profileLink: ProfileLink? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        ) {
                            data class Avatar(
                                @SerializedName("data")
                                var `data`: Data? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            ) {
                                data class Data(
                                    @SerializedName("attribution")
                                    var attribution: Attribution? = null,
                                    @SerializedName("caption")
                                    var caption: String? = null,
                                    @SerializedName("id")
                                    var id: Int? = null,
                                    @SerializedName("photoSizeDynamic")
                                    var photoSizeDynamic: PhotoSizeDynamic? = null,
                                    @SerializedName("publishedDateTime")
                                    var publishedDateTime: String? = null,
                                    @SerializedName("sizes")
                                    var sizes: List<Size?>? = null,
                                    @SerializedName("thumbsUpVotes")
                                    var thumbsUpVotes: Int? = null,
                                    @SerializedName("__typename")
                                    var typename: String? = null,
                                    @SerializedName("uploadDateTime")
                                    var uploadDateTime: String? = null
                                ) {
                                    data class Attribution(
                                        @SerializedName("text")
                                        var text: String? = null,
                                        @SerializedName("__typename")
                                        var typename: String? = null
                                    )

                                    data class PhotoSizeDynamic(
                                        @SerializedName("maxHeight")
                                        var maxHeight: Int? = null,
                                        @SerializedName("maxWidth")
                                        var maxWidth: Int? = null,
                                        @SerializedName("__typename")
                                        var typename: String? = null,
                                        @SerializedName("urlTemplate")
                                        var urlTemplate: String? = null
                                    )

                                    data class Size(
                                        @SerializedName("height")
                                        var height: Int? = null,
                                        @SerializedName("__typename")
                                        var typename: String? = null,
                                        @SerializedName("url")
                                        var url: String? = null,
                                        @SerializedName("width")
                                        var width: Int? = null
                                    )
                                }
                            }

                            data class ContributionCount(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class LocalizedDisplayName(
                                @SerializedName("debugValueKey")
                                var debugValueKey: Any? = null,
                                @SerializedName("string")
                                var string: String? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )

                            data class ProfileLink(
                                @SerializedName("accessibilityString")
                                var accessibilityString: AccessibilityString? = null,
                                @SerializedName("route")
                                var route: Route? = null,
                                @SerializedName("text")
                                var text: Text? = null,
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
                                        var contentId: Any? = null,
                                        @SerializedName("contentType")
                                        var contentType: Any? = null,
                                        @SerializedName("tab")
                                        var tab: Any? = null,
                                        @SerializedName("__typename")
                                        var typename: String? = null,
                                        @SerializedName("username")
                                        var username: String? = null
                                    )
                                }

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

                    data class SearchLink(
                        @SerializedName("accessibilityString")
                        var accessibilityString: Any? = null,
                        @SerializedName("route")
                        var route: Route? = null,
                        @SerializedName("text")
                        var text: Text? = null,
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
                                @SerializedName("contentType")
                                var contentType: String? = null,
                                @SerializedName("detailId")
                                var detailId: Int? = null,
                                @SerializedName("pagee")
                                var pagee: Any? = null,
                                @SerializedName("routingFilters")
                                var routingFilters: Any? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class Text(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class SeeMore(
                        @SerializedName("accessibilityString")
                        var accessibilityString: Any? = null,
                        @SerializedName("route")
                        var route: Route? = null,
                        @SerializedName("text")
                        var text: Text? = null,
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
                                @SerializedName("contentType")
                                var contentType: String? = null,
                                @SerializedName("detailId")
                                var detailId: Int? = null,
                                @SerializedName("pagee")
                                var pagee: Any? = null,
                                @SerializedName("routingFilters")
                                var routingFilters: Any? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class Text(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class SeeMoreV2(
                        @SerializedName("accessibilityString")
                        var accessibilityString: Any? = null,
                        @SerializedName("route")
                        var route: Route? = null,
                        @SerializedName("text")
                        var text: Text? = null,
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
                                @SerializedName("detailId")
                                var detailId: Int? = null,
                                @SerializedName("pagee")
                                var pagee: String? = null,
                                @SerializedName("routingFilters")
                                var routingFilters: Any? = null,
                                @SerializedName("__typename")
                                var typename: String? = null
                            )
                        }

                        data class Text(
                            @SerializedName("debugValueKey")
                            var debugValueKey: Any? = null,
                            @SerializedName("string")
                            var string: String? = null,
                            @SerializedName("__typename")
                            var typename: String? = null
                        )
                    }

                    data class TabSearchHint(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )

                    data class TabTitle(
                        @SerializedName("debugValueKey")
                        var debugValueKey: Any? = null,
                        @SerializedName("string")
                        var string: String? = null,
                        @SerializedName("__typename")
                        var typename: String? = null
                    )
                }

                data class TagsSubsection(
                    @SerializedName("tagsV2")
                    var tagsV2: List<TagsV2?>? = null,
                    @SerializedName("__typename")
                    var typename: String? = null
                ) {
                    data class TagsV2(
                        @SerializedName("tag")
                        var tag: Tag? = null,
                        @SerializedName("text")
                        var text: Any? = null,
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
                }

                data class TargetingParam(
                    @SerializedName("key")
                    var key: String? = null,
                    @SerializedName("__typename")
                    var typename: String? = null,
                    @SerializedName("values")
                    var values: List<String?>? = null
                )
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
