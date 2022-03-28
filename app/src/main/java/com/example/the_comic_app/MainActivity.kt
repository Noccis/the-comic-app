package com.example.the_comic_app
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {


    lateinit var logoText: TextView
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logoText = findViewById(R.id.logoTextView)
        logoText.text = getString(R.string.app_name)
        image = findViewById(R.id.testImageView)

        // List with all the ComicStrip objects.
        val listOfComics = mutableListOf(ComicStrip("https://imgs.xkcd.com/comics/party_quadrants.png"),
            ComicStrip("https://imgs.xkcd.com/comics/outlet_denier.png"),
            ComicStrip("https://imgs.xkcd.com/comics/i_shouldnt_complain.png"),
            ComicStrip("https://imgs.xkcd.com/comics/qua.png"),
            ComicStrip("https://imgs.xkcd.com/comics/false_dichotomy.png"),
            ComicStrip("https://imgs.xkcd.com/comics/deviled_eggs.png"),
            ComicStrip("https://imgs.xkcd.com/comics/consensus_time.png"),
            ComicStrip("https://imgs.xkcd.com/comics/advanced_techniques.png"),
            ComicStrip("https://imgs.xkcd.com/comics/galaxies.png"),
            ComicStrip("https://imgs.xkcd.com/comics/salary_negotiation.png"))


        loadImage(listOfComics[0].imgUrl)

    }
    // Function to load image url using Glide.
    fun loadImage(url:String) {
        if (url !== null) {
            Glide.with(this)
                .load(url)
                .into(image)
        } else {
            image.setImageResource(R.drawable.ic_launcher_background)
        }
    }


}