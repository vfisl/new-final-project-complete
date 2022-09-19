package com.vfislk.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vfislk.training.exceptions.AgentNotFoundExcepion;
import com.vfislk.training.model.Agent;
import com.vfislk.training.model.Customer;
import com.vfislk.training.service.IAgentService;
import com.vfislk.training.service.ICustomerService;

//@RestController
public class AgentController {

	@Autowired
	IAgentService agentService;

	@PostMapping("/agents")
	public void addAgent(@RequestBody Agent agent) {
		agentService.addAgent(agent);
	}

	@PutMapping("/agents")
	public void updateAgent(@RequestBody Agent agent) {
		
	}

	@DeleteMapping("/agents/{agentId}")
	public void deleteAgent(@PathVariable("agentId") int agentId) {
		agentService.deleteAgent(agentId);
	}

	@GetMapping("/agents")
	List<Agent> getAllAgents(){
		return agentService.getAllAgents();
		
	}

	@GetMapping("/agents/state/{state}")
	List<Agent> getByState(@PathVariable("state") String state){
		return agentService.getByState(state);
		
	}

	@GetMapping("/agents/phoneNumber/{phoneNumber}")
	List<Agent> getByphoneNumber(@PathVariable("phoneNumber") long phoneNumber) {
		return agentService.getByphoneNumber(phoneNumber);
		
	}
	@GetMapping("/agents/planName/{planName}")
	List<Agent> getByPlans(@PathVariable("planName") String planName){
		return agentService.getByPlans(planName);
		
	}
  
	@GetMapping("/agents/premium/{premium}")
	List<Agent> getByPremium(@PathVariable("premium") double premium) {
		return agentService.getByPremium(premium);
		
	}
	@GetMapping("/agents/coverage/{coverage}")
	List<Agent> getByCoverage(@PathVariable("coverage") String coverage) {
		return agentService.getByCoverage(coverage);
		
	}
	@GetMapping("/agents/amount/{amount}")
	List<Agent> getByAmount(@PathVariable("amount") double amount){
		return agentService.getByAmount(amount);
		
	}
	@GetMapping("/agents/firstName/{firstName}/lastName/{lastName}")
	List<Agent> getByCustomer(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
		return agentService.getByCustomer(firstName, lastName);
		
	}
}
