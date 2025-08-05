import java.util.Scanner;
public class CustomerPurchaseAverage {
    public static void main(String [] args){
        System.out.println(
                "Enter Number of Customer:"
        );
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        double avg=0;
        for(int i=1; i<=n; i++){
            System.out.println(
                    "Enter number of items for customer "+i
            );
            double  k=sc.nextDouble();
            double sum=0;
            for(int j=1; j<=k; j++){
                System.out.println(
                        "Item- "+j+" price:"
                );
                double  price=sc.nextDouble();
                sum=sum+price;
            }
             avg=sum/k;
            System.out.println(
                    "Average for Customer- "+i+" :"+avg
            );
        }
    }
}
