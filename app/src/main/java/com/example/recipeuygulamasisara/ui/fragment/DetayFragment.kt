package com.example.recipeuygulamasisara.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.recipeuygulamasisara.R
import com.example.recipeuygulamasisara.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detay,container,false)

        val bundle:DetayFragmentArgs by navArgs()
        val yemek = bundle.yemek

        binding.yemekNesnesi = yemek

        binding.ivYemek.setImageResource(
            resources.getIdentifier(yemek.resim,"drawable", requireContext().packageName))

        return binding.root
    }

}