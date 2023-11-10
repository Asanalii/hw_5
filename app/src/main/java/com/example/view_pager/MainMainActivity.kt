//package com.example.view_pager
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import com.example.view_pager.databinding.ActivityMainBinding
//import com.google.android.material.tabs.TabLayout
//import com.google.android.material.tabs.TabLayoutMediator
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        val fragmentList: MutableList<Fragment> = mutableListOf()
//        PhoneType.values().forEach {
//            fragmentList.add(PhoneFragment(it))
//        }
//        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, fragmentList)
//
//        binding.viewPager.adapter = adapter
//        binding.viewPager.currentItem = 1
////        binding.viewPager.currentItem = fragmentList.size / 2
//
//
////        binding.viewPager.setPageTransformer(GalleryTransformer())
////        binding.viewPager.setPageTransformer(CarouselTransformer())
////        binding.viewPager.setPageTransformer(ZoomTransformer())
//
//        binding.viewPager.setPageTransformer(ChangeScreenTransformer())
//
//        binding.viewPager.offscreenPageLimit = 1
//
//
//
//
//        TabLayoutMediator(binding.topTab, binding.viewPager){ tab, position ->
//            tab.text = getString(PhoneType.values()[position].title)
//        }.attach()
//
//        TabLayoutMediator(binding.bottomTab,binding.viewPager){tab, _ ->
//            tab.view.isClickable = false
//        }.attach()
//    }
//}