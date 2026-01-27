public class MyInteger {
     int newint;
MyInteger vlaue = 0;
MyInteger(int MyInt){
    newint = MyInt;
    
}
//Normal code
String isEven() {
    
    return isEven(newint);
}

String isOdd() {
    return isOdd(newint);
}


String isPrime() {
   return isPrime(newint);
}




//static ints
static String isEven(int newint) {
    if (newint % 2 == 0){
        return "The integer is even";
    }  else {
        return "The integer is not even";
    }
}

static String isOdd(int newint) {
    if (newint % 2 != 0){
        return "The integer is odd";
    }  else {
        return "The integer is not odd";
    }
}
static String isPrime(int newint) {
    if (newint <= 1) {
        return "The integer is not prime";
    }
 
    for (int i = 2; i <= Math.sqrt(newint); i++) {
        if (newint % i == 0) {
            return "The integer is not prime";
        } else {
            return "The integer is prime";
        }
    }
    return "";
}

//MyInteger clauses
static String isEven(MyInteger vlaue) {
    
    return isEven(vlaue.value);
}

static String isOdd(MyInteger vlaue) {
    return isOdd(vlaue.value);
}

static String isPrime(MyInteger vlaue) {
    return isPrime(vlaue.value);
}

//Equals code
String equals(MyInteger vlaue) {
    if (newint == vlaue.value) {
        return "the integer is equal";
    }
    return "";
}
}
