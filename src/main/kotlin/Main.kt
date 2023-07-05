
fun main() {

    val story1 = Story("Mwangi, the brave boy", "A boy that went searching for his beloved dog in the deadly forest", "20 pages", "bravery and courage", "5-10 years")
    println(story1)

    val storyteller1 = StoryTeller("Kamau Maina", "Kikuyu", "5-10 years")
    storyteller1.tellStory(story1)

    val translator1 = Translator("Pauline", "Kikuyu", "English")
   println( translator1.translateContent("born a crime"))

    val story2 = Story("Jamba Nene", "A boy that met an ogre in the deadly forest", "40 pages", "obedience and courage", "11-15 years")

    val storyteller2 = StoryTeller("Wambui Kamau", "Kikuyu", "11-15 years")
   println( storyteller2.tellStory(story2))


    val translator2 = Translator("Translator2", "Kikuyu", "English")
    println( translator2.translateContent("jamba nene story"))


    val moroccanRecipe = MoroccanRecipe("Couscous", listOf("Chicken", "Semolina", "Wheat flour", "Cloves"), "2 hours", "Steaming", "Calories: 150, Fat: 0g, Protein: 5g",)
    moroccanRecipe.displayRecipe()
    moroccanRecipe.displayMoroccanRecipe()

    val ethiopianRecipe = EthiopianRecipe("Injera", listOf("Teff Flour", "Garlic", "Ginger"), "3 hours", "Baking", "Calories: 450, Fat: 20g, Protein: 25g",)
    ethiopianRecipe.displayRecipe()
    ethiopianRecipe.displayEthiopianRecipe()

    val nigerianRecipe = NigerianRecipe("Jollof Rice", listOf("Rice", "Tomatoes", "Onions", "Peppers", "Chicken"), "1 hour", "Boiling, Frying", "Calories: 300, Fat: 8g, Protein: 20g",)
    nigerianRecipe.displayRecipe()
    nigerianRecipe.displayNigerianRecipe()

    val lion = Predator("Lion", "Carnivore", 10)
    val gazelle = Prey("Gazelle", "Herbivore", 5, "Seasonal migration")

    println("Species: ${lion.name}")
    println("Diet: ${lion.diet}")
    println("Typical Lifespan: ${lion.lifespan} years")


    println("Species: ${gazelle.name}")
    println("Diet: ${gazelle.diet}")
    println("Typical Lifespan: ${gazelle.lifespan} years")
    println("Migration Pattern: ${gazelle.migrationPattern}")

    val season = "dry"
    val migrationPrediction = gazelle.predictMigration(season)
    println("Migration Prediction for $season season: $migrationPrediction")

    val artist1 = Artist("Rema", "Nigeria", "Afrobeats", "Drum")
    val artist2 = Artist("Diamond", "Tanzania", "Bongo", "Guitar")
    val artist3 = Artist("Sauti Sol", "Kenya", "Zilipendwa", "Guitar")


    val performance1 = Performance(artist1, "18:00", "19:00", "Alchemist, Capacity: 300" )
    val performance2 = Performance(artist2, "19:30", "20:30", "Carnivore, Capacity: 400")
    val performance3 = Performance(artist3, "20:30", "10:30", "Kasarani Stadium, Capacity: 1000")
    performance1.displayInfo()
    performance2.displayInfo()
    performance3.displayInfo()


    val product1 = Product("Shoes", 2200.00, 10)
    val product2 = Product("Dress", 1500.00, 15)
    val product3 = Product("Trouser", 800.00, 14)


    val totalValue1 = product1.calculateTotalValue()
    val totalValue2 = product2.calculateTotalValue()
    val totalValue3 = product3.calculateTotalValue()


    println("Total value of {product1.name}: $totalValue1")
    println("Total value of {product2.name}: $totalValue2")
    println("Total value of {product3.name}: $totalValue3")





    val student1 = Student("Mary Achieng", 18, listOf(85, 90, 76, 92, 88))
    student1.displayStudentInfo()
    println("Average Grade: ${student1.calculateAverageGrade()}")
    println("Has Passed: ${student1.hasPassed()}")

    val student2 = Student("Pauline Wanjiru", 20, listOf(45, 55, 0, 70, 50))
    student2.displayStudentInfo()
    println("Average Grade: ${student2.calculateAverageGrade()}")
    println("Has Passed: ${student2.hasPassed()}")


    val bookingSystem = FlightBookingSystem()

    bookingSystem.addFlight("FLY540", "Mombasa", "2023-07-05", 500)
    bookingSystem.addFlight("BOENG560", "London", "2023-07-25", 220)

    val availableFlights = bookingSystem.searchFlights("London", "2023-07-25")
    println(availableFlights)

    val flightNumber = "BOENG560"
    val flightToReserve = availableFlights[0]
    val passengerName = "Brigit Amakove"
    val passenger2 = "Pauline Wanjiru"
    val seatReserved = bookingSystem.reserveSeat(flightToReserve.flightNumber, passengerName)
    println(if (seatReserved) "Seat reserved for $passengerName" else "No seats available")

    val seatReserve = bookingSystem.reserveSeat(flightToReserve.flightNumber, passenger2)
    println(if (seatReserve) "Seat reserved for $passenger2" else "No seats available")

    val passengersInfo = bookingSystem.getPassengerInfo(flightToReserve.flightNumber)
    println("Passenger information for ${flightToReserve.flightNumber}: $passengersInfo")

    val confirmation = bookingSystem.generateBookingConfirmation(flightToReserve.flightNumber)
    println(confirmation)


    val library = Library()
    library.addBook("Born a Crime", "Trevor Noah", 300, 2019)
    library.addBook("Originals", "Adam Grant", 22, 2017)
    library.addBook("The Kite Runner", "Hussein Mohammed", 18, 2009)

    val foundBooks = library.searchBook("Originals")
    println(foundBooks)

    library.displayBooks()
}

