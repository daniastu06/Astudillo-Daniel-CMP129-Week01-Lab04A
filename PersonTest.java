public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Daniel Astudillo");
        person1.setAge(20);
        person1.setmail("danielA@gmail.com");
        
        Person person2 = new Person();
        
        person2.setName("Felipe Castaneda");
        person2.setAge(18);
        person2.setmail("felipeC@gmail.com");

        System.out.println("First Person");
        person1.displayInfo();

        System.out.println("Second Person");
        person2.displayInfo();
    }
}
