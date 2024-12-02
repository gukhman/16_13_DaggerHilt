package com.example.a16_13_daggerhilt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a16_13_daggerhilt.databinding.ItemCurrencyBinding

class CurrencyAdapter : RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder>() {

    private var currencies = listOf<Currency>()

    fun setCurrencies(currencies: List<Currency>) {
        this.currencies = currencies
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CurrencyViewHolder {
        val binding = ItemCurrencyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CurrencyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        holder.bind(currencies[position])
    }

    override fun getItemCount(): Int = currencies.size

    class CurrencyViewHolder(private val binding: ItemCurrencyBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(currency: Currency) {
            binding.currencyNameTV.text = currency.name
            // Use a library like Glide or Picasso to load the image
            Glide.with(binding.currencyImageIV.context)
                .load(currency.imageUrl)
                .into(binding.currencyImageIV)
        }
    }
}
