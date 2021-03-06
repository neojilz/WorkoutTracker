package com.workoutTracker.wt.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.workoutTracker.wt.intf.WorkoutServiceInterface;
import com.workoutTracker.wt.model.ActiveWorkout;
import com.workoutTracker.wt.request.ActiveWorkItemRequest;
import com.workoutTracker.wt.request.CategoryRequest;
import com.workoutTracker.wt.request.WorkItemRequest;
import com.workoutTracker.wt.response.CategoryResponse;
import com.workoutTracker.wt.response.WorkItemResponse;

@CrossOrigin(origins="*")
@RestController
public class WorkoutController {
		
	
	@Autowired
	WorkoutServiceInterface workoutServiceInterface;
	
	@RequestMapping(path="/getCategories",method=RequestMethod.GET)
	public List<CategoryResponse> getAllCategories(){
		System.out.print("Inside Controller");
		return workoutServiceInterface.getAllCategories();
		
	}
	
	@RequestMapping(path="/addCategory",method=RequestMethod.POST)
	public String addCategory(@RequestBody CategoryRequest categoryRequest){
		System.out.print(categoryRequest.toString());
		return workoutServiceInterface.addCategory(categoryRequest);
		
	}
	
	@RequestMapping(path="/deleteCategory",method=RequestMethod.POST)
	public String deleteCategory(@RequestBody CategoryRequest categoryRequest){
		System.out.print(categoryRequest.toString());
		return workoutServiceInterface.deleteCategory(categoryRequest);
		
	}
	
	@RequestMapping(path="/updateCategory",method=RequestMethod.POST)
	public String updateCategory(@RequestBody CategoryRequest categoryRequest){
		System.out.print(categoryRequest.toString());
		return workoutServiceInterface.updateCategory(categoryRequest);
		
	}
	
	
	@RequestMapping(path="/getWorkItems",method=RequestMethod.GET)
	public List<WorkItemResponse> getAllWorkItems(){
		System.out.print("Inside Controller");
		return workoutServiceInterface.getAllWorkItems();
		
	}
	
	@RequestMapping(path="/addWorkItem",method=RequestMethod.POST)
	public String addWorkItem(@RequestBody WorkItemRequest workITemRequest){
		System.out.println(workITemRequest.toString());
		return workoutServiceInterface.addWorkItem(workITemRequest);
	}
	

	
	@RequestMapping(path="/deleteWorkItem",method=RequestMethod.POST)
	public String deleteWorkItem(@RequestBody WorkItemRequest workITemRequest){
		System.out.println(workITemRequest.toString());
		return workoutServiceInterface.deleteWorkItem(workITemRequest);
	}
	
	@RequestMapping(path="/addActiveWorkItem",method=RequestMethod.POST)
	public String addWorkItem(@RequestBody ActiveWorkItemRequest activeRequest){
		System.out.println(activeRequest.toString());
		return workoutServiceInterface.addActiveWorkItem(activeRequest);
		//return "Success";
	}
	
	@RequestMapping(path="/getActiveWorkouts",method=RequestMethod.GET)
	public List<ActiveWorkout> getActiveWorkouts(){
		System.out.print("Inside Controller");
		return workoutServiceInterface.getActiveWorkouts();
		
	}

}
