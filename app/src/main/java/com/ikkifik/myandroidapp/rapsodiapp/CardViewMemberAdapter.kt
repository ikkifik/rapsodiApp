package com.ikkifik.myandroidapp.rapsodiapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewMemberAdapter(private val listMember: ArrayList<Member>): RecyclerView.Adapter<CardViewMemberAdapter.CardViewViewHolder>() {

    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnVote: Button = itemView.findViewById(R.id.btn_set_vote)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_member, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMember.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val member = listMember[position]

        Glide.with(holder.itemView.context)
            .load(member.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.tvName.text = member.name
        holder.tvDetail.text = member.detail

        holder.btnVote.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Vote " + listMember[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

        holder.itemView.setOnClickListener{
            val moveActivity = Intent(holder.itemView.context, DetailMemberActivity::class.java)
            moveActivity.putExtra(DetailMemberActivity.EXTRA_NAME, listMember[holder.adapterPosition].name)
            moveActivity.putExtra(DetailMemberActivity.EXTRA_DETAIL, listMember[holder.adapterPosition].detail)
            moveActivity.putExtra(DetailMemberActivity.EXTRA_PHOTO, listMember[holder.adapterPosition].photo)
            holder.itemView.context.startActivity(moveActivity)
        }

    }

}