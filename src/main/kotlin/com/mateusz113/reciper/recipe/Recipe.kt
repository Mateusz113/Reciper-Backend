package com.mateusz113.reciper.recipe

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "RECIPES")
data class Recipe(
    @Id
    @GeneratedValue
    val id: Long,
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
