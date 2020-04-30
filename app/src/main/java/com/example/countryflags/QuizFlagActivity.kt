package com.example.countryflags

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.startButton
import kotlinx.android.synthetic.main.activity_quiz_flag.*
import java.io.IOException

class QuizFlagActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_flag)

        start()
    }
    var points = 0
    var tryies = 0

    private fun start(){
        pointView.setText("$points / $tryies")
        rollAnswer()
        imagePut()
    }

    private fun rollAnswer(): Int {
        return (0..3).shuffled().first()
    }

    private fun rollCountry() : Int{
        return (0..253).shuffled().first()
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
        val index2: Int
        val index3: Int
        val index4: Int
            if (index > 127) {
                index2 = index - (1..41).shuffled().first()
                index3 = index - (42..83).shuffled().first()
                index4 = index - (84..126).shuffled().first()
            }
            else{
                index2 = index + (1..41).shuffled().first()
                index3 = index + (42..83).shuffled().first()
                index4 = index + (84..126).shuffled().first()
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

        imageView.setOnClickListener{Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show(); ++points; ++tryies; start()}
        imageView2.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index2]}", Toast.LENGTH_LONG).show(); ++tryies; start()}
        imageView3.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index3]}", Toast.LENGTH_LONG).show(); ++tryies; start()}
        imageView4.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index4]}", Toast.LENGTH_LONG).show(); ++tryies; start()}

    }

    private fun put1image(){
        val index = rollCountry()
        val index2: Int
        val index3: Int
        val index4: Int
        if (index > 127) {
            index2 = index - (1..41).shuffled().first()
            index3 = index - (42..83).shuffled().first()
            index4 = index - (84..126).shuffled().first()
        }
        else{
            index2 = index + (1..41).shuffled().first()
            index3 = index + (42..83).shuffled().first()
            index4 = index + (84..126).shuffled().first()
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

        imageView2.setOnClickListener{Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show(); ++points; ++tryies; start()}
        imageView.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index2]}", Toast.LENGTH_LONG).show(); ++tryies; start()}
        imageView3.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index3]}", Toast.LENGTH_LONG).show(); ++tryies; start()}
        imageView4.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index4]}", Toast.LENGTH_LONG).show(); ++tryies; start()}

    }

    private fun put2image(){
        val index = rollCountry()
        val index2: Int
        val index3: Int
        val index4: Int
        if (index > 127) {
            index2 = index - (1..41).shuffled().first()
            index3 = index - (42..83).shuffled().first()
            index4 = index - (84..126).shuffled().first()
        }
        else{
            index2 = index + (1..41).shuffled().first()
            index3 = index + (42..83).shuffled().first()
            index4 = index + (84..126).shuffled().first()
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

        imageView3.setOnClickListener{Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show(); ++points; ++tryies; start()}
        imageView2.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index2]}", Toast.LENGTH_LONG).show(); ++tryies; start()}
        imageView.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index3]}", Toast.LENGTH_LONG).show(); ++tryies; start()}
        imageView4.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index4]}", Toast.LENGTH_LONG).show(); ++tryies; start()}

    }

    private fun put3image(){
        val index = rollCountry()
        val index2: Int
        val index3: Int
        val index4: Int
        if (index > 127) {
            index2 = index - (1..41).shuffled().first()
            index3 = index - (42..83).shuffled().first()
            index4 = index - (84..126).shuffled().first()
        }
        else{
            index2 = index + (1..41).shuffled().first()
            index3 = index + (42..83).shuffled().first()
            index4 = index + (84..126).shuffled().first()
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

        imageView4.setOnClickListener{Toast.makeText(applicationContext, "Prawidłowa odpowiedź", Toast.LENGTH_LONG).show(); ++points; ++tryies; start()}
        imageView2.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index2]}", Toast.LENGTH_LONG).show(); ++tryies; start()}
        imageView3.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index3]}", Toast.LENGTH_LONG).show(); ++tryies; start()}
        imageView.setOnClickListener{Toast.makeText(applicationContext, "${Flags_list().countryNames[index4]}", Toast.LENGTH_LONG).show(); ++tryies; start()}

    }

}
