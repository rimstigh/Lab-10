class Sugar extends Cookie {
  //2 instance variables
  String cookieShape;
  boolean isDecorated;

  //default constructor
  Sugar() {
    cookieShape = "";
    isDecorated = false;
  }

  //constructor with 1 parameter
  Sugar(String aCookieShape) {
    cookieShape = aCookieShape;
    isDecorated = false;
  }

  //accessor for shape
  String getCookieShape() {
    return cookieShape;
  }

  //mutator for shape
  void setCookieShape(String aCookieShape) {
    cookieShape = aCookieShape;
  }

  //method to cut out shapes
  void cutCookies(String aCookieShape, int aNumCookies) {
    System.out.println(aNumCookies + " were cut into " + aCookieShape);
    setNumCookies(aNumCookies);
  }

  //method to decorate cookies if they're baked
  void decorateCookies(boolean aIsReady) {
    if (aIsReady == true) {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}