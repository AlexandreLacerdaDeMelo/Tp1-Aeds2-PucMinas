#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

int recSum(int digits[], int index) {
    if (index < 0) {
        return 0;
    }
    return digits[index] + recSum(digits, index - 1);
}

int main() {
    char input[100];
    
    while(1) {
        fgets(input, sizeof(input), stdin);
        
        // Remove newline character
        input[strcspn(input, "\n")] = '\0';
        
        // Check for exit condition (case insensitive)
        int isExit = 1;
        char lowerInput[100];
        strcpy(lowerInput, input);
        for(int i = 0; lowerInput[i]; i++) {
            lowerInput[i] = tolower(lowerInput[i]);
        }
        if(strcmp(lowerInput, "fim") == 0) {
            break;
        }
        
        // Try to convert to number
        int number;
        if(sscanf(input, "%d", &number) != 1) {
            continue;
        }
        
        // Convert number to string
        char numStr[20];
        sprintf(numStr, "%d", abs(number)); // Handle negative numbers
        
        // Create digits array
        int digits[strlen(numStr)];
        for(int i = 0; i < strlen(numStr); i++) {
            digits[i] = numStr[i] - '0'; // Convert char to int
        }
        
        // Calculate and print sum
        int result = recSum(digits, strlen(numStr) - 1);
        printf("%d\n", result);
    }
    
    return 0;
}