# Java OOP Notes
By Muhammad Rizqi Ardiansyah

## Array
Syntax: 
```java
DataTypes[] arrayName;
arrayName = {element1, element2, element3, ...};

DataTypes[] anotherArray = {element1, element2, element3, ...};

```

Example:
```java
public class MyArraySample {
    public static void main(String[] args) {

        // Array of int
        int[] myArray1 = {1, 3, 5, 7, 9, 11};

        // Array of String
        String[] myArray2 = {"Jakarta", "Kuala Lumpur", "Manila", "Bangkok"}

        // Accessing element from an array
        // Remember, index of an array starts at 0 (zero)
        System.out.println(myArray1[0]); // Output: 1
        System.out.println(myArray1[5]); // Output: 11

        System.out.println(myArray2[0]); // Output: Jakarta
        System.out.println(myArray2[1]); // Output: Kuala Lumpur
    }
}
```

## Structure Control

### 1. If/Else
Syntax: 
```
if (statement) {
    // blocks of code
} else if (statement) {
    // blocks of code
} else {
    // blocks of code
}
```

```
if (statement) 
    // one line of code
```
Example:
```java
public class MyIfElseSample {
    public static void main(String[] args) {
        double myScore = 93.0;
        
        if (myScore == 100) {
            System.out.println("Perfect!");
        } else if (myScore >= 90) {
            System.out.println("Excellent!");
        } else if (myScore >= 85) {
            System.out.println("Good!");
        } else if (myScore >= 80) {
            System.out.println("Keep it up!");
        } else if (myScore >= 77) {
            System.out.println("Dont give up!");
        } else {
            System.out.println("Sorry, you didn't pass the test.");
        }

        // Output: Excellent!
    }
}
```
### 2. Switch Case

### 3. For Loop

### 4. While Loop

### 5. Do While Loop

## Class

