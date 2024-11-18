# Advent of Code 2023 - Day 1 Solution

## Overview

This repository contains a Java solution for Day 1 of the Advent of Code 2023 challenge.

**Problem Statement:** [Day 1 Problem #1](https://adventofcode.com/2023/day/1)

The program reads a file named `puzzleInput.txt`, extracts the first and last digits from each line containing digits, computes the number formed by these digits, and outputs the sum of these numbers.

## Problem Details

The task involves reading lines from an input file and identifying the first and last digits within each line:

- If a line has no digits, it is skipped.
- The program concatenates the first and last digit found in each line to form a two-digit number.
- These numbers are summed across all lines in the input file.

### Example

For an input file containing the following lines:

```
abc123
45b7c
no digits here
99a1b
```

The output of the program would be:

- Line 1: First digit = 1, Last digit = 3, Formed number = 13
- Line 2: First digit = 4, Last digit = 7, Formed number = 47
- Line 3: Skipped (no digits)
- Line 4: First digit = 9, Last digit = 1, Formed number = 91

**Total Sum**: 13 + 47 + 91 = 151

## Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/prithvirajdeshmane/AdventOfCode_2023_Day1_1.git
   ```
2. Ensure you have Java installed (Java 8 or higher).
3. Place your input file named `puzzleInput.txt` in the root directory.

## Usage

To compile and run the program:

```bash
javac App.java
java App
```

## Input File

The program reads from a file named `puzzleInput.txt`, which should be located in the same directory as `App.java`. Ensure the file contains the input as per the problem requirements.

## Error Handling

If the input file is not found, the program will display an error message:

```
Input file not found at provided path
```

## Explanation of the Code

The main logic of the solution is as follows:

- Read the input file line by line using `Scanner`.
- Skip lines that do not contain any digits.
- Iterate through each character in the line to identify the first and last digit.
- Calculate the number formed by the first and last digits and add it to the cumulative sum.
- Print the final sum.

## Author

**Prithviraj Deshmane**

This project is part of the Advent of Code 2023 series. For more details, visit [Advent of Code](https://adventofcode.com).

## License

This project is licensed under the GNU General Public License v3.0 - see the LICENSE file for details.

