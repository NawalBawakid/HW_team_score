package com.example.hw_team_score

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.hw_team_score.databinding.FragmentScoreBinding

// xml not linked i don't know why
class ScoreFragment : Fragment() {
    private val viewModel: ScoreViewModel by viewModels()

    private lateinit var binding:FragmentScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScoreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDetach() {
        super.onDetach()
    }

    var total = binding.buttons.checkedRadioButtonId
    var chosenbutton = when(total){
        binding.addbuttom.id -> viewModel.add1()
        binding.subtractbuttom.id -> viewModel.subtract()
        else -> viewModel.add4()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.score.text.toString()
        binding.addbuttom.setOnClickListener {viewModel.add1()}
        binding.subtractbuttom.setOnClickListener {viewModel.subtract()}
        binding.add4buttom.setOnClickListener {viewModel.add4()}
        binding.result.setText(chosenbutton)
    }

}