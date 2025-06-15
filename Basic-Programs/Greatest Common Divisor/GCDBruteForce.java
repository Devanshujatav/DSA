    import java.util.ArrayList;
    import java.util.Scanner;

    public class GCDBruteForce {

        static void GreatestCommonDivisor(int x , int y){

            ArrayList<Integer> list = new ArrayList<>();

            for (int i=x ; i>0; i--){
                if (x%i==0 && y%i==0){
                    list.add(i);
                }
            }

            System.out.println("GDC : " +list.get(0));
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the First Divisor : ");
            int x = sc.nextInt();

            System.out.print("Enter the Second Divisor : ");
            int y = sc.nextInt();

            GreatestCommonDivisor(x , y);
        }
    }
