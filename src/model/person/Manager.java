package model.person;

import control.LibraryControl.Role;

import static control.LibraryControl.Role.MANAGER;

public class Manager extends Employee {


    public Manager(String id, String name, String email, String phoneNumber, Address address, String managerId) {

        super(id, name, email, phoneNumber, address, managerId);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Role getRole() {
        return MANAGER;
    }

    @Override
    public String getRoleAsString() {
        return MANAGER.toString();
    }
}
