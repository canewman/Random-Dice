# Random-Dice  
Rolling random dice
-------
This program had two roles and was a project in my Java class in college. The first goal of the program was to have the user enter a number of dice to be rolled and the number of sides on all of the dice. The program then roles the desired dice and asks if the user wants to continue. The second goal of the program was to role 5 random dice with the die types being: d4, d6, d8, d10, d12, d20, and d100.  

The order of the program:  
1) Starts while loop  
    --while user doesn't enter 1  
        ---roll dice selected by user
 
 2) After the user enters 1 a for loop is created to loop 5 times (the five random dice). A random number between 0-7 is selected to use in a switch statement in each loop with each choice being a different dice type. Then that die is rolled and the result is output to the screen. 
 
 There is a seperate die object used to create the dice, this object contains sides as a parameter. The sides are used for the .roll() method (this also sets the current face value of the object). Evertime a die is rolled this class is used. 
