package design_partner.builder;

import javax.rmi.CORBA.Util;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * @author liusy
 * @since 2021/9/12下午11:09
 */
public class Main {
    public static void main(String[] args) {
        CaseInfo build = new Builder().caseNo("123").payDate(new Date()).build();
        System.out.println(build);

        StringBuilder stringBuilder = new StringBuilder();
        String s = stringBuilder.append(1).toString();

        Payment build1 = new Payment.Builder(UUID.randomUUID().toString()).build();
        System.out.println(build1.toString());

//        Payment build2 = new Payment.Builder(UUID.randomUUID().toString()).amount(BigDecimal.ZERO).payDate(new Date()).status("1").build();
//        System.out.println(build2);

        CaseInfo build3 = new CaseInfo.Builder().caseNo("123").payDate(new Date()).build();
        System.out.println(build3);
    }
}
