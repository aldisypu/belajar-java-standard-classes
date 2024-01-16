package programmer.zaman.now.classes;

public class StringBuilderApp {
  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("Aldi");
    builder.append(" ");
    builder.append("Syah");
    builder.append(" ");
    builder.append("Putra");

    String name = builder.toString();
    System.out.println(name);

  }
}
