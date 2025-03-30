class CourseDetails{
    static String instituteName = "Default Institute";
	String courseName;
    int duration;
	double fee;
	
	CourseDetails(String courseName, int duration, double fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	void displayCourseDetails(){
		System.out.println("\nCourse Name: "+ courseName);
		System.out.println("Duration: "+ duration);
		System.out.println("Fee: "+ fee);
		System.out.println("Institute Name: "+ instituteName);
	}
	static void updateInstituteName(String newName){
		instituteName = newName;
	}
	public static void main(String[] args){
		CourseDetails course1 = new CourseDetails("Java Programming",6,5000);
		course1.displayCourseDetails();
		
		CourseDetails.updateInstituteName("Tech Academy");
		
		CourseDetails course2 = new CourseDetails("Python Programming", 8, 6000);
		course2.displayCourseDetails();
	}
}
	
