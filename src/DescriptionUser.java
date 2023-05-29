public class DescriptionUser {
    public static void main(String[] args) {
        User tom = new User("Tom", 25);
        User aleks = new User("Aleks", 33);
        User angela = new User("Angela", 21);
        System.out.println(tom.toString() + "/" + tom.hashCode());
        System.out.println(aleks.toString() + "/" + aleks.hashCode());
        System.out.println(angela.toString() + "/" + angela.hashCode());
        User angela1 = new User("Angela",21);
        User tom1 = new User("Toom",25);
        System.out.println(angela.equals(angela1));
        System.out.println(tom.equals(tom1));
    }

}
