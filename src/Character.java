public abstract class Character implements Life{
    String name;
    int hp;

    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
    }

    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に5ポイントのダメージ");
    }
    public abstract void attack(Matango m);
}