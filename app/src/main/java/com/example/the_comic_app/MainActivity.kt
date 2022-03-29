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

    }

    fun compareIDToString(text: String) {
        for (comic in DataManager.comics) {
            val id = comic.id.toString()
            if (id == text ) {
                Log.d("dodo", "WOHO A MATCH!")
            }else{
                Log.d("dodo", "No match....")
            }
        }
    }

    fun toggleShowSearchFunction() {
        if (!searchViewIsVisible) {
            searchView.visibility = View.VISIBLE
            searchButton.visibility = View.VISIBLE
            searchViewIsVisible = true
        }else{
            searchView.visibility = View.GONE
            searchButton.visibility = View.GONE
            searchViewIsVisible = false
        }
    }

}


