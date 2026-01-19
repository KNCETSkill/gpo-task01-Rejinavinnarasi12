# GPO_Task01 – Java Coding Assessment

## Problem Title
Brew Size Advisor

## Objective
Develop a Java program that determines the appropriate coffee size based on the given coffee volume (in milliliters). This task evaluates your understanding of conditional statements, input handling using Scanner, output accuracy, and adherence to instructions.

## Input Specification
A single integer representing coffee volume in milliliters (ml).

## Output Specification
Print exactly one word based on the rules below:
Small, Medium, or Large.
Do not print any additional text, prompts, or symbols.

## Decision Rules
Coffee Volume (ml) > 350 → Large  
Coffee Volume (ml) between 200 and 350 (inclusive) → Medium  
Coffee Volume (ml) < 200 → Small

## Constraints
Input will be a valid Positive integer.  
Assume only one input value.  
Output must be case-sensitive.  
No extra spaces or lines allowed.

## Sample Test Cases
220 → Medium  
400 → Large  
150 → Small  
200 → Medium  
350 → Medium  

## Instructions to Students
Do not change the class name: BrewSizeAdvisor.  
Write your logic only inside the given file.  
Use Scanner for input.  
Print output using System.out.print() or System.out.println().  
Ensure there is no additional output text.

## Autograding Information
This assignment is auto-graded using GitHub Actions. Your code will be tested against multiple test cases. Compilation errors or incorrect outputs will result in failed tests. Partial marks are awarded based on passed test cases.

## Repository Structure (Do Not Modify)
GPO_Task01  
├── src  
│   └── BrewSizeAdvisor.java  
├── .github/workflows  
│   └── classroom.yml  
└── README.md  

## Common Mistakes to Avoid
Printing prompts like "Enter the volume".  
Printing extra text like "Result is Medium".  
Changing file or class name.  
Adding additional Java files.

## Expected Output Format Example
Input:
220  
Output:
Medium

Note: This assessment is part of the GPO Technical Evaluation. Ensure correctness, clarity, and strict adherence to instructions. All the best.
