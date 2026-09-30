package com.example.mycourse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycourse.databinding.ItemMateriBinding

data class Materi(
    val title: String,
    val subtitle: String,
)

class MateriAdapter(private val listMateri: List<Materi>) :
    RecyclerView.Adapter<MateriAdapter.MateriViewHolder>() {

    class MateriViewHolder(private val binding: ItemMateriBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(materi: Materi) {
            binding.tvMateriTitle.text = materi.title
            binding.tvMateriSub.text = materi.subtitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriViewHolder {
        val binding = ItemMateriBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        )
        return MateriViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MateriViewHolder, position: Int) {
        holder.bind(listMateri[position])
    }

    override fun getItemCount(): Int = listMateri.size
}
