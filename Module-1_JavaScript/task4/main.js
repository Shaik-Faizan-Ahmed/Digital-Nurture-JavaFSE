let events=[
    {
        name:"Music Night",
        category:"Music",
        seats:20
    },
    {
        name:"Dance Show",
        category:"Dance",
        seats:15
    },
    {
        name:"Coding Workshop",
        category:"Workshop",
        seats:25
    }
];

function addEvent(name,category,seats){

    events.push({
        name:name,
        category:category,
        seats:seats
    });

    console.log("Event Added");
}

function registerCounter(){

    let totalRegistrations=0;

    return function(){

        totalRegistrations++;

        return totalRegistrations;
    };
}

const musicRegistrations=registerCounter();

function registerUser(eventName,category){

    let event=events.find(e=>e.name===eventName);

    if(event && event.seats>0){

        event.seats--;

        let count=0;

        if(category==="Music"){
            count=musicRegistrations();
        }

        document.getElementById("output").innerHTML=
        `Registered for ${eventName}<br>
        Remaining Seats: ${event.seats}<br>
        Music Registrations: ${count}`;
    }
}

function filterEventsByCategory(category,callback){

    let filteredEvents=events.filter(
        event=>event.category===category
    );

    callback(filteredEvents);
}

function displayEvents(eventList){

    let result="<h3>Filtered Events</h3>";

    eventList.forEach(event=>{
        result+=`${event.name}<br>`;
    });

    document.getElementById("output").innerHTML=result;
}

function showMusicEvents(){

    filterEventsByCategory(
        "Music",
        displayEvents
    );
}

addEvent("Guitar Workshop","Music",30);