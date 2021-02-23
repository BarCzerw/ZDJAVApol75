package wstepoop.homework.interfaces.zadanie4;

public class User {

    String name;
    int age;
    String login;
    String password;

    public User() {
        this.name = "";
        this.age = 0;
        this.login = "";
        this.password = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name, Validator<String> validator) {
        if (validator.validate(name)) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, Validator<Integer> validator) {
        if (validator.validate(age)) {
            this.age = age;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator<String> validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
