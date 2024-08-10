package com.dhk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReference {

    public static void main(String[] args) {


//        staticMethodReference();
//        particularTypeObjectReference();
        methodReferenceToInstance();
    }
    /*
     Reference to a Static Method
     */
    private static void staticMethodReference(){
        List<User> userList = Arrays.asList(
                new User(100, "Rahul"),
                new User(101, "Shyam"),
                new User(102, "")
        );
        //  with lambda expression
        boolean isValud = userList.stream().anyMatch(user -> User.isValidUser(user));
        //  with static method reference
        isValud = userList.stream().anyMatch(User::isValidUser);
        System.out.println("is Valid User = " + isValud);

    }

    /*
    Reference to an Instance Method
     */
    private static void methodReferenceToInstance(){
        List<User> userList = Arrays.asList(
                new User(100, "Rahul"),
                new User(101, "Shyam"),
                new User(102, "")
        );
        User user = new User(200,"Ramesh");

        boolean isLegalName = userList.stream().anyMatch(user::isLegalName);
        System.out.println("isLegalName = " + isLegalName);

    }

    /*
    Reference to an Instance Method of an Object of a Particular Type
     */
    private static void particularTypeObjectReference(){
        List<String > stringList = Arrays.asList("", "my","name","is","","kumar");

        long count = stringList.stream().filter(String::isBlank).count();
        System.out.println("Blank string in the list is : "+count);
    }

    private static void constructorReference(){


    }
}
