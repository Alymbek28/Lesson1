package com.example.lesson1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.lesson1.databinding.FragmentTaskBinding

class TaskFragment : Fragment() {

    private lateinit var binding: FragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTaskBinding.inflate(LayoutInflater.from(requireContext()),container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSave.setOnClickListener{
            save()
        }
    }

    private fun save() {
        val bundle = bundleOf("key" to binding.etTask.text.toString())
        parentFragmentManager.setFragmentResult("rk_result",bundle)
        findNavController().navigateUp()
    }

}