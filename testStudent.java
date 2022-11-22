import java.util.*;
class testStudent{
    public static void main(String args[]){
        int i,count=0,ch=0;

        String roll="",name="";
        double assignment1=0,assignment2=0,project=0;
    
        
        double min=100,max=0,avg=0;
        
        double ans=0;

        student st[] = new student[10];

        
        Scanner cs = new Scanner(System.in);
        do{
            System.out.println("\n1. Enter Student record  \n2. Display all students grade  \n3. Display statistics \n4. Exit");
            
            System.out.println("Enter your choice:");
            ch = cs.nextInt(); 
            
            switch(ch){
                case 1: st[count] = new student();
                            System.out.println("Enter Student roll number : ");
                            roll= cs.next();

                            System.out.println("Enter Student name : ");
                            name = cs.next();

                            System.out.println("Enter Assignment 1 marks : ");
                            assignment1 = cs.nextDouble();

                            System.out.println("Enter Assignment 2 marks : ");
                            assignment2 = cs.nextDouble();

                            System.out.println("Enter Project marks : ");
                            project = cs.nextDouble();

                        
                        st[count].setRoll(roll);
                        st[count].setName(name);
                        st[count].setAssignment1(assignment1);
                        st[count].setAssignment2(assignment2);
                        st[count].setProject(project);

                        count++;

                        break;
                case 2:
                        if(count == 0){
                            System.out.println("Enter at least one record!!");
                            break;
                        }
                        else{
                                System.out.println("Roll\tName\tAssignment1\tAssignment2\tProject\t\tTotal\tGrade");

                                for(i=0;i<count;i++){
                                    System.out.print( (roll=st[i].getRoll() )+"\t");
                                    System.out.print( (name=st[i].getName() )+"\t");
                                    System.out.print( (assignment1=st[i].getAssignment1() )+"\t\t");
                                    System.out.print( (assignment2=st[i].getAssignment2() )+"\t\t");
                                    System.out.print( (project=st[i].getProject() )+"\t\t");
                                    System.out.print( (st[i].calculate() )+"\t");
                                    System.out.print( (st[i].getGrade()  )+"\t");
                                    System.out.println();
                                }
                                
                                for(i=0;i<count;i++){
                                    if((ans=st[i].calculate()) < min){
                                        min=ans;
                                        roll=st[i].getName();
                                    }
                                }
                                
                                for(i=0;i<count;i++){
                                    if((ans=st[i].calculate()) > max){
                                        max=ans;
                                        name=st[i].getName();
                                    }
                                }
                                
                                for(i=0;i<count;i++){
                                    avg+= st[i].calculate() / count;
                                }

                            }
                            break;

                case 3: if(count == 0){
                            System.out.println("Enter at least one record!");
                            break;
                        }
                        else{
                            System.out.println("Minimum marks scored by "+roll+" : "+min);
                            System.out.println("Maximum marks scored by "+name+" : "+max);
                            System.out.println("Average marks scored by class : "+avg);
                        }

                        break;

            }

        }while(ch!=4);
    }
}