package com.example.the_comic_app
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {


 //   lateinit var logoText: TextView
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    logoText = findViewById(R.id.logoTextView)
      //  logoText.text = getString(R.string.app_name)
  //      image = findViewById(R.id.testImageView)

        // Using function loadImage with string from the Singelton list with comics.
  //      loadImage(DataManager.comics[0].img)

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