package com.mateusz113.reciper.entity

import jakarta.persistence.*

@Entity
@Table(name = "RECIPES")
data class Recipe(
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    val id: Long? = null,

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

    @Column(nullable = true)
    val calories: Int?,

    @Column(nullable = true)
    val carbs: Int?,

    @Column(nullable = true)
    val fat: Int?,

    @Column(nullable = true)
    val protein: Int?
)
