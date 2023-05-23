package week2.Practice;

public class BoxMatch {
    BoxFighters f1;
    BoxFighters f2;

    int minWeight;
    int maxWeight;

    BoxMatch(BoxFighters f1, BoxFighters f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }
    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("=== New Round ===");
                // %50 sans ile ilk vuran belirlenir.
                if (firstBlood()) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }else {
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                System.out.println(this.f1.name + " health = " + this.f1.health);
                System.out.println(this.f2.name + " health = " + this.f2.health);
            }
        } else {
            System.out.println("Fighters weights are not match");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && f1.weight <= maxWeight) && (this.f2.weight >= minWeight && f2.weight <= maxWeight);
    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name + " won !");
            return true;
        }

        if (this.f2.health==0){
            System.out.println(this.f1.name + " won !");
            return true;
        }
        return false;
    }
    boolean firstBlood(){
        double random = Math.random() * 100;
        if (random >= 50){
            return true;
        }else return false;
    }
}
