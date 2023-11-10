package com.example.view_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.view_pager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentList: MutableList<Fragment> = mutableListOf()
        PhoneType.values().forEach {
            fragmentList.add(PhoneFragment(it))
            fragmentList.add(PhoneFragment(it))
            fragmentList.add(PhoneFragment(it))
        }
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, fragmentList)

        binding.viewPager.adapter = adapter
        binding.viewPager.currentItem = 1

        binding.viewPager.setPageTransformer(ChangeScreenTransformer())
//        binding.viewPager.setPageTransformer(ZoomTransformer())

        binding.viewPager.offscreenPageLimit = 1


    }
}