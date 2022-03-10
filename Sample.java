//Resolved conflict and merged branch
public class Sample {
    //adding few lines in new branch
    static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b) {
        return a - b;
    }
    //adding few lines in main branch in git
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;

    }
    public static void main(String args[]){
        System.out.println("Hello World");

        int ra = add(10,20);
        int rs = sub(20,10);
        int rm = mul(5,4);
        int rd = div(20,2);
        System.out.println(ra);
        System.out.println(rs);

    }

}
