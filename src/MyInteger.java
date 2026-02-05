public class MyInteger {
     int newint;
     
     String againwhy;
     int h;
     char[] hello = new char [h];
     int q;
     int value;

MyInteger(int MyInt, int i, String why, int thisone, char[] hi){
    newint = MyInt;
    h = i;
    q = thisone;
    why = againwhy;
    hi = new char[100];
    
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

int parseint(char[] hi) {
    int total = 0;
    for (int u = 0; u < h; u++) {
        total += hi[u];
    }
    return total;
}

int parsestring(String why) {
    int number = Integer.parseInt(why);
    return number;
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
 
    for (int ppp = 2; ppp <= Math.sqrt(newint); ppp++) {
        if (newint % ppp == 0) {
            return "The integer is not prime";
        } else {
            return "The integer is prime";
        }
    }
    return "";
}

//Equals code
String equals(int newint) {
        return "The integer is equal";
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

String equals(MyInteger vlaue) {
    return equals(vlaue.value);
}


}
