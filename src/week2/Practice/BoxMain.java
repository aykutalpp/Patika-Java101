package week2.Practice;
public class BoxMain {
    public static void main(String[] args) {

    BoxFighters f1 = new BoxFighters("Ali",12,140,100, 30);
    BoxFighters f2 = new BoxFighters("Veli",18,90,85, 20);

    BoxMatch match = new BoxMatch(f1,f2,80,105);

    match.run();
    }
}
