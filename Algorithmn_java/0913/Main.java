public class Main {

    public static void main(String[] args) {
        System.out.println(solution(108, 45));
    }

    // solution
    private static int solution(int first, int second) {
        return first * second / gcd(first, second);
    }

    private static int gcd(int first, int second) {
        //큰 수를 작은수로 나눈다
        //나온 나머지로 작은수를 나눈다.
        //나온 나머지로 아까 나머지를 나눈다.
        int remainder = 0;
        if(first < second) {
            int tmp = first; 
            first = second;
            second = tmp;
        }

        while((remainder = first % second) != 0) {
            first = second;
            second = remainder;
        }
        return second;
    }


}