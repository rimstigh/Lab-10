class Cookie {
  //4 instance variables
  int numCookies;
  int bakeTemp;
  int minutesBaked;
  boolean isReady;

  //default constructor, all variables = 0 or false
  Cookie() {
    numCookies = 0;
    bakeTemp = 0;
    minutesBaked = 0;
    isReady = false;
  }

  //constructor with 3 parameters and false
  Cookie(int aNumCookies, int aBakeTemp, int aMinutesBaked) {
    numCookies = aNumCookies;
    bakeTemp = aBakeTemp;
    minutesBaked = aMinutesBaked;
    isReady = false;
  }

  //accessor for isReady
  boolean getIsReady() {
    return isReady;
  }

  //mutator for number variable
  void setNumCookies(int aNumCookies) {
    numCookies = aNumCookies;
  }

  //bake cookies method
  void bakeCookies(int aBakeTemp, int aBakeTime) {
    System.out.println(numCookies + " cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isReady = true;
  }
}