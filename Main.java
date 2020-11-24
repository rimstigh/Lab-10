class Main {
  public static void main(String[] args) {
    //sugar object named tree
    Sugar tree = new Sugar("tree");
    tree.cutCookies(tree.getCookieShape(), 10);
    tree.bakeCookies(350, 12);
    tree.decorateCookies(tree.getIsReady());

    //sugar object named aCookie
    Sugar aCookie = new Sugar();
    aCookie.decorateCookies(aCookie.getIsReady());
  }
}