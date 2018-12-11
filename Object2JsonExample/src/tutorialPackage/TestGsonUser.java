package tutorialPackage;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestGsonUser {
    public static void main(String[] argv) {
        Company company = Company.getCompanyDummy();
 
        System.out.println("========= Object => Json ==========");
        String company2Json = new Gson().toJson(company);
        System.out.println(company2Json);
 
        System.out.println("========= Json => Object =========");
        Company json2Company = new Gson().fromJson(company2Json, Company.class);
        printCompanyObject(json2Company);
 
        System.out.println("========= Object => Json =========");
        String company2JsonIsNull = new GsonBuilder().serializeNulls().create().toJson(company);
        System.out.println(company2JsonIsNull);
 
        System.out.println("========= Json => Object =========");
        Company json2CompanyIsNull = new Gson().fromJson(company2Json, Company.class);
        printCompanyObject(json2CompanyIsNull);
    }
 
    private static void printCompanyObject(Company company) {
    	ArrayList<Company.Person> personList = company.getEmployees();
        System.out.println("userName: " + company.getName());
        for (Company.Person person : personList) {
            System.out.println(person);
        }
    }
}
