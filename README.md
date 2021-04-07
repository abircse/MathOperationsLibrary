# AbirMathLibrary Version 1.0

This is simple library for basic Arithmatic operations, sum, subtraction, multiplication, Division by integer value. I will update this Library step by step & i will try to update all operation of math here. so stay tune

## To use this library just add follow instructions

### Step 2 : Add my dependency to Android studio App Level build.gradle files in dependency block

    implementation 'com.github.abircse:MyMathOperationsLibrary:1.0'
    
### Step 2 : Add this line in Project Level build.gradle files like this

    allprojects {
        repositories {
            google()
            jcenter()

            //-------Use This Line----------------//
            maven { url 'https://jitpack.io' }
        }
    }


## OKEY! DONE. NOW LETS KNOW HOW TO WRITE CODE

### Step 3 : In you class or Activity file just call my operations method, & only put int value using comma's for specific operations.
      
  
        int a = abirmath.Plus(10, 20);
        int b = abirmath.Division(20, 30);
        int c = abirmath.Minus(20,10);
        int d = abirmath.Multiplication(20,10);


### OKEY! ENJOY.... :)
