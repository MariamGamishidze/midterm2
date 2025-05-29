# List Processing Algorithm

## Overview

This Java program implements a specialized list processing algorithm that transforms two input arrays through a series of mathematical calculations and filtering operations. The program demonstrates array manipulation, index calculation, and pattern-based element removal.

## Algorithm Description

### Input
- **List1**: An array of integers `[6, 9, 9, 5, 3, 7, 6, 2, 4, 7, 6, 5, 9]`
- **List2**: An array of strings `["fykh", "kVCyE", "Cp3", "AJJ", "Xp4", "W1H", "HTc", "MS6oq", "NJiRM", "nmD", "IEoEj", "Khcns", "slGO", "V8O4", "zfxQ", "YBy0", "qcXq", "DOd2"]`

### Process

#### Step 1: Index Generation
For each integer `n` in List1, calculate index using formula: `(2n - 1)`

**Example:**
- Element 6 → Index: 2(6) - 1 = 11
- Element 9 → Index: 2(9) - 1 = 17
- Element 5 → Index: 2(5) - 1 = 9

#### Step 2: Element Extraction
Use calculated indices to select corresponding elements from List2, forming an intermediate List3.

**Example:**
- Index 11 → List2[11] = "Khcns"
- Index 17 → List2[17] = "DOd2"
- Index 9 → List2[9] = "nmD"

#### Step 3: Removal Pattern
Apply systematic removal algorithm:
1. Remove the first element from List3
2. Remove every second element from the remaining list

**Removal Process:**
```
Original List3: [A, B, C, D, E, F, G, H]
Remove First:   [B, C, D, E, F, G, H]
Remove Every 2nd: [B, D, F, H]  (removed C, E, G)
```

### Output
The program outputs the final processed list after all transformations.

## Features

- **Dynamic Processing**: Works with any integer and string arrays
- **Boundary Checking**: Automatically handles invalid indices
- **Memory Efficient**: Creates minimal copies of data
- **Error Handling**: Prevents array out-of-bounds exceptions

## Technical Specifications

### Requirements
- Java 8 or higher
- No external dependencies required

### File Structure
```
Task1.java
├── Class: Task1
├── Method: main(String[] args)
└── Method: applyRemovalPattern(List<String> list)
```

### Dependencies
- `java.util.List`
- `java.util.ArrayList`

## Usage

### Compilation
```bash
javac Task1.java
```

### Execution
```bash
java Task1
```

### Sample Output
```
[DOd2, nmD, V8O4, AJJ, V8O4, nmD]
```

## Customization

### Modifying Input Data
To use different input arrays, modify the `list1` and `list2` arrays in the `main` method:

```java
int[] list1 = {your, integer, values};
String[] list2 = {"your", "string", "values"};
```

### Changing the Formula
To modify the index calculation formula, update this line:
```java
int index = 2 * n - 1;  // Change formula here
```

### Adjusting Removal Pattern
To implement a different removal pattern, modify the `applyRemovalPattern` method logic.

## Algorithm Complexity

- **Time Complexity**: O(n + m) where n = length of list1, m = length of resulting list3
- **Space Complexity**: O(m) for storing intermediate and final results

## Example Walkthrough

Given the default input:

1. **Index Calculation**:
   - 6 → 11, 9 → 17, 9 → 17, 5 → 9, 3 → 5, 7 → 13...

2. **Element Selection**:
   - ["Khcns", "DOd2", "DOd2", "nmD", "W1H", "V8O4"...]

3. **Removal Process**:
   - Remove first element
   - Remove every second element from remainder
   - Final result: `[DOd2, nmD, V8O4, AJJ, V8O4, nmD]`



