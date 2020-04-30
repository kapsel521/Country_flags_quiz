package com.example.countryflags

import android.content.res.AssetManager
import android.graphics.Bitmap
import android.graphics.Bitmap.*
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quiz()
    }

    private fun quiz() {

        startButton.setOnClickListener{
            start()

        }

        imageView.setOnClickListener{
            if(imageView.tag == rollAnswer()){
                Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "${Flags_list().countryNames.get(rollCountry())}" , Toast.LENGTH_LONG).show()
            }


        }
        imageView2.setOnClickListener{
            if(imageView2.tag == rollAnswer()){
                Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "ŹLE ${rollAnswer()}", Toast.LENGTH_LONG).show()
            }
            println(Flags_list().mapFlags_list?.get(0))
        }
        imageView3.setOnClickListener{
            if(imageView3.tag == rollAnswer()){
                Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "ŹLE ${rollAnswer()}", Toast.LENGTH_LONG).show()
            }
            println(Flags_list().mapFlags_list?.get(0))
        }
        imageView4.setOnClickListener{
            if(imageView4.tag == rollAnswer()){
                Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "ŹLE ${rollAnswer()}", Toast.LENGTH_LONG).show()
            }
            println(Flags_list().mapFlags_list?.get(0))
        }
    }


    private fun start(){
        rollAnswer()
        imagePut()
    }

    private fun rollCountry() : Int{
        return (0..253).shuffled().first()
    }

    private fun rollAnswer(): Int {
        return (0..3).shuffled().first()
    }

    private fun imagePut(){
        val assetsBitmap:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[rollCountry()])
        imageView.setImageBitmap(assetsBitmap)
    }

    private fun getBitmapFromAssets(fileName: String): Bitmap? {
        return try {
            BitmapFactory.decodeStream(assets.open(fileName))
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }


}

