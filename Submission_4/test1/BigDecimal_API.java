package test1;

import java.math.BigDecimal;

public class BigDecimal_API
{

    public BigDecimal_API()
    {

        // 最好别用，基本不对
        BigDecimal b = new BigDecimal(0.01);
        BigDecimal b2 = new BigDecimal(0.09);
        System.out.println(b);
        System.out.println(b2);
        System.out.println();

        BigDecimal b3 = new BigDecimal("0.3232");
        BigDecimal b4 = BigDecimal.valueOf(0.008);
        System.out.println(b3);
        System.out.println(b4);
    }
}
