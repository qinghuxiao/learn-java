package learn.java.clone;

public class Staff implements Cloneable {
    private String name;
    private Integer age;
    private Contact contact;

    public Contact getAddress() {
        return contact;
    }

    public void setAddress(Contact contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Staff clone() {
        try {
            return (Staff) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + contact +
                '}';
    }
}