//**Ancestral Stories:** In many African cultures, the art of storytelling is passed
//down from generation to generation. Imagine you're creating an application that
//records these oral stories and translates them into different languages. The
//stories vary by length, moral lessons, and the age group they are intended for.
//Think about how you would model `Story`, `StoryTeller`, and `Translator`
//objects, and how inheritance

 data class Story(val title: String, val content: String, val length: String, val moralLessons: String, val ageGroup: String)

//class AncestralStory(title: String, content: String, length: String, moralLessons: String, ageGroup: String) : Story(title, content, length, moralLessons, ageGroup)

open class StoryTeller(val name: String, val language: String, val ageGroup: String) {
    open fun tellStory(story: Story) {
        println("$name is telling a ${story.title} story which is a $language story to ${story.ageGroup} children. it is ${story.length} long and the moral lessons are ${story.moralLessons} ")
    }
}

class Translator(val name: String, val originalLanguage: String, val translatedLanguage: String) {
  open  fun translate(story: Translator){

      println("$name is translating a $originalLanguage story to $translatedLanguage" )

//        return Translator("$name is translating a $originalLanguage, to $translatedLanguage ")

//        return Story(story.title, translatedContent, story.length, story.moralLessons, story.ageGroup)
    }

     fun translateContent(content: String): String {

        return content
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
    open fun displayRecipe() {
        println("Recipe: $name")
        println("Ingredients: $ingredients")
        println("Preparation Time: $preparationTime")
        println("Cooking Method: $cookingMethod")
        println("Nutritional Information: $nutritionalInfo") }
}

// Subclass for Moroccan recipes
class MoroccanRecipe(name: String, ingredients: List<String>, preparationTime: String, cookingMethod: String, nutritionalInfo: String, ) : Recipe(name, ingredients, preparationTime, cookingMethod, nutritionalInfo) {
    fun displayMoroccanRecipe() {
        super.displayRecipe()
        println("The word “Couscous” is an Amazigh word. It means how we prepare small wheat grains.")
    }
}
class EthiopianRecipe(name: String, ingredients: List<String>, preparationTime: String, cookingMethod: String, nutritionalInfo: String, ) : Recipe(name, ingredients, preparationTime, cookingMethod, nutritionalInfo) {
    // Method to display Ethiopian recipe details
    fun displayEthiopianRecipe() {
        super.displayRecipe()
        println("Injera is made from teff seeds, the smallest of the nuts.")
    }
}
class NigerianRecipe(name: String, ingredients: List<String>, preparationTime: String, cookingMethod: String, nutritionalInfo: String, ) : Recipe(name, ingredients, preparationTime, cookingMethod, nutritionalInfo) {
    fun displayNigerianRecipe() {
        super.displayRecipe()
        println("The name “jollof” originates from a Senegambian kingdom called the Jolof Empire.")
    }
}

//
//**Wildlife Preservation:** You're a wildlife conservationist working on a
//program to track different species in a national park. Each species has its own
//characteristics and behaviors, such as its diet, typical lifespan, migration
//patterns, etc. Some species might be predators, others prey. You'll need to
//
//create classes to model `Species`, `Predator`, `Prey`, etc., and think about how
//these classes might relate to each other through inheritance.

open class Species(val name: String, val diet: String, val lifespan: Int)

class Predator(name: String, diet: String, lifespan: Int) :
    Species(name, diet, lifespan)

class Prey(name: String, diet: String, lifespan: Int, val migrationPattern: String) :
    Species(name, diet, lifespan) {

    fun predictMigration(season: String): String {
        return when (season) {
            "wet" -> "No migration will occur."
            "dry" -> "Migration will occur."
            else -> "Unable to predict migration."
        }
    }
}


//**African Music Festival:** You're in charge of organizing a Pan-African music
//festival. Many artists from different countries, each with their own musical style
//and instruments, are scheduled to perform. You need to write a program to
//manage the festival lineup, schedule, and stage arrangements. Think about how
//you might model the `Artist`, `Performance`, and `Stage` classes, and consider
//how you might use inheritance if there are different types of performances or
//stages.


open class Artist(var name: String, var country: String, var musicStyle: String, var instruments: String) {

}

class Performance(val artist: Artist, val startTime: String, val endTime: String, var stageName: String) {
    fun displayInfo() {
        println("Performance by ${artist.name} from ${artist.country}.")
        println("Genre: ${artist.musicStyle}")
        println("Instruments: ${artist.instruments}")
        println("Start time: $startTime, End time: $endTime")
        println("Stage: $stageName")
    }
}



//Create a class called Product with attributes for name, price, and quantity.
//Implement a method to calculate the total value of the product (price * quantity).
//Create multiple objects of the Product class and calculate their total values.

class Product(val name: String, val price: Double, val quantity: Int) {
    fun calculateTotalValue(): Double {
        return price * quantity
    }
}





//Implement a class called Student with attributes for name, age, and grades (a list of integers).
// Include methods to calculate the average grade, display the student information, and determine if the student has passed
// (average grade >= 60). Create objects for the Student class and demonstrate the usage of these methods.

class Student(val name: String, val age: Int, val grades: List<Int>) {
    fun calculateAverageGrade(): Double {
        if (grades.isEmpty()) {
            return 0.0
        }
        return grades.sum().toDouble() / grades.size
    }
    fun displayStudentInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Grades: $grades")
    }
    fun hasPassed(): Boolean {
        val averageGrade = calculateAverageGrade()
        return averageGrade >= 60
    }
}


