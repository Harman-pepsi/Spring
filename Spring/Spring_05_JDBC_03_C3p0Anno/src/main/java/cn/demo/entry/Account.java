package cn.demo.entry;

/**
 * @Classname Account
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/11 1:02
 * @Version V1.0.0
 * @Since 1.0
 */
public class Account {

    private Integer acid;
    private String acname;
    private Double balance;

    public Integer getAcid() {
        return acid;
    }

    public void setAcid(Integer acid) {
        this.acid = acid;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{\"Account\":{"
                + "\"acid\":\"" + acid + "\""
                + ", \"acname\":\"" + acname + "\""
                + ", \"balance\":\"" + balance + "\""
                + "}}";
    }
}