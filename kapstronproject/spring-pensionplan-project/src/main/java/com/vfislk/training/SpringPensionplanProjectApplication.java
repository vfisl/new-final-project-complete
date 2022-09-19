package com.vfislk.training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vfislk.training.model.Agent;
import com.vfislk.training.model.Coverage;
import com.vfislk.training.model.Customer;
import com.vfislk.training.model.Nominee;
import com.vfislk.training.model.Occupation;
import com.vfislk.training.model.Plans;
import com.vfislk.training.model.Relationship;
import com.vfislk.training.service.IAgentService;
import com.vfislk.training.service.ICustomerService;
import com.vfislk.training.service.INomineeService;
import com.vfislk.training.service.IPlansService;

@SpringBootApplication
public class SpringPensionplanProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringPensionplanProjectApplication.class, args);
	}

	@Autowired
	IAgentService agentService;

	@Autowired
	ICustomerService customerService;

	@Autowired
	IPlansService plansService;

	@Autowired
	INomineeService nomineeService;

	@Override
	public void run(String... args) throws Exception {

//		Nominee nominee1 = new Nominee("Virat", 35, "6360359939", Relationship.BROTHER);
//		Nominee nominee2 = new Nominee("Rahul", 25, "7562323939", Relationship.FATHER);
//		Nominee nominee3 = new Nominee("Pramod", 60, "8660458636", Relationship.HUSBAND);
//		Nominee nominee4 = new Nominee("Joe", 45, "6360359939", Relationship.MOTHER);
//		Nominee nominee5 = new Nominee("Sita", 28, "7562323958", Relationship.SISTER);
//		Nominee nominee6 = new Nominee("Nikita", 30, "7660458621", Relationship.WIFE);
//		Nominee nominee7 = new Nominee("Surekha", 40, "6360359945", Relationship.FATHER);
//		Nominee nominee8 = new Nominee("Sita", 46, "8772323939", Relationship.BROTHER);
//		Nominee nominee9 = new Nominee("Poornima", 35, "4660458620", Relationship.WIFE);
//		Nominee nominee10 = new Nominee("Root", 48, "9660458645", Relationship.SISTER);
//
//		Set<Nominee> nominees1 = new HashSet<>(Arrays.asList(nominee1, nominee2));
//		Set<Nominee> nominees2 = new HashSet<>(Arrays.asList(nominee3, nominee4));
//		Set<Nominee> nominees3 = new HashSet<>(Arrays.asList(nominee5, nominee6));
//		Set<Nominee> nominees4 = new HashSet<>(Arrays.asList(nominee7, nominee8));
//		Set<Nominee> nominees5 = new HashSet<>(Arrays.asList(nominee9, nominee10));
//
//		Customer customer1 = new Customer("Pramod", "Anachimath", "14/06/1999", "pramodanachimath@gmail.com",
//				"9695632144", 23, Occupation.SALARIED, nominees1);
//		Customer customer2 = new Customer("Virat", "Kohli", "05/011/1988", "viratkohli@gmail.com", "6895632145", 32,
//				Occupation.SALARIED, nominees2);
//		Customer customer3 = new Customer("Guru", "Itagi", "11/10/1998", "Pramod@gmail.com", "5895632142", 24,
//				Occupation.SELFEMPLOYEED, nominees3);
//		Customer customer4 = new Customer("Rahul", "Dravid", "11/01/1973", "rahuldravid@gmail.com", "4895632143", 45,
//				Occupation.SELFEMPLOYEED, nominees4);
//		Customer customer5 = new Customer("Rohit", "Sharma", "30/04/1987", "rohitsharma@gmail.com", "3895632144", 33,
//				Occupation.STUDENT, nominees5);
//
//		Set<Customer> customers = new HashSet<>(Arrays.asList(customer1, customer2));
//		Agent agent1 = new Agent("Root", "Karnataka", "6360355939", customers);
//		agentService.addAgent(agent1);
//
//		Set<Customer> ncustomers = new HashSet<>(Arrays.asList(customer3, customer4));
//		Agent agent2 = new Agent("Joe", "Hydrabad", "7895631149", ncustomers);
//		agentService.addAgent(agent2);
//
//		Set<Customer> mcustomers = new HashSet<>(Arrays.asList(customer5));
//		Agent agent3 = new Agent("Amith", "Karnataka", "8762323939", mcustomers);
//		agentService.addAgent(agent3);
//
//		Set<Agent> agents = new HashSet<>(Arrays.asList(agent1, agent2));
//		Set<Agent> nagents = new HashSet<>(Arrays.asList(agent3));
//		Plans plans1 = new Plans("Aditya Birla Sunlife Empower Pension Plan", 25, "5-30", 18000, 500000,
//				Coverage.PARENTS, agents);
//
//		Plans plans2 = new Plans("Aegon Life Guaranteed Income Advantage Plan", 20, "25-55", 10000, 200000,
//				Coverage.SHARING, nagents);
//
//		plansService.addPlans(plans1);
//		plansService.addPlans(plans2);
//
//		System.out.println("Get All");
//		agentService.getAllAgents().forEach(System.out::println);

		Nominee nominee1 = new Nominee("satya", 35, "6160359939", Relationship.BROTHER);
		Nominee nominee2 = new Nominee("Ram", 25, "7262323939", Relationship.FATHER);
		Nominee nominee3 = new Nominee("Pramod", 60, "8360458636", Relationship.HUSBAND);
		Nominee nominee4 = new Nominee("Lakshman", 45, "6460359939", Relationship.MOTHER);
		Nominee nominee5 = new Nominee("Guru", 28, "7462323958", Relationship.SISTER);
		Nominee nominee6 = new Nominee("Rakshita", 30, "7560458621", Relationship.WIFE);
		Nominee nominee7 = new Nominee("Roopa", 40, "6760359945", Relationship.BROTHER);
		Nominee nominee8 = new Nominee("Vignesh", 46, "8872323939", Relationship.MOTHER);
		Nominee nominee9 = new Nominee("Anand", 35, "4960458620", Relationship.WIFE);
		Nominee nominee10 = new Nominee("Andy", 48, "9160458645", Relationship.HUSBAND);


		Set<Nominee> nominees1 = new HashSet<>(Arrays.asList(nominee1, nominee2));
		Set<Nominee> nominees2 = new HashSet<>(Arrays.asList(nominee3, nominee4));
		Set<Nominee> nominees3 = new HashSet<>(Arrays.asList(nominee5, nominee6));
		Set<Nominee> nominees4 = new HashSet<>(Arrays.asList(nominee7, nominee8));
		Set<Nominee> nominees5 = new HashSet<>(Arrays.asList(nominee9, nominee10));

		Customer customer1 = new Customer("Sachin", "Tendulakar", "14/06/1999", "sachin199@gmail.com", "7195632149", 40,
				Occupation.STUDENT, nominees1);
		Customer customer2 = new Customer("Virandra", "Shehavag", "7/07/1981", "virandra@gmail.com", "8295632148",
				30, Occupation.UNEMPLOYEED, nominees2);
		Customer customer3 = new Customer("Harbajan", "Sing", "04/10/1997", "harbajan@gmail.com", "9395632147", 24,
				Occupation.UNEMPLOYEED, nominees3);
		Customer customer4 = new Customer("Mohammad", "Yusuf", "25/05/1999", "mohammadyusuf@gmail.com",
				"2495632146", 31, Occupation.SALARIED, nominees4);
		Customer customer5 = new Customer("Yuvaraj", "Sing", "23/06/1990", "yuvarajsing@gmail.com", "9855632145", 25,
				Occupation.SELFEMPLOYEED, nominees5);
		
		
		Set<Customer> customers=new HashSet<>(Arrays.asList(customer1,customer2));
		Agent agent1 = new Agent("Dinga", "Karnataka", "6365355939", customers);
//		agentService.addAgent(agent1);
		
		
		
		Set<Customer> ncustomers=new HashSet<>(Arrays.asList(customer3,customer4));
		Agent agent2 = new Agent("Dingi", "Hydrabad", "7895638149", ncustomers);
//		agentService.addAgent(agent2);
		
		
		
		Set<Customer> mcustomers=new HashSet<>(Arrays.asList(customer5));
		Agent agent3 = new Agent("Rohit", "Karnataka", "8762323139", mcustomers);
//		agentService.addAgent(agent3);

		
		Set<Agent> agents=new HashSet<>(Arrays.asList(agent1));
		Set<Agent> nagents=new HashSet<>(Arrays.asList(agent2));
		Set<Agent> magents=new HashSet<>(Arrays.asList(agent3));
		Plans plans1 = new Plans("Exide Life Golden years Retirement Plan", 25, "10-42", 18000, 500000,
				Coverage.SINGLEPLUSHEALTH, agents);
		Plans plans2 = new Plans("Future Generali - Big Dreams Pension Scheme", 18, "5-20", 60000, 500000,
				Coverage.SINGLE, nagents);
		Plans plans3 = new Plans("HDFC Life Click 2 Retire", 18, "10-35", 24000, 500000, Coverage.SHARING, magents);


//		plansService.addPlans(plans1);
//		plansService.addPlans(plans2);
//		plansService.addPlans(plans3);

		System.out.println("Get All");
		agentService.getAllAgents().forEach(System.out::println);
		
//		plansService.deletePlans(12);

	}

}
