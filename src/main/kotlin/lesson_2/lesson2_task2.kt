package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 30
    val salaryOfEmployees = 30_000
    val salaryOfInterns = 20_000

    val employeeSalaryExpenses = numberOfEmployees * salaryOfEmployees
    val employeeSalaryExpensesAndInterns = employeeSalaryExpenses + numberOfInterns * salaryOfInterns
    val averageSalary = employeeSalaryExpensesAndInterns / (numberOfInterns + numberOfEmployees)

    println(employeeSalaryExpenses)
    println(employeeSalaryExpensesAndInterns)
    println(averageSalary)
}
