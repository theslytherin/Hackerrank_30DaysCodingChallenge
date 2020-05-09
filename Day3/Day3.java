import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int r=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0)
           r=1;
        else
        {
            if(N>=2&&N<=5)
            r=0;
            else
            if(N>=6&&N<=20)
            r=1;
            else
            r=0;
        }
        if(r==0)
        System.out.println("Not Weird");
        else
        System.out.println("Weird");
        scanner.close();
    }
}
