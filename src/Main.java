import javax.xml.stream.events.Characters;

public class Main {
    public static void main(String[] args) {

        Character[] c = new Character[3];
        c[0] = new Hero();
        c[0].name = "勇者";
        c[1] = new Thief();
        c[1].name = "盗賊";
        c[2] = new Wizard();
        c[2].name = "魔法使い";

        Monster[] monsters = new Monster[3];
        monsters[0] = new Slime();
        monsters[0].name = "スライム";
        monsters[1] = new Goblin();
        monsters[1].name = "ゴブリン";
        monsters[2] = new Matango();
        monsters[2].name = "マタンゴ";

        for (Character member : c) {
            for (Monster m : monsters) {
                member.attack(m);
            }
        }
    }
}