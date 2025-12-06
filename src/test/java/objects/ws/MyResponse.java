package objects.ws;

import java.util.Arrays;

public class MyResponse {
    String code;
    User[] data;

    public MyResponse(String code, User[] data) {
        this.code = code;
        this.data = data;
    }

    public MyResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User[] getData() {
        return data;
    }

    public void setData(User[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        MyResponse response = (MyResponse) o;
        return getCode().equals(response.getCode()) && Arrays.equals(getData(), response.getData());
    }

    @Override
    public int hashCode() {
        int result = getCode().hashCode();
        result = 31 * result + Arrays.hashCode(getData());
        return result;
    }

    @Override
    public String
    toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
