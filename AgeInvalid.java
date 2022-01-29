public class AgeInvalid extends Exception {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public AgeInvalid(String msg) {
        this.msg = msg;
    }
}
