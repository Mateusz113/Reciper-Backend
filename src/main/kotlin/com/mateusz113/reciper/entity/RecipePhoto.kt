package com.mateusz113.reciper.entity

import jakarta.persistence.*

@Entity
@Table(name = "RECIPE_PHOTOS")
data class RecipePhoto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val recipeId: Long,

    @Lob
    val photoData: ByteArray,
)