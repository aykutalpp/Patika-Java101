package week2.Practice;

public class BoxFighters {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    BoxFighters (String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if (dodge >= 0 && dodge <=100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }
    }

    int hit (BoxFighters foe){
        if (foe.isDodge()){
            System.out.println(foe.name + " dodged.");
            return foe.health;
        } else System.out.println(this.name + " => " + foe.name + " " + this.damage + " hit !");
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge (){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;

    }

}
