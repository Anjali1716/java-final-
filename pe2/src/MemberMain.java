public class MemberMain {

    public static void main(String[] args){
        Member m1=new Member();
        m1.setname("Harry Potter");
        String s1= m1.getname();
        m1.setage(30);
        int a=m1.getage();
        m1.setsal(2500.3);
        double s=m1.getsal();

        System.out.println("Member's Name:"+s1);
        System.out.println("Member's Age:"+a);
        System.out.println("Member's Salary:"+s);

    }
}


