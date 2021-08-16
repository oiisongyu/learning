package proxy.fomatMethod;

import java.util.Map;

/**
 * @author liusy
 * @since 2021/8/8下午8:56
 */
public abstract class AbstractPay {
    void doPay(String psn){
        if(isCheckParam()){
            System.out.println(beforePay(psn));
        }
        System.out.println(pay(psn));
        System.out.println(analysis(psn));
        System.out.println(success(psn));
    }

    boolean isCheckParam(){
        return false;
    };

    abstract String beforePay(String payBody);

    abstract String pay(String payBody);

    abstract String analysis(String payBody);

    abstract String success(String payBody);

}
