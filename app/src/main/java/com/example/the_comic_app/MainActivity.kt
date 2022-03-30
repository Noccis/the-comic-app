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

    // Views containing ComicStrip if there is a match when you search
    lateinit var matchComicId: TextView
    lateinit var matchComicName: TextView
    lateinit var matchImageView: ImageView

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
        noMatchTextView = findViewById(R.id.noMatchTextView)
        noMatchTextView.visibility = View.GONE
        matchImageView = findViewById(R.id.matchImageView)
        matchImageView.visibility = View.GONE
        matchComicId = findViewById(R.id.matchIdTextView)
        matchComicId.visibility = View.GONE
        matchComicName = findViewById(R.id.matchNameTextView)
        matchComicName.visibility = View.GONE


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
            matchImageView.setImageResource(R.drawable.no_image)
        }
    }

    private fun showResult(comic: ComicStrip) {
        // Connecting all the match views with the match comic

            Glide.with(this)
                .load(comic.img)
                .into(matchImageView)
        matchComicId.text = comic.id.toString()
        matchComicName.text = comic.name

        // Showing the result
        matchImageView.visibility = View.VISIBLE
        matchComicId.visibility = View.VISIBLE
        matchComicName.visibility = View.VISIBLE


    }

    private fun toggleShowSearchFunction() {
        // Toggles the visibility on all the searchviews, matchviews and removes searchtext
        if (!searchViewsIsVisible) {
            searchView.setText("")
            searchView.visibility = View.VISIBLE
            searchButton.visibility = View.VISIBLE
            searchViewsIsVisible = true
        }else{
            searchView.visibility = View.GONE
            searchButton.visibility = View.GONE
            noMatchTextView.visibility = View.GONE
            matchImageView.visibility = View.GONE
            matchComicId.visibility = View.GONE
            matchComicName.visibility = View.GONE
            searchViewsIsVisible = false
        }
    }
}


