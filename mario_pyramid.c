// The code draws a pyramid of a given height.

#include <stdio.h>

// Function to validate and return an integer within a specified range.
int check_int(void);

// Function to generate and print the pyramid.
void gen_pyramid(int height, int peak);

int main(void)
{
    int peak = 2; // Initial value for the width of the pyramid base.
    int height = check_int(); // Get the user input for the height of the pyramid.
    gen_pyramid(height, peak); // Generate and print the pyramid.
}

// Function to validate and return an integer within the specified range (0 to 23).
int check_int(void)
{
    int i;
    do
    {
        printf("Enter the height of the pyramid (0 to 23): \n");
        scanf("%i", &i);
    }
    while (i < 0 || i > 23);
    return i;
}

// Function to generate and print the pyramid.
void gen_pyramid(int height, int peak)
{
    char air = ' ';   // Character representing empty space.
    char block = '#';  // Character representing a block in the pyramid.

    // Loop through each row of the pyramid.
    for (int r = 0; r < height; r++)
    {
        // Print spaces before the blocks to center the pyramid.
        for (int a = 0; a < height - r - 1 ; a++)
        {
            printf("%c", air);
        }

        // Print the blocks for the pyramid base.
        for (int b = 0; b < peak + r; b++)
        {
            printf("%c", block);
        }

        // Move to the next line for the next row.
        printf("\n");
    }
}
