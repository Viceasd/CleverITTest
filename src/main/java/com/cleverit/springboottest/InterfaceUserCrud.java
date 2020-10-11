package com.cleverit.springboottest;

import java.util.List;

public interface InterfaceUserCrud {

    Object findByIdUser(String idUser);
    Object editUser(Object user);
    List<Object> getUsers();
    boolean deleteUser(Object user);
}
