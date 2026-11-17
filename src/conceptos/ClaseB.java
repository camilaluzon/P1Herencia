package conceptos;

public class ClaseB extends ClaseA{
    private int num3;

    public ClaseB(int num1, int num2, int num3) {
        super(num1, num2);
        System.out.println("Constructor ClaseB");
        this.num3 = num3;
    }
}
