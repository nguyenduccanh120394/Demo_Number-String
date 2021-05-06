import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        System.out.println("Enter Number U Want Convert:?");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] arr = {"mươi", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (number<0){
            System.out.println("Input Unvalid");
        }
        if (number==1){
            System.out.printf("%s",arr[1]);
        }
    }
}