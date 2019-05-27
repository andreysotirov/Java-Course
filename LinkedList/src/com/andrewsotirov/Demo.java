package com.andrewsotirov;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Mladost");
        addInOrder(placesToVisit, "Drujba");
        addInOrder(placesToVisit, "Lulin");
        addInOrder(placesToVisit, "Vitosha");
        addInOrder(placesToVisit, "Center");
        addInOrder(placesToVisit, "Nadejda");

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> listToPrint) {
        Iterator<String> iterator = listToPrint.iterator();
        while (iterator.hasNext()) {
            System.out.println("Places to visit : " + iterator.next());
        }
        System.out.println("=========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparision = stringListIterator.next().compareTo(newCity);

            if (comparision == 0) {
                System.out.println(newCity + " is already on list.");
                return false;
            } else if (comparision > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            boolean goingForward = true;
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            goingForward = true;
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("You reached the end of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) ;
                        listIterator.previous();
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}

