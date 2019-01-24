import builder.User;
import builder.UserBuilder;

public class Main {
  public static void main (String args[]) {

    User user = new UserBuilder().setAddress("Example street").setEmail("example@gmx.de").setName("Niklas").getUser();
    System.out.println(user);
  }
}
