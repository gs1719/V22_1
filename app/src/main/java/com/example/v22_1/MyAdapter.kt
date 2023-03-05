package com.example.v22_1

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.v22_1.databinding.EachItemLayoutBinding
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) :
//own class which implements or extends the array_adapter class
    ArrayAdapter<User>(context, R.layout.each_item_layout, arrayList) {
// here passing         context , our own layout, and off-course the datasource

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_item_layout, null)

/*        val name = view.findViewById<TextView>(R.id.tvName)
        val lastmsg = view.findViewById<TextView>(R.id.tvMessage)
        val lastMsgTime = view.findViewById<TextView>(R.id.tvTime)
        val profile = view.findViewById<CircleImageView>(R.id.profile_image)


        name.text = arrayList[position].name
        lastmsg.text = arrayList[position].lastMsg
        lastMsgTime.text = arrayList[position].lastMsgTime
        profile.setImageResource(arrayList[position].imageId)*/

        val binding = EachItemLayoutBinding.bind(view)

//      Simply binding the view which already inflate the R.layout.each_Item_layout file

        binding.tvName.text = arrayList[position].name
        binding.tvMessage.text = arrayList[position].lastMsg
        binding.tvTime .text = arrayList[position].lastMsgTime
        binding.profileImage.setImageResource(arrayList[position].imageId)

        return view
    }
}