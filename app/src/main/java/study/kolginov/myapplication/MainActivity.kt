package study.kolginov.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TextPushkin", "Ты видел деву на скале")
        Log.d("TextPushkin", "В одежде белой над волнами")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TextPushkin", "Когда, бушуя в бурной мгле,")
        Log.d("TextPushkin", "Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TextPushkin", "Когда луч молний озарял")
        Log.d("TextPushkin", "Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TextPushkin", "И ветер бился и летал")
        Log.d("TextPushkin", "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TextPushkin", "Прекрасно море в бурной мгле")
        Log.d("TextPushkin", "И небо в блесках без лазури;")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TextPushkin", "Но верь мне: дева на скалее")
        Log.d("TextPushkin", "Прекрасней волн, небес и бури.")
    }

    override fun onRestart() {
        super.onRestart()
    }

}