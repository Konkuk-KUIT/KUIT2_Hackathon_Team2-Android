package com.example.kuit_hackerton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentManager
import com.example.kuit_hackerton.databinding.ActivityMainBinding
import com.example.kuit_hackerton.databinding.ActivityRestaurantBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class RestaurantActivity : AppCompatActivity() {
    lateinit var binding: ActivityRestaurantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomsheet=CalanderFragment()


        //이거 resume에 적게?
        binding.clMakeReservation.setOnClickListener {//눌리면 프래그먼트 under이 보이게
            //눌리면 이제 bottomsheet이 나오게 해야함
            //이건 fagment로 화면 바꾸는

            //val transaction = supportFragmentManager.beginTransaction()
            //transaction.add(R.id.frame_under, CalanderFragment())
            //transaction.commitAllowingStateLoss()
            bottomsheet.show(supportFragmentManager,bottomsheet.tag)

        }

    }

}