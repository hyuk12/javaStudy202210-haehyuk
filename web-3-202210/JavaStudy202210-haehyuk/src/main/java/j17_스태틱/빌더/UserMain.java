package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .email("gogur7419@gmail.com")
                .username("hyuko12")
                .build();
        System.out.println(user.toString());

        User2 user2 = User2.builder()
                .username("hyuko12")
                .password("12313")
                .email("gogur7419@gmail.com")
                .build();

       User u = user2.to();
        System.out.println(u);
    }
}
