class User {
    username;
    password;
    name;
    email;


}

class UserMain {
    main() {
        let user = new User();
        user.username = "haehyuk";
        user.password = "1234";
        user.name = "최해혁";
        user.email = "gogur7419@gmail.com";

        console.log(user);

    }
}

window.onload = () => {
    let userMain = new UserMain();

    userMain.main();
}