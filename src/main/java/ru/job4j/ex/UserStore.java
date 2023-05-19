package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User name : users) {
            if (name.getUsername().equals(login)) {
                rsl = name;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User name not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Invalid username");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Max", true),
                    new User("Dima", true),
                    new User("Semen", true),
                    new User("Bob", true),
            };
            User user1 = findUser(users, "Max");
            User user2 = findUser(users, "Dima");
            User user3 = findUser(users, "Semen");
            User user4 = findUser(users, "Bob");
            if (validate(user1)) {
                System.out.println("Welcome");
            } else if (validate(user2)) {
                System.out.println("Welcome");
            } else if (validate(user3)) {
                System.out.println("Welcome");
            } else if (validate(user4)) {
                System.out.println("Welcome");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}
