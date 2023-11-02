public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("john",10,120,100,30,50);
        Fighter f2=new Fighter("alex",20,85,90,40,50);

        match match=new match(f1,f2,85,100);
        match.run();

    }
}
