package com.mateusz113.reciper.service

import com.mateusz113.reciper.dto.RecipeDTO
import com.mateusz113.reciper.dto.RecipePhotoDTO
import com.mateusz113.reciper.entity.RecipePhoto
import com.mateusz113.reciper.mapper.toRecipe
import com.mateusz113.reciper.repository.RecipePhotoRepository
import com.mateusz113.reciper.repository.RecipeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RecipeService @Autowired constructor(
    private val recipeRepository: RecipeRepository,
    private val recipePhotoRepository: RecipePhotoRepository
) {

}