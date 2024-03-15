package com.luizafmartinez.at01_kotlin.lesson03

class LanguageCourse() : ComputerCourse() {

    override fun coursePrice() {

        println("Course Price")
    }

    override fun coursePrerequisite() {

        println("Course Prerequisite")
    }
}