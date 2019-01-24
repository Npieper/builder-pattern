package builder;

public class User {

  private  int id;
  private  String email;
  private  String address;
  private  String name;

  public User(int id, String email, String address, String name) {
    this.id = id;
    this.email = email;
    this.address = address;
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", email='" + email + '\'' +
        ", address='" + address + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
