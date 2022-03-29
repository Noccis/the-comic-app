package com.example.the_comic_app

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ComicsRecycleAdapter(val context: Context, val comics: List<ComicStrip> ) :
    RecyclerView.Adapter<ComicsRecycleAdapter.ViewHolder>(){

    val layoutInFlater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflate the recycleview with the list_item
        val comicView = layoutInFlater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(comicView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Current comic
        val comic = comics[position]

        // Bool to keep track on explanation visibility
        var explanationIsVisible = false
        // Load image url into imageView using Glide
        if(comic.img != null) {
            Glide.with(context)
                .load(comic.img)
                .into(holder.comicImage)
        }
        // Set comic id and description
        holder.comicId.text = comic.id.toString()
        holder.comicDescription.text = comic.description
        holder.comicExplanation.visibility = View.INVISIBLE
        holder.toggleExplanationbutton.setOnClickListener {
            if (!explanationIsVisible) {
                holder.comicExplanation.visibility = View.VISIBLE
                explanationIsVisible = true
                Log.d("Dodo", "Explanation should now be visible")
            }else{
                holder.comicExplanation.visibility = View.INVISIBLE
                explanationIsVisible = false
            }
        }
    }

    override fun getItemCount() = comics.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Locate the views in the list_item
        val comicImage = itemView.findViewById<ImageView>(R.id.comicImageView)
        val comicId = itemView.findViewById<TextView>(R.id.comicIdTextView)
        val comicDescription = itemView.findViewById<TextView>(R.id.descriptionTextView)
        val toggleExplanationbutton = itemView.findViewById<Button>(R.id.toggleExplanationbutton)
        var comicExplanation = itemView.findViewById<TextView>(R.id.explanationTextView)
    }
/*
fun loadImage(url:String, view: ImageView, context: Context) {
        if (url !== null) {
            Glide.with(context)
                .load(url)
                .into(view)
        } else {
            Log.d("Dodo", "LoadImage FAIL")
        }
    }
 */

}