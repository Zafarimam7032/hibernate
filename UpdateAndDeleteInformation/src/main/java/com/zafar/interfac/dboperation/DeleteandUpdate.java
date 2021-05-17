
package com.zafar.interfac.dboperation;

import java.util.Scanner;

import org.hibernate.SessionFactory;

public interface DeleteandUpdate {
public void deleteid(SessionFactory factory,Scanner scanner);
public void deleteall(SessionFactory factory,Scanner scanner);
public void update(SessionFactory factory,Scanner scanner);
}
