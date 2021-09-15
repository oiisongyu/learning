package design_partner.builder;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liusy
 * @since 2021/9/13上午12:30
 */
public class Payment {
    private String pmSerialNo;
    private BigDecimal amount;
    private Date payDate;
    private String status;

    private Payment(Builder builder) {
        this.pmSerialNo = builder.pmSerialNo;
        this.amount = builder.amount;
        this.payDate = builder.payDate;
        this.status = builder.status;
    }

    public static class Builder{
        //require
        private String pmSerialNo ;
        private BigDecimal amount;
        private Date payDate;
        //default
        private String status = "0";

        public Builder(String pmSerialNo){
            this.pmSerialNo = pmSerialNo;
        }

        public Builder amount(BigDecimal amount){
            //check
            if (amount.compareTo(BigDecimal.ZERO) <= 0){
                throw new IllegalArgumentException("金额不能小于等于0");
            }
            this.amount = amount;
            return this;
        }

        public Builder payDate(Date payDate){
            this.payDate = payDate;
            return this;
        }

        public Builder status(String status){
            this.status = status;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "pmSerialNo='" + pmSerialNo + '\'' +
                ", amount=" + amount +
                ", payDate=" + payDate +
                ", status='" + status + '\'' +
                '}';
    }
}
