package com.test3;

public class test
{
    static void main(){
        int[] ans = new int[300];
        int digit = 1;    // 总位数
        int carry = 0;  // 进位
        ans[0] = 1;

        for(int i = 2; i <= 50; i++)
        {
            carry = 0;

            for(int j = 0; j < digit; j++)
            {
                int res = ans[j]*i + carry;
                carry = res / 10;
                ans[j] = res % 10;
            }
                if (carry > 0) {
                ans[digit] = carry % 10;
                carry /= 10;
                digit++;
                }
                if (carry > 0) {
                ans[digit] = carry % 10;
                carry /= 10;
                digit++;
                }
        }

        System.out.print("50 的阶乘是: " );
        for(int i = digit - 1; i >= 0; i--){
            System.out.print(ans[i]);
        }
        System.out.println("");
        System.out.println("50 的阶乘是: 30414093201713378043612608166064768844377641568960512000000000000");
    }
}

















