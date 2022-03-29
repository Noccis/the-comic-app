package com.example.the_comic_app
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {


    lateinit var logoText: TextView
    lateinit var recyclerView: RecyclerView
    lateinit var searchView: EditText
    lateinit var searchButton: Button
    lateinit var resultImageView: ImageView
    lateinit var noMatchTextView: TextView
   // lateinit var resultConstraintLayout: constraintlayout

    var searchViewIsVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logoText = findViewById(R.id.logoTextView)
        logoText.text = getString(R.string.app_name)
        searchView = findViewById(R.id.searchEditText)
        searchView.visibility = View.GONE
        searchButton = findViewById(R.id.searchButton)
        searchButton.visibility = View.GONE
        resultImageView = findViewById(R.id.resultImageView)
        resultImageView.visibility = View.GONE
        noMatchTextView = findViewById(R.id.noMatchTextView)
        noMatchTextView.visibility = View.GONE

        val showSearchImageButton = findViewById<ImageButton>(R.id.SearchImageButton)
        showSearchImageButton.setOnClickListener {
            toggleShowSearchFunction()
        }

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ComicsRecycleAdapter(this, DataManager.comics)


        searchButton.setOnClickListener {
            searchComics()
        }


    }

    fun searchComics() {
        val searchText = searchView.text.toString()
        compareIDToString(searchText)
        resultImageView.visibility = View.VISIBLE
    }

    fun compareIDToString(text: String) {

        var matchingComic: ComicStrip? = null
        for (comic in DataManager.comics) {
            val id = comic.id.toString()
            if (id == text ) {
                matchingComic = comic
                Log.d("dodo", "WOHO A MATCH!")
            }else{
                Log.d("dodo", "No match....")
            }
        }

        if (matchingComic != null) {
            showResult(matchingComic)
            noMatchTextView.visibility = View.GONE
        }else{
            noMatchTextView.visibility = View.VISIBLE
            resultImageView.setImageResource(R.drawable.no_image)
        }

    }

    fun showResult(comic: ComicStrip) {
        if(comic.img != null) {
            Glide.with(this)
                .load(comic.img)
                .into(resultImageView)
        }

    }

    fun toggleShowSearchFunction() {
        if (!searchViewIsVisible) {
            searchView.setText("")
            searchView.visibility = View.VISIBLE
            searchButton.visibility = View.VISIBLE
            searchViewIsVisible = true
        }else{
            searchView.visibility = View.GONE
            searchButton.visibility = View.GONE
            searchViewIsVisible = false
            noMatchTextView.visibility = View.GONE
            resultImageView.visibility = View.GONE
        }
    }
}


