const eventName="Music Night";
const eventDate="15-Jan-2027";

let seats=50;

const eventInfo=`Event Name: ${eventName}<br>
Event Date: ${eventDate}<br>
Available Seats: ${seats}`;

document.getElementById("eventInfo").innerHTML=eventInfo;

function registerUser(){
    seats--;

    document.getElementById("eventInfo").innerHTML=
    `Event Name: ${eventName}<br>
    Event Date: ${eventDate}<br>
    Available Seats: ${seats}`;
}