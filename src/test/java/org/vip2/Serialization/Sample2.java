package org.vip2.Serialization;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		RestAssured.baseURI="https://chandruautomation11.atlassian.net";
		Project2 pro= new Project2();
		pro.setKey("TES");
		
	pro.setId("10110");
		IssueType2 type= new IssueType2();
		//type.setName("Bug");
		type.setId("1");
		Fields2 filed= new Fields2();
		filed.setProject(pro);
		filed.setDescription("chandruone and oley");
		filed.setSummary("nature of c");
		filed.setIssuetype(type);
		Account2 acc= new Account2();
		acc.setFields(filed);
Response re=RestAssured.given().header("Content-Type","application/json").auth().preemptive().basic("chandrurajendiran343@gmail.com", "AxvaKL1EJOKY7Mnw6hvQE8D2").body(acc).when().post("/rest/api/2/issue");
	
System.out.println(re.getStatusCode());
System.out.println(re.body().asString());
	}
		
	}
	