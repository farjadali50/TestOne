public class allMethod {


    static void factorial() {
        int num = 10;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

        //return num; if i choose int in method then i have to un comment retrun
    }

    static void missingArray() {


        int total_num;
        int[] numbers = new int[]{1,2,3,4,6,7};
        total_num = 7;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i: numbers) {
            num_sum += i;

        }

        System.out.print( expected_num_sum - num_sum);
        System.out.print("\n");


    }
    static void fiboNa() {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }

    public static void main(String args[]){

        factorial();
        missingArray();
        fiboNa();

    }
}

