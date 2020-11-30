class Main {
  public static void main(String[] args) {
    String name = "Francis";
    int age = 25;
    char initials = 'F';
    double accountBalance = 0.0;
    boolean isTall = false;
    
    System.out.println(Person.haveEaten(null));
    
    //System.out.println(Person.isYou());
  }
}

class Person{
  public boolean isMe(){
    String[] arg = {"you", "me"};
    Main.main(arg);
    return true;
  }
  
  public static boolean isYou(){
    return false;
  }
  
  public static boolean haveEaten(String food){
    return (food == null || food == "")? false : true;
  }
}
