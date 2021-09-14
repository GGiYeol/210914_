package p99codingbat;

public class Ex210914 {



public boolean sleepIn(boolean weekday, boolean vacation) {
	  if(weekday == false || weekday == vacation ){
	    return true;
	  } else{
	    return false;
	  }
	}
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	  if(aSmile == bSmile){
	    return true;
	    
	  } else{
	    return false;
	  }
	}
public int sumDouble(int a, int b) {
	  if(a == b){
	    return a*4;
	  }else{
	    return a + b;
	  }
	}
public int diff21(int n) {
	  if(n>21){
	    return (n-21) * 2;
	  } else{
	    return 21- n;
	  }
	}
public boolean parrotTrouble(boolean talking, int hour) {
	  if(talking & (hour<7 | hour>20)){
	    return true;
	  }else{
	    return false;
	  }
	}
public boolean makes10(int a, int b) {
	   if(a == 10 || b == 10 || (a + b) ==10){
	    return true;
	  }else{
	    return false;
	  }
	}
public boolean nearHundred(int n) {
	  if((n>89 && n<111) || (n>189 && n<211)){
	    return true;
	  }else {
	    return false;
	  }
	}
public boolean posNeg(int a, int b, boolean negative) {
	  if(a == -b && negative == false){
	    return true;
	  }else if(a<0 && b<0 && negative == true){
	    return true;
	  }else if(a * b<0 && negative == false){
	    return true;
	    
	  }else{
	    return false;
	  }

	}




}
