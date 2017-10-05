package by.amushinsky;

import by.amushinsky.builders.*;


public class Main {

    public static void main(String[] args) {

        // -----------------------------------------------------------------------------------------------------------

        User user1 = new Builder1NoSafety()
                .withFirstName("John")
                .withLastName("Smith")
                .build();

        user1.getAge().ifPresent(System.out::println); // Ok
        System.out.println(user1.getLastName().equals("Smith")); // NullPointerException ?!!






























        // -----------------------------------------------------------------------------------------------------------

        User user2 = new Builder2SafeButWhatTheDifference("John", "Smith")
                .withAge(40)
                .build();

        System.out.println(user2.getLastName().equals("Smith")); // Ok































        // -----------------------------------------------------------------------------------------------------------

        User user3 = Builder3SafeInterfaces.builder()
                .withFirstName("John")
                .withLastName("Smith")
                .withAge(40)
                .build();

        System.out.println(user3.getLastName().equals("Smith")); // Ok




























        // -----------------------------------------------------------------------------------------------------------

        User user4 = Builder4SafePhantomTypes.build(Builder4SafePhantomTypes.builder()
                .withLastName("Smith")
                .withAge(12)
                .withFirstName("John"));

        System.out.println(user4.getLastName().equals("Smith")); // Ok




































        // -----------------------------------------------------------------------------------------------------------

        User user5 = Builder5SafeTypeEvidence.builder()
                .withFirstName("John", TypeEvidence.typeEquals())
                .withLastName("Smith", TypeEvidence.typeEquals())
                .withAge(40, TypeEvidence.typeEquals())
                .build(TypeEvidence.typeEquals());

        System.out.println(user5.getLastName().equals("Smith")); // Ok





























    }
}
