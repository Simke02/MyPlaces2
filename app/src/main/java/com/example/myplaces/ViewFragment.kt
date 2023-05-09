package com.example.myplaces

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.myplaces.databinding.FragmentViewBinding
import com.example.myplaces.model.MyPlacesViewModel
import java.util.zip.Inflater


class ViewFragment : Fragment() {
    private val myPlacesViewModel:MyPlacesViewModel by activityViewModels()
    private var _binding: FragmentViewBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmyplacesNameText.text=myPlacesViewModel.selected?.name
        binding.viewmyplacesDescText.text = myPlacesViewModel.selected?.description
        binding.viewmyplacesFinishedButton.setOnClickListener {
            myPlacesViewModel.selected=null
            findNavController().navigate(R.id.action_ViewFragment_to_ListFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        myPlacesViewModel.selected = null
    }
}