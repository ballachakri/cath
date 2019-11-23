package com.automationtests.dbTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

public class CountryDataBaseTest {

    private Connection con = null;
    private Statement statement = null;
    private String query = null;
    private ResultSet result = null;

    @Given("I have a database")
    public void i_have_a_database() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "admin");
    }

    @When("I enter the continent name {string}")
    public void i_enter_the_continent_name(String word) throws SQLException {
        query = "SELECT Name,Continent FROM country where Continent=" + "\'" + word + "\'";
        Statement statement = con.createStatement();
        result = statement.executeQuery(query);
    }

    @Then("I should view the countries in the continent")
    public void i_should_view_the_countries_in_the_continent() throws SQLException {
        while (result.next()) {
            System.out.println(result.getString(1) + "\t" + result.getString(2));
        }
        con.close();
    }

}
