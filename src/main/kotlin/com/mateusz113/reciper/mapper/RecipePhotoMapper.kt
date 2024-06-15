package com.mateusz113.reciper.mapper

import com.mateusz113.reciper.dto.RecipePhotoDTO
import com.mateusz113.reciper.entity.RecipePhoto

fun RecipePhotoDTO.toRecipePhoto(recipeId: Long): RecipePhoto {
    return RecipePhoto(recipeId = recipeId, photoData = this.photoData)
}