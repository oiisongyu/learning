package design_partner.builder;

import java.util.Date;

/**
 * @author liusy
 * @since 2021/9/12下午11:05
 */
public class Builder {
    private CaseInfo caseInfo = new CaseInfo.Builder().build();

    Builder caseNo(String caseNo){
        this.caseInfo.setCaseNo(caseNo);
        return this;
    }

    Builder payDate(Date payDate){
        this.caseInfo.setPayDate(payDate);
        return this;
    }

    CaseInfo build(){
        return this.caseInfo;
    }

}
