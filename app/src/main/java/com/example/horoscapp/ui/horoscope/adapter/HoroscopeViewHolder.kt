package com.example.horoscapp.ui.horoscope.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscapp.databinding.ItemHoroscopeBinding
import com.example.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected:(HoroscopeInfo) -> Unit) {
        val context: Context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener { onItemSelected(horoscopeInfo)}
    }
}