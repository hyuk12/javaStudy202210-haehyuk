class User {
    username;
    password;
    name;
    email;

    constructor(username, password, name, email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    printName() {
        console.log(this.name + "님의 정보");
    }
    

}


class UserMain {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null){
            this.#instance = new UserMain();
        }
        return this.#instance;
    }

    main() {
        let user = new User("haehyuk", "1234", "최해혁", "gogur7419@gmail.com");
        // user.username = "haehyuk";
        // user.password = "1234";
        // user.name = "최해혁";
        // user.email = "gogur7419@gmail.com";

        console.log(user);

        // localStorage -> 전역 요소 / 웹 브라우저에 데이터를 저장하는 로컬스토리지를 반환한다 
        localStorage.username = user.username;
        console.log("username: " + localStorage.username);

        user.printName();

    }
}

window.onload = () => {
    let userMain = UserMain.getInstance();

    userMain.main();
}