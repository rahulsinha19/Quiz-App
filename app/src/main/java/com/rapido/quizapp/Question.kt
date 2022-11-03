package com.rapido.quizapp

/*
defines the parameters for the question like what do i need to know about each question,
what kind of information it need.
*/

data class Question(
    val id: Int, // -> for question number
    val question: String, // -> for the question statement
    val image: Int, // -> for the images in the question

    // for the 4 options in the question
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,

    val correctAnswer: Int
)
