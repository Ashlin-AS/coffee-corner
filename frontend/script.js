
document
    .getElementById("bookingForm")
    .addEventListener("submit", function(event) {

        event.preventDefault();

        const customerName =
            document.getElementById("customerName").value;

        const bookingDate =
            document.getElementById("bookingDate").value;

        const bookingTime =
            document.getElementById("bookingTime").value;

        const numberOfPeople =
            document.getElementById("numberOfPeople").value;

        const bookingMessage =
            document.getElementById("bookingMessage");


        bookingMessage.textContent =
            "✅ Thank you, " +
            customerName +
            "! Your table for " +
            numberOfPeople +
            " people has been booked for " +
            bookingDate +
            " at " +
            bookingTime +
            ".";


        document
            .getElementById("bookingForm")
            .reset();

});