public class  StaticVsPublicChallenge {
    static int addFive(int number) {
        return number + 5;
    }
    static int addTwo(int number) {
        return number + 2;
    }
    public int divideByFive(int number){
        return number/5;
    }
    public int divideByTen(int number){
        return number/10;
    }
    public static void main(String[] args){
        StaticVsPublicChallenge test = new StaticVsPublicChallenge();
        int a = test.divideByFive(50);
        int b = test.divideByTen(100);
        int c = addFive(5);
        int d = addTwo(5);
        System.out.println("the results are " + a + b + c + d);
    }
}
