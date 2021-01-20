import java.util.*;
    class UserException extends Exception{

        public UserException(String message) {
            super(message);
        }
    }
    class PasswordException extends Exception{
        public PasswordException(String message) {
            super(message);
        }
    }
    public  class Test{
        private static String username = "admin";
        private static String password = "123";
        public static void login(String username,String password) {
            if(!Test.username.equals(username)) {
                try {
                    throw new UserException("用户名错误");
                } catch (UserException e) {
                    e.printStackTrace();
                }
            }
            if (!Test.password.equals(password)) {
                try {
                    throw new PasswordException("密码错误");
                } catch (PasswordException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("登陆成功");
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名和密码");
            String username = sc.next();
            String password = sc.next();
            login(username,password);
        }
    }


