enum Branch{
    MATH("Information regarding math"),
    PHYSICS("information regarding physics"),
    Cs("information regarding cs"),
    Eng("information regarding Eng");
    final String desc;
    private Branch(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return desc;
    }
}
class Teacher{
    int id;
    Branch b;
    public Teacher(int id, Branch b){
        this.id = id;
        this.b = b;
    }
    public Branch getBranch(){
        return b;
    }
}

public class main{
    public static void main(String[] args){
       Teacher t1 = new Teacher(1,Branch.Cs);
       Teacher t2 = new Teacher(2,Branch.Eng);
       Teacher t3 = new Teacher(3,Branch.PHYSICS);
       Teacher t4 = new Teacher(4,Branch.MATH);
       Teacher[] teachers = {t1,t2,t3,t4};
       for(Teacher t: teachers){
        System.out.printf("%s\t -  %s\n",t.getBranch(),t.getBranch().getDesc());
       }
    }
}