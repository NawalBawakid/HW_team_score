package com.example.hw_team_score

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.hw_team_score.databinding.FragmentScoreBinding

class ScoreFragment : Fragment() {
    private val viewModel: ScoreViewModel by viewModels()

    private lateinit var binding:FragmentScoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScoreBinding.inflate(inflater, container, false)
        return binding.root
    }
    var firstCheck=true
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttons.setOnCheckedChangeListener { group, checkedId ->

           if (firstCheck) {
               setIntValuOnly()
               firstCheck=  false
           }

            when (checkedId) {
                binding.addbuttom.id -> viewModel.add1()
                binding.subtractbuttom.id -> viewModel.subtract()
                else -> viewModel.add4()
            }
            binding.result.setText(viewModel.score.toString())
        }

    }

    private fun setIntValuOnly() {
        viewModel.setInitScore(binding.score.text.toString().toInt())
    }

    override fun onDetach() {
        super.onDetach()
    }

}