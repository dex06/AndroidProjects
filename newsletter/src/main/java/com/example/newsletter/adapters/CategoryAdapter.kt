package com.example.newsletter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsletter.R
import com.example.newsletter.model.Category

class CategoryAdapter(private val dataset: List<Category>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(val root: View) : RecyclerView.ViewHolder(root) {
        fun bind(item: Category) {
            val txtTitle = root.findViewById<TextView>(R.id.category_name)
            val imageView: ImageView = root.findViewById<ImageView>(R.id.category_image)
            //val txtDesc = root.findViewById<TextView>(R.id.article_description)
            txtTitle.text = item.name
            //txtDesc.text = item.description
            Glide
                .with(root)
                .load(item.image)
                .centerInside()
                .placeholder(R.drawable.image)
                .into(imageView);

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

    override fun getItemCount() = dataset.size
}