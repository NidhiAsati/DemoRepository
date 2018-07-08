package com.qa.util;


/**
 * 
 *First we hv to download GIT
 *then go to particular project pathfrom cmd
 *then give the command "init" for initializing the git
 *then go to github
 *click start button
 *Give the repository name and description
 *then select the first line from "we want to push the existing repository from cmd"
 *and paste in cmd...and now we are linked in remote origin repository "DemoRepository" from project path
 *
 *Now we want to push(checkin) our code:
 *first we hv to add all library means complete folder we have to add
 *First we hv to check current status(What are files is pending to add
 *So to know the current status
 *give the command "git status"
 *Now can see the pending files in red color
 *Then give the command "git add ."  Means add the complete project directly
 *
 *Now before check in the code we hv to commit the code
 *So give the command "git commit -n "First git commit for my selenium code"   
 	//////////// Here -n means comment, u hv to comment that what exactly u want to commit..lets see tomorrow u hv some changes in home page, so u hv to write updated home page method or whatever
 * 
 *
 * 
 * 
 * 
 * @author user
 *
 */
public class TestUtil {
	public void testUtil() {
		System.out.println("Test Util");
	}

}
