class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayInfo(){
        System.out.println("Course: "+courseName+"\nDuration: "+duration+" weeks");
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Platform: "+platform+"\nRecorded: "+(isRecorded? "Yes":"No"));
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    void displayInfo(){
        super.displayInfo();
        double finalFee = fee - (fee * discount/100);
        System.out.println("Fee: "+fee+"\nDiscount: "+discount+"\nFinal Price: "+finalFee);
    }
}

