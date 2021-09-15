package design_partner.builder;

import lombok.Data;

import java.util.Date;

/**
 * @author liusy
 * @since 2021/9/12下午11:03
 */
@Data
public class CaseInfo {
    private String caseNo;
    private Date payDate;

    private CaseInfo(Builder builder){
        this.caseNo = builder.caseNo;
        this.payDate = builder.payDate;
    }

    public static class Builder {
        private String caseNo;
        private Date payDate;

        public Builder (){

        }
        public Builder caseNo(String caseNo){
            this.caseNo = caseNo;
            return this;
        }

        public Builder payDate(Date payDate){
            this.payDate = payDate;
            return this;
        }

        public CaseInfo build(){
            return new CaseInfo(this);
        }

    }
}