// Create a FlightBooking class that represents a flight booking system. Implement
// methods to search for available flights based on destination and date, reserve
// seats for customers, manage passenger information, and generate booking
// confirmations.

class FlightBookingSystem {
     val flights = mutableListOf<Flight>()

    fun addFlight(flightNumber: String, destination: String, date: String, availableSeats: Int) {
        val flight = Flight(flightNumber, destination, date, availableSeats)
        flights.add(flight)
    }

    fun searchFlights(destination: String, date: String): List<Flight> {
        return flights.filter { flight ->
            flight.destination == destination &&
                    flight.date == date &&
                    flight.availableSeats > 0
        }
    }

    fun reserveSeat(flightNumber: String, passengerName: String): Boolean {
        val flight = flights.find { it.flightNumber == flightNumber }
        if (flight != null && flight.availableSeats > 0) {
            flight.availableSeats -= 1
            flight.passengers.add(passengerName)
            return true
        }
        return false
    }

    fun getPassengerInfo(flightNumber: String): List<String> {
        val flight = flights.find { it.flightNumber == flightNumber }
        return flight?.passengers ?: emptyList()
    }

    fun generateBookingConfirmation(flightNumber: String): String {
        val flight = flights.find { it.flightNumber == flightNumber }
        return if (flight != null) {
            val passengerList = flight.passengers.mapIndexed { index, passenger ->
                "${index + 1}. $passenger"
            }.joinToString("\n")
            "Confirmation for Flight ${flight.flightNumber}:\n" +
                    "Destination: ${flight.destination}\n" +
                    "Date: ${flight.date}\n" +
                    "Passenger List:\n" +
                    passengerList
        } else {
            "Flight not found"
        }
    }

    data class Flight(
        val flightNumber: String,
        val destination: String,
        val date: String,
        var availableSeats: Int,
        val passengers: MutableList<String> = mutableListOf()
    )
}



//Create a LibraryCatalog class that handles the cataloging and management of books in a library.
//Implement methods to add new books, search for books by title or author, keep track of available
//copies, and display book details.

class Library {
    val books = mutableListOf<Book>()

    fun addBook(title: String, author: String, copies: Int, year: Int) {
        val book = Book(title, author, copies, year)
        books.add(book)
        }

    fun searchBook(title: String): List<Book> {
        return books.filter { it.title.equals(title, ignoreCase = true) }
        }

    fun displayBooks() {
        if (books.isEmpty()) {
            println("No books found.")
            } else { books.forEach { book -> println("${book.title} by ${book.author}, Year: ${book.year}, Copies: ${book.copies}")
                }
            }
        }
        data class Book(val title: String, val author: String, val copies: Int, val year: Int)
    }







