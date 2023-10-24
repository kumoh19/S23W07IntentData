package kr.ac.kumoh.ce.s20190467.s23w07intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import kr.ac.kumoh.ce.s20190467.s23w07intentdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener { //중요!
    companion object{
        val KEY_NAME = "location" // 이렇게 하는 것이 좋은 방법
        val DOG = "dog"
        val CAT = "cat"
    }
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnDog.setOnClickListener(this)

        main.btnCat.setOnClickListener(this)
    }

    override fun onClick(v: View?) { //v: view가 들어감, 뷰의 아이디

        val value = when(v?.id){
            main.btnCat.id-> {
                Toast.makeText(this,"강아지",Toast.LENGTH_SHORT).show()
                CAT
            }
            main.btnDog.id->{
                Toast.makeText(this,"고양이",Toast.LENGTH_SHORT).show()
                DOG
            }
            else->return
        }

        val intent = Intent(this,ImageActivity::class.java)
        intent.putExtra(KEY_NAME, value)
        startActivity(intent)
    }
}
