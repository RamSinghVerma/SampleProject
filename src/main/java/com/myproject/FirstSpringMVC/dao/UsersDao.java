package com.myproject.FirstSpringMVC.dao;

import java.util.List;

import com.myproject.FirstSpringMVC.model.Users;

public interface UsersDao {
public void addUser(Users u);
public void updateUser(int id);
public void removeUser(int id);
public Users getUserById(int id);
public List<Users> listUsers();
public boolean checkLogin(String userName, String userPassword);
}
