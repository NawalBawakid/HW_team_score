package com.example.hw_team_score

import androidx.lifecycle.ViewModel


class ScoreViewModel: ViewModel() {
    private var _score = 0
    val score: Int get() = _score

    fun add1(){
        if (score >= 0){
            _score += 1
        }else if (score < 0){
            _score =  0
        }
    }

    fun subtract(){
        if (score >= 0) {
            _score -= 2
        }else if (score < 0){
          _score =  0
        }
    }

    fun add4(){
        if (score >= 0) {
            _score += 4
        }else if (score < 0){
            _score =  0
        }
    }

   fun setInitScore(score:Int){
       _score=score
   }
}