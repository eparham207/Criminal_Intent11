package com.parham.msu.criminal_intent11

import java.util.Date
import java.util.UUID

data class Crime(
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean,
    var requiresPolice: Boolean
)
