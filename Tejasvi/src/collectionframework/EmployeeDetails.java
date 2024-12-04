package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDetails {

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("EMPLOYEE DETAILS");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,List<String>> data=new HashMap<>();
		//data.put("ds101", "tejasvi");
		List<String> dataList=new ArrayList<>();
		/*
		data.put("2113986001", dataList);
		data.get("2113986001").add("Tim");
		data.get("2113986001").add("Project Manager");
		data.get("2113986001").add("PM");
		data.get("2113986001").add("$12000");
		data.get("2113986001").add("8894072283");
		data.get("2113986001").add("tim@gmail.com");
		//or
		dataList.add("Tim");
		dataList.add("Project Manager");
		dataList.add("PM");
		dataList.add("$12000");
		dataList.add("9981981981");
		dataList.add("tim@gmail.com");
		data.put("2113986001",dataList);
		System.out.println(data);
		*/
		dataList=Arrays.asList("Tim","Project Manager","Pm","$12000","19818288189","tim@gmail.com");
		data.put("2113986001", dataList);
		
		dataList=Arrays.asList("Ram","Project Lead","Pl","$12000","19818338189","ram@gmail.com");
		data.put("2113986002", dataList);
		System.out.println(data);
		for(Map.Entry<String,List<String>> entry: data.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	

}
