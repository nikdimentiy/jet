#include <stdio.h>

/* 
   Function to calculate the sum of digits in an integer.
   Parameters:
   - n: Integer for which sum of digits needs to be calculated.
   Returns:
   - Sum of digits in the given integer.
*/
int getSum(int n) 
{ 
    int sum = 0; 

    // Loop to iterate through each digit of the number.
    while (n != 0) 
    { 
        // Add the last digit of the number to the sum.
        sum = sum + n % 10; 

        // Remove the last digit from the number.
        n = n / 10; 
    } 

    // Return the calculated sum of digits.
    return sum; 
} 

int main() 
{
    int n;

    // Prompt the user to enter an integer.
    printf("Enter integer number: \n");
    
    // Read the entered integer from the user.
    scanf("%d", &n);

    // Display a message indicating the sum of digits calculation.
    printf("The sum of digits, of entered number is: ");
    
    // Call the getSum function to calculate and print the sum of digits.
    printf("%d\n", getSum(n)); 

    // Indicate successful program execution.
    return 0; 
}

