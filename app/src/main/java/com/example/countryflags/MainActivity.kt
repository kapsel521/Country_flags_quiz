package com.example.countryflags

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            if(rollAnswer() == 0){
                Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "Zła odpowiedź", Toast.LENGTH_LONG).show()
            }
            start()
        }
        imageView2.setOnClickListener{
            if(rollAnswer() == 1){
                Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "Zła odpowiedź", Toast.LENGTH_LONG).show()
            }
            start()
        }
        imageView3.setOnClickListener{
            if(rollAnswer() == 2){
                Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "Zła odpowiedź", Toast.LENGTH_LONG).show()
            }
            start()
        }
        imageView4.setOnClickListener{
            if(rollAnswer() == 3){
                Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext, "Zła odpowiedź", Toast.LENGTH_LONG).show()
            }
            start()
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
        when(rollAnswer()){
            0 -> put0image()
            1 -> put1image()
            2 -> put2image()
            3 -> put3image()
        }
    }

    private fun getBitmapFromAssets(fileName: String): Bitmap? {
        return try {
            BitmapFactory.decodeStream(assets.open(fileName))
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    private fun put0image(){
        val index = rollCountry()
        var index2 = rollCountry()
        if (index2 == index){
            if (index > 100)
                index2 -= 10
            else
                index2 += 10
        }
        var index3= rollCountry()
        if (index3 == index){
            if (index > 100)
                index3 -= 10
            else
                index3 += 10
        }
        var index4= rollCountry()
        if (index4 == index){
            if (index > 100)
                index4 -= 10
            else
                index4 += 10
        }
        if (index2 == index3){
            if (index3 > 100)
                index2 -= 10
            else
                index2 += 10
        }
        if (index2 == index4){
            if (index4 > 100)
                index2 -= 10
            else
                index2 += 10
        }
        if (index3 == index4){
            if (index4 > 100)
                index3 -= 10
            else
                index3 += 10
        }

        val assetsBitmap:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index])
        val assetsBitmap2:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index2])
        val assetsBitmap3:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index3])
        val assetsBitmap4:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index4])
        titleTextView.text = Flags_list().countryNames[index]

        imageView.setImageBitmap(assetsBitmap)
        imageView2.setImageBitmap(assetsBitmap2)
        imageView3.setImageBitmap(assetsBitmap3)
        imageView4.setImageBitmap(assetsBitmap4)
    }

    private fun put1image(){

        val index = rollCountry()
        var index2 = rollCountry()
        if (index2 == index){
            if (index > 100)
                index2 -= 10
            else
                index2 += 10
        }
        var index3= rollCountry()
        if (index3 == index){
            if (index > 100)
                index3 -= 10
            else
                index3 += 10
        }
        var index4= rollCountry()
        if (index4 == index){
            if (index > 100)
                index4 -= 10
            else
                index4 += 10
        }
        if (index2 == index3){
            if (index3 > 100)
                index2 -= 10
            else
                index2 += 10
        }
        if (index2 == index4){
            if (index4 > 100)
                index2 -= 10
            else
                index2 += 10
        }
        if (index3 == index4){
            if (index4 > 100)
                index3 -= 10
            else
                index3 += 10
        }

        val assetsBitmap:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index])
        val assetsBitmap2:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index2])
        val assetsBitmap3:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index3])
        val assetsBitmap4:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index4])
        titleTextView.text = Flags_list().countryNames[index]

        imageView.setImageBitmap(assetsBitmap2)
        imageView2.setImageBitmap(assetsBitmap)
        imageView3.setImageBitmap(assetsBitmap3)
        imageView4.setImageBitmap(assetsBitmap4)
    }

    private fun put2image(){

        val index = rollCountry()
        var index2 = rollCountry()
        if (index2 == index){
            if (index > 100)
                index2 -= 10
            else
                index2 += 10
        }
        var index3= rollCountry()
        if (index3 == index){
            if (index > 100)
                index3 -= 10
            else
                index3 += 10
        }
        var index4= rollCountry()
        if (index4 == index){
            if (index > 100)
                index4 -= 10
            else
                index4 += 10
        }
        if (index2 == index3){
            if (index3 > 100)
                index2 -= 10
            else
                index2 += 10
        }
        if (index2 == index4){
            if (index4 > 100)
                index2 -= 10
            else
                index2 += 10
        }
        if (index3 == index4){
            if (index4 > 100)
                index3 -= 10
            else
                index3 += 10
        }

        val assetsBitmap:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index])
        val assetsBitmap2:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index2])
        val assetsBitmap3:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index3])
        val assetsBitmap4:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index4])
        titleTextView.text = Flags_list().countryNames[index]

        imageView.setImageBitmap(assetsBitmap3)
        imageView2.setImageBitmap(assetsBitmap2)
        imageView3.setImageBitmap(assetsBitmap)
        imageView4.setImageBitmap(assetsBitmap4)
    }

    private fun put3image(){

        val index = rollCountry()
        var index2 = rollCountry()
        if (index2 == index){
            if (index > 100)
                index2 -= 10
            else
                index2 += 10
        }
        var index3= rollCountry()
        if (index3 == index){
            if (index > 100)
                index3 -= 10
            else
                index3 += 10
        }
        var index4= rollCountry()
        if (index4 == index){
            if (index > 100)
                index4 -= 10
            else
                index4 += 10
        }
        if (index2 == index3){
            if (index3 > 100)
                index2 -= 10
            else
                index2 += 10
        }
        if (index2 == index4){
            if (index4 > 100)
                index2 -= 10
            else
                index2 += 10
        }
        if (index3 == index4){
            if (index4 > 100)
                index3 -= 10
            else
                index3 += 10
        }

        val assetsBitmap:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index])
        val assetsBitmap2:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index2])
        val assetsBitmap3:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index3])
        val assetsBitmap4:Bitmap? = getBitmapFromAssets(Flags_list().fileNames[index4])
        titleTextView.text = Flags_list().countryNames[index]

        imageView.setImageBitmap(assetsBitmap4)
        imageView2.setImageBitmap(assetsBitmap2)
        imageView3.setImageBitmap(assetsBitmap3)
        imageView4.setImageBitmap(assetsBitmap)
    }

}

