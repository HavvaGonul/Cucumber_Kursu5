package StepDefinitions;

import Utilities.DBUtility;
import io.cucumber.java.en.Then;

import java.util.ArrayList;

public class _11_JDBCStates {
    @Then("Send The query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        //DB den gerekli bilgileri alalim
        ArrayList<ArrayList<String >> dbList= DBUtility.getListData(sorgu);
        for (int i = 0; i < dbList.size(); i++) {
            System.out.println(dbList.get(i).get(1));

        }
    }
}
