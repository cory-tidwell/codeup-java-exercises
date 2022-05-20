public class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.printf("Hello there from %s!%n You are %s years old!", this.name, this.age);
        }



        public static void main(String[] args) {
//        Person person1 = new Person("John", 36);

//        person1.sayHello();
//        Person person2 = new Person("John", 36);
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John", 36);
//        Person person3 = new Person("John", 36);
//        Person person2 = person1;
//        person1 = person3;
//        System.out.println(person2 == person1);

            Person person1 = new Person("John", 36);
            Person person2 = person1;
            System.out.println(person1.getName());
            System.out.println(person2.getName());
            person2.setName("Jane");
            System.out.println(person1.getName());
            System.out.println(person2.getName());


        }
    }

