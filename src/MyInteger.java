public class MyInteger {
     int newint;

MyInteger(int MyInt){
    newint = MyInt;
}

String isEven() {
    if (newint % 2 == 0){
        return "True";
    }  else {
        return "False";
    }
}

String isOdd() {
    if (newint % 2 != 0){
        return "True";
    }  else {
        return "False";
    }
}


String isPrime() {
    if (newint <= 1) {
        return "False";
    }
 
    for (int i = 2; i <= Math.sqrt(newint); i++) {
        if (newint % i == 0) {
            return "False";
        } else {
            return "True";
        }
    }
    return "";
}


}
