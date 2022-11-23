package com.example.convidados.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.convidados.databinding.RowGuestBinding
import com.example.convidados.model.Guest

class GuestViewHolder(private val bind: RowGuestBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind(item: Guest){
        bind.textGuest.text = item.name

        bind.textGuest.setOnClickListener{

        }
    }

}