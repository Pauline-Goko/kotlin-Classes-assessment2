
fun main() {
    // Create an instance of AncestralStory
    val story1 = AncestralStory("Mwangi, the brave boy", "A boy that went searching for his beloved dog in the deadly forest", "20 pages", "bravery and courage", "5-10 years")

    // Create an instance of StoryTeller
    val storyteller1 = StoryTeller("Kamau Maina", "Kikuyu", "5-10 years")

    // Tell the story
    storyteller1.tellStory(story1)

    // Create an instance of Translator
    val translator1 = Translator("Translator1", "Kikuyu", "English")

    // Translate the story
    val translatedStory1 = translator1.translate(story1)

    // Output the translated story
    println("Translated story: ${translatedStory1.title}: ${translatedStory1.content}")

    // Create an instance of AncestralStory
    val story2 = AncestralStory(
        "Jamba Nene", "A boy that met an ogre in the deadly forest", "40 pages", "obedience and courage", "11-15 years")

    // Create an instance of StoryTeller
    val storyteller2 = StoryTeller("Wambui Kamau", "Kikuyu", "11-15 years")

    // Tell the story
    storyteller2.tellStory(story2)

    // Create an instance of Translator
    val translator2 = Translator("Translator2", "Kikuyu", "English")

    // Translate the story
    val translatedStory2 = translator2.translate(story2)

    // Output the translated story
    println("Translated story: ${translatedStory2.title}: ${translatedStory2.content}")




    val moroccanRecipe = MoroccanRecipe(
        "Fried Chicken", listOf("Chicken", "Onions", "Spices", "Cloves"), "2 hours", "Frying", "Calories: 400, Fat: 15g, Protein: 30g",)

    moroccanRecipe.displayRecipe()
    moroccanRecipe.displayMoroccanRecipe()

    val ethiopianRecipe = EthiopianRecipe(
        "Injera", listOf("Wheat Flour", "Onions", "Spices"), "3 hours", "Baking", "Calories: 450, Fat: 20g, Protein: 25g",)

    ethiopianRecipe.displayRecipe()
    ethiopianRecipe.displayEthiopianRecipe()

    val nigerianRecipe = NigerianRecipe(
        "Jollof Rice",
        listOf("Rice", "Tomatoes", "Onions", "Peppers", "Chicken"), "1 hour", "Boiling, Frying", "Calories: 300, Fat: 8g, Protein: 20g",)

    nigerianRecipe.displayRecipe()
    nigerianRecipe.displayNigerianRecipe()


}


//**Ancestral Stories:** In many African cultures, the art of storytelling is passed
//down from generation to generation. Imagine you're creating an application that
//records these oral stories and translates them into different languages. The
//stories vary by length, moral lessons, and the age group they are intended for.
//Think about how you would model `Story`, `StoryTeller`, and `Translator`
//objects, and how inheritance

open class Story(val title: String, val content: String, val length: String, val moralLessons: String, val ageGroup: String)

class AncestralStory(title: String, content: String, length: String, moralLessons: String, ageGroup: String) : Story(title, content, length, moralLessons, ageGroup)

open class StoryTeller(val name: String, val language: String, val ageGroup: String) {
    open fun tellStory(story: Story) {
        println("$name is telling a ${story.title} story which is a $language story to ${story.ageGroup} children. it is ${story.length} long and the moral lessons are ${story.moralLessons} ")
    }
}

class Translator(
    val name: String, val originalLanguage: String, val translatedLanguage: String) {
    fun translate(story: Story): Story {
        val translatedContent = translateContent(story.content)

        return Story(story.title, translatedContent, story.length, story.moralLessons, story.ageGroup)
    }

     fun translateContent(content: String): String {

        return content // Placeholder translation
    }
}

//**African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.


// Recipe class
open class Recipe(
    val name: String, val ingredients: List<String>, val preparationTime: String, val cookingMethod: String, val nutritionalInfo: String) {
    // Method to display the recipe details
    open fun displayRecipe() {
        println("Recipe: $name")
        println("Ingredients: $ingredients")
        println("Preparation Time: $preparationTime")
        println("Cooking Method: $cookingMethod")
        println("Nutritional Information: $nutritionalInfo") }
}

// Subclass for Moroccan recipes
class MoroccanRecipe(name: String, ingredients: List<String>, preparationTime: String, cookingMethod: String, nutritionalInfo: String, ) : Recipe(name, ingredients, preparationTime, cookingMethod, nutritionalInfo) {
    // Method to display Moroccan recipe details
    fun displayMoroccanRecipe() {
        println()
    }
}

// Subclass for Ethiopian recipes
class EthiopianRecipe(name: String, ingredients: List<String>, preparationTime: String, cookingMethod: String, nutritionalInfo: String, ) : Recipe(name, ingredients, preparationTime, cookingMethod, nutritionalInfo) {
    // Method to display Ethiopian recipe details
    fun displayEthiopianRecipe() {
        println()
    }
}

// Subclass for Nigerian recipes
class NigerianRecipe(name: String, ingredients: List<String>, preparationTime: String, cookingMethod: String, nutritionalInfo: String, ) : Recipe(name, ingredients, preparationTime, cookingMethod, nutritionalInfo) {
    // Method to display Nigerian recipe details
    fun displayNigerianRecipe() {
        println()
    }
}





