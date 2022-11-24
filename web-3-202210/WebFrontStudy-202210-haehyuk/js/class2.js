window.onload = () => {
    console.log("class2.html: " + localStorage.username);
    // alert(localStorage.username);
    
    const btns = document.querySelectorAll("button");
    btns[0].onclick = () => {
        print();
    }

    btns[1].onclick = () => {
        history.back();
    }
    
}