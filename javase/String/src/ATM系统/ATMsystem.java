package ATM系统;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMsystem {
    public static void main(String[] args){
        /*
        1,定义账户类
        2，定义一个集合容器，负责以后储存全部的账户对象，进行操作
         */
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);     // 扫描器，一个即可

        //展现系统首页及初始功能

        while (true) {
            System.out.println("基沃托斯银行欢迎您，请小心路过的 砂狼白子");
            System.out.println("1 Accout login");
            System.out.println("2 sign up an account");
            System.out.println("请选择您要选择的操作：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 登录功能
                    login(accounts,sc);
                    break;
                case 2:
                    // 开户功能
                    register(accounts,sc);    // Alt+Ｅntire
                    break;
                default:
                    System.out.println("错误.your option is wrong!");
            }
        }



    }
    //登录功能的实现
    /*
    1，定义一个方法，并传入用户集合

    2，让用户输入卡号，然后查询是否存在账户，是的话进入下一步，否则重新输入（）
    3，输入密码，判断是否正确，是的话登录成功，否则重新输入

     */

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("========请登录=======");
        // 判断账户集合中是否存在账户，若不存在，登录功能即不能正常运行，只能进行开户功能
        if (accounts.size() == 0){
            System.out.println("抱歉，当前系统内尚没有账户存入，请先开通账户");
            return; // 卫语言风格，返回上一步
        }

        while (true) {
            System.out.println("请输入卡号（AID）");
            String Aid = sc.next();
            Account acc = getAccountCardId(Aid,accounts);
            // 判断卡号是否存在
            if(acc != null){
                // 即存在卡号
                // 进入下一步，输入密码
                System.out.println("请输入密码");
                String passWord = sc.next();
                if (acc.getPassWord().equals(passWord)){
                    System.out.println("欢迎来到基沃托斯银行"+acc.getUserName());
                }
                // 登录成功，展示用户操作页面
                showCommand(sc,acc,accounts);
                return; //结束登录方法

            }else {
                System.out.println("您所输入的卡号不存在，请重新输入");
                break;
            }
        }
    }

    // 展示用户操作页面方法
    /*
    用户操作设计，查询账户，退出账户功能分析
    1，成功后进入操作页面
    2，查询 直接展示当前账户信息
    3，退出账户后直接返回首页
     */
    private static void showCommand(Scanner sc,Account acc,ArrayList<Account>accounts){
        while (true) {
            System.out.println("========用户操作页========请根据指令进行操作==========");
            System.out.println("1,查询账户");
            System.out.println("2，存款");
            System.out.println("3，取款");
            System.out.println("4，转账");
            System.out.println("5，修改密码");
            System.out.println("6，退出系统");
            System.out.println("7，注销账户");
            System.out.println("8，反馈");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 查询账户 ---独立功能
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    depositeMoney(acc,sc);
                    break;
                case 3:
                    // 取款
                    drawMoney(acc,sc);

                    break;
                case 4:
                    // 转账
                    transferMoney(acc,sc,accounts);
                    break;
                case 5:
                    // 修改密码
                    updatPassWord(sc,acc);

                    break;
                case 6:
                    // 退出账户
                    System.out.println("======您将推出当前账户========");
                    return;             // 退出当前方法
                case 7:
                    // 注销账户

                    break;
                default:
                    System.out.println("您输入的操作不正确");
            }
        }
    }

    /**
     * 修改密码
     * @param sc
     * @param acc
     */
    private static void updatPassWord(Scanner sc, Account acc) {
        while (true) {
            System.out.println("=========修改密码========");
            System.out.println("Please enter the old password:");
            String passWord = sc.next();
            if (passWord.equals(acc.getPassWord())){
                System.out.println("please enter the new password:");
                String newpw = sc.next();
                System.out.println("please enter the new password again");
                String newpw2 = sc.next();
                if (newpw.equals(newpw2)){
                    acc.setPassWord(newpw);
                    System.out.println("you have updated the password successfully");
                    return;
                }else {
                    System.out.println("the passwords you entered twice do not match");
                    return;
                }
            }else {
                System.out.println("the old password you entered is wrong");
            }
        }
    }

    /**
     * 转账方法
     * @param acc 用户账户
     * @param sc 扫描器
     * @param accounts 全部账户
     */
    private static void transferMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
       System.out.println("=========用户转账操作=========");
       // 1 判断系统内是否存有可转账账户
        if(accounts.size() < 2){
            System.out.println("Sorry,there is currently no transfer account " +
                    "in the system,please open another account~");
            return;
        }
        while (true) {
            // 开始转账
            System.out.println("please input the AID that you want transfer to");
            String id = sc.next();
            Account account = getAccountCardId(id,accounts);

            // 不能是自己卡号
            if (id.equals(acc.getAID())){
                System.out.println("you can`t transfer money to yourself");
                continue;
            }

            // 判断输入卡号是否存在
            if(account == null){
                System.out.println("Sorry,the AID you entered does not exis");
                System.out.println("if you want back to the precious step,please input the command 0");
                int command = sc.nextInt();
                switch (command){
                    case 0:
                        return;
                    default:
                        continue;
                }
            }else {
                // 再度认证
                String userName = account.getUserName();
                String tip = "*" + userName.substring(1);
                System.out.println("please input the firstname of "+tip);
                String firstName = sc.next();

                if (userName.startsWith(firstName)){
                    // 认证成功
                    while (true) {

                        System.out.println("please enter the transfer amount:");
                        double money = sc.nextDouble();
                        // 确定余额是否足够
                        if (money > acc.getBalanca()){
                            System.out.println("Sorry,you have insufficient account balacne." +
                                    "You can only transfer "+acc.getBalanca());
                        }else {
                            System.out.println("You have successfully transferred "+money+
                                    "./t"+"Your current account balance is:"+(acc.getBalanca()-money));
                            acc.setBalanca(acc.getBalanca()-money);
                            return;
                        }
                    }
                }else {
                    System.out.println("Sorry,the information you write is wrong,please repeat");
                }
            }

        }
        /**
         * 选择其他操作，但不会
        System.out.println("please select your next action");
        System.out.println("1 go back to the precious step");
        System.out.println("2 Re-enter the AID");
        int command = sc.nextInt();
        switch (command){
            case 1:
                return;
            case 2:
        */
    }

    /**
     * 取款功能 先判断余额是否满足取款条件，再进行取款操作
     * @param acc
     * @param sc
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("=========您已进入取款界面========");
        // 判断余额是否满足取款条件
        if (acc.getBalanca()<100){
            System.out.println("Sorry,your balance can`t meet the withdrawal conditions~");
            return;
        }
        // 判断是否满足取款需求
        while (true) {
            System.out.println("请输入取款金额：");
            double money = sc.nextDouble();
            if(money > acc.getLimit()){
                System.out.println("sorry,your current withdrawal amount is greater than the withdrawal limit" +
                        " your current withdrawal limit is:"+acc.getLimit());
            }else {
                if (money>acc.getBalanca()){
                    System.out.println("Sorry,your current withdrawal is greater than your balance"+
                            "your current balance is:"+acc.getBalanca());
                }else {
                    System.out.println("You have withdrawn "+money+
                            "your current balance is:"+(acc.getBalanca()-money));
                    acc.setBalanca(acc.getBalanca()-money);
                    return;
                }
            }
        }
    }

    /**
     * 存款方法
     * @param acc
     * @param sc
     */
    private static void depositeMoney(Account acc, Scanner sc) {
        System.out.println("======请输入您要存款的金额=========");
        double money = sc.nextDouble();
        acc.setBalanca(acc.getBalanca() + money);
        System.out.println("金额已存入，当前账户余额为：");
        showAccount(acc);
    }

    /**
     * 查询功能
     * @param acc
     */
    private static void showAccount(Account acc) {
        System.out.println("========当前账户信息如下========");
        System.out.println("卡号"+acc.getAID());
        System.out.println("户主"+acc.getUserName());
        System.out.println("余额"+acc.getBalanca());
        System.out.println("限额"+acc.getLimit());

    }
    /**
     * 开户功能
     * @param accounts
     * @param sc
     */
    // 开户第一步 定义 用户名 密码 提款限额
    private static void register(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("=========系统开户操作=========");
        Account account = new Account();
        // 2，录入当前这个账户的信息，注入到账户对象中去。
        System.out.println("请输入账户名称（user）:");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请您确定密码：");
            String password = sc.next();

            System.out.println("请您确定密码：");
            String rewrite = sc.next();
            account.setPassWord(password);
            // String rewrite = sc.next(); 扫描器之类可以放到循环外面，从而避免占用更多内存
            if (rewrite.equals(password)) {
                account.setPassWord(password);
                break;
            } else {
                System.out.println("抱歉，您两次输入的密码不一致，请重新输入密码");
            }
        }


        System.out.println("请您输入当次提款限额：");
        double quotomoney = sc.nextDouble();
        account.setLimit(quotomoney);


        // 为账户随机生成一个8位不重复的卡号  （独立功能） 难点 ps：再创建一个方法来帮助
        String AID = getRandomAID(accounts);
        account.setAID(AID);

        // 将账户对象添加到账户集合中
        accounts.add(account);
        System.out.println("恭喜您，"+userName+"Sir/Lady,您开户成功，您的卡号是："+AID);
    }

    /**
     * 先随机生成一个八位卡号，在判断是否重复，是则返回重新生成
     * @param accounts
     * @return
     */
    private static String getRandomAID(ArrayList<Account> accounts) {
        // 先生成八位数字
        Random r = new Random();
        while (true) {
            String Aid = "";
            for (int i = 0; i < 8; i++) {
                Aid += r.nextInt(10);
            }

            // 判断卡号是否重复 ***难点
            Account acc = getAccountCardId(Aid,accounts);
            if (acc == null){
                return Aid;
            }
        }
    }

    //判断卡号是否重复，再次创建一个方法 即 Account acc = getAccountCardId(Aid,accounts);
    private static Account getAccountCardId(String AID,ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(acc.getAID().equals(AID)){
                return acc;
            }
        }
        return null;
    }
}
