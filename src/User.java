public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User " + name + " " + age + " y.o.";
    }

    @Override
    public int hashCode() {
        return 10 * name.hashCode() + 20456;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        User p = (User) obj;
        return this.name.equals(p.name);
    }
}
