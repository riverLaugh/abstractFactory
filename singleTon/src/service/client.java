package service;

import bean.Computer;
import bean.Staff;
import dao.*;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            InputStream in = new BufferedInputStream(new
                    FileInputStream("D:\\23f\\ooad\\abstract_factory\\src\\singleTon\\src\\resource.properties"));
            prop.load(in);
            DaoFactoryImpl daoFactory = DaoFactoryImpl.getInstance(prop.getProperty("classname"));
            test(daoFactory.createStaffDao(), daoFactory.createComputerDao());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test(StaffDao staffDao, ComputerDao computerDao) {
        Scanner input = new Scanner(System.in);
        int op = -1;
        do {
            try {
                op = input.nextInt();
                switch (op) {
                    case 1:
                        staffDao.insertStaff(new Staff());
                        break;
                    case 2:
                        staffDao.updateStaff(1);
                        break;
                    case 3:
                        staffDao.deleteStaff(1);
                        break;
                    case 4:
                        computerDao.insertComputer(new Computer(1));
                        break;
                    case 5:
                        computerDao.updateComputer(1);
                        break;
                    case 6:
                        computerDao.deleteComputer(1);
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Exception " + e);
            }
        } while (op != 0);
    }
}
