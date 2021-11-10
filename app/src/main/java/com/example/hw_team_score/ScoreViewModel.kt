package com.example.hw_team_score

import androidx.lifecycle.ViewModel


class ScoreViewModel: ViewModel() {
    private var _score = 0
    val score: Int get() = _score

    fun add1(): Int{
        score >= 0
        return score + 1
    }

    fun subtract(): Int{
        score >= 0
        return score - 2
    }

    fun add4(): Int{
        score >= 0
        return score + 4
    }
}