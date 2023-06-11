package com.drxid.porto.load

import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drxid.porto.LoginActivity
import com.drxid.porto.R

class LandingLoadingActivity : AppCompatActivity() {

    private lateinit var handler: Handler
    private lateinit var runnable: Runnable
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_loading)

        imageView = findViewById(R.id.img)

        handler = Handler(Looper.getMainLooper())

        runnable = Runnable {
            val intent = Intent(this@LandingLoadingActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        handler.postDelayed(runnable, 3000)
    }

    override fun onDestroy() {
        super.onDestroy()

        // Hentikan Runnable ketika Activity dihancurkan
        handler.removeCallbacks(runnable)
    }
}
