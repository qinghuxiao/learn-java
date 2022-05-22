package learn.java.clone;

public class Application {

    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setPostCode(1001);
        contact.setDetail("VL USA");
        Staff source = new Staff();
        source.setName("John");
        source.setAge(19);
        source.setAddress(contact);
        Staff target = source;

        System.out.println("------assign------");
        System.out.println("source == target: " + (source == target));
        System.out.println();

        Staff clone = source.clone();
        System.out.println("------shallow clone------");
        System.out.println("source == clone: " + (source == clone));
        System.out.println("source: " + source);
        System.out.println("clone: " + clone);

        System.out.println("modify source");
        source.setName("Steff");
        source.setAge(35);
        source.getAddress().setPostCode(9000);
        source.getAddress().setDetail("PL CHN");
        System.out.println("source: " + source);
        System.out.println("clone: " + clone);
        System.out.println();

        Course course = new Course();
        course.setName("CS");
        Student origin = new Student();
        origin.setName("Linda");
        origin.setAge(23);
        origin.setCourse(course);
        Student deep = origin.clone();
        System.out.println("------deep clone------");
        System.out.println("origin == deep: " + (origin == deep));
        System.out.println("origin: " + origin);
        System.out.println("deep: " + deep);

        origin.setName("Amy");
        origin.setAge(18);
        origin.getCourse().setName("BI");
        System.out.println("modify origin");
        System.out.println("origin: " + origin);
        System.out.println("deep: " + deep);
    }
}
