package Demo;

public class CheckedException extends Exception {
    int code; // mã lỗi
    public CheckedException(String message) {
        super(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
