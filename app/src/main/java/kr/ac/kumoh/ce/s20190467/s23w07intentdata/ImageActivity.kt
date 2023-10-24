package kr.ac.kumoh.ce.s20190467.s23w07intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.ce.s20190467.s23w07intentdata.databinding.ActivityImageBinding
import kr.ac.kumoh.ce.s20190467.s23w07intentdata.databinding.ActivityMainBinding
import kotlin.math.log

class ImageActivity : AppCompatActivity() {
    private lateinit var main: ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityImageBinding.inflate(layoutInflater)
        setContentView(main.root)
        Log.i("image!", intent.getStringExtra(MainActivity.KEY_NAME) ?: "없음") //?: 앨비스 연산자
        val res = when(intent.getStringExtra(MainActivity.KEY_NAME)){
            MainActivity.DOG -> R.drawable.doga
            MainActivity.CAT-> R.drawable.dogb
            else -> R.drawable.panda
        }
        main.image.setImageResource(res) //주의!!
    }
}