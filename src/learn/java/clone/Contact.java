package learn.java.clone;

public class Contact {
    private Integer postCode;
    private String detail;

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postCode=" + postCode +
                ", detail='" + detail + '\'' +
                '}';
    }
}
