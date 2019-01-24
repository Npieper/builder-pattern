package builder;

public class UserBuilder {

  private  int id;
  private  String email;
  private  String address;
  private  String name;


  public UserBuilder setId(int id) {
    this.id = id;
    return this;
  }

  public UserBuilder setEmail(String email) {
    this.email = email;
    return this;
  }

  public UserBuilder setAddress(String address) {
    this.address = address;
    return this;

  }

  public UserBuilder setName(String name) {
    this.name = name;
    return this;

  }

  public User getUser() {
    return new User(id, email, address, name);
  }
}
