package com.jagandev.builds;

class Calculator {
    def jenkins
}

def Calculator(jenkins){
    this.jenkins = jenkins
}

def add(firstNumber,secondNumber)
{
    return firstNumber+secondNumber
}
def multiply(firstNumber,secondNumber)
{
    return firstNumber*secondNumber
}