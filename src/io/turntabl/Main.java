package io.turntabl;

public class Main {

    public static void main(String[] args) {
        // ********* DIRECTOR ****************

        User user1 = new User.UserBuilder("Yaa", "Turntabl")
                .age(9)
                .phone("1234567")
                .address("Yaddress 1234")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Erbynn", "Turntabl")
                .age(23)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Bill", "Turntabl")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}

