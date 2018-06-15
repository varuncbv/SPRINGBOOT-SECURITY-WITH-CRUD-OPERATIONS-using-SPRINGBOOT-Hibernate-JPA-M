package com.letsstartcoding.springboothibernate.dao;



public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
