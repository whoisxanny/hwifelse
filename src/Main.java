public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("You have an access");
        }else {
            System.out.println("You are too young, wait some amount of time");
        }



        int temperature = 4;
        if (temperature < 5) {
            System.out.println("The temperature outside is " + temperature + ". You should wear a hat.");
        }else {
            System.out.println("The temperature outside is " + temperature + ". There is no need to wear a hat.");
        }



        int carSpeed = 61;
        if (carSpeed > 60) {
            System.out.println("If your speed was " + carSpeed + ". You must pay a fine");
        }else {
            System.out.println("All's clear");
        }



        int agegg = 21;

        if (agegg > 2 && agegg < 6) {
            System.out.println("If the age of the human is " + agegg + ", he should go to kindegarten");
        }else if (agegg > 7 && agegg < 17) {
            System.out.println("If the age of the human is " + agegg + ", he should go to school");
        }else if (agegg >= 18 && agegg <= 24) {
            System.out.println("If the age of the human is " + agegg + ", he should go to the university");
        }else {
            System.out.println("It's about time to go and find a job, bruh");
        }


        int ageggg = 13;

        if (ageggg < 5) {
            System.out.println("If the child's age is " + ageggg + ", child can not go on rides");
        }else if (ageggg > 5 && ageggg < 14) {
            System.out.println("If the child's age is " + ageggg + ", child can not go on rides without parents");
        }else{
            System.out.println("He is free");
        }


        int placesHave = 102;
        int sittbleHave = 60;
        int peopleInside = 58;
        int peopleSitting = 13;

        if (peopleInside < 102 && peopleSitting < 60) {
            System.out.println("You can have a sit");
        }else if (peopleInside < 102 && peopleSitting >= 60) {
            System.out.println("YOu can just stand");
        }else {
            System.out.println("There is no place inside");
        }



        int one = 1;
        int two = 4;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one + " - is the biggest number");
        }else if (two > one && two > three) {
            System.out.println(two + " - is the biggest one");
        }else {
            System.out.println(three + " - is the biggest number");
        }
    }
}