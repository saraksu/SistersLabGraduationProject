package com.example.recipeuygulamasisara.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recipeuygulamasisara.R
import com.example.recipeuygulamasisara.data.entity.Yemekler
import com.example.recipeuygulamasisara.databinding.FragmentAnasayfaBinding
import com.example.recipeuygulamasisara.ui.adapter.YemeklerAdapter
import com.example.recipeuygulamasisara.ui.viewmodel.AnasayfaViewModel
import java.util.HexFormat

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa,container,false)

        binding.anasayfaToolbarBaslik= "Yemekler"

        viewModel.yemeklerListesi.observe(viewLifecycleOwner){
            val yemeklerAdapter = YemeklerAdapter(requireContext(),it)
            binding.yemeklerAdapter = yemeklerAdapter
        }

        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val tempViewModel:AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }

}