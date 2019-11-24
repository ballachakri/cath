package com.automationtests.dbTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

/**
 * Data base connection to extract data and assert.
 * Three methods should be written in another java class file.
 * one for connection, second to execute statement and third to return boolean for assertion
 * methods should be called in this step definition class and assert.
 * Note: no need of @before and @after methods to invoked.
 */
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
        List<String> countryList = new ArrayList<>();
        while (result.next()) {
            countryList.add(result.getString(1));
        }
             con.close();
        assertThat("Wrong data has been retrieved, please investigate",
                countryList, hasItem("India"));
        for(String country:countryList) {
            System.out.println(country);
        }
    }

}