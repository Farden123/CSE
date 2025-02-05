import java.util.*;

class Homework91{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(Prime(3));
        System.out.println(Perfect(33));
        int number = sc.nextInt();
        System.out.println(special(number));
    }

    public static int special(int number ){
        int sum=0;
        for(int i =0;i<number;i++){
            if(Prime(i)||Perfect(i)){
                sum+=i;
            }
        }
        return sum;
    }

    public static boolean Perfect(int number){
        int sum=0;
        for(int i=0;i<=number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean Prime(int number ){
        int count =0;
        for(int i = 0; i < number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
}
