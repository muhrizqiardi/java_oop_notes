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

```java
public class MySwitchCaseExample {
    public static void main(String[] args) {
        int menu = 3;

        switch (menu) {
            case 1:
                System.out.println("You chose menu 1");
                break;
            case 2:
                System.out.println("You chose menu 2");
                break;
            case 3:
                System.out.println("You chose menu 3");
                break;
            case 4:
                System.out.println("You chose menu 4");
                break;
            case 5:
                System.out.println("You chose menu 5");
                break;
            default:
                System.out.println("Please enter the menu properly.");

            // Output: You chose menu 3
        }

    }
}
```

### 3. For Loop

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
```

Output:

```
0
1
2
3
4
```

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

Output:

```
0
1
2
3
4
5
```

### 4. While Loop

- Entry controlled loop--the statement is checked at the beginning of each iteration
- Which means, it will always run zero or more times

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

Output:

```
0
1
2
3
4
```

## 5. Break and Continue

A `break` statement can be used to break a loop.

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 8) {
                break;
            }
            System.out.println(i);
            i += 2;
        }
    }
}
```

Output:

```
0
2
4
6
```

A `continue`, on the other hand, can be used to skip a loop iteration.

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
            i += 2;
        }
    }
}
```

Output:

```
0
2
4
6
```

In a condition where a nested loop is used, labelled loop can be used.

```java
// Example from https://www.javatpoint.com/java-continue
public class LabelledContinueExample {
    public static void main(String[] args) {
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    //using continue statement with label
                    continue aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}

```

### 6. Do While Loop

- Unlike `While` loop, this is an exit-controlled loop, which means the statement is checked at the end of each iteration
- This results in the loop always run at least once, even though the statement is false.

Take a look at this example:

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
```

Output:

```
5
```

You can see in the output, that even though the statement is false, it's still run, unlike this `while` loop example:

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
```

This will not output anything.

## 6. Class

Class definition syntax:

```
<modifier> class <name> {
    <attributesDeclaration>*
    <constructorDeclaration>*
    <methodDeclaration>*
}
```

Class declaration syntax:

```
<modifier> <type> <name>[ = <defaultValue>];
```

Example:

```java
public class StudentRecord {
    public String name;
    public char sex;
    public String address;
    public String major;
    private double programmingGrade;
    private double linearAlgebraGrade;
    private double dataStructuresGrade;
    private double databaseGrade;
    private double networkingGrade;
    private static int totalStudent = 0; // Static variable is a variable that belongs to a class itself, not by each object

    // Constructor
    StudentRecord(String name, char sex) {
        totalStudent++;
        this.name = name;
        this.sex = sex;
    }

    StudentRecord(String name, char sex, String address, String major) {
        totalStudent++;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.major = major;
    }

    // Constructor overloading
    StudentRecord(String name, double programmingGrade, double linearAlgebraGrade, double dataStructuresGrade,
            double databaseGrade, double networkingGrade) {
        totalStudent++;
        this.name = name;
        this.setProgrammingGrade(programmingGrade);
        this.setLinearAlgebraGrade(linearAlgebraGrade);
        this.setDataStructuresGrade(dataStructuresGrade);
        this.setDatabaseGrade(databaseGrade);
        this.setNetworkingGrade(networkingGrade);
    }

    /* Methods */

    /* Getter/accessor */
    public double getNetworkingGrade() {
        return networkingGrade;
    }

    /* Setter/mutator */
    public void setNetworkingGrade(double networkingGrade) {
        this.networkingGrade = networkingGrade;
    }

    public double getDatabaseGrade() {
        return databaseGrade;
    }

    public void setDatabaseGrade(double databaseGrade) {
        this.databaseGrade = databaseGrade;
    }

    public double getDataStructuresGrade() {
        return dataStructuresGrade;
    }

    public void setDataStructuresGrade(double dataStructuresGrade) {
        this.dataStructuresGrade = dataStructuresGrade;
    }

    public double getLinearAlgebraGrade() {
        return linearAlgebraGrade;
    }

    public void setLinearAlgebraGrade(double linearAlgebraGrade) {
        this.linearAlgebraGrade = linearAlgebraGrade;
    }

    public double getProgrammingGrade() {
        return programmingGrade;
    }

    public void setProgrammingGrade(double programmingGrade) {
        this.programmingGrade = programmingGrade;
    }

    public double getAverage() {
        return (programmingGrade + linearAlgebraGrade + dataStructuresGrade + databaseGrade + networkingGrade) / 5;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }
}
```
Implementation of class:
```java
class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord rizqiRecord = new StudentRecord("Kiki Rizqi", 'M'); // New object from a class StudentRecord
        StudentRecord aditRecord = new StudentRecord("Adit Didit", 'M'); 
        StudentRecord dianRecord = new StudentRecord("Dian", 'F', "42 Wallaby Way", "Computer Science"); 
        StudentRecord hartonoRecord = new StudentRecord("Tono Hartono", 100.0, 90.0, 85.0, 88.0, 89.0); 

        // Accessing name
        System.out.println(rizqiRecord.name); 

        // Modifying public attributes
        rizqiRecord.address = "221B Baker St."; 
        rizqiRecord.major = "Informatics Engineering";
        aditRecord.address = "Bleecker St.";
        aditRecord.major = "Mechanical Engineering";

        // Setting a private attributes using setter/mutator
        rizqiRecord.setDataStructuresGrade(90.0);
        rizqiRecord.setDatabaseGrade(100.0);
        rizqiRecord.setLinearAlgebraGrade(85.0);
        rizqiRecord.setNetworkingGrade(89.0);
        rizqiRecord.setProgrammingGrade(100.0);

        // Accessing a private attributes using getter/accessor
        System.out.println("Rizqi's Programming Grade: " + rizqiRecord.getProgrammingGrade());
        System.out.println("Dian's Database Grade: " + dianRecord.getDatabaseGrade());
        System.out.println("Tono's Programming Grade: " + hartonoRecord.getProgrammingGrade());
    }
}
```

## 7. Access modifiers
- `public`: allow access from inside the class or outside the class.
- `protected`: allow access **only** from their own class and subclasses
- `private`: allow access **only** from their own class