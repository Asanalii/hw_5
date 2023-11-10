package com.example.view_pager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.view_pager.databinding.FragmentHomeworkPhoneBinding
import com.example.view_pager.databinding.FragmentPhoneBinding

class PhoneFragment(private val phoneType: PhoneType?):Fragment() {
//    private lateinit var binding: FragmentPhoneBinding
    private lateinit var binding: FragmentHomeworkPhoneBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeworkPhoneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        phoneType?.let{
            binding.image.setImageResource(it.image)
//            binding.title.text = getString(it.title)
        }
    }

}