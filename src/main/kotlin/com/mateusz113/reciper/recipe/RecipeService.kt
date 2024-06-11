package com.mateusz113.reciper.recipe

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RecipeService @Autowired constructor(
    private val recipeRepository: RecipeRepository
) {

}