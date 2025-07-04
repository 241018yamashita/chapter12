public abstract class Monster implements Life{
    int hp;
    String name;

    public void run() {
        System.out.println("モンスターは逃げ出した。");
    }

}