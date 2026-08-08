// CHANGE PAGE

function showPage(pageName) {

    let pages = document.querySelectorAll(".page");

    pages.forEach(function(page) {

        page.classList.remove("active");

    });

    document
        .getElementById(pageName)
        .classList.add("active");

    window.scrollTo(0, 0);
}


// ORDER COFFEE

function orderCoffee(item) {

    alert(
        "☕ " +
        item +
        " has been added to your order!"
    );

}


// CONTACT FORM

function sendMessage(event) {

    event.preventDefault();

    let name =
        document.getElementById("name").value;

    alert(
        "Thank you, " +
        name +
        "! Your message has been sent successfully."
    );

    document.getElementById("name").value = "";

    document.getElementById("email").value = "";

    document.getElementById("phone").value = "";

    document.getElementById("message").value = "";

}