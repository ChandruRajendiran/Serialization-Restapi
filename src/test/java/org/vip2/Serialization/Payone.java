package org.vip2.Serialization;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Payone {
	
	public static void main(String[] args) {
		InputPaylod p= new InputPaylod();
		List<Data>data= new ArrayList<Data>();
		
		RestAssured.baseURI="https://chandruautomation11.atlassian.net";
		
		Data data1 = new Data();
		data1.setId(20);
		data1.setEmail("chandru@gmail.com");
		data1.setFirst_name("chandru");
		data1.setLast_name("char");
		data1.setAvatar("emou");
		
		Data data2 = new Data();
		
		data1.setId(21);
		data1.setEmail("chandru2222@gmail.com");
		data1.setFirst_name("chandru222");
		data1.setLast_name("char222");
		data1.setAvatar("emo222u");
		
		data.add(data1);
		data.add(data2);
		
		p.setPage(66);
		p.setData(data);
		p.setPer_page(3);
		p.setTotal(87);
		p.setTotal_page(76);
		
		Ad ad= new Ad();
		ad.setCompany("chandruone");
		ad.setText("msa");
		ad.setUrl("hexaware.com");
		p.setAd(ad);
		Final f= new Final();
		f.setAd(ad);
		f.setData2(data);
				
		Response post=	RestAssured.given().header("Content-Type","application/json").auth().preemptive().
				basic("chandrurajendiran343@gmail.com", "AxvaKL1EJOKY7Mnw6hvQE8D2").body(f).when()
	.post("/api/users?page=2");
		
		System.out.println(post.getStatusCode());
		System.out.println(post.body().asString());

		
	}

}
