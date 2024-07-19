package Lambda;
interface jayanth
{
    String run (String  str);
}
interface draw
{
     void draw();
}
interface subtraction

{
    int sub(int a, int b);

}

public interface Lambda1 {
    public static <s> void main(String[] args) {

        jayanth ja=(R) ->"hey" +R;
        draw d =()-> System.out.println("draw");
        subtraction ab =(a,b)->a-b;
        System.out.println(ja.run("yes"));
        d.draw();
        ab.sub(77,34);

    }
}
