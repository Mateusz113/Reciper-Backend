package com.mateusz113.reciper.mapper

import com.mateusz113.reciper.dto.RecipeDTO
import com.mateusz113.reciper.entity.Recipe

fun Recipe.toRecipeDTO(): RecipeDTO {
    return RecipeDTO(
        authorEmail = this.authorEmail,
        title = this.title,
        category = this.category,
        publishingTimestamp = this.publishingTimestamp,
        ratingVotes = this.ratingVotes,
        ratingValue = this.ratingValue,
        description = this.description,
        ingredients = this.ingredients,
        makingDirections = this.makingDirections,
        servingsNumber = this.servingsNumber,
        preparationTime = this.preparationTime,
        cookingTime = this.cookingTime,
        calories = this.calories,
        carbs = this.carbs,
        fat = this.fat,
        protein = this.protein
    )
}

fun RecipeDTO.toRecipe(): Recipe {
    return Recipe(
        authorEmail = this.authorEmail,
        title = this.title,
        category = this.category,
        publishingTimestamp = this.publishingTimestamp,
        ratingVotes = this.ratingVotes,
        ratingValue = this.ratingValue,
        description = this.description,
        ingredients = this.ingredients,
        makingDirections = this.makingDirections,
        servingsNumber = this.servingsNumber,
        preparationTime = this.preparationTime,
        cookingTime = this.cookingTime,
        calories = this.calories,
        carbs = this.carbs,
        fat = this.fat,
        protein = this.protein
    )
}