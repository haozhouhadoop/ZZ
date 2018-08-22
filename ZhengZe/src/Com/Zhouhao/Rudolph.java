package Com.Zhouhao;
public class Rudolph {
	public static void checkQQ(){
        String qq = "123a45664";

        String regex = "[1-9]\\d{4,14}";

        boolean flag = qq.matches(regex);
        if(flag)
            System.out.println(qq+"...is ok");
        else
            System.out.println(qq+"... 不合法");
         
}             //不合法

	public static void main(String[] args) {
//		for (String pattern : new String[]{"Rudolph","[rR]udolph","[rR][aeiou][a-z]ol.*", "R.*"})
//		{
//			System.out.println("Rudolph".matches(pattern));
//			
//		}
		checkQQ();
		

	}

}
