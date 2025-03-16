class Person{
      protected int age;
      protected String name;
      protected String bGroup;
      protected String dob;
      
      protected Person(String name, String dob, String bGroup){
            this.name = name;
            this.bGroup = bGroup;
            this.dob = dob;
            this.age = 2025 - Integer.parseInt(dob.substring(6));
            
      }
      
      public String getName(){
            return name;
      }
      
      protected void setName(String name){
            this.name = name;
      }
      
      public int getAge(){
            this.age = 2025 - Integer.parseInt(dob.substring(6));
            return age;
      }
      
      public String getBGroup(){
            return bGroup;
      }
}

class Student extends Person{
      public String regNo;
      public String branch;
      
      Student(String name, String dob, String bGroup, String branch){
            super(name,dob,bGroup);
            this.branch = branch;
            this.regNo = 2024 + "B" + branch + 001;
      }
      
      public String toString(){
            return this.name+" "+this.bGroup+" "+this.dob+" "+this.age+" "+this.regNo
            +" "+this.branch;
      }
      
      public static void main(String... args){
            Student s = new Student("Anurag","14/01/2005","O+","IT");
            System.out.println(s);
            System.out.println(s.getName()+" "+s.getAge());
            s.setName("Andy");
            System.out.println(s.getName()+" "+s.getAge());
      }
}
