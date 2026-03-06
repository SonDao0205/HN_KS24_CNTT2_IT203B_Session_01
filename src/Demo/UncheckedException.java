package Demo;

public class UncheckedException extends RuntimeException {
    int code; // mã lỗi
    public UncheckedException(String message) {
        super(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
