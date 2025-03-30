class I2{
    static String instituteName = "Default Institute";
	String courseName;
    int duration;
	double fee;
	
	I2(String courseName, int duration, double fee){
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
		I2 course1 = new I2("Java Programming",6,5000);
		course1.displayCourseDetails();
		
		I2.updateInstituteName("Tech Academy");
		
		I2 course2 = new I2("Python Programming", 8, 6000);
		course2.displayCourseDetails();
	}
}
	
