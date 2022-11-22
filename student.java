class student{
    String roll,name;
    double assignment1,assignment2,project,total;
    String grade;

    /*public student(){

    }
    */

    public student(String roll,String name,double assignment1,double assignment2,double project){
        this.roll = roll;
        this.name = name;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
        this.project = project;
    }

    
    public student() {
    }


    public void setRoll(String roll){
        this.roll = roll;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAssignment1(double assignment1){
        this.assignment1 = assignment1;
    }
    public void setAssignment2(double assignment2){
        this.assignment2 = assignment2;
    }
    public void setProject(double project){
        this.project = project;
    }


    public String getRoll(){
        return this.roll;
    }
    
    public String getName(){
        return this.name;
    }

    public double getAssignment1(){
        return this.assignment1;
    }
    
    public double getAssignment2(){
        return this.assignment2;
    }

    public double getProject(){
        return this.project;
    }

    
    public double calculate(){
        total = assignment1 + assignment2 + project;
        return total;
    }

    public String getGrade(){
        if(total < 50)
            grade = "F";
        else if(total >=50 && total <65)
            grade = "P";
        else if(total >=65 && total <75)
            grade = "C";
        else if(total >=75 && total <85)
            grade = "D";
        else if(total >=85)
            grade="HD";
        
        return grade;
    }


}