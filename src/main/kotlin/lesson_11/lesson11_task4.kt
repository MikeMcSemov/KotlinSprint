package org.example.lesson_11

class CategoryRecipe(   //сущность: Категория рецепта
        val nameCategory: String,   //имя категории: Бургеры, Десерты, Пицца, Рыба и т.д.
        val textCategory: String,   //текст у категории
        val recipeList: List<Recipe>,   //список с рецептами
        val titleCategoryPage: String = "КАТЕГОРИИ",    //заголовок страницы
)

class Recipe(   //сущность рецепт
    val nameRecipe: String, //имя рецепта
    var isFavorite: Boolean = false,    //переменная, для добавления/удаления из избранного
    val ingredientList: List<Ingredient>, //список ингредиентов
)

class Ingredient(   //сущность ингредиент
    val nameIngredient: String, //наименование ингредиента
    var numberServings: Int = 1,    //количество порций, по умолчанию считаем для 1
    var numberIngredients: Int, //количество ингредиентов, на скринах указаны целые числа
    val unitMeasurement: String,    //единица измерения ингредиента
)
