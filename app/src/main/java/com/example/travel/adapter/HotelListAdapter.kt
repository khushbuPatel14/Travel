package com.example.travel.adapter


import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.core.view.ViewCompat
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.FitCenter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.travel.R
import com.example.travel.`interface`.ClickForDetail
import com.example.travel.databinding.HotelListItemBinding
import com.example.travel.model.hotellist.HotelList
import com.example.travel.ui.HotelListFragment



class HotelListAdapter(private val context: HotelListFragment , private val myList: ArrayList<HotelList.Data.AppPresentationQueryAppV2.Section>,private val clickForDetail: ClickForDetail)
    : RecyclerView.Adapter<HotelListAdapter.ViewHolder>(),Filterable {

    private lateinit var binding: HotelListItemBinding

    var searchList = ArrayList<HotelList.Data.AppPresentationQueryAppV2.Section>()

    init {
        searchList = myList
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        binding = HotelListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        //    binding.data = myList[position]


        val imgUri: Uri = Uri.parse("https://wallpapercave.com/wp/wp8122701.jpg")
        var requestOption = RequestOptions()
        requestOption = requestOption.transform(FitCenter(), RoundedCorners(2))

        Glide.with(context)
            .load(imgUri)
            .centerCrop()
            .placeholder(R.drawable.hotel)
            .error(R.drawable.hotel)
            .apply(requestOption)
            .skipMemoryCache(true)
            .into(binding.imgCardHotel)

//        Log.d("NULL",myList[position].singleCardContent?.cardTitle?.hotelName.toString())
//        myList[position].singleCardContent?.cardPhotos?.get(0)?.sizes?.urlTemplate?.let {
//            Log.d("IMAGELOG",
//                it
//            )
//        }

        if (searchList[position].singleCardContent != null) {
            binding.cardViewHotelList.visibility = View.VISIBLE
            binding.data = searchList[position]


        } else {
            binding.cardViewHotelList.visibility = View.GONE
        }

        ViewCompat.setTransitionName(binding.imgCardHotel, "card_item")

        binding.cardViewHotelList.setOnClickListener {

            clickForDetail.onItemClickDetail(searchList[position])

            context.parentFragmentManager.commit {
                addSharedElement(binding.imgCardHotel , "card_item")
            }

        }



//        myList.let {
//            binding.tvCardTitle.text = myList[position].singleCardContent?.cardTitle?.hotelName.toString()
//        }

        //binding.imgCardHotel.setImageResource(binding.data.singleCardContent.cardPhotos?.get(position).sizes.urlTemplate?.get(position).toString())
//
//       val getRating = myList[position].singleCardContent?.bubbleRating?.rating
//        binding.rbCardRating.rating = getRating!!.toFloat()

        //binding.tvCardTitle.text =
//myList[position].data?.appPresentationQueryAppListV2?.get(position)?.sections?.get(position)?.singleCardContent?.cardTitle?.string

//        binding.cardViewHotelList.startAnimation(AnimationUtils.loadAnimation(holder.itemView.context,
//            R.anim.slide_up))

        /*      binding.tvCardDescription.text =
            myList[position].data?.appPresentationQueryAppListV2?.get(position)?.sections?.get(position)?.singleCardContent?.descriptiveText.toString()
*/
        //  binding.imgCardHotel.setImageResource(myList[position].data?.appPresentationQueryAppListV2?.get(position)?.sections?.get(position)?.singleCardContent?.cardPhotos.toString())

    }

    override fun getItemCount(): Int {
        return searchList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getFilter(): Filter {
        return object : Filter(){
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                searchList = if (charSearch.isEmpty()) {
                    myList
                } else {
                    val resultList = ArrayList<HotelList.Data.AppPresentationQueryAppV2.Section>()
                    for (row in searchList) {
                        if (row.singleCardContent?.cardTitle?.hotelName.toString().lowercase().contains(constraint.toString().lowercase())) {
                            resultList.add(row)
                        }
                    }
                    resultList
                }
                val filterResults = FilterResults()
                filterResults.values = searchList
                return filterResults
            }

            override fun publishResults(p0: CharSequence?, p1: FilterResults?) {
                searchList = p1?.values as ArrayList<HotelList.Data.AppPresentationQueryAppV2.Section>
                notifyDataSetChanged()

            }

        }

    }
}




