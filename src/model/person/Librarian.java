package model.person;

import static control.LibraryControl.Role;
import static control.LibraryControl.Role.LIBRARIAN;

public class Librarian extends Employee {

    public Librarian(String id, String name, String email, String phoneNumber, String managerId) {

        super(id, name, email, phoneNumber, managerId);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Role getRole() {
        return LIBRARIAN;
    }

    @Override
    public String getRoleAsString() {
        return LIBRARIAN.toString();
    }
}
