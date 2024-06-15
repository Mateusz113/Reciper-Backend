package com.mateusz113.reciper.dto

import com.mateusz113.reciper.entity.RecipePhoto

data class RecipeDTO(
    val authorEmail: String,
    val title: String,
    val category: String,
    val publishingTimestamp: Long,
    val ratingVotes: Int,
    val ratingValue: Int,
    val description: String,
    val ingredients: String,
    val makingDirections: String,
    val servingsNumber: Int,
    val preparationTime: Int,
    val cookingTime: Int,
    val calories: Int?,
    val carbs: Int?,
    val fat: Int?,
    val protein: Int?
)