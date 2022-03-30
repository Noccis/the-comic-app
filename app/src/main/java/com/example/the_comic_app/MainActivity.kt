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

    // App logo!
    lateinit var logoText: TextView
    lateinit var recyclerView: RecyclerView

    // Edit text view where you type in your search text
    lateinit var searchView: EditText
    lateinit var searchButton: Button
    // ImageView containing image if there is a match when you search
    lateinit var resultImageView: ImageView
    // The Text showing that there is no match when you search
    lateinit var noMatchTextView: TextView
    // Bool to keep track of visibility of the search items.
    var searchViewsIsVisible = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Finding the Views
        logoText = findViewById(R.id.logoTextView)
        logoText.text = getString(R.string.app_name)

        // finding and hiding the searchViews:
        searchView = findViewById(R.id.searchEditText)
        searchView.visibility = View.GONE
        searchButton = findViewById(R.id.searchButton)
        searchButton.setOnClickListener {
            searchComics()
        }
        searchButton.visibility = View.GONE
        resultImageView = findViewById(R.id.resultImageView)
        resultImageView.visibility = View.GONE
        noMatchTextView = findViewById(R.id.noMatchTextView)
        noMatchTextView.visibility = View.GONE

        // The search icon to toggle visibility:
        val showSearchImageButton = findViewById<ImageButton>(R.id.SearchImageButton)
        showSearchImageButton.setOnClickListener {
            toggleShowSearchFunction()
        }

        // RecyclerView:
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ComicsRecycleAdapter(this, DataManager.comics)


    }

    private fun searchComics() {
        // Getting the input and comparing it to list
        val searchText = searchView.text.toString().lowercase()
        compareIDToString(searchText)
        // Showing the result
        resultImageView.visibility = View.VISIBLE
    }

    private fun compareIDToString(text: String) {

        var matchingComic: ComicStrip? = null

        // Searching thru the list with comics
        for (comic in DataManager.comics) {
            val id = comic.id.toString()
            val name = comic.name.lowercase()

            // If there is a match our comic object won't be null
            if (id == text ) {
                matchingComic = comic
            }else if (name == text) {
                matchingComic = comic
            }
        }

        if (matchingComic != null) {
            // Showing result if there is a match
            showResult(matchingComic)
            noMatchTextView.visibility = View.GONE
        }else{
            // If comic object still is null then no match where found.
            noMatchTextView.visibility = View.VISIBLE
            noMatchTextView.setText(R.string.no_match)
            resultImageView.setImageResource(R.drawable.no_image)
        }
    }

    private fun showResult(comic: ComicStrip) {
            Glide.with(this)
                .load(comic.img)
                .into(resultImageView)
    }

    private fun toggleShowSearchFunction() {
        // Toggles the visibility on all the searchviews and removes searchtext
        if (!searchViewsIsVisible) {
            searchView.setText("")
            searchView.visibility = View.VISIBLE
            searchButton.visibility = View.VISIBLE
            searchViewsIsVisible = true
        }else{
            searchView.visibility = View.GONE
            searchButton.visibility = View.GONE
            noMatchTextView.visibility = View.GONE
            resultImageView.visibility = View.GONE
            searchViewsIsVisible = false
        }
    }
}


