package async;

class Ceo {
  String id;
  String name;

  public String getId()
  {
    return this.id;
  }

  public Ceo(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "Ceo_" + name;
  }
}
