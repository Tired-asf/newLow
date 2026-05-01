import java.util.Scanner;

public class Test5 {
    public static void main(String args[]){
        String s1="Hello";
        String s2="Hello";
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the name of your college");
        String collegeName = sn.nextLine();
        System.out.println("College Name: " + collegeName);
        
        String s3=new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
