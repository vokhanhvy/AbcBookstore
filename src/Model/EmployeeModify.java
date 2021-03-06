/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * CRUD (insert, update, delete, findAll)
 * @author KHANH VY
 */
public class EmployeeModify {

    public static ArrayList findAll() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        try {
            connection = SqlConnection.connectDB();
            //querry
            String sql = "select * from Employees";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Employee emp = new Employee(resultSet.getInt("EmpId"),
                                            resultSet.getString("EmpName"),
                                            resultSet.getString("UserName"),
                                            resultSet.getString("PassWord"),
                                            resultSet.getString("Address"),
                                            resultSet.getString("Position"),
                                            resultSet.getDate("Birthday"),
                                            resultSet.getDate("Startdate"),
                                            resultSet.getLong("Salary")
                );
                employeeList.add(emp);
        } 
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //end here
        return employeeList;
    }
    
    public static void insert(Employee emp){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = SqlConnection.connectDB();
            //querry
            String sql = "insert into Employees(EmpName, UserName, PassWord, Address, Birthday, Startdate, Position, Salary) values(?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, emp.getEmpName());
            statement.setString(2, emp.getUserName());
            statement.setString(3, emp.getPassword());
            statement.setString(4, emp.getAddress());
            
            java.util.Date birthday1 = emp.getBirthday();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String sqlBirthday = dateformat.format(birthday1);
            
            statement.setString(5, sqlBirthday);
            
            java.util.Date startdate1 = emp.getStartDate();         
            String sqlstartdate = dateformat.format(startdate1);
            
            statement.setString(6, sqlstartdate);
            statement.setString(7, emp.getPosition());
            statement.setDouble(8, emp.getSalary());
            
            statement.execute();
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    
    public static void update(Employee emp){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = SqlConnection.connectDB();
            //querry
            String sql = "update Employees set EmpName=?, UserName=?, PassWord=?, Address=?, Birthday=?, Startdate=?, Position=?, Salary=? where EmpId=?";
            statement = connection.prepareCall(sql);
            statement.setString(1, emp.getEmpName());
            statement.setString(2, emp.getUserName());
            statement.setString(3, emp.getPassword());
            statement.setString(4, emp.getAddress());
            
            java.util.Date birthday1 = emp.getBirthday();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String sqlBirthday = dateformat.format(birthday1);
            
            statement.setString(5, sqlBirthday);
            
            java.util.Date startdate1 = emp.getStartDate();         
            String sqlstartdate = dateformat.format(startdate1);
            
            statement.setString(6, sqlstartdate);
            statement.setString(7, emp.getPosition());
            statement.setDouble(8, emp.getSalary());
            statement.setInt(9, emp.getEmpId());
            
            statement.execute();
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }   
    }
    
    public static void delete(int id){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = SqlConnection.connectDB();
            //querry
            
            String sql = "delete from Employees where EmpId=?";
            
            statement = connection.prepareCall(sql);
            statement.setInt(1, id);
            
            statement.execute();
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }   
    }  
    
    
    
    public static void resetIncrement() {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = SqlConnection.connectDB();
            //querry

            String sql = "declare @max int; select @max = max(EmpId) from Employees;dbcc checkident(Employees, reseed, @max)";

            statement = connection.prepareCall(sql);

            statement.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public static ArrayList search(String txt) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = SqlConnection.connectDB();
            //querry
            String sql = "select * from Employees where concat('.', EmpName, '.', Address, '.', Position, '.') like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%.%" + txt +"%.%");
            
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Employee emp = new Employee(resultSet.getInt("EmpId"),
                                            resultSet.getString("EmpName"),
                                            resultSet.getString("UserName"),
                                            resultSet.getString("PassWord"),
                                            resultSet.getString("Address"),
                                            resultSet.getString("Position"),
                                            resultSet.getDate("Birthday"),
                                            resultSet.getDate("Startdate"),
                                            resultSet.getLong("Salary")
                );
                employeeList.add(emp);
        } 
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //end here
        return employeeList;
    }
    
    //Method to check if username and password is valid
    public static Employee checkLogin(String user, String pass) {
        
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = SqlConnection.connectDB();
            //querry
            String sql = "select * from Employees where UserName=? and PassWord=?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, user);
            statement.setString(2, pass);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Employee emp = new Employee(resultSet.getInt("EmpId"),
                                            resultSet.getString("EmpName"),
                                            resultSet.getString("UserName"),
                                            resultSet.getString("PassWord"),
                                            resultSet.getString("Address"),
                                            resultSet.getString("Position"),
                                            resultSet.getDate("Birthday"),
                                            resultSet.getDate("Startdate"),
                                            resultSet.getLong("Salary")
                );
                return emp;
        } 
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //end here
        return null;
    }
}
