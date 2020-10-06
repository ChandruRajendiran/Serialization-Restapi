package org.vip2.Serialization;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Sample  extends Base{
	
	

	public static void main(String[] args) throws IOException {
		String s=getData("username");
		String s1=getData("password");
		// TODO Auto-generated method stub
		PreemptiveBasicAuthScheme ss= new PreemptiveBasicAuthScheme();
		ss.setUserName("s");
		ss.setPassword("s1");
	
		
		RequestSpecBuilder spec= new RequestSpecBuilder();
		
		RequestSpecification requestspe=spec.addHeader("Content-Type", "application/json").setContentType(ContentType.JSON).setAuth(ss).setBaseUri("https://chandruautomation11.atlassian.net")
				.build();
		
		//RestAssured.baseURI="https://chandruautomation11.atlassian.net";
		Project project= new Project();
	project.setKey("TES");
		IssueType issuetype= new IssueType();
		issuetype.setName("Bug");
		Fields fields = new Fields();
		fields.setProject(project);
		fields.setSummary("Login not working AT THE MOMENT22");
		fields.setDescription("Login not workiing ON  A MOMENT11");
		fields.setIssuetype(issuetype);
	Account account = new Account();
	account.setFields(fields);
	ResponseSpecBuilder spenc= new ResponseSpecBuilder();
	
	ResponseSpecification spec23= spenc.expectStatusCode(201).expectContentType(ContentType.JSON).build();


	//
	Output post=RestAssured.given().spec(requestspe).body(account).when().post("/rest/api/2/issue").
	then().spec(spec23).extract().as(Output.class);
System.out.println(post.getId());
System.out.println(post.getKey());
System.out.println(post.getSelf());
//	System.out.println(post.getStatusCode());
//	System.out.println(post.body().asString());
	
	}

}
