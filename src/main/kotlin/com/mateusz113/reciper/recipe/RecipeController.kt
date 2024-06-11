package com.mateusz113.reciper.recipe

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/recipes")
class RecipeController @Autowired constructor(
    private val recipeService: RecipeService
) {

}