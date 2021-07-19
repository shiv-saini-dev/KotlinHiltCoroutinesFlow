package com.kotlin.demo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.demo.model.Post
import com.kotlin.demo.databinding.PostRowBinding

class PostAdapter(private var postList: List<Post>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    private lateinit var binding: PostRowBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        binding = PostRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return PostViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        binding.tasks.text = postList[position].body
        binding.title.text = postList[position].title
    }

    override fun getItemCount(): Int = postList.size

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    fun setData(postList: List<Post>) {
        this.postList = postList
        notifyDataSetChanged()
    }

}