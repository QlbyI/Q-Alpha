package ATM系统;

public class Account {
    /*
    确定私有类
     */

    //
    private String AID;
    private String passWord;
    private String userName;
    private double balanca;
    private double limit;

    //无参构造器

    public Account() {
    }

    //行为

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalanca() {
        return balanca;
    }

    public void setBalanca(double balanca) {
        this.balanca = balanca;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
