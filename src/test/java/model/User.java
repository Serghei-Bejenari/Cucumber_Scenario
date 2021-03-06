package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class User {
    private String userLoginId;
    private String firstName;
    private String lastName;
    private String cardNumber;
    private String password;
    private String expirationMonth;
    private String expirationYear;
    private List<Double> balanceHistory = new ArrayList<>();

    public User(String userLoginId, String password) {
        this.userLoginId = userLoginId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userLogInID='" + userLoginId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserLoginId(), user.getUserLoginId()) &&
                Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserLoginId(), getPassword());
    }
}
